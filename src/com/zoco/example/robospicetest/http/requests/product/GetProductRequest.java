package com.zoco.example.robospicetest.http.requests.product;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.ProductService;
import com.zoco.example.robospicetest.models.Product;

public class GetProductRequest extends
		RetrofitSpiceRequest<Product, ProductService> {

	Integer id;

	public GetProductRequest(Integer id) {
		super(Product.class, ProductService.class);
		this.id = id;
	}

	@Override
	public Product loadDataFromNetwork() throws Exception {
		try {
			return getService().product(this.id);
		} catch (Exception excep) {
			// Catch them all!
			excep.printStackTrace();
			throw new IllegalAccessError("The fuck happend!");
		}
	}

}