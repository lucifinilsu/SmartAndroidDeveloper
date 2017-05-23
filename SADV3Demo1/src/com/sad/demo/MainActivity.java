package com.sad.demo;

import com.sad.android.activity.AppBaseWithUIDesignActivity;
import com.sad.android.activity.AppSimpleImmersedDesignActivity;
import com.sad.android.framwork.mvrp.resmanager.UIDesignType;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;

public class MainActivity extends  AppSimpleImmersedDesignActivity<R_MainActivity> {

	@Override
	public void OnDesign(UIDesignType arg0, Toolbar arg1, AppBarLayout arg2, CoordinatorLayout arg3,
			CollapsingToolbarLayout arg4, Object... arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnDesignCompleted(UIDesignType arg0, Toolbar arg1, AppBarLayout arg2, CoordinatorLayout arg3,
			CollapsingToolbarLayout arg4, Object... arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int thisControllerId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean OnExecuteActivityFunction() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public R_MainActivity getResController() {
		// TODO Auto-generated method stub
		if (activityResController==null) {
			activityResController=new R_MainActivity();
		}
		return activityResController;
	}

	@Override
	public CharSequence getActivityTitle() {
		// TODO Auto-generated method stub
		return "SAD_Demo";
	}

	
}
