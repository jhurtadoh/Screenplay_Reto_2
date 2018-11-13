package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.InformacionEmpleado;
import co.com.proyectobase.screenplay.questions.BuscarEmpleado;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.Matchers.equalTo;

public class OrangeHrmDemoStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor johan = Actor.named("Johan");
	
	@Before
	public void configuracionInicial()
	{
		johan.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^que Johan necesita crear un empleado en la página OrageHRM Demo$")
	public void queJohanNecesitaCrearUnEmpleadoEnLaPáginaOrageHRDemo() throws Exception {
		johan.wasAbleTo(Abrir.LaPaginaOrageHRMDemo());
	}

	@When("^el realiza el ingreso del registro en la aplicación$")
	public void elRealizaElIngresoDelRegistroEnLaAplicación(List<InformacionEmpleado> dato) throws Exception {
		johan.attemptsTo(Registrar.EmpleadoEnLaPagina(dato));
	}

	@Then("^el visualiza el nuevo empleado (.*) en el aplicativo$")
	public void elVisualizaElNuevoEmpleadoEnElAplicativo(String palabraEsperada) throws Exception {
		johan.should(net.serenitybdd.screenplay.GivenWhenThen.seeThat(BuscarEmpleado.validarRegistro(), equalTo(palabraEsperada)));
	}
}
