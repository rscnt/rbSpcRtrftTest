package com.zoco.example.robospicetest.http.requests.user;

import org.json.JSONObject;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.User;
import com.zoco.example.robospicetest.models.utils.serializers.UserSerializer;

public class CreateUserRequest extends RetrofitSpiceRequest<User, UserService> {

	User nusr;

	public CreateUserRequest(User user) {
		super(User.class, UserService.class);
		this.nusr = user;
	}

	@Override
	public User loadDataFromNetwork() throws Exception {
		try {
			/* ============== Serializers ======== */
			// GsonBuilder gsonBuild = new GsonBuilder();
			// gsonBuild.registerTypeAdapter(User.class, new UserSerializer());
			// gsonBuild.serializeNulls();
			// gsonBuild.setPrettyPrinting();
			// Gson gson = gsonBuild.create();
			/* =================================== */
			Gson gson = new Gson();
			JsonObject jsonUserobj = new JsonObject();
			jsonUserobj.add("user", gson.toJsonTree(nusr));
			return getService().createUser(jsonUserobj);
		} catch (Exception excep) {
			// Catch them all!
			excep.printStackTrace();
			System.out.println("\n" + "-----------------------------" + "\n");
			throw new IllegalAccessError("What the fuck happend!");
		}
	}
}
