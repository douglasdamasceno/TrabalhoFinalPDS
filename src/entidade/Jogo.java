package entidade;

import java.util.ArrayList;

import controladores.ControladorRodada;

public class Jogo {
	//guardar o jogadorAtual da rodada para informar para TelaTabuleiro
	private ControladorRodada contralarRodado;
	private static Jogo jogo;
	Jogador[] listaJogadores;
	//private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	//sigleton
	
	public static Jogo getInstance(){
        if (jogo == null) jogo = new Jogo();
        return jogo;
    }
	private Jogo() {
		contralarRodado = new ControladorRodada(this.listaJogadores);
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
	
	public void JogadoresRodada() {
		//aqui vai ter o while como no teste da main colocando ojogador para jogar.
	}
	
}
