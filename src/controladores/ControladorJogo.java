package controladores;

import java.util.ArrayList;

import entidade.Jogo;

public class ControladorJogo {
	
	private Jogo jogo;
	private static ControladorJogo controladorJogo;
	
	
	private ControladorJogo() {
		jogo = new Jogo();
	}
	
	public static ControladorJogo getInstance() {
		if(controladorJogo==null)
			return controladorJogo = new ControladorJogo();
		return controladorJogo;
	}
	
	public String criarJogador(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		String resposta = null;
		if(!nomeDoJogador.isEmpty()) {
			if(jogo.criarJogadores(nomeDoJogador,qtdJogadores)) {
				resposta= "Jogadores Cadastrados com sucesso!";
			}else {
				resposta= "Jogadores Não cadastrados com sucesso!";
			}
		}
		JogadoresRodada();
		return resposta;
	}
	
	public void JogadoresRodada() {
		jogo.JogadoresRodada();
	}
	
}
