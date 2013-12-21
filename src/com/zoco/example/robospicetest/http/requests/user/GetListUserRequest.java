package com.zoco.example.robospicetest.http.requests.user;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.UserList;

public class GetListUserRequest extends
		RetrofitSpiceRequest<UserList, UserService> {

	public GetListUserRequest() {
		super(UserList.class, UserService.class);
	}

	@Override
	public UserList loadDataFromNetwork() {
		try {
			return (UserList) getService().users();
		} catch (Exception exception) {
			// Catch them all!
			exception.printStackTrace();
			throw new IllegalAccessError("The fuck happen!");
		}
	}
}