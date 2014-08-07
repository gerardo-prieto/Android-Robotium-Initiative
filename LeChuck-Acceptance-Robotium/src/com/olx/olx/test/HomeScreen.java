package com.olx.olx.test;

import com.robotium.solo.Solo;


public class HomeScreen {

	public Solo solo;

	
	 public HomeScreen(Solo solo) {
	        this.solo = solo;
	    }
	 
	 
    // It is useful to be able to chain methods together.

    // For public methods that direct you to other pages,
    // return the Page Object for that page.
//    public OptionsPage options() {
//        getSolo().clickOnButton(getSolo().getString(R.string.options_button));
//        return new OptionsPage(getSolo());
//    }

    //For public methods that DON'T direct you to other pages, return this.
    public HomeScreen skipTutorial() {
		solo.scrollViewToSide(solo.getView(com.olx.olx.R.id.mainViewPager), Solo.RIGHT);
		solo.scrollViewToSide(solo.getView(com.olx.olx.R.id.mainViewPager),	Solo.RIGHT);
		solo.clickOnText(java.util.regex.Pattern.quote(solo.getString(com.olx.olx.R.string.tutorial_start)));
        return this;
    }
    
    
}