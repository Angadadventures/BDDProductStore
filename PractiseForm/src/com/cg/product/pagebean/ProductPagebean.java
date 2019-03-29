package com.cg.product.pagebean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductPagebean {

	@FindBy(how = How.NAME, name = "prodid")
	private WebElement productId;

	@FindBy(how = How.NAME, name = "prodname")
	private WebElement productName;

	@FindBy(how = How.NAME, name = "p_price")
	private WebElement productPrice;

	@FindBy(how = How.NAME, name = "address")
	private WebElement Address;

	@FindBy(how = How.NAME, name = "city")
	private WebElement City;

	@FindBy(how = How.NAME, name = "email")
	private WebElement Email;

	@FindBy(how = How.NAME, name = "pcat")
	private List<WebElement> productcategory;

	@FindBy(how = How.NAME, name = "typ")
	private List<WebElement> prodType;

	@FindBy(how = How.NAME, name = "submit")
	private WebElement submit;

	public String getProdId() {
		return productId.getAttribute("value");
	}

	public void setProdId(String productId) {
		this.productId.clear();
		this.productId.sendKeys(productId);
	}

	public String getProdName() {
		return productName.getAttribute("value");
	}

	public void setProdName(String productName) {
		this.productName.clear();
		this.productName.sendKeys(productName);
	}

	public String getProdPrice() {
		this.productPrice.clear();
		return productPrice.getAttribute("value");
	}

	public void setProdPrice(String productPrice) {
		this.productPrice.clear();
		this.productPrice.sendKeys(productPrice);
	}

	public String getAddress() {
		return productPrice.getAttribute("value");
	}

	public void setAddress(String Address) {
		this.Address.clear();
		this.Address.sendKeys(Address);
	}

	public String getCity() {

		return new Select(this.City).getFirstSelectedOption().getText();

	}

	public void setCity(String City) {

		Select select = new Select(this.City);
		select.selectByVisibleText(City);
	}

	public String getEmail() {
		return productPrice.getAttribute("value");
	}

	public void setEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}

	public String getCategory() {
		for (WebElement cat : productcategory) {
			if (cat.isSelected())
				return cat.getAttribute("value");
		}

		return "";

	}

	public void setCategory(String Category) {
		for (WebElement cat : this.productcategory) {
			if (cat.getAttribute("value").equals(Category))
				cat.click();
		}

	}

	public void setTyp(String t) {
		for (WebElement type : prodType) {
			if (type.isSelected())
				type.click();
			if (type.getAttribute("value").equals(t))
				type.click();
		}

	}

	public void clickSubmit() {
		this.submit.click();
	}

}
