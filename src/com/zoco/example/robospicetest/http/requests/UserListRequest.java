package com.zoco.example.robospicetest.http.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UsersService;
import com.zoco.example.robospicetest.models.User;
import com.zoco.example.robospicetest.models.User.List;

public class UserListRequest extends
		RetrofitSpiceRequest<User.List, UsersService> {

	public UserListRequest() {
		super(User.List.class, UsersService.class);
	}

	@Override
	public List loadDataFromNetwork() {
		try {
			return getService().users();
		} catch (Exception exception) {
			// Catch them all!
			exception.printStackTrace();
			throw new IllegalAccessError("The fuck happen!");
		}
	}
}