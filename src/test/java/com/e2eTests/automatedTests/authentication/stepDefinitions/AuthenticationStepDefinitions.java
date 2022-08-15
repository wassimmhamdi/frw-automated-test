package com.e2eTests.automatedTests.authentication.stepDefinitions;

import org.junit.Assert;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinitions {
	
	 private AuthenticationPage authenticationPage;

	    public AuthenticationStepDefinitions() {
	        this.authenticationPage = new AuthenticationPage();
	    }
	
//	@Given("^Je me connecte à l'application Arvea$")
//	public void jeMeConnecteÀLApplicationArvea() throws Throwable {
//		authenticationPage.goToHomePage();
//	}

	 /*Login*/
	@When("^Je me connecte à mon compte Arvea \"([^\"]*)\" \"([^\"]*)\"$")
	public void jeMeConnecteÀMonCompteArvea(String name, String password) throws Throwable {
		authenticationPage.login(name, password);
	}
	
	/*Logout*/
	@When("^Je me deconnecte de l'application Arvea$")
	public void jeMeDeconnecteDeLApplicationArvea() throws Throwable {
		authenticationPage.logout();
	}
	
	/*Create account*/
	@When("^Je clique sur créer mon compte$")
	public void jeCliqueSurCréerMonCompte() throws Throwable {
		authenticationPage.clickOnCreateAccount();
	}

	@And("^Je saisis le Code de Parrainage \"([^\"]*)\"$")
	public void jeSaisisLeCodeDeParrainage(String code) throws Throwable {
		authenticationPage.fillGodFatherCode(code);
	}

	@And("^Je saisis un Pays de nationalité$")
	public void jeSaisisUnPaysDeNationalité() throws Throwable {
		authenticationPage.fillNationalityContainer();
	}

	@And("^Je saisis une adresse E-mail \"([^\"]*)\"$")
	public void jeSaisisUneAdresseEMail(String email) throws Throwable {
		authenticationPage.fillEMail(email);
	}

	@And("^Je saisis le Nom et Prénom \"([^\"]*)\"$")
	public void jeSaisisLeNomEtPrénom(String name) throws Throwable {
		authenticationPage.fillName(name);
	}

	@And("^Je saisis le Pays d'exercice / de résidence$")
	public void jeSaisisLePaysDExerciceDeRésidence() throws Throwable {
		authenticationPage.fillContryContainer();
	}

	@And("^Je saisis le N° Carte d'Identité Nationale \"([^\"]*)\"$")
	public void jeSaisisLeNCarteDIdentitéNationale(String cin) throws Throwable {
		authenticationPage.fillCin(cin);
	}

	@And("^Je clique sur s'inscrire sur mon compte$")
	public void jeCliqueSurSInscrireSurMonCompte() throws Throwable {
		authenticationPage.clickInscription();
	}
	
	/*Create account*/
	@Then("^Je vérifie le message d'erreur \"([^\"]*)\"$")
	public void jeVérifieLeMessageDErreur(String alert) throws Throwable {
		String messageAlert = AuthenticationPage.alertText.getText();
		Assert.assertTrue(messageAlert.contains(alert));
	}
}
