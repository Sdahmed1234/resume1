
@tag
Feature: Authentifaction data
  
  @tag1
  Scenario: connexion 
   
    Given tap Url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When sais user "Admin"
    And sais mdp "admin123"
    And cliquer sur  se connecter
    Then verifier le  profil "Paul Collings"
   

