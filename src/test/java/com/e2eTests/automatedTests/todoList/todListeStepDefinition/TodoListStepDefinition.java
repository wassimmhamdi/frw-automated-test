package com.e2eTests.automatedTests.todoList.todListeStepDefinition;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.todoList.todoListPage.TodoListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TodoListStepDefinition {

    private TodoListPage todoListPage;

    public TodoListStepDefinition() {
        this.todoListPage = new TodoListPage();
    }

    @When("^Je saisis une Adresse mail \"([^\"]*)\"$")
    public void je_saisis_une_adresse_mail_something(String mail) throws Throwable {
        todoListPage.saisieAdressMail(mail);
    }

    @When("^je saisis le champ Nom de la tâche \"([^\"]*)\"$")
    public void je_saisis_le_champ_nom_de_la_tche_something(String md1) throws Throwable {
       todoListPage.saisietache(md1);
    }

    @Then("^Je vérifie que Submit est non cliquable$")
    public void je_vrifie_que_submit_est_non_cliquable() throws Throwable {
        todoListPage.bouttonSubmitNonCliquable();
    }

    @Then("^Je vérifie que le bouton Submit est cliquable$")
    public void je_vrifie_que_le_bouton_submit_est_cliquable() throws Throwable {
        todoListPage.clickSubmitButton();
        todoListPage.bouttonSubmitCliquable();
    }

    @Then("^Je vérifie que le bouton Ajouter la tâche est cliquable$")
    public void je_vrifie_que_le_bouton_ajouter_la_tche_est_cliquable() throws Throwable {
         todoListPage.clickAjouterTacheButton();
    }

    @Then("^Je vérifie qu'un message rouge apparaît \"([^\"]*)\"$")
    public void je_vrifie_quun_message_rouge_apparat_something(String msg) throws Throwable {
        todoListPage.clickSubmitButton();
        String message = TodoListPage.alertemessage.getText();
        Assert.assertTrue(message.contains(msg));
    }

    @Then("^je vérifie que le bouton Tâche est non activé$")
    public void je_vrifie_que_le_bouton_tche_est_non_cliquable() throws Throwable {
          todoListPage.bouttonTacheNonAffiché();
    }

    @Then("^Je vérifie que le bouton Tâche est activé$")
    public void je_vrifie_que_le_bouton_tche_est_cliquable() throws Throwable {

    }

    @And("^Je saisi un mot de passe \"([^\"]*)\"$")
    public void je_saisi_un_mot_de_passe_something(String mdp) throws Throwable {
        todoListPage.saisieMotDePasse(mdp);
    }

    @And("^Je vérifie que le bouton Ajouter la tâche est non cliquable$")
    public void je_vrifie_que_le_bouton_ajouter_la_tche_est_non_cliquable() throws Throwable {

    }

    @And("^je sais le champ Description de la tâche en une ligne \"([^\"]*)\"$")
    public void je_sais_le_champ_description_de_la_tche_en_une_ligne_something(String md2) throws Throwable {
        todoListPage.saisiedestache(md2);
    }

    @And("^Je saisis un mot de passe \"([^\"]*)\"$")
    public void je_saisis_un_mot_de_passe_something(String strArg1) throws Throwable {

    }

    @And("^Je vérifie que le bouton Déconnexion est non activé$")
    public void je_vrifie_que_le_bouton_dconnexion_est_non_cliquable() throws Throwable {
todoListPage.bouttonDeconnexionNonaffiché();
    }

    @And("^Je vérifie que le bouton Déconnexion est activé$")
    public void je_vrifie_que_le_bouton_dconnexion_est_cliquable() throws Throwable {

    }

    @And("^Je clique sur le bouton déconnexion$")
    public void je_clique_sur_le_bouton_dconnexion() throws Throwable {
todoListPage.clickDeconnexionButton();
    }

}
