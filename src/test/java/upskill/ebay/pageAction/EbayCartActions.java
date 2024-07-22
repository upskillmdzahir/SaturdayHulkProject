package upskill.ebay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
			for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void selectSizeTypeDD() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);
		dropDown.selectByVisibleText("Big & Tall");
	}
	
	public void selectMenSizeDD(){
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
		dropDown.selectByVisibleText("4XLT");
	}
	
	public void selectShadeDD() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddShade);
		dropDown.selectByVisibleText("Black");
	}
	
	public void enterQuantity(){
		EbayCartLocatorsObj.txtbxQty.clear();
		EbayCartLocatorsObj.txtbxQty.sendKeys("2");
	}
	
	public void addToCart(){
		EbayCartLocatorsObj.btnAddCart.click();
	}
	
	public void selectAirJordan() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddShoeSize);
		dropDown.selectByVisibleText("11");
	}

}