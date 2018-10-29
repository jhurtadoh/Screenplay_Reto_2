package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.OrangeHrmDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task{
	
	private OrangeHrmDemoPage orangeHrmDemoPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(orangeHrmDemoPage));
		
		actor.attemptsTo(Click.on(OrangeHrmDemoPage.BUTTON_LOGIN));
		
	}

	public static Abrir LaPaginaOrageHRMDemo() {
		return Tasks.instrumented(Abrir.class);
	}



}
