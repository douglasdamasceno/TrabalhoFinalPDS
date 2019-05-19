package inicializador;

import java.util.ArrayList;

import entidade.Casa;
import entidades.casas.AbstractCasa;

public class InicializadorCasas {
	
	private static InicializadorCasas inicializadorCasas;
	private ArrayList<AbstractCasa> listaDeCasa;
	
	private InicializadorCasas() {
		listaDeCasa = new ArrayList<>();
	}
	
	public static InicializadorCasas getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasas();
        return inicializadorCasas;	
	}
	
	void iniciarCasas(){
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
