package com.olx.olx.helpers;

import com.appthwack.sandwich.SoloFactory;
import com.olx.grog.GrogApplication;
import com.olx.grog.db.DBHelper;
import com.olx.olx.screens.ManualLocationScreen;
import com.olx.olx.test.Repository;


public class RobotiumHelper {
	
	
	public void setFirstStart(boolean tutorialStatus){
		DBHelper dbHelper;
		
		PreferencesHelper.clear();
		PreferencesHelper.setApiEndpoint(Repository.ENVIRONMENT);
		PreferencesHelper.setTutorialseen(!tutorialStatus);
		
		dbHelper = GrogApplication.getInstance().getDbhelper();
  		if (dbHelper != null){
			dbHelper.clearCache();
	  		dbHelper.purgeCache();
  		}
	}
	

	public void setManualLocation(){
		ManualLocationScreen manualLocationScreen = new ManualLocationScreen();
	if (manualLocationScreen.isScreenDisplayed()){
		manualLocationScreen.setManualCountryAndCity(Repository.LOCATION_COUNTRY, Repository.LOCATION_CITY);
		}
	SoloFactory.getSolo().sleep(4000);
	}
	

	
}
