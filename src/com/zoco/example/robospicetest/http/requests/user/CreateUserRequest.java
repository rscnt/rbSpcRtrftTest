package com.zoco.example.robospicetest.http.requests.user;

import retrofit.Callback;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.User;

public class CreateUserRequest extends RetrofitSpiceRequest<User, UserService> {

	User nusr;
	Callback<User> usrCllbck;

	public CreateUserRequest(User user, Callback<User> userCallback) {
		super(User.class, UserService.class);
		this.nusr = user;
		this.usrCllbck = userCallback;
	}

	@Override
	public User loadDataFromNetwork() throws Exception {
		try {
			return getService().createUser(nusr, usrCllbck);
		} catch (Exception excep) {
			// Catch them all!
			excep.printStackTrace();
			throw new IllegalAccessError("What the fuck happend!");
		}
	}

}
