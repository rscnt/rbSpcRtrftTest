package com.zoco.example.robospicetest.activity;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.zoco.example.robospicetest.R;
import com.zoco.example.robospicetest.http.requests.product.GetListProductRequest;
import com.zoco.example.robospicetest.http.requests.user.CreateUserRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.Product;
import com.zoco.example.robospicetest.models.ProductList;
import com.zoco.example.robospicetest.models.User;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends BaseAbstractActivity {

	private ArrayAdapter<Product> productListAdapter;
	private ListView lstVwProducts;
	private Button buttonGetList;
	private Button buttonPOSTUser;
	private GetListProductRequest prdctLstRqst;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUI();
		initRequests();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void initUI() {
		lstVwProducts = (ListView) findViewById(R.id.listViewProducts);
		productListAdapter = new ArrayAdapter<Product>(this,
				android.R.layout.simple_list_item_1);
		lstVwProducts.setAdapter(productListAdapter);
		buttonGetList = (Button) findViewById(R.id.buttonGetListProducts);
		buttonGetList.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				executeProductListRequest();
			}
		});
		buttonPOSTUser = (Button) findViewById(R.id.buttonPOSTUser);
		buttonPOSTUser.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				executeSimplePOSTUser();
			}
		});
	}

	private void initRequests() {
		prdctLstRqst = new GetListProductRequest();
	}

	private void executeProductListRequest() {
		if (prdctLstRqst != null) {
			// [request, name, duration, listener]
			getSpiceManager().execute(prdctLstRqst, "yourMommaIsSoFat",
					DurationInMillis.ALWAYS, new ProductListRequestListener());
		}

	}

	private void fillProductList(ProductList products) {
		productListAdapter.clear();
		for (Product product : products) {
			productListAdapter.add(product);
		}
	}

	private void executeSimplePOSTUser() {
		User usr = new User();
		usr.setPassword("12345672");
		usr.setUsername("username1252");
		usr.setEmail("username1252@gmail.com");
		usr.setCountry_id(1);
		CreateUserRequest crtUsrRqst = new CreateUserRequest(usr);
		getSpiceManager().execute(crtUsrRqst, "causeTwoIsTwo",
				DurationInMillis.ONE_WEEK, new UserRequestListener());
	}

	public final class ProductListRequestListener implements
			RequestListener<ProductList> {

		@Override
		public void onRequestFailure(SpiceException spcExcptn) {
			System.out.println("-------------------------------------");
			spcExcptn.getCause().printStackTrace();
			System.out.println("-------------------------------------");
		}

		@Override
		public void onRequestSuccess(ProductList products) {
			String msg = "Products Obtained: " + products.size();
			Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
			if (lstVwProducts != null) {
				fillProductList(products);
			}
		}
	}

	public final class UserRequestListener implements RequestListener<User> {

		@Override
		public void onRequestFailure(SpiceException spcExcptn) {
			spcExcptn.printStackTrace();
		}

		@Override
		public void onRequestSuccess(User user) {
			String msg = "User is awesome: " + user.getCode();
			Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
		}
	}
}
