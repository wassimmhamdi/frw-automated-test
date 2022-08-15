package com.e2eTests.automatedTests.addUser.addUserStepDefinition;


import com.e2eTests.automatedTests.addUser.addUserPage.AddUserPage;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.utilis.CommonMethods;
import com.e2eTests.automatedTests.utilis.Setup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;

public class AddUserStepDefinition {
    private AddUserPage addUserPage;
    private CommonMethods commonMethods ;
    public WebDriver driver;

    public AddUserStepDefinition() {
        this.addUserPage = new AddUserPage();
    }

    @And("^I am authenticated as admin \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_am_authenticated_as_admin_something_something(String name, String password) throws Throwable {
        addUserPage.loginToApp(name, password);
    }


    @When("^I click on PIM tab$")
    public void i_click_on_pim_tab() throws Throwable {
        addUserPage.clickPIMTab();
    }

    @And("^I click on Add Employee tab$")
    public void i_click_on_add_employee_tab() throws Throwable {
        addUserPage.clickOnAddEmployeeTab();

    }

    @And("^I fill the first name \"([^\"]*)\"$")
    public void i_fill_the_first_name_something(String ftName) throws Throwable {
        addUserPage.fillFirstName(ftName);
    }

    @And("^I fill the last name \"([^\"]*)\"$")
    public void i_fill_the_last_name_something(String LName) throws Throwable {
        addUserPage.fillLastName(LName);
    }

    @And("^I fill ID user \"([^\"]*)\"$")
    public void i_fill_id_user_something(String eId) throws Throwable {
     addUserPage.fillEmployeeId(eId);
    }

    @And("^I choose a picture$")
    public void i_choose_a_picture() throws Throwable {
        addUserPage .clickOnChoosePicture();
    }

    @When("^I click on Create Login Details radio button$")
    public void i_click_on_create_login_details_radio_button() throws Throwable {
        addUserPage.clickOnCreateLoginDetailsRadioButton();
    }

    @And("^I fill a user Name \"([^\"]*)\"$")
    public void i_fill_a_user_name_something(String user) throws Throwable {
        addUserPage.fillUserName(user);
    }

    @And("^I fill a password \"([^\"]*)\"$")
    public void i_fill_a_password_something(String psw) throws Throwable {
        addUserPage.fillUserPassword(psw);
    }

    @And("^I Confirm password \"([^\"]*)\"$")
    public void i_confirm_password_something(String psw) throws Throwable {
        addUserPage.ConfirmUserPassword(psw);
    }

    @And("^I select a status$")
    public void i_select_a_status() throws Throwable {
        addUserPage.selectStatus();
    }

    @And("^I click on save button of Add Employee section$")
    public void i_click_on_save_button_of_add_employee_section() throws Throwable {
        addUserPage.clickOnSaveButtonAddEmployeeSection();
    }

    @Then("^I check that the page is switched to Personal Details page$")
    public void i_check_that_the_page_is_switched_to_personal_details_page() throws Throwable {
        addUserPage.check();
    }

    @When("^I click on edit button of Personal Details section$")
    public void i_click_on_edit_button_of_personal_details_section() throws Throwable {
        addUserPage.clickOnEditPersonalDetailsSection();
    }


    @And("^I click on gender radio button$")
    public void i_click_on_gender_radio_button() throws Throwable {
        addUserPage.clickOnGenderRadioButton();
    }

    @And("^i select a nationality$")
    public void i_select_a_nationality() throws Throwable {
        addUserPage.selectNationality();

    }

    @And("^I click on save button of Personal Details section$")
    public void i_click_on_save_button_of_personal_details_section() throws Throwable {
        addUserPage.clickOnSavePersonalDetailsSection();
    }

    @And("^I click on edit button of Custom Fields section$")
    public void i_click_on_edit_button_of_custom_fields_section() throws Throwable {
        addUserPage.clickOnEditCustomFieldsSection();
    }

    @And("^I select a blood type$")
    public void i_select_a_blood_type() throws Throwable {
        addUserPage.selectBloodType();
    }

    @And("^I click on save button of Custom Fields section$")
    public void i_click_on_save_button_of_custom_fields_section() throws Throwable {
        addUserPage.clickOnSavebuttonCustomFieldsSection();
    }

    @When("^I click on Employee list tab$")
    public void i_click_on_employee_list_tab() throws Throwable {
        addUserPage.clickOnemployeeListTab();
    }

    @And("^I fill a Employee Name \"([^\"]*)\"$")
    public void i_fill_a_employee_name_something(String etName) throws Throwable {
        addUserPage.fillEmployeeName(etName);
    }

    @And("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
        addUserPage.clickOnSearchButton();
    }

    @Then("^I check that the name of user is well displayed$")
    public void i_check_that_the_name_of_user_is_well_displayed() throws Throwable {
       addUserPage.check2();
    }
}
