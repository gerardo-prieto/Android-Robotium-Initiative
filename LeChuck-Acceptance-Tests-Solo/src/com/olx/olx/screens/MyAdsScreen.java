package com.olx.olx.screens;


import com.appthwack.sandwich.SoloFactory;
import com.appthwack.sandwich.views.classes.*;
import com.appthwack.sandwich.identifiers.AId;
import com.appthwack.sandwich.identifiers.AName;
import com.olx.olx.test.Repository;
import com.robotium.solo.Solo;

public class MyAdsScreen extends AScreen {
	
    public MyAdsScreen() {
        super(com.olx.olx.ui.activities.HomeActivity.class);
    }

    DrawerScreen drawer = new DrawerScreen();
    HomeScreen homeScreen = new HomeScreen();
    PostingHubScreen postingHub = new PostingHubScreen();
   
    
	@AName("com.olx.olx.R.string.myads_no_results")
	public ATextView no_results;
	
	@AId(com.olx.olx.R.id.myads_no_results_button)
	public AButton post_an_ad_button;
	
	@AId(com.olx.olx.R.id.myads_item_menu)
	public AButton my_ads_item_menu;
	
	@AId(com.olx.olx.R.id.menu_delete)
	public AButton my_ads_item_menu_delete;
    
	public boolean isMyAdsListEmpty(){
		SoloFactory.getSolo().waitForActivity(com.olx.olx.ui.activities.MyAdsActivity.class);
	    return SoloFactory.getSolo().searchText(SoloFactory.getSolo().getString(this.no_results.toString()));
	}
	
	
	public void goToHomePage(){
    	drawer.open_drawer();
    	drawer.home.click();
	}
	
	public boolean createADraft(){
		this.post_an_ad_button.click();
		postingHub.publish_category.click();
		postingHub.selectCategoryAndSubcategory();
		postingHub.publish_describe.click();
		postingHub.fillAdInformation(Repository.DRAFT_TITLE, Repository.POST_DESCRIPTION);
		postingHub.step_ok.click();
		homeScreen.goToMyAds();
		
		SoloFactory.getSolo().waitForView(SoloFactory.getSolo().getView(android.R.id.message));
		SoloFactory.getSolo().sleep(2000);
	
		boolean checkpoint2 = SoloFactory.getSolo().searchText(SoloFactory.getSolo().getString(com.olx.olx.R.string.draft));
		
		SoloFactory.getSolo().clickInList(1,0);
		
		boolean checkpoint3 = SoloFactory.getSolo().searchText(SoloFactory.getSolo().getString(com.olx.olx.R.string.publish)); 
		boolean checkpoint4 = SoloFactory.getSolo().searchText(SoloFactory.getSolo().getString(com.olx.olx.R.string.publish_add_photos_tip));

		SoloFactory.getSolo().clickOnView(SoloFactory.getSolo().getView(com.olx.olx.R.id.publish_describe));

		boolean checkpoint5 = SoloFactory.getSolo().searchText(Repository.DRAFT_TITLE);
		
		return (checkpoint2 && checkpoint3 && checkpoint4 && checkpoint5) == true;
		}
	

	public void deleteADraft(){
		postingHub.goToHomePage();
		homeScreen.goToMyAds();
		this.my_ads_item_menu.click();
		Solo solo = SoloFactory.getSolo();
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
		solo.waitForDialogToOpen(5000);
		solo.clickOnView(solo.getView(android.R.id.button1));
	}
	
	public void editADraft(){
		postingHub.goToHomePage();
		homeScreen.goToMyAds();
		Solo solo = SoloFactory.getSolo();
		solo.clickInList(1,0);
		solo.clickOnView(solo.getView(com.olx.olx.R.id.publish_describe));
		solo.clearEditText((android.widget.EditText) solo.getView(com.olx.olx.R.id.text_field_text));
		solo.enterText((android.widget.EditText) solo.getView(com.olx.olx.R.id.text_field_text), Repository.DRAFT_TITLE_EDITED);
		solo.clickOnView(solo.getView(com.olx.olx.R.id.action_selection_ok));
		solo.goBack();
		solo.sleep(2000);

	//	assertTrue(solo.getString(com.olx.olx.R.string.publish_save_draft), solo.waitForView(solo.getView(android.R.id.message)));
		
		solo.clickInList(1,0);
		solo.clickOnView(solo.getView(com.olx.olx.R.id.publish_describe));
//		assertTrue(solo.searchText(Repository.DRAFT_TITLE_EDITED));
	}
	
	
	
}
