package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;

public class Jogo {
	
	private IteratorRodada iteratorRodado;
	ArrayList<Jogador> listaDeJogadores;
	private int CasaFinal;
	private Tabuleiro tabuleiro = Tabuleiro.getInstance();
	
	public Jogo() {
		listaDeJogadores = new ArrayList<Jogador>();
	}
	
	public boolean criarJogadores(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		int i=0;
		while(i<qtdJogadores) {
			Jogador jogador = new Jogador(nomeDoJogador.get(i),i+1 );
			listaDeJogadores.add(jogador);
			i++;
		}
		iteratorRodado = new IteratorRodada(listaDeJogadores);
		return true;
	}
	
	public void JogadoresRodada() {
		
		 while (iteratorRodado.existeProximoJogador()) {
	         Jogador jogadorVez = iteratorRodado.proximoJogador();
	         System.out.println(jogadorVez.getNome());	
	         jogadorVez.avancarPeca();
	         if(jogadorVez.getMinhaPeca().getCasaAtual()==100)
	        	 break;
		 }
	}

	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}

	
	
}
