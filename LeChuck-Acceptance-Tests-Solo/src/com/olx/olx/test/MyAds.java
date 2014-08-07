package com.olx.olx.test;

import com.appthwack.sandwich.SandwichBaseTest;
import com.appthwack.sandwich.SoloFactory;
import com.olx.olx.helpers.RobotiumHelper;
import com.olx.olx.screens.HomeScreen;
import com.olx.olx.screens.MyAdsScreen;
import com.olx.olx.test.Repository;
import com.olx.olx.ui.activities.SplashActivity;
import com.robotium.solo.Solo;

public class MyAds extends SandwichBaseTest<SplashActivity> {
  	
	public MyAds() {
		super(com.olx.olx.ui.activities.SplashActivity.class);
	}

	
	public void createaAndViewDraft(){
		RobotiumHelper robotiumHelper = new RobotiumHelper();	
		robotiumHelper.setFirstStart(false);
		super.getActivity();
		robotiumHelper.setManualLocation();
		
		HomeScreen homeScreen = new HomeScreen();
		homeScreen.goToMyAds();
		
		MyAdsScreen myAds = new MyAdsScreen();
		assertTrue(myAds.createADraft());		
	}
	
	public void deleteADraft(){
		this.createaAndViewDraft();
		SoloFactory.getSolo().goBack();
		MyAdsScreen myAds = new MyAdsScreen();
		myAds.deleteADraft();		
	}
	
	public void editADraft(){
		
	}
}