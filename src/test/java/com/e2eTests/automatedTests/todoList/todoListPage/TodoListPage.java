package com.e2eTests.automatedTests.todoList.todoListPage;

import com.e2eTests.automatedTests.steps.CommonSteps;
import com.e2eTests.automatedTests.utilis.BasePage;
import com.e2eTests.automatedTests.utilis.CommonMethods;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TodoListPage extends BasePage {
    public WebDriverWait wait;
    CommonSteps commonSteps = new CommonSteps();
    private static final String HOME_PAGE_URL2 = "http://localhost:3000/";
    public static CommonMethods commonMethods = new CommonMethods(driver);
    static JSONObject object = commonMethods.JsonData(0);
    public static long shortWait = Long.valueOf((String) object.get("short-wait"));
    public TodoListPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL2);

    }
    // Locators /
    final static String adressMail_XPATH = "//*[@class='form-control' and @type='email']";
    final static String motDePasse_XPATH = "//*[@class='form-control' and @type='password']";
    final static String submitButton_XPATH = "//*[@class='btn btn-primary']";
    final static String tâche_XPATH = "//*[contains(text(),'Nom de la tâche')]/following::*[@class='form-control'][1]";
    final static String descTâche_XPATH = "//*[contains(text(),'Description')]/following::*[@class='form-control'][1]";
    final static String buttonTâche_XPATH = "//*[@class='nav-link' and contains(text(),'Tâches')]";
    final static String buttonDeconnexion_XPATH = "//*[@class='nav-link' and contains(text(),'Déconnexion')]";
    final static String buttonAjouterTache_XPATH = "//*[@class='btn btn-primary']";
    final static String alertemessage_XPATH = "//*[@class='alert alert-danger']";

    @FindBy(how= How.XPATH, using=adressMail_XPATH)
    public static WebElement adressMail;
    @FindBy(how= How.XPATH, using=motDePasse_XPATH)
    public static WebElement motDePasse;
    @FindBy(how= How.XPATH, using=submitButton_XPATH )
    public static WebElement submitButton;
    @FindBy(how= How.XPATH, using=tâche_XPATH )
    public static WebElement tâche;
    @FindBy(how= How.XPATH, using=descTâche_XPATH )
    public static WebElement descTâche;
    @FindBy(how= How.XPATH, using= buttonTâche_XPATH )
    public static WebElement buttonTâche;
    @FindBy(how= How.XPATH, using= buttonDeconnexion_XPATH )
    public static WebElement buttonDeconnexion;
    @FindBy(how= How.XPATH, using= buttonAjouterTache_XPATH )
    public static WebElement buttonAjouterTache;
    @FindBy(how= How.XPATH, using= alertemessage_XPATH )
    public static WebElement alertemessage;

    //Methods
    public void bouttonSubmitNonCliquable() {
        boolean status1 = submitButton.isEnabled();
        System.out.println("status1   " +status1);
    }

    public void bouttonSubmitCliquable() {
        boolean status4 = submitButton.isEnabled();
        System.out.println("status4   " +status4);
    }

    public void saisieAdressMail(String mail) {
        adressMail.sendKeys(mail);
    }

    public void saisieMotDePasse(String mdp) {
        motDePasse.sendKeys(mdp);
    }

    public void clickSubmitButton( ){ submitButton.click(); }

    public void saisietache(String md1){
        tâche.sendKeys(md1);
    }

    public void saisiedestache(String md2){
        descTâche.sendKeys(md2);
    }

    public void bouttonTacheNonAffiché () {
        boolean status2 = buttonTâche.isDisplayed();
        System.out.println(status2);
    }

    public void bouttonDeconnexionNonaffiché () {
        boolean status3 = buttonDeconnexion.isDisplayed();
        System.out.println(status3);
    }

    public void clickAjouterTacheButton( ){
        buttonAjouterTache.click();
    }
    public void clickDeconnexionButton( ) {
        buttonDeconnexion.click();

    }

}
