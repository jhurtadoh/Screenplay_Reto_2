#Author:jhurtadoh@choucairtesting.com

Feature: Registro de empleado en la página OrangeHRM Demo
  Como usuario
  Quiero ingresar a la página Web Automation Demo Site
  Para realizar el registro de un empleado en la página

  @registrar
  Scenario Outline: Realizar registro en la página
    Given que Johan necesita crear un empleado en la página OrageHRM Demo
    When el realiza el ingreso del registro en la aplicación
    |firstName|middleName|lastName|location|region|fte|temporaryDepartment|bloodGroup|hobbies|
 		|<firstName>|<middleName>|<lastName>|<location>|<region>|<fte>|<temporaryDepartment>|<bloodGroup>|<hobbies>|
    Then el visualiza el nuevo empleado en el aplicativo
    Examples:
    |firstName|middleName|lastName|location|region|fte|temporaryDepartment|bloodGroup|hobbies|
    ##@externaldata@./src/test/resources/datadriven/dtDatos.xlsx@Datos
   |germán   |ezequiel   |cano   |German Regional HQ   |Region-1   |1   |Sub unit-3   |A   |score goal against nacional|






    


