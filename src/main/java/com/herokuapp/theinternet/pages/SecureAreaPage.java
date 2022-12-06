package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject {

	private String pageSecureUrl = "http://the-internet.herokuapp.com/secure";
	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	private By successsMsg = By.id("flash-messages");

	public SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageSecureUrl;
	}

	/** Verification if logOutButton is displayed */
	public boolean isLogOutButtonDisplayed() {
		return find(logOutButton).isDisplayed();
	}

	/** Return text from success message */
	public String getSuccessMessageText() {
		return find(successsMsg).getText();
	}
}