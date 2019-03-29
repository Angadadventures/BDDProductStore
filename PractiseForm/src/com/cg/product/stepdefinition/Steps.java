package com.cg.product.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.product.pagebean.ProductPagebean;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private WebDriver driver;

	private ProductPagebean pageBean;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^User is accessing Product registration page on browser$")
	public void user_is_accessing_Product_registration_page_on_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("C:\\M3Example\\PractiseForm\\HtmlPages\\AddProductForm.html");
		pageBean = PageFactory.initElements(driver, ProductPagebean.class);
		// throw new PendingException();
	}

	@When("^user is trying to submit data without entering 'Product Id'$")
	public void user_is_trying_to_submit_data_without_entering_Product_Id() throws Throwable {

		pageBean.setProdId("");
		pageBean.clickSubmit();
		Thread.sleep(1000);
		// throw new PendingException();
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String expectedMessage) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String actualAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualAlertMessage);
	}

	@When("^user is trying to submit data without entering 'Product name'$")
	public void user_is_trying_to_submit_data_without_entering_Product_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("");
		
		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@When("^user is trying to submit data without entering 'Price'$")
	public void user_is_trying_to_submit_data_without_entering_Price() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("");

		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@When("^user is trying to submit data without entering 'Address'$")
	public void user_is_trying_to_submit_data_without_entering_Address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("6000");
		pageBean.setAddress("");

		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@When("^user is trying to submit data without entering 'city'$")
	public void user_is_trying_to_submit_data_without_entering_city() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("6000");
		pageBean.setAddress("HNO56789");
		// pageBean.setCity("");

		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@When("^user is trying to submit data without entering 'Email'$")
	public void user_is_trying_to_submit_data_without_entering_Email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		Thread.sleep(5000);

		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("6000");
		pageBean.setAddress("HNO56789");
		pageBean.setCity("Hyderabad");

		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@When("^user is trying to submit data without entering 'Product Category'$")
	public void user_is_trying_to_submit_data_without_entering_Product_Category() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("6000");
		pageBean.setAddress("HNO56789");
		pageBean.setCity("Hyderabad");
		pageBean.setEmail("gurjot@gmail.com");
		
		// pageBean.setCategory("");

		pageBean.clickSubmit();
		Thread.sleep(1000);

	}

	@Given("^User is on Product registration page on Browser$")
	public void user_is_on_Product_registration_page_on_Browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.get("C:\\M3Example\\PractiseForm\\HtmlPages\\AddProductForm.html");
		pageBean = PageFactory.initElements(driver, ProductPagebean.class);
	}

	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		// driver.switchTo().alert().dismiss();
		pageBean.setProdId("123");
		pageBean.setProdName("GurjotSin");
		pageBean.setProdPrice("6000");
		pageBean.setAddress("HNO56789");
		pageBean.setCity("Hyderabad");
		pageBean.setEmail("gurjot@gmail.com");
		pageBean.setCategory("Electronics");
		pageBean.setTyp("B");
		pageBean.clickSubmit();
		Thread.sleep(1000);
	}

	@Then("^'Your Succesfully added a Product ' should be displayed$")
	public void your_Succesfully_added_a_Product_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String expmsg = "Your Succesfully added a Product ";
		String actmsg = driver.switchTo().alert().getText();
		Assert.assertEquals(expmsg, actmsg);

	}

	@After
	public void tearDownStepEnv() {
		// driver.switchTo().alert().dismiss();
		driver.quit();
	}

}
