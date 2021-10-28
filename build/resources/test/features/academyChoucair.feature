# Autor: Sebastian
@stories
  Feature: Academy Choucair
    As a user,I want to learn how to automate in scremplay at the Choucair Academy whith the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than omar wants to learn automation at the academy Choucair
      | strUser    | strPassword    |
      | 1047232087 | Choucair2021*  |
      When he search for the course on the choucair academy platform
      | strCourse               |
      | Metodologia Bancolombia |
      Then he finds the course called
      | strCourse               |
      | Metodologia Bancolombia |
