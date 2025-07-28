package com.automation.e2etests.steps_defitions;

import org.junit.jupiter.api.Assertions;

import com.automation.e2etests.pages.objects.LoginPage;
import com.automation.e2etests.utils.ConfigFileReader;
import com.automation.e2etests.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	LoginPage loginPage;
	ConfigFileReader configFileReader;
	SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();

	}

	@Given("je navigue sur le site orange")
	public void jeNavigueSurLeSiteOrange() throws InterruptedException {
		seleniumUtils.get(configFileReader.getProperty("home.url"));
		Thread.sleep(3000);

	}

	@When("je saisis le username")
	public void jeSaisisLeUsername(){
		seleniumUtils.writeText(LoginPage.getUsername(), configFileReader.getProperty("home.username"));

	}

	@When("je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		seleniumUtils.writeText(LoginPage.getPassword(), configFileReader.getProperty("home.password"));

	}

	@When("je clique sur le bouton ligin")
	public void jeCliqueSurLeBoutonLigin() {

		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("je me rederige vers la page {string}")
	public void jeMeRederigeVersLaPage(String text) {
		String result = seleniumUtils.readText(LoginPage.getTextDashboard());
		Assertions.assertEquals(result, text);
	}




}