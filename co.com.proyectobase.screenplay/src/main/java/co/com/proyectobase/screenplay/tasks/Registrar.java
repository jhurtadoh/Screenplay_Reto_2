package co.com.proyectobase.screenplay.tasks;

import java.util.List;
import co.com.proyectobase.screenplay.interactions.TiempoDeEspera;
import co.com.proyectobase.screenplay.interactions.Seleccionar;
import co.com.proyectobase.screenplay.model.InformacionEmpleado;
import co.com.proyectobase.screenplay.userinterface.OrangeHrmDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrar implements Task{

	OrangeHrmDemoPage orangeHrmDemoPage;
	
	private List<InformacionEmpleado> data;
	
	public Registrar(List<InformacionEmpleado> data) {
		this.data = data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.MENU_PIM));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.SUBMENU_ADD_EMPLOYEE));			
		
		//WaitUntil.the(OrangeHrmDemoPage.WINDOW_ADD_EMPLOYEE, isVisible());
		//WaitUntil.the(OrangeHrmDemoPage.TEXTBOX_FIRST_NAME, isEnabled());
		actor.attemptsTo(TiempoDeEspera.Pausa(10000));	


		
		
		actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(OrangeHrmDemoPage.TEXTBOX_FIRST_NAME));
		actor.attemptsTo(Enter.theValue(data.get(0).getMiddleName()).into(OrangeHrmDemoPage.TEXTBOX_MIDDLE_NAME));
		actor.attemptsTo(Enter.theValue(data.get(0).getLastName()).into(OrangeHrmDemoPage.TEXTBOX_LAST_NAME));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.COMBOBOX_LOCATION));
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.SELECTCOMBOBOX_LOCATION,data.get(0).getLocation()));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT));
		
	}
	
	public static Registrar EmpleadoEnLaPagina(List<InformacionEmpleado> dato) {
		return Tasks.instrumented(Registrar.class, dato);
	}



}
