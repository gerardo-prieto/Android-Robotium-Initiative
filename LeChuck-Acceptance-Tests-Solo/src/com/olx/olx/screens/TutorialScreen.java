package com.olx.olx.screens;

import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.identifiers.AId;
import com.appthwack.sandwich.identifiers.AName;
import com.appthwack.sandwich.views.classes.*;
import com.robotium.solo.Solo;

public class TutorialScreen extends AScreen {
	
	public static final String prueba = SoloFactory.getSolo().getString(com.olx.olx.R.string.abc_action_bar_home_description);
	
	public TutorialScreen() {
        super(com.olx.olx.ui.activities.TutorialActivity.class);
    }
	
	
	@AName("com.olx.olx.R.string.tutorial_title")
	public ATextView tutorial_title;
	
	@AName("com.olx.olx.R.string.tutorial_screen_one")
	public ATextView tutorial_screen_one;
	
	@AName("com.olx.olx.R.string.tutorial_screen_two")
	public ATextView tutorial_screen_two;
	
	@AName("com.olx.olx.R.string.tutorial_screen_three")
	public ATextView tutorial_screen_three;
	
	
	@AId(com.olx.olx.R.id.start_button)
    public AButton start_button;
	

	public void right_scroll(){
    	SoloFactory.getSolo().scrollViewToSide(SoloFactory.getSolo().getView(com.olx.olx.R.id.mainViewPager), Solo.RIGHT);;
	}
    

}
