package controladores;

import java.util.ArrayList;


import entidade.Jogo;
import fronteiras.TelaJogadorInfoConsole;

public class ControladorJogo {
	
	private Jogo jogo;
	private TelaJogadorInfoConsole telaInfo;
	
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
		if(!nomeDoJogador.isEmpty()) {
			if(jogo.criarJogadores(nomeDoJogador,qtdJogadores)) {
				JogadoresRodada(qtdJogadores);
			}
		}
	}
	
	public void JogadoresRodada(int qtdJogadores) {
		String comando ="";
		boolean comandoSpace = true;
		do{	
			if(comando.isEmpty() || comandoSpace) {
				telaInfo.setJogador(jogo.jogadorDaVez());
				comando = telaInfo.rolarDadoJogador();
				if(jogo.JogadoresRodada()) {
					telaInfo.FimDeJogo(jogo.getNumeroGerado());
					break;
				}
				telaInfo.setCasa(jogo.getCasaDaRodada());
				telaInfo.setNumeroAleatorio(jogo.getNumeroGerado());	
				telaInfo.infoJogador();
			}
		}while(comando.isEmpty() || comandoSpace);
			
				
	}

	
}
