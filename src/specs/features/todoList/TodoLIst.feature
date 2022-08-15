@TodoList
Feature: TodoList

  Background:
    Given J'accède à l'application

  @Q1
  Scenario: Question_1
    Then Je vérifie que Submit est non cliquable
    When Je saisis une Adresse mail "test@test.com"
    And Je saisi un mot de passe "test"
    Then Je vérifie que le bouton Submit est cliquable

    And Je vérifie que le bouton Ajouter la tâche est non cliquable
    When je saisis le champ Nom de la tâche "tâche 01"
    And je sais le champ Description de la tâche en une ligne "Description"
    Then Je vérifie que le bouton Ajouter la tâche est cliquable
    And Je clique sur le bouton déconnexion


  @Q3
  Scenario: Question_3
    When Je saisis une Adresse mail "user@user.com"
    And Je saisi un mot de passe "user"
    Then Je vérifie qu'un message rouge apparaît "Désolé"

  @Q4
  Scenario: Question_4
   Then je vérifie que le bouton Tâche est non activé
    And Je vérifie que le bouton Déconnexion est non activé
    When Je saisis une Adresse mail "test@test.com"
    And Je saisi un mot de passe "test"
    Then Je vérifie que le bouton Tâche est activé
    And Je vérifie que le bouton Déconnexion est activé

