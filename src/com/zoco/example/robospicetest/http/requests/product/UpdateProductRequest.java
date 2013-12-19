package com.zoco.example.robospicetest.http.requests.product;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductsService;
import com.zoco.example.robospicetest.models.Product;

public class UpdateProductRequest extends
		RetrofitSpiceRequest<Product, ProductsService> {

	Product uprdct;

	public UpdateProductRequest(Product product) {
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