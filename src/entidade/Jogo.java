package entidade;

import java.util.ArrayList;

public class Jogo {
	Jogador[] listaJogadores;
	private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	//sigleton
	public Jogo() {
	
	}
	
	public void criarJoogadores(int qtdJogadores) {
		listaJogadores = new Jogador[qtdJogadores];
	}
}
