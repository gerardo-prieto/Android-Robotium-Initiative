package com.olx.olx.screens;

import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.identifiers.AName;
import com.appthwack.sandwich.views.classes.*;
import com.olx.olx.helpers.PreferencesHelper;

public class ManualLocationScreen extends AScreen {
	
    public ManualLocationScreen() {
        super(com.olx.olx.ui.activities.SplashActivity.class);
    }

	@AName("com.olx.olx.R.location_select_country")
	public ATextView location_select_country;
    
    public void setManualCountryAndCity(String country, String city){
    	SoloFactory.getSolo().scrollUp();
    	SoloFactory.getSolo().clickOnText(country);
    	SoloFactory.getSolo().clickOnText(city);
    }
    
    
    public boolean isScreenDisplayed(){
    	return  ((PreferencesHelper.getResolvedLocation() == null) && this.location_select_country.isVisible()); 
        	
    }

	
    
    
	
}