package semana4.miercoles.ej1;


public class ExcepcionPrueba1 extends RuntimeException {

	public ExcepcionPrueba1(String message) {
		super(message);
	}
	public ExcepcionPrueba1() {
		super("InsertarPersonasException");
	}
}
