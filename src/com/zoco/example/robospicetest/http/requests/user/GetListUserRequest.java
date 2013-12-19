package com.zoco.example.robospicetest.http.requests.user;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.User;
import com.zoco.example.robospicetest.models.User.List;

public class GetListUserRequest extends
		RetrofitSpiceRequest<User.List, UserService> {

	public GetListUserRequest() {
		super(User.List.class, UserService.class);
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