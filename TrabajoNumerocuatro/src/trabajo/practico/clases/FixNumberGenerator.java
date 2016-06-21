package trabajo.practico.clases;

public class FixNumberGenerator implements NumberGenerator{
	int   numeroInicial;
	
	public FixNumberGenerator (Integer number) {
	  
		numeroInicial=number;
	
	}
	
	public Integer generate() {
		return numeroInicial;
	}


}
