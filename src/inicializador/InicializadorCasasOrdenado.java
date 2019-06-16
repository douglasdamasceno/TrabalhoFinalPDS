package inicializador;


import java.util.ArrayList;

import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;
import interfaces.CasaEspecial;

public class InicializadorCasasOrdenado {
	
	private static InicializadorCasasOrdenado inicializadorCasas;
	private AbstractFabrica minhaFabrica;
	private ArrayList<CasaEspecial> listaDeCasa;
	
	public static InicializadorCasasOrdenado getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasasOrdenado();
        return inicializadorCasas;	
	}
	
	private InicializadorCasasOrdenado(){
		listaDeCasa = new ArrayList<>();	
		minhaFabrica = new FabricaCasa();
    }
	
	public ArrayList<CasaEspecial> iniciarCasas(){
		CasaEspecial casa;
		int i=1;
		while(i<=100) {
			casa = minhaFabrica.criarCasa(i);
			listaDeCasa.add(casa);
			i++;
		}
		return listaDeCasa;
	}
	
	
}
