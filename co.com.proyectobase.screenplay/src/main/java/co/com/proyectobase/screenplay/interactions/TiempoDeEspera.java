package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class TiempoDeEspera implements Interaction{

	private int tiempo;
	
	public TiempoDeEspera(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static TiempoDeEspera Pausa(int t) {
		return new TiempoDeEspera(t);
	}

}
