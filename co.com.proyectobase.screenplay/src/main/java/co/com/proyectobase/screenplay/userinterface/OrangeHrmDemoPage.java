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
			+ "de lugares").located(By.id("location_inputfileddiv"));
	public static final Target BUTTON_NEXT = Target.the("Button para pasar a la pantalla "
			+ "de datos importantes").located(By.id("systemUserSaveBtn"));
	
	public static final Target BUTTON_NEXT_2 = Target.the("Button para avanzar a la segunda pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	public static final Target BUTTON_NEXT_3 = Target.the("Button para avanzar a la tercera pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target COMBOBOX_REGION = Target.the("Combobox "
			+ "de regiones").located(By.id("WizardFieldDefinition9_inputfileddiv"));
	public static final Target COMBOBOX_FTE = Target.the("Combobox "
			+ "de FTE").located(By.id("WizardFieldDefinition10_inputfileddiv"));
	public static final Target COMBOBOX_TEMPORARY_DEPARTMENT = Target.the("Combobox "
			+ "de Temporary Department").located(By.id("WizardFieldDefinition11_inputfileddiv"));	
	public static final Target BUTTON_NEXT_4 = Target.the("Button para avanzar a la cuarta pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	
	public static final Target BUTTON_NEXT_5 = Target.the("Button para avanzar a la quinta pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	public static final Target BUTTON_NEXT_6 = Target.the("Button para avanzar a la sexta pantalla "
			+ "de datos personales importantes").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	public static final Target BUTTON_SAVE = Target.the("Button para "
			+ "grabar").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[3]"));
	
	public static final Target COMBOBOX_BLOOD_GROUP = Target.the("Combobox "
			+ "de grupo sanguíneo").located(By.id("1_inputfileddiv"));	
	public static final Target TEXTBOX_HOBBIES = Target.the("TextBox donde se digitan "
			+ "los hobbies").located(By.id("5"));
	public static final Target BUTTON_SAVE_2 = Target.the("Button para "
			+ "grabar").located(By.xpath("//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[8]/div/sf-decorator[2]/div/button"));
	
	public static final Target LABEL_EMPLOYEE_NAME = Target.the("Label que contiene "
			+ "el nombre del empleado").located(By.id("pim.navbar.employeeName"));	
//	public static final Target MENU_EMPLOYEE_LIST = Target.the("Menú del módulo "
//			+ "de listado de empleados").located(By.id("menu_pim_viewEmployeeList"));	
//	public static final Target BUTTON_SEARCH = Target.the("Button para "
//			+ "buscar").located(By.id("quick_search_icon"));
//	public static final Target FILTER_EMPLOYEE_NAME = Target.the("filtro para "
//			+ "buscar empleado").located(By.id("employee_name_quick_filter_employee_list_value"));
	

	
}

