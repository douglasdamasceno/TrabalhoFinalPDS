package entidade;

import java.util.ArrayList;

import inicializador.InicializadorCasasOrdenado;
import interfaces.CasaEspecial;

public class Tabuleiro {
	private static Tabuleiro tabuleiro;
	private ArrayList<CasaEspecial> listaDeCasas;
	private InicializadorCasasOrdenado inicializadorCasas;
	
	
	public static Tabuleiro getInstance(){
        if (tabuleiro == null) tabuleiro = new Tabuleiro();
        return tabuleiro;
    }
    
	private Tabuleiro(){
        this.inicializadorCasas = InicializadorCasasOrdenado.getInstance();
        listaDeCasas = inicializadorCasas.iniciarCasas();
    }
	
	public ArrayList<CasaEspecial> getListaDeCasas() {
		return listaDeCasas;
	}
}
