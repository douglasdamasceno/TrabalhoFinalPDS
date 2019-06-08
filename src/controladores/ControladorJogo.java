package controladores;

import java.util.ArrayList;


import entidade.Jogo;
import fronteiras.TelaConsole;
import fronteiras.TelaJogadorInfoConsole;
import main.Teste.TelaTabuleiroInfoGUI;

public class ControladorJogo {
	
	private Jogo jogo;
	private TelaJogadorInfoConsole telaInfo;
	private TelaTabuleiroInfoGUI tabuleiroInfo = TelaTabuleiroInfoGUI.getInstace();
	private static ControladorJogo controladorJogo;
	
	private ControladorJogo() {
		jogo = new Jogo();

		telaInfo = new TelaJogadorInfoConsole();
	}
	
	public static ControladorJogo getInstance() {
		if(controladorJogo==null)
			return controladorJogo = new ControladorJogo();
		return controladorJogo;
	}
	
	public void criarJogador(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		//String resposta = null;
		if(!nomeDoJogador.isEmpty()) {
			jogo.criarJogadores(nomeDoJogador,qtdJogadores);
			
		}
		JogadoresRodada();
	}
	
	public void JogadoresRodada() {
		String comando ="a";
		boolean comandoSpace = true;
		do{	
			if(comando.isEmpty()) {
				telaInfo.setJogador(jogo.jogadorDaVez());
				comando = telaInfo.rolarDadoJogador();
				if(jogo.JogadoresRodada()) {
					telaInfo.FimDeJogo(jogo.getNumeroGerado());
					break;
				}
				telaInfo.setCasa(jogo.getCasaDaRodada());
				telaInfo.setNumeroAleatorio(jogo.getNumeroGerado());	
				telaInfo.infoJogador();
			}else if(comandoSpace) {
				//
				tabuleiroInfo.exibirTabuleiro();
				
				//iniciar pecas aqui pegando a qttd de jogadores
				tabuleiroInfo.exibirPecasJogadores();
				
				tabuleiroInfo.setJogadorInfo(jogo.jogadorDaVez());
				
				
				
				tabuleiroInfo.atualizarTabuleiro();
				comandoSpace = tabuleiroInfo.rolarDadoJogador();
				
				tabuleiroInfo.atualizarTabuleiro();
				
			}
		}while(comando.isEmpty() || comandoSpace);
			
		
				
	}
	
}
