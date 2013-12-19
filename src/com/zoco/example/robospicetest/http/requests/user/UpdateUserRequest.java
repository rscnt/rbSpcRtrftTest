package com.zoco.example.robospicetest.http.requests.user;

import retrofit.Callback;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.User;

public class UpdateUserRequest extends RetrofitSpiceRequest<User, UserService> {

	User usr;
	Callback<User> usrCllbck;

	public UpdateUserRequest(User user, Callback<User> userCallback) {
		super(User.class, UserService.class);
		this.usr = user;
		this.usrCllbck = userCallback;
	}

	@Override
	public User loadDataFromNetwork() throws Exception {
		try {
			return getService().updateUser(usr.getId(), usr);
		} catch (Exception excep) {
			// Gotcha!
			excep.printStackTrace();
			throw new IllegalAccessError("What the fuck!");
		}
	}

}
