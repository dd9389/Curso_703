package semana4.miercoles.ej1;

public class ExcepcionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona[] gente = new Persona[4];
		String[] nombres = {"jose", "pablo","david","marcos","sergio"};
		byte[]	edades = {12,25,36,98,15};
		
		try{
			// codigo que genera una excepcion
			for (int i = 0; i<5; i++){
				gente[i] = new Persona(nombres[i],edades[i]);
			}
		}
		//Capturo la excepcion y luego propago la mia
		catch (IndexOutOfBoundsException e){
			
			System.out.println("Acceso a array fuera de margen");
			//throw(new ExcepcionPrueba1("IndiceFueraDelimitesException"));
			throw(new ExcepcionPrueba1());
			
		}
	}

}
