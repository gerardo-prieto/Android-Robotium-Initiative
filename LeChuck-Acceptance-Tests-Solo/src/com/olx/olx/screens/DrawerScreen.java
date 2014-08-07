package com.olx.olx.screens;


import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.views.classes.*;
import com.appthwack.sandwich.identifiers.AId;
import com.appthwack.sandwich.identifiers.AIdName;
import com.appthwack.sandwich.identifiers.AName;
import com.appthwack.sandwich.identifiers.AText;
import com.robotium.solo.Solo;

public class DrawerScreen extends AScreen {
	
    public DrawerScreen() {
        super(com.olx.olx.ui.activities.SplashActivity.class);
    }

    @AName("com.olx.olx.R.string.menu_home")
	public ATextView home;
    
    @AName("com.olx.olx.R.string.post_an_ad")
	public ATextView post_an_ad;
    
	@AIdName("com.olx.olx.R.string.post_an_ad")
	public ATextView my_ads;
	
	@AName("com.olx.olx.R.string.menu_favorites")
	public ATextView my_favorites;

	@AName("com.olx.olx.R.string.menu_login")
	public ATextView my_login;
	
	@AName("com.olx.olx.R.string.menu_settings")
	public ATextView settings;
	
    public void open_drawer(){
    	SoloFactory.getSolo().setNavigationDrawer(Solo.OPENED);
    }

}
