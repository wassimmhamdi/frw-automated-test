package com.e2eTests.automatedTests.addUser.addUserPage;

import com.e2eTests.automatedTests.steps.CommonSteps;
import com.e2eTests.automatedTests.utilis.BasePage;
import com.e2eTests.automatedTests.utilis.CommonMethods;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class AddUserPage extends BasePage {
    public WebDriverWait wait;
    CommonSteps commonSteps = new CommonSteps();
    private static final String HOME_PAGE_URL = "https://opensource-demo.orangehrmlive.com/";
    public static CommonMethods commonMethods = new CommonMethods(driver);
    static JSONObject object = commonMethods.JsonData(0);
    public static long shortWait = Long.valueOf((String) object.get("short-wait"));

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(HOME_PAGE_URL);

    }
    // Locators /
    final static String login_ID = "txtUsername";
    final static String password_ID = "txtPassword";
    final static String login_BUTON_ID = "btnLogin";
    final static String pim_Tab_ID = "menu_pim_viewPimModule";
    final static String addUser_Tab_ID = "menu_pim_addEmployee";
    final static String first_Name_ID = "firstName";
    final static String last_Name_ID = "lastName";
    final static String choose_file_ID = "photofile";
    final static String radio_Button_ID = "chkLogin";
    final static String user_Name_ID = "user_name";
    final static String pass_Word_ID = "user_password";
    final static String re_Pass_Word_ID = "re_password";
    final static String status_ID = "status";
    final static String save_ADDUser_Section_ID = "btnSave";
    final static String gender_Radio_Button_ID = "personal_optGender_1";
    final static String edit_Personal_Details_section_ID= "btnSave";
    final static String nationality_ID = "personal_cmbNation";
    final static String edit_Button_Custom_Section_ID= "btnEditCustom']";
    final static String bloodType_XPATH = "//*[@name='custom1' and @class='editable']";
    final static String verif_XPATH = "//h1[contains(text(),'Personal Details')]";
    final static String employee_List_Tab ="menu_pim_viewEmployeeList";
    final static String employee_Name ="empsearch_employee_name_empName";
    final static String employeeId ="employeeId";
    final static String checkId_XPATH ="//*[@class='left'][2]";
    final static String search_ID ="searchBtn";
    List<WebElement> options = driver.findElements(By.xpath("//*[@class='left'][2]"));


    // @FindBy /
    @FindBy(how = How.ID, using = login_ID)
    public static WebElement login;
    @FindBy(how = How.ID, using = password_ID)
    public static WebElement userPassword;
    @FindBy(how = How.ID, using = login_BUTON_ID)
    public static WebElement loginButton;
    @FindBy(how = How.ID, using = pim_Tab_ID)
    public static WebElement pimTab;
    @FindBy(how = How.ID, using = addUser_Tab_ID)
    public static WebElement addUserTab;
    @FindBy(how = How.ID, using = first_Name_ID)
    public static WebElement firstName;
    @FindBy(how = How.ID, using = last_Name_ID)
    public static WebElement lastName;
    @FindBy(how = How.ID, using = choose_file_ID)
    public static WebElement chooseFile;
    @FindBy(how = How.ID, using = radio_Button_ID)
    public static WebElement radioButton;
    @FindBy(how = How.ID, using = user_Name_ID)
    public static WebElement userName;
    @FindBy(how = How.ID, using = pass_Word_ID)
    public static WebElement pass_word;
    @FindBy(how = How.ID, using = re_Pass_Word_ID)
    public static WebElement re_Pass_Word;
    @FindBy(how = How.ID, using = status_ID)
    public static WebElement status;
    @FindBy(how = How.ID, using = save_ADDUser_Section_ID)
    public static WebElement save_ADDUser_Section;
    @FindBy(how = How.ID, using = edit_Personal_Details_section_ID)
    public static WebElement edit_Personal_Details_section;
    @FindBy(how = How.ID, using = gender_Radio_Button_ID)
    public static WebElement gender_Radio_Button;
    @FindBy(how = How.ID, using = nationality_ID)
    public static WebElement nationality;
    @FindBy(how = How.ID, using = edit_Button_Custom_Section_ID)
    public static WebElement edit_Button_Custom_Section;
    @FindBy(how = How.ID, using = bloodType_XPATH)
    public static WebElement bloodType;
    @FindBy(how = How.ID, using = verif_XPATH)
    public static WebElement verif;
    @FindBy(how=How.ID, using=employee_List_Tab)
    public static WebElement employeeListTab;
    @FindBy(how=How.ID, using=employee_Name)
    public static WebElement employeeName;
    @FindBy(how=How.ID, using=employeeId)
    public static WebElement employee_id;
    @FindBy(how=How.XPATH, using=checkId_XPATH)
    public static WebElement check_id;
    @FindBy(how=How.ID, using=search_ID)
    public static WebElement search;

    // Methods /
    public void loginToApp(String name, String password) {
        login.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
    }

    public void clickPIMTab() {
        pimTab.click();
    }

    public void clickOnAddEmployeeTab() {
        addUserTab.click();
    }

    public void fillFirstName(String ftName) {
        firstName.sendKeys(ftName);
    }

    public void fillLastName(String LName) {
        lastName.sendKeys(LName);
    }

    public void  clickOnChoosePicture() throws InterruptedException {
        String filePath = "/home/exo/Downloads/fatmaimage.jpg";
        Thread.sleep(shortWait);
        chooseFile.click();
        commonSteps.uploadFileWithRobot(filePath);
        Thread.sleep(3000);}

    public void  clickOnCreateLoginDetailsRadioButton() {
        radioButton.click();
    }

    public void  fillUserName(String user) throws InterruptedException {
        Thread.sleep(2000);
        userName.sendKeys(user);
    }

    public void  fillUserPassword(String psw) {
        pass_word.sendKeys(psw);
    }

    public void  ConfirmUserPassword(String psw) {
        re_Pass_Word.sendKeys(psw);
    }

    public void  selectStatus() {
        Select select = new Select(status);
        select.selectByValue("Enabled");
    }

    public void  clickOnSaveButtonAddEmployeeSection() throws InterruptedException {
        save_ADDUser_Section.click();
        Thread.sleep(shortWait);
    }

    public void  clickOnEditPersonalDetailsSection() throws InterruptedException {
        edit_Personal_Details_section.click();
        Thread.sleep(shortWait);
    }

    public void  clickOnGenderRadioButton() throws InterruptedException {
        Thread.sleep(shortWait);
        gender_Radio_Button.click();
    }

    public void  selectNationality() {
        Select select = new Select(nationality);
        select.selectByValue("181");
    }

    public void  clickOnSavePersonalDetailsSection() throws InterruptedException {
        edit_Personal_Details_section.click();
    }

    public void  clickOnEditCustomFieldsSection() throws InterruptedException {
        Thread.sleep(shortWait);
        edit_Button_Custom_Section.click();
    }

    public void  selectBloodType() {
        Select select = new Select(bloodType);
        select.selectByValue("AB+");
    }

    public void  clickOnSavebuttonCustomFieldsSection() {
        edit_Button_Custom_Section.click();
    }

    public void  check() {
        String verifText =verif.getText();
        Assert.assertEquals("Personal Details", verifText);

    }
    public void clickOnemployeeListTab() {
        employeeListTab.click();
    }
    public void fillEmployeeName(String etName) {
        employeeName.sendKeys(etName);
    }
    public void fillEmployeeId(String eId) throws InterruptedException {
        employee_id.click();
        employee_id.sendKeys(eId);
        Thread.sleep(shortWait);
    }

    public void  check2() throws InterruptedException {
        Thread.sleep(shortWait);
       // String verifText =check_id.getText();
       // System.out.println("the id is    " +verifText);
       // Assert.assertTrue(verifText.contains("Admin"));
        int optionsList =options.size();
        for(int i=0;i<optionsList;i++)
        {String name=options.get(i).getText();
            if (name.equals("Fatma"))
            {System.out.println("vrai"  +name);;
                break;
            }
    }}
    public void clickOnSearchButton() throws InterruptedException {
        search.click();
        Thread.sleep(shortWait);
    }

}

