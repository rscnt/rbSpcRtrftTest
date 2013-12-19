package com.zoco.example.robospicetest.http.services;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.http.Path;

import com.zoco.example.robospicetest.models.Product;
import com.zoco.example.robospicetest.models.User;

public interface UserService {

	@GET("/users/")
	User.List users();

	@GET("/users/{id}/")
	User user(@Part("id") Long id);

	@POST("/users/")
	User createUser(@Body User user, Callback<User> cllbck);

	@Multipart
	@PUT("/products/{id}/")
	Product updateUser(@Part("id") Long id, @Body User user);

	@DELETE("/users/{id}/")
	void deleteUser(@Path("id") Integer id);

}
