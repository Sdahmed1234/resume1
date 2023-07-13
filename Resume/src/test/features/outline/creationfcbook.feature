@tag
Feature: Creation compte fcbook avec plusieurs donnees

  @tag2
  Scenario Outline: Creation compte fcbook
    Given Cliquer sur l icone de navigateur
    And Saisir Url "https://fr-fr.facebook.com/"
    When Cliquer sur Creer nouv compte
    And Saisir le prenom "<Prenom>"
    And Saisir le nom "<Nom>"
    And Saisir l adresse Email "<adresse Email>"
    And Confirmer adresse Email "<adresse Email>"
    And Saisir nouv mot de passe "<nouv mot de passe>"
    And Saisir le jour de naissance "<jdn>"
    And Saisir le mois de naissance  "<mdn>"
    And Saisir l annee de naissance  "<adn>"
    And cocher Homme
    And cliquer sur INSCRIRE
    Then Compte creer avec succes

    Examples: 
      | Prenom | Nom     | adresse Email         | nouv mot de passe | jdn | mdn | adn  |
      | Ahmed  | Ali     | potrafertu@gufum.com  | 159357Bb'(        |  15 |   9 | 1980 |
      | Mahdi  | ozil    | potrafertu1@gufum.com | 753159Cc('        |   6 |   8 | 1996 |
      | Med    | dimaria | potrafertu2@gufum.com | 852369AA--        |   7 |   2 | 2012 |
