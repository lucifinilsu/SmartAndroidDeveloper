package com.sad.demo;

import com.sad.android.framwork.mvrp.resmanager.ABaseRESController;
import com.sad.android.framwork.mvrp.resmanager.RClassManager;

import android.support.v7.widget.Toolbar;

public class R_MainActivity  extends ABaseRESController<MainActivity>{

	@Override
	public void release(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initTopBar() {
		// TODO Auto-generated method stub
		super.initTopBar();
		topBar=(Toolbar) RClassManager.findViewById(mainHost, R.id.toolbar);
		if (topBar!=null) {
			topBar.setTitle(mainHost.getActivityTitle());
		}
	}
	@Override
	public int getLayoutRES(int arg0) {
		// TODO Auto-generated method stub
		return R.layout.activity_main;
	}

}
