package controladores;

import java.util.ArrayList;

import entidade.Jogo;

public class ControladorJogo {
	
	private Jogo jogo = Jogo.getInstance();
	private static ControladorJogo controladorJogo;
	
	
	private ControladorJogo() {
		
	}
	
	public static ControladorJogo getInstance() {
		if(controladorJogo==null)
			return controladorJogo = new ControladorJogo();
		return controladorJogo;
	}
	
	public void criarJogador(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		if(!nomeDoJogador.isEmpty()) {
			jogo.criarJogadores(nomeDoJogador,qtdJogadores);
		}
	}
	
	
}
