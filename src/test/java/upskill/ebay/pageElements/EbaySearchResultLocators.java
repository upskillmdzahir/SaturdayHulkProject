package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	// Validate Shoes Items
	@FindBy(xpath = "//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;

	// Validate Pants Items
	@FindBy(xpath = "//span[2][@class='BOLD' and contains(text(), 'Pants')]")
	public WebElement txtPants;

	// Validate Shirts Items
	@FindBy(xpath = "//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;

	// Checkbox Brand Addidas
	@FindBy(xpath = "//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	// Checkbox Brand Nike
	@FindBy(xpath = "//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	// Checkbox Brand Unbranded
	@FindBy(xpath = "//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;

	// Checkbox Color Black
	@FindBy(xpath = "//input[@aria-label='Black']")
	public WebElement cbxColorBlack;

	// Checkbox Color White
	@FindBy(xpath = "//input[@aria-label='White']")
	public WebElement cbxColorWhite;

	// Checkbox Color Blue
	@FindBy(xpath = "//input[@aria-label='Blue']")
	public WebElement cbxColorBlue;

	// Shirt Link
	@FindBy(xpath = "//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
	public WebElement linkShirtItems;
	
	// Shoe Link
	@FindBy(xpath = "//span[contains(text(),'Nike Air Jordan Retro 4 Oxidized')]")
	public WebElement linkShoeItems;

}
