package com.e2eTests.automatedTests.authentication.pageObjects;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.utilis.BasePage;
import com.e2eTests.automatedTests.utilis.CommonMethods;

public class AuthenticationPage extends BasePage {

	private static final String HOME_PAGE_URL = "https://test.arvea-test.ovh/login";
	public static CommonMethods commonMethods = new CommonMethods(driver);
	static JSONObject object = commonMethods.JsonData(0);
	public static long shortWait = Long.valueOf((String) object.get("short-wait"));

	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage() {
		driver.get(HOME_PAGE_URL);
		wait.forLoading(5);
	}
	
		final static String USER_NAME_ID="username";
		final static String USER_PASSWORD_ID="password";
		final static String BUTTON_LOGIN_ID="//button[@type='submit']";
		
		final static String CLOSE_POPUP="//*[@id=\"img-modal\"]/div/p";
		final static String PROFILE_BUTTON="//a[@title='Ouvrir']";
		final static String LOGOUT_BUTTON="//*[@id='profile-dropdown']/li[2]/a";
		
		final static String CREATE_MY_ACCOUNT="//*[contains(text(),'Créer mon compte')]";
		final static String GOD_FATHER_CODE_ID="godfatherCode";
		final static String NATIONALITY_CONTAINER_ID="select2-nationality-container";
		final static String EMAIL_ID="email";
		final static String FULL_NAME_ID="fullName";
		final static String COUNTRY_CONTAINER_ID="select2-country_id-container";
		final static String CIN_ID="cin";
		final static String INSCRIPTION_ID="inscription";
		final static String NATIONALITY="//*[contains(text(),'France')]";
		final static String COUNTRY="//*[@id='select2-country_id-results']/li[1]";
		final static String ALERT="(//*[@class='material-icons'])[2]";



		@FindBy(how=How.ID, using=USER_NAME_ID)
		public static WebElement userName;
		@FindBy(how=How.ID, using=USER_PASSWORD_ID)
		public static WebElement userPassword;
		@FindBy(how=How.XPATH, using=BUTTON_LOGIN_ID)
		public static WebElement btnLogin;
		
		@FindBy(how=How.XPATH, using=PROFILE_BUTTON)
		public static WebElement profileBtn;
		@FindBy(how=How.XPATH, using=LOGOUT_BUTTON)
		public static WebElement btnLogout;
		@FindBy(how=How.XPATH, using=CLOSE_POPUP)
		public static WebElement closePopup;
		
		@FindBy(how=How.XPATH, using=CREATE_MY_ACCOUNT)
		public static WebElement createMyAccount;
		@FindBy(how=How.ID, using=GOD_FATHER_CODE_ID)
		public static WebElement godfatherCode;
		@FindBy(how=How.ID, using=NATIONALITY_CONTAINER_ID)
		public static WebElement nationalityContainer;
		@FindBy(how=How.ID, using=EMAIL_ID)
		public static WebElement emailID;
		@FindBy(how=How.ID, using=FULL_NAME_ID)
		public static WebElement fullName;
		@FindBy(how=How.ID, using=COUNTRY_CONTAINER_ID)
		public static WebElement countryContainer;
		@FindBy(how=How.ID, using=CIN_ID)
		public static WebElement cinID;
		@FindBy(how=How.ID, using=INSCRIPTION_ID)
		public static WebElement inscriptionID;
		@FindBy(how=How.XPATH, using=NATIONALITY)
		public static WebElement nationality;
		@FindBy(how=How.XPATH, using=COUNTRY)
		public static WebElement country;
		@FindBy(how=How.XPATH, using=ALERT)
		public static WebElement alertText;


		
		//Methods   employeeListTab
		public void login(String name, String password) throws IOException, InterruptedException {
			userName.sendKeys(name);
			Thread.sleep(shortWait);
			userPassword.sendKeys(password);
			btnLogin.click();
			wait.forLoading(5);
		}
		
		public void logout() {
			closePopup.click();
			profileBtn.click();
			wait.forLoading(2);
			btnLogout.click();
		}
		
		public void clickOnCreateAccount() {
			createMyAccount.click();
		}
		
		public void fillGodFatherCode(String code) {
			godfatherCode.sendKeys(code);
		}
		
		public void fillNationalityContainer() {
			nationalityContainer.click();
			wait.forLoading(3);
			nationality.click();
		}
		
		public void fillEMail(String email) {
			emailID.sendKeys(email);
		}
		
		public void fillName(String name) {
			fullName.sendKeys(name);
		}
		
		public void fillContryContainer() {
			countryContainer.click();
			wait.forLoading(2);
			country.click();
		}
		
		public void fillCin(String cin) {
			cinID.sendKeys(cin);
		}
		
		public void clickInscription() {
			inscriptionID.click();
		}


}
