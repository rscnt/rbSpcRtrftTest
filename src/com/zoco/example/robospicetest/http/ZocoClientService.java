package com.zoco.example.robospicetest.http;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

import com.octo.android.robospice.persistence.CacheManager;
import com.octo.android.robospice.persistence.exception.CacheCreationException;
import com.octo.android.robospice.persistence.ormlite.InDatabaseObjectPersisterFactory;
import com.octo.android.robospice.persistence.ormlite.RoboSpiceDatabaseHelper;
import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;
import com.zoco.example.robospicetest.http.services.ProductService;
import com.zoco.example.robospicetest.http.services.UserService;
import com.zoco.example.robospicetest.models.Product;
import com.zoco.example.robospicetest.models.User;

public class ZocoClientService extends RetrofitGsonSpiceService {

	public static final String API_URL = "http://192.168.1.12:4000/api/";
	private static final String DB_NAME = "zoco.db";
	private static final Integer DB_VERSION = 1;

	@Override
	public void onCreate() {
		super.onCreate();
		addRetrofitInterface(ProductService.class);
		addRetrofitInterface(UserService.class);
	}

	// @Override
	// public CacheManager createCacheManager(Application application)
	// throws CacheCreationException {
	// CacheManager cacheMngr = new CacheManager();
	// List<Class<?>> clsCollections = new ArrayList<Class<?>>();
	// // TODO: Add annotations to models
	// clsCollections.add(User.class);
	// clsCollections.add(User.List.class);
	// clsCollections.add(Product.class);
	// clsCollections.add(Product.List.class);
	//
	// // start cache
	// RoboSpiceDatabaseHelper dbHlpr = new RoboSpiceDatabaseHelper(
	// application, DB_NAME, DB_VERSION);
	//
	// InDatabaseObjectPersisterFactory inDatabaseObjectPersisterFactory = new
	// InDatabaseObjectPersisterFactory(
	// application, dbHlpr, clsCollections);
	//
	// cacheMngr.addPersister(inDatabaseObjectPersisterFactory);
	// return cacheMngr;
	// }

	@Override
	protected String getServerUrl() {
		return API_URL;
	}

}
