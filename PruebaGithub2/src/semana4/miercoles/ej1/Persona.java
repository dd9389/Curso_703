//paquete 
package semana4.miercoles.ej1;

//imports


// Clase

public class Persona {

	
// atributos
	
	int edad;
	String nombre;

// Metodos
	//constructores
	/**
	 * Constructor popr defecto
	 */
	public Persona()
	{

	}
	
	/**
	 * Constructor con parametros
	 * 
	 * @param nombre 	- indica el nombre de la persona
	 * @param edad		- edad de la persona
	 */
	public Persona (String nombre, byte edad)
	{	
		this.nombre = nombre;
		this.edad = edad;
	}
	// metodos corrientes
	
	/**
	 * Muestra la persona de la persona por pantalla
	 */
	public void mostrar()
	{
/*		System.out.print("El nombre de la persona es: ");
		System.out.println(this.nombre);
		System.out.print("La edad de la persona es: ");		
		System.out.println(this.edad);  */
		System.out.println(this.toString());
	}
	
	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
		  Persona p3= null;
		  boolean esigual = false;
		  
		  p3 = (Persona) obj;
		  
		  if ((this.nombre.equals(p3.nombre)) && 
				  (this.edad == p3.edad))
		  {
			  esigual = true;
		  }
		  else
		  {
			  esigual = false;
		  }
		  // Como se haria con cortocircuito
		  // dev = (null!=obj)&& 
		  //   	((obj==this)||((null!=(p=esTipoPersona(obj)))&&(contienelaMisma(this,p))))
		return esigual;
			
		}
	
	/**
	 * toString  
	 * 	Devuelve una cadena con el nombre y la edad listos para mostrar en pantalla
	 */
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			String cadena = new String();
			
			cadena = this.nombre + " tiene "+(this.edad)+" años";
			
			return cadena;
		}
	
	
	/**
	 * crea y devuelve una nueva persona con mismo nombre pero incremento de edad
	 * 
	 */
	
	Persona sumaAnios1( Persona p,int sumaedad)
	{
		Persona p2 = new Persona(p.nombre,(byte)( p.edad + sumaedad));
		return p2;
	}
	
	/**
	 *  incremento de edad de persona this
	 * 
	 */
	
	void sumaAnios2(int sumaedad)
	{
		this.edad = ( this.edad + sumaedad);
	}
	
	/**
	 *  incremento de edad de persona p, funcion estatica
	 * 
	 */
	public static void sumaAnios3( Persona p,int sumaedad)
	{
		p.edad = ( p.edad + sumaedad);
		
	}
	
	
	
	boolean esMayorDeEdad()
	{
		boolean esmayor = false;
		
		if (this.edad >= 18)
		{
			esmayor = true;
		}
		
		return esmayor;
	}
	
	
	
}
