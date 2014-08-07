package com.olx.olx.test;
import com.appthwack.sandwich.SandwichBaseTest;
import com.appthwack.sandwich.SoloFactory;
import com.olx.grog.GrogApplication;
import com.olx.grog.db.DBHelper;
import com.olx.olx.helpers.PreferencesHelper;
import com.olx.olx.helpers.RobotiumHelper;
import com.olx.olx.screens.HomeScreen;
import com.olx.olx.screens.TutorialScreen;
import com.olx.olx.ui.activities.SplashActivity;

public class HomeTutorial extends SandwichBaseTest<SplashActivity> {


	
	public HomeTutorial() {
		super(com.olx.olx.ui.activities.SplashActivity.class);
	}

	
	public void seeTutorialAndGoToHomePage(){
		RobotiumHelper robotiumHelper = new RobotiumHelper();	
		robotiumHelper.setFirstStart(true);
		super.getActivity();
		
		TutorialScreen tutorialScreen = new TutorialScreen();
	
		tutorialScreen.tutorial_screen_one.isVisible();
		tutorialScreen.tutorial_title.isVisible();
		
		tutorialScreen.right_scroll();
		tutorialScreen.tutorial_screen_two.isVisible();
		
		tutorialScreen.right_scroll();
		tutorialScreen.tutorial_screen_three.isVisible();
				
		tutorialScreen.start_button.click();

		HomeScreen homeScreen = new HomeScreen();
		assertTrue(homeScreen.isScreenDisplayed());
	
	}
}