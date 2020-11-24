@stories

Feature: Academy choucair
  As a user, I want to learn how to Automate in screenplay at the Choucair Academy with the atomation course
  @scenario1
  Scenario: Search for a automation course
    Given than david wants to learn automation at the academy Choucar
    |strUser|strPassword|
    |1041611184|Choucair2020*|
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
    |course|
    |ISTQB - Test Automation Engineer|
    Then he finds the course called resources Recursos Automatizacion Bancolombia
    |course|
    |ISTQB - Test Automation Engineer|
