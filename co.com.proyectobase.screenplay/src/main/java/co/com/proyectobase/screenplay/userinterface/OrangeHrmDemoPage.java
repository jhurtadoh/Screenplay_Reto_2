package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OrangeHrmDemoPage extends PageObject {
	
	public static final Target BUTTON_LOGIN = Target.the("Button para realizar "
			+ " logueo").located(By.xpath("//*[@id=\"btnLogin\"]"));
	
	public static final Target MENU_PIM = Target.the("Menú del módulo "
			+ "de información personal").located(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]"));	
	public static final Target SUBMENU_ADD_EMPLOYEE = Target.the("Menú del módulo "
			+ "de información personal").located(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]"));
	
	
	public static final Target TEXTBOX_FIRST_NAME = Target.the("TextBox donde se digita "
			+ "el primer nombre").located(By.id("firstName"));
	public static final Target TEXTBOX_MIDDLE_NAME = Target.the("TextBox donde se digita "
			+ "el segundo nombre").located(By.xpath("//*[@id=\"middleName\"]" ));
	public static final Target TEXTBOX_LAST_NAME = Target.the("TextBox donde se digita "
			+ "el apellido").located(By.xpath("//*[@id=\"lastName\"]" ));
	public static final Target COMBOBOX_LOCATION = Target.the("Combobox "
			+ "de lugares").located(By.xpath("//*[@id=\"location_inputfileddiv\"]/div/input"));
	public static final Target SELECTCOMBOBOX_LOCATION = Target.the("seleccionar "
			+ "lugar").located(By.xpath("//*[@id=\"select-options-2bd56d48-f1cf-9650-1331-be2cef4f62a3\"]"));
	public static final Target BUTTON_NEXT = Target.the("Button para avanzar a la pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"systemUserSaveBtn\"]"));
	
	public static final Target WINDOW_ADD_EMPLOYEE = Target.the("ventana "
			+ "para añadir empleado").located(By.xpath("//*[@id=\"addEmployeeModal\"]/h4"));	
	
	
	
	
	
	
	

}
