package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;

public class Jogo {
	
	private IteratorRodada controlarRodado;
	private static Jogo jogo;
	Jogador[] listaJogadores;
	private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	
	// o jogo que informar qual casa o jogador deve mover a peca.
	public static Jogo getInstance(){
        if (jogo == null) jogo = new Jogo();
        return jogo;
    }
	private Jogo() {
		controlarRodado = new IteratorRodada(this.listaJogadores);
	}
	
	public void criarJogadores(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		listaJogadores = new Jogador[qtdJogadores];
		int i=0;
		while(i<qtdJogadores) {
			Jogador jogador = new Jogador(nomeDoJogador.get(i),i+1 );
			listaJogadores[i] = jogador;
			i++;
		}
	}
	
	public void JogadoresRodada() {
		 while (controlarRodado.existeProximoJogador()) {
	         Jogador jogadorVez = controlarRodado.jogadorAtual();   
	         System.out.println(jogadorVez.getNome());	
	      }
	}
	
}
