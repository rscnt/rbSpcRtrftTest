package com.zoco.example.robospicetest.http.requests;

import retrofit.Callback;
import android.util.Log;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductsService;
import com.zoco.example.robospicetest.models.Product;

public class AddProductRequest extends
		RetrofitSpiceRequest<Product, ProductsService> {

	Product nprdct;
	Callback<Product> clbk;

	public AddProductRequest(Product product, Callback<Product> callback) {
		super(Product.class, ProductsService.class);
		this.nprdct = product;
		this.clbk = callback;
	}

	@Override
	public Product loadDataFromNetwork() throws Exception {
		try {
			Log.d(AddProductRequest.class.getCanonicalName(),
					"Calling web service for add a product");
			return getService().createProduct(nprdct, clbk);
		} catch (Exception excep) {
			// Gotcha!
			excep.printStackTrace();
			throw new IllegalAccessError("What the fuck!");
		}
	}

}
