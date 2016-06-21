package trabajo.practico.clases;



public class Tambor {

	public Integer posicion;
	
	
	public Tambor( NumberGenerator generator ) 
	{
		posicion=generator.generate();
		
	}
	
/* post: devuelve el n�mero de posici�n en la que se
* encuentra el Tambor. Es un valor comprendido
* entre 1 y 10.
*/
public Integer getPosicion() {
	return posicion;
}
/* post: hace girar el tambor y luego se detiene en
* una posici�n comprendida entre 1 y 10.
*/
public void girar() {
	
	RandoNumberGenerator numero= new RandoNumberGenerator();
	
	posicion=numero.generate();
			
}
}
