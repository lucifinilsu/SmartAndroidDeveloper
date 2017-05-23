package com.sad.demo;

import com.sad.SADApplication;

public class App extends SADApplication{

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		CurrApplication=this;
		APP_NAME="sad_v3_demo";
	}
	@Override
	public String getAppMainProcess() {
		// TODO Auto-generated method stub
		return "com.sad.demo";
	}

}
