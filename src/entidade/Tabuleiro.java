package entidade;

import java.util.ArrayList;

import entidade.casas.AbstractCasa;
import inicializador.InicializadorCasasOrdenado;

public class Tabuleiro {
	private static Tabuleiro tabuleiro;
	private ArrayList<AbstractCasa> listaDeCasas;
	private InicializadorCasasOrdenado inicializadorCasas;
	
	
	public static Tabuleiro getInstance(){
        if (tabuleiro == null) tabuleiro = new Tabuleiro();
        return tabuleiro;
    }
    
	private Tabuleiro(){
        this.inicializadorCasas = InicializadorCasasOrdenado.getInstance();
        listaDeCasas = inicializadorCasas.iniciarCasas();
    }
	
	public ArrayList<AbstractCasa> getListaDeCasas() {
		return listaDeCasas;
	}
}
