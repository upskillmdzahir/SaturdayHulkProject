package upskill.ebay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}

	public void verifyShoesItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());

		// Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());

		// Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}

	public void verifyPantsItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());

		// Option 2
		Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());

		// Option 3
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}

	public void verifyShirtsItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());

		// Option 2
		Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());

		// Option 3
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}

	public void filterBrand(String brand) {
		if (brand.equals("Adidas")) {
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not found");
		}
	}

	public void verifyBrandItems(String brand) {
		if (brand.equals("Adidas")) {
			Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		} else if(brand.equals("Nike")){
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		} else if(brand.equals("Unbranded")){
			Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		} else {
			System.out.println("Brand not found");
		}

	}
	
	public void filterColor(String color) {
		if (color.equals("White")) {
			EbaySearchResultLocatorsObj.cbxColorWhite.click();
		} else if(color.equals("Black")){
			EbaySearchResultLocatorsObj.cbxColorBlack.click();
		} else if(color.equals("Blue")){
			EbaySearchResultLocatorsObj.cbxColorBlue.click();
		} else {
			System.out.println("Color not found");
		}
	}
	
	public void verifyColorItems(String color) {
		if (color.equals("White")) {
			Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		} else if(color.equals("Black")){
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		}  else if(color.equals("Blue")){
			Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		} else {
			System.out.println("Color not found");
		}

	}
	
	public void selectCottonTee(){
		EbaySearchResultLocatorsObj.linkShirtItems.click(); 
		
	}
	
	 public void selectAirJordan() {
		 EbaySearchResultLocatorsObj.linkShoeItems.click();
	    }
}

// EbaySearchResultLocators EbaySearchResultLocatorsObj;//intitailizing obj
// here(cause it needs to be global obj)

// public EbaySearchResultActions() {//we created this constructor to pull
// locators and execute it 1st with the help of constructor

// EbaySearchResultLocatorsObj = new EbaySearchResultLocators();//Assigning it
// inside the costructor as we need to
// excute it 1st with the help of constructor but if we put it inside the
// constructor method it will become loacl
// so we intialized it in class level and assigning it in local)
