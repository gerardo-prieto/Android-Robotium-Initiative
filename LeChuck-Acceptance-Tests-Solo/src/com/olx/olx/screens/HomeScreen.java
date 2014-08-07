package com.olx.olx.screens;

import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.views.classes.*;
import com.appthwack.sandwich.identifiers.AId;
import com.olx.olx.test.Repository;
import com.robotium.solo.Solo;

public class HomeScreen extends AScreen {
	
    public HomeScreen() {
        super(com.olx.olx.ui.activities.HomeActivity.class);
    }
    
    DrawerScreen drawer = new DrawerScreen();
    
	@AId(com.olx.olx.R.id.home_post_button)
    public AButton post_button;
       
    
    public void goToMyAds(){
    	drawer.open_drawer();
    	SoloFactory.getSolo().clickInList(3,0);
    }
    
 
    public boolean isScreenDisplayed(){
		ManualLocationScreen manualLocationScreen = new ManualLocationScreen();
		if (manualLocationScreen.isScreenDisplayed()){
			manualLocationScreen.setManualCountryAndCity(Repository.LOCATION_COUNTRY, Repository.LOCATION_CITY);
		}
    	return SoloFactory.getSolo().waitForActivity(com.olx.olx.ui.activities.HomeActivity.class.getSimpleName());
    }
    
    
}
