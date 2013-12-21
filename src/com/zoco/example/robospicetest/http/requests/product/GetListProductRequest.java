package com.zoco.example.robospicetest.http.requests.product;

import android.util.Log;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductService;
import com.zoco.example.robospicetest.models.ProductList;

/**
 * RetrofitSpiceRequest, are the bridge between services and activities.
 * */
public class GetListProductRequest extends
		RetrofitSpiceRequest<ProductList, ProductService> {

	public GetListProductRequest() {
		super(ProductList.class, ProductService.class);
	}

	@Override
	public ProductList loadDataFromNetwork() {
		try {
			Log.d(GetListProductRequest.class.getCanonicalName(),
					"Calling web service");
			return getService().products();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new IllegalAccessError("The fuck happen!");
		}
	}
}
