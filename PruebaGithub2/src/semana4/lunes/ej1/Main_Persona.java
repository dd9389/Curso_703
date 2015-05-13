package semana4.lunes.ej1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main_Persona {

	/** Clase para practicar con Serializable.
	 *  Empleamos nuestra clase Persona, creando objetos que escribimos 
	 *  en fichero y luego leemos y mostramos por pantalla.
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		String[] nombres = {"jose", "pablo","david","marcos","sergio"};
		byte[]	edades = {12,25,36,98,15};
		Persona persona = null;
		
		// Creo el stream de escritura que apunta a fichero
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("media3.dat"));
		
		// creo una persona y la escribo en el fichero
		for (int i = 0; i < nombres.length;i++){
			persona = new Persona(nombres[i],edades[i]);
			salida.writeObject(persona); 
	
		}
		//cierro fichero
		salida.close();
		
		
		

				
		
		
		ObjectInputStream entrada =new ObjectInputStream (new FileInputStream("media3.dat"));
		Persona persona2 = null;
		for (int i = 0; i < nombres.length;i++){
			persona2 = (Persona) entrada.readObject();
			persona2.mostrar();
		}
		
		entrada.close();


// aqui serializamos un array de objetos Persona

		//	Creo el stream de escritura que apunta a fichero
		salida=new ObjectOutputStream(new FileOutputStream("mediaAr.dat"));
		
		// creo un array de personas
		Persona[] personas = new Persona[nombres.length];
		for (int i = 0; i < nombres.length;i++){
			personas[i] = new Persona(nombres[i],edades[i]);
		}
		// escribo el array de un golpe
		salida.writeObject(personas);
		//cierro fichero
		salida.close();
// deserializamos el array		
		entrada =new ObjectInputStream (new FileInputStream("mediaAr.dat"));
		Persona[] personas2 = null;
		personas2 = (Persona[]) entrada.readObject();
		for (int i = 0; i < nombres.length;i++){
			persona2 = personas2[i];
			persona2.mostrar();
		}
					
		entrada.close();
		
	}

}
