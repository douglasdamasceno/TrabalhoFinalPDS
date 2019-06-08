package entidade;

import java.util.Random;

public class Carta {
	
	public int informarNumero(){
		
/// tem que ter um random negativo;		
		 Random random = new Random();
	     return random.nextInt(3) + 1;
	}

}
