package entidade;

import java.util.Random;

public class Carta {
	
	public int informarNumero(){
		 Random random = new Random();
	     return random.nextInt(3) + 1;
	}

}
