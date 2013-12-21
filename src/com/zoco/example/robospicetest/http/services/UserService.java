package com.zoco.example.robospicetest.http.services;

import java.util.List;

import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.http.Path;

import com.google.gson.JsonObject;
import com.zoco.example.robospicetest.models.User;

public interface UserService {

	@GET("/users/")
	List<User> users();

	@GET("/users/{id}/")
	User user(@Part("id") Long id);

	@POST("/users/")
	@Headers("Content-Type: application/json")
	User createUser(@Body JsonObject userJSON);

	@Multipart
	@PUT("/products/{id}/")
	User updateUser(@Part("id") long id, @Body User user);

	@DELETE("/users/{id}/")
	User deleteUser(@Path("id") Long id);

}
