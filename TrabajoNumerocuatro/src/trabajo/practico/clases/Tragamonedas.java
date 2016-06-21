package trabajo.practico.clases;


public class Tragamonedas {
	
	public Tambor tambor_uno;
	public Tambor tambor_dos;
	public Tambor tambor_tres;
	int ganar=0;
	FixNumberGenerator generator = new FixNumberGenerator(10);

	
	public Tragamonedas() {
		
		tambor_uno = new Tambor(generator);
		tambor_dos = new Tambor(generator);
		tambor_tres = new Tambor(generator);
		
	}
	/* post: activa el Tragamonedas haciendo girar
	* sus 3 Tambores.
	*/
	public void activar() {
		
		tambor_uno.girar();
		tambor_dos.girar();
		tambor_tres.girar();
		
	
		
	}
	
	/* post: indica si el Tragamonedas entrega un premio
	* a partir de la posición de sus 3 Tambores.
	*/
	public boolean entregaPremio() {
		
		boolean entregar=true;
			if (tambor_uno.getPosicion()==tambor_dos.getPosicion() && tambor_uno.getPosicion()==tambor_tres.getPosicion()){
				
				return entregar;}
			
			else {entregar=false;
			    return entregar;
				
			}
		}
		
	
}
