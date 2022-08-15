@authentification
Feature: ARVEA - Connexion
  En tant que utilisateur je souhaite tester la page de connexion

  Background: 
    Given Je me connecte à l'application Arvea


  Scenario: Je teste la page de connexion de l'application Arvea
    And Je me connecte à mon compte Arvea "TN06296712" "megadios"


  Scenario: Je teste la déconnexion de l'application Arvea
    And Je me connecte à mon compte Arvea "TN06296712" "megadios"
    When Je me deconnecte de l'application Arvea

  @compte
  Scenario Outline: Je teste la déconnexion de l'application Arvea
    And Je clique sur créer mon compte
    And Je saisis le Code de Parrainage "<code>"
    And Je saisis un Pays de nationalité
    And Je saisis une adresse E-mail "<email>"
    And Je saisis le Nom et Prénom "<name>"
    And Je saisis le Pays d'exercice / de résidence
    And Je saisis le N° Carte d'Identité Nationale "<ncarte>"
    And Je clique sur s'inscrire sur mon compte

    Examples: 
      | code   | email         | name      | ncarte     |
      | 010203 | test@test.com | Jeje JIJI | 0123456789 |
      
      
   @login-KO
  Scenario: Je teste la page de connexion de l'application Arvea - cas non passant
    And Je me connecte à mon compte Arvea "Test" "Test" 
    Then Je vérifie le message d'erreur "info_outline"

