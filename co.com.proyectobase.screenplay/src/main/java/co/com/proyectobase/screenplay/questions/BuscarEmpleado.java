package co.com.proyectobase.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.proyectobase.screenplay.userinterface.OrangeHrmDemoPage;

public class BuscarEmpleado implements Question<String>{
	
	OrangeHrmDemoPage orangeHrmDemoPage;

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(OrangeHrmDemoPage.LABEL_EMPLOYEE_NAME).viewedBy(actor).asString();
	}

	public static BuscarEmpleado validarRegistro() {
		return new BuscarEmpleado();
	}

}
