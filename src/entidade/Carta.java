package entidade;

import java.util.ArrayList;
import java.util.Random;

public class Carta {
	private ArrayList<Integer> numeroAleatorio;
	
	public Carta() {
		numeroAleatorio = new ArrayList<Integer>();
	}
	
	public int informarNumero(){	
		 Random random = new Random();	 
		 int positivo = random.nextInt(3) +1;
		 int negativo = (random.nextInt(3) +1) * -1;
		 this.numeroAleatorio.add(positivo);
		 this.numeroAleatorio.add(negativo);
	
		 int posicao = random.nextInt(2);
	     return numeroAleatorio.get(posicao);
	}

}
