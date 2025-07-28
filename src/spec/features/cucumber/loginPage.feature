@login
Feature: Authentififcation
 ETQ utilisateur je souhaite me connecter sur le site orange
  @login_valid_credntials
  Scenario: je souhaite me connecter avec des identifiants valides
    Given je navigue sur le site orange
    When je saisis le username
    And je saisis le mot de passe
    And je clique sur le bouton ligin
    Then je me rederige vers la page "dashboard"
   