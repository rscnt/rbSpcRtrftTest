package com.zoco.example.robospicetest.http.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductsService;
import com.zoco.example.robospicetest.models.Product;

public class GetProductRequest extends
		RetrofitSpiceRequest<Product, ProductsService> {

	Product uprdct;

	public GetProductRequest(Product product) {
		super(Product.class, ProductsService.class);
		this.uprdct = product;
	}

	@Override
	public Product loadDataFromNetwork() throws Exception {
		try {
			return getService().updateProduct(uprdct.getId(), uprdct);
		} catch (Exception excp) {
			// Catch them all!
			excp.printStackTrace();
			throw new IllegalAccessError("The Fucking fuck!");
		}
	}

}
