package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	//Shirt size type
	@FindBy(xpath="//span[@class='btn__label' and text()='Size Type:']")
	public WebElement ddSizeType;
	
	//Shirt men size
	@FindBy(xpath="//body/div[2]/main[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/span[1]/button[1]")
	public WebElement ddMenSize;
	
	//Shirt shade
	@FindBy(xpath="//span[@class='btn__label' and text()='Shade:']")
	public WebElement ddShade;
	
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	//Add to Cart
	@FindBy(xpath="//span[contains(text(), 'Add to cart')]")
	public WebElement btnAddCart;
	
	//USA Shoe size
	@FindBy(xpath="//span[contains(text(),'US Shoe Size:')]")
	public WebElement ddShoeSize;
}