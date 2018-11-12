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
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.COMBOBOX_LOCATION,data.get(0).getLocation()));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT));
		
		actor.attemptsTo(TiempoDeEspera.Pausa(15000));	
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT_2));
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT_3));
		
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));		
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.COMBOBOX_REGION));
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.COMBOBOX_REGION,data.get(0).getRegion()));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.COMBOBOX_FTE));
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.COMBOBOX_FTE,data.get(0).getFte()));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.COMBOBOX_TEMPORARY_DEPARTMENT));
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.COMBOBOX_TEMPORARY_DEPARTMENT,data.get(0).getTemporaryDepartment()));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT_4));
		
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT_5));
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_NEXT_6));
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_SAVE));
		
		actor.attemptsTo(TiempoDeEspera.Pausa(5000));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.COMBOBOX_BLOOD_GROUP));
		actor.attemptsTo(Seleccionar.laLista(OrangeHrmDemoPage.COMBOBOX_BLOOD_GROUP,data.get(0).getBloodGroup()));
		actor.attemptsTo(Enter.theValue(data.get(0).getHobbies()).into(OrangeHrmDemoPage.TEXTBOX_HOBBIES));
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_SAVE_2));
	}
	
	public static Registrar EmpleadoEnLaPagina(List<InformacionEmpleado> dato) {
		return Tasks.instrumented(Registrar.class, dato);
	}



}
