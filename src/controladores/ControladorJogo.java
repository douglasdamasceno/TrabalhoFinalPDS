package controladores;

import java.util.ArrayList;

import entidade.Jogador;
import entidade.Jogo;
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
			do{
				comando = telaInfo.rolarDadoJogador();
				telaInfo.setJogador(jogo.jogadorDaVez());
				jogo.JogadoresRodada();
				
				
				telaInfo.Tese();
			}while(comando.isEmpty());
				
	}
	
}
