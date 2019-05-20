package entidade;

import java.util.ArrayList;

public class Jogo {
	

	private static Jogo jogo;
	Jogador[] listaJogadores;
	//private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	//sigleton
	
	public static Jogo getInstance(){
        if (jogo == null) jogo = new Jogo();
        return jogo;
    }
	private Jogo() {
	
	}
	
	public void criarJoogadores(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		listaJogadores = new Jogador[qtdJogadores];
		int i=0;
		while(i<qtdJogadores) {
			Jogador jogador = new Jogador(nomeDoJogador.get(i),i+1 );
			listaJogadores[i] = jogador;
			i++;
		}
	}
}
