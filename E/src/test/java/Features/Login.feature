Feature: Application login feature

  Scenario: home page
    Given Navigate to website "http://qaclickacademy.com"
    And Click on login button
    When User gives "test99@gmail.com" and "123456"
    Then Home page opens
  

 