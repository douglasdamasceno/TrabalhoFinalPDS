package controladores;

import java.util.ArrayList;

import entidade.Jogador;
import entidade.Jogo;
import fronteiras.TelaConsole;
import fronteiras.TelaFimJogo;
import fronteiras.TelaJogadorInfo;

public class ControladorJogo {
	
	private Jogo jogo;
	private TelaJogadorInfo telaInfo;
	private static ControladorJogo controladorJogo;
	
	private ControladorJogo() {
		jogo = new Jogo();

		telaInfo = new TelaJogadorInfo();
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
		String comando ="";
		boolean comandoSpace = false;
		do{	
			if(comando.isEmpty()) {
				telaInfo.setJogador(jogo.jogadorDaVez());
				comando = telaInfo.rolarDadoJogador();
				if(jogo.JogadoresRodada()) {
					telaInfo.FimDeJogo(jogo.getNumeroGerado());
					TelaConsole TC = new TelaConsole();
					break;
				}
				telaInfo.setCasa(jogo.getCasaDaRodada());
				telaInfo.setNumeroAleatorio(jogo.getNumeroGerado());	
				telaInfo.infoJogador();
			}
		}while(comando.isEmpty() || comandoSpace);
			
		
				
	}
	
}
