package com.automation.e2etests.pages.objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2etests.utils.BasePage;

public class LoginPage extends BasePage {

	@FindBy(how = How.NAME, using = "username")
	private static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public static WebElement getUsername() {

		return username;

	}
	
	public static WebElement getPassword() {

		return password;

	}
	
	public static WebElement getBtnLogin() {

		return btnLogin;

	}

}

