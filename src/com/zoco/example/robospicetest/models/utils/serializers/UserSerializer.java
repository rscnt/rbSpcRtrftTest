/**
 * 
 */
package com.zoco.example.robospicetest.models.utils.serializers;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.zoco.example.robospicetest.models.User;

/**
 * @author raul
 * 
 */
public class UserSerializer implements JsonSerializer<User> {

	@Override
	public JsonElement serialize(User usr, Type typeOfSrc,
			JsonSerializationContext context) {
		Gson gson = new Gson();
		JsonObject nJsonUser = new JsonObject();
		nJsonUser.add("user", gson.toJsonTree(usr));
		return nJsonUser;
	}

}