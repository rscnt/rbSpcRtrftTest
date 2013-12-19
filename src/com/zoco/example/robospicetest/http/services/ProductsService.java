package com.zoco.example.robospicetest.http.services;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Multipart;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.mime.TypedFile;

import com.zoco.example.robospicetest.models.Product;

public interface ProductsService {

	@GET("/products/")
	Product.List products();

	@GET("/products/{id}/")
	Product product(@Part("id") Long id);

	@POST("/products/")
	Product createProduct(@Body Product product, Callback<Product> cllbck);

	@Multipart
	@PUT("/products/{id}")
	Product updateProduct(@Part("id") Long id, @Body Product product);

	@Multipart
	@PUT("/products/{id}/photo")
	Product updateProduct(@Path("id") Long id, @Part("photo") TypedFile photo);

	@DELETE("/products/{id}/")
	void deleteProduct(@Path("id") Integer id);

}
