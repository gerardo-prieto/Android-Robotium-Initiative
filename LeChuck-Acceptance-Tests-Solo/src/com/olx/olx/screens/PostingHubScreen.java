package com.olx.olx.screens;

import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.identifiers.AId;
import com.appthwack.sandwich.views.classes.*;

public class PostingHubScreen extends AScreen {
	
    public PostingHubScreen() {
        super(com.olx.olx.ui.activities.PublishActivity.class);
    }

    DrawerScreen drawer = new DrawerScreen();
    
    
	@AId(com.olx.olx.R.id.publish_category)
    public AButton publish_category;
	
    
	@AId(com.olx.olx.R.id.publish_describe)
    public AButton publish_describe;
	
	@AId(com.olx.olx.R.id.action_selection_ok)
    public AButton step_ok;
	
	
    public void fillAdInformation(String title, String description){
    	SoloFactory.getSolo().clearEditText((android.widget.EditText) SoloFactory.getSolo().getView(com.olx.olx.R.id.text_field_text));
    	SoloFactory.getSolo().enterText((android.widget.EditText) SoloFactory.getSolo().getView(com.olx.olx.R.id.text_field_text), title);
    	SoloFactory.getSolo().clearEditText((android.widget.EditText) SoloFactory.getSolo().getView(com.olx.olx.R.id.text_field_text, 1));
    	SoloFactory.getSolo().enterText((android.widget.EditText) SoloFactory.getSolo().getView(com.olx.olx.R.id.text_field_text, 1), description);
    }
	
	public void goToHomePage(){
    	drawer.open_drawer();
    	drawer.home.click();
	}
	
	public void goToMyAds(){
    	drawer.open_drawer();
    	drawer.my_ads.click();
	}
	
	public void selectCategoryAndSubcategory(){
		SoloFactory.getSolo().clickInList(1, 0);
		SoloFactory.getSolo().clickInList(1, 0);
	}
	
}