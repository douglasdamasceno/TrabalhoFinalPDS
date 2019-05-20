package entidade;

import java.util.ArrayList;

import entidades.casas.AbstractCasa;
import inicializador.InicializadorCasas;

public class Tabuleiro {
	private static Tabuleiro tabuleiro;
	private ArrayList<AbstractCasa> listaDeCasas;
	private InicializadorCasas inicializadorCasas;
	
	
	public static Tabuleiro getInstance(){
        if (tabuleiro == null) tabuleiro = new Tabuleiro();
        return tabuleiro;
    }
    
	private Tabuleiro(){
        this.inicializadorCasas = InicializadorCasas.getInstance();
        listaDeCasas = inicializadorCasas.iniciarCasas();
    }
	//casa inicial
	//casa final
	
	
	
}
