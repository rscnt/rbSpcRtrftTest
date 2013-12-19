package com.zoco.example.robospicetest.http.requests.product;

import retrofit.Callback;
import android.util.Log;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductService;
import com.zoco.example.robospicetest.models.Product;

public class CreateProductRequest extends
		RetrofitSpiceRequest<Product, ProductService> {

	Product nprdct;
	Callback<Product> clbk;

	public CreateProductRequest(Product product, Callback<Product> callback) {
		super(Product.class, ProductService.class);
		this.nprdct = product;
		this.clbk = callback;
	}

	@Override
	public Product loadDataFromNetwork() throws Exception {
		try {
			Log.d(CreateProductRequest.class.getCanonicalName(),
					"Calling web service for add a product");
			return getService().createProduct(nprdct, clbk);
		} catch (Exception excep) {
			// Gotcha!
			excep.printStackTrace();
			throw new IllegalAccessError("What the fuck!");
		}
	}

}
