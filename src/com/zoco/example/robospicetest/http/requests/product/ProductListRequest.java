package com.zoco.example.robospicetest.http.requests.product;

import android.util.Log;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductsService;
import com.zoco.example.robospicetest.models.Product;

/**
 * RetrofitSpiceRequest, are the bridge between services and activities.
 * */
public class ProductListRequest extends
		RetrofitSpiceRequest<Product.List, ProductsService> {

	public ProductListRequest() {
		super(Product.List.class, ProductsService.class);
	}

	@Override
	public Product.List loadDataFromNetwork() {
		try {
			Log.d(ProductListRequest.class.getCanonicalName(),
					"Calling web service");
			return getService().products();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new IllegalAccessError("The fuck happen!");
		}
	}
}
