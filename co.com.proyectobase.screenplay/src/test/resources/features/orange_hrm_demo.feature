#Author:jhurtadoh@choucairtesting.com

Feature: Registro de empleado en la página OrangeHRM Demo
  Como usuario
  Quiero ingresar a la página Web Automation Demo Site
  Para realizar el registro de un empleado en la página

  @registrar
  Scenario Outline: Realizar registro en la página
    Given que Johan necesita crear un empleado en la página OrageHRM Demo
    When el realiza el ingreso del registro en la aplicación
    |firstName|middleName|lastName|location|
 		|<firstName>|<middleName>|<lastName>|<location>|
    Then el visualiza el nuevo empleado en el aplicativo
    Examples:
    |firstName|middleName|lastName|location|
    ##@externaldata@./src/test/resources/datadriven/dtDatos.xlsx@Datos
   |germán   |ezequiel   |cano   |German Regional HQ|

    


