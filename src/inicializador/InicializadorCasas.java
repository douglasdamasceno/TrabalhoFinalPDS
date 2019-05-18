package inicializador;

import java.util.ArrayList;

import entidade.Casa;

public class InicializadorCasas {
	ArrayList<Casa> listaDeCasa;
	
	public InicializadorCasas() {
		listaDeCasa = new ArrayList<>();
	}
	
	void iniciarCasas(){
		listaDeCasa.add(new Casa(45,610,"1"));
		listaDeCasa.add(new Casa(145,610,"2"));
		listaDeCasa.add(new Casa(245,610,"3"));
		listaDeCasa.add(new Casa(345,610,"4"));
		listaDeCasa.add(new Casa(445,610,"5"));
		listaDeCasa.add(new Casa(545,610,"6"));
		listaDeCasa.add(new Casa(645,610,"7"));
		listaDeCasa.add(new Casa(745,610,"8"));
		listaDeCasa.add(new Casa(845,610,"9"));
		listaDeCasa.add(new Casa(945,610,"10"));
		//
		int j =0;
		for(int i=0;i<10;i++) {
			listaDeCasa.add(new Casa((45 + (j*100) ),610,i+""));
			j++;
		}
		
		j=0;
		
		for(int i=20;i>11;i--) {
			listaDeCasa.add(new Casa((45 + (j*100) ),533.2f,i+""));
			j++;
		}
		
		j=0;
		
		
	}
}
