package inicializador;

import java.util.ArrayList;

import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;

public class InicializadorCasas {
	
	private static InicializadorCasas inicializadorCasas;
	private AbstractFabrica minhaFabrica;
	private ArrayList<AbstractCasa> listaDeCasa;
	
	public static InicializadorCasas getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasas();
        return inicializadorCasas;	
	}
	
	private InicializadorCasas(){
		listaDeCasa = new ArrayList<>();	
		minhaFabrica = new FabricaCasa();
    }
	
	public ArrayList<AbstractCasa> iniciarCasas(){
		
		return listaDeCasa;
	}
	
	public static void main(String[] args) {
		InicializadorCasas IC = InicializadorCasas.getInstance();
		IC.iniciarCasas();
	}
}
