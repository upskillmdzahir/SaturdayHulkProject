package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}
	
	public void searchShoes(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchPants(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Pants");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchShirts(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchItems(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
}


	//EbayHomePageLocators EbayHomePageLocatorsObj;//intitailizing obj here(cause it needs to be global obj)
	
	//public EbayHomePageActions() {//we created this constructor to pull locators and execute it 1st with the help of constructor
		
		//EbayHomePageLocatorsObj = new EbayHomePageLocators(); //Assigning it inside the costructor as we need to 
		//excute it 1st with the help of constructor but if we put it inside the constructor method it will become loacl 
		//so we intialized it in class level and assigning it in local)
	