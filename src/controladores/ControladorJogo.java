package controladores;

import java.util.ArrayList;

import entidade.Jogo;

public class ControladorJogo {
	
	private Jogo jogo = Jogo.getInstance();
	
	public ControladorJogo() {
		
	}
	
	public void criarJogador(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		if(!nomeDoJogador.isEmpty()) {
			jogo.criarJogadores(nomeDoJogador,qtdJogadores);
		}
	}
}
