package test.prac.cuatro;

import static org.junit.Assert.*;

import org.junit.Test;

import trabajo.practico.clases.*;



public class TestTragamonedas {

	@Test
	public void mijuego(){
	
		
		Tragamonedas tragamonedas = new Tragamonedas();
	
	tragamonedas.activar();

	
	

	
		
	
	
	
	System.out.println("el el tambor numero uno devuelve "+tragamonedas.tambor_uno.getPosicion());
	
	System.out.println("el el tambor numero dos devuelve "+tragamonedas.tambor_dos.getPosicion());	
	
	System.out.println("el el tambor numero tres devuelve "+tragamonedas.tambor_tres.getPosicion());
	

	
		if (tragamonedas.entregaPremio()) {
			System.out.println(" has ganado");
		
		}
		else {
			System.out.println(" Perdiste ,segui jugando");
			
		}
		assertNotEquals(10,tragamonedas.tambor_uno.getPosicion(),0.01);

		

	}
	}
	
