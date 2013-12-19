package com.zoco.example.robospicetest.http.requests.user;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.User;

public class DeleteProductRequest extends
		RetrofitSpiceRequest<User, UserService> {

	Long mId;

	public DeleteProductRequest(Long id) {
		super(User.class, UserService.class);
		this.mId = id;
	}

	@Override
	public User loadDataFromNetwork() throws Exception {
		try {
			return getService().deleteUser(mId);
		} catch (Exception excep) {
			excep.printStackTrace();
			throw new IllegalAccessError("What the fuck!");
		}
	}
}
