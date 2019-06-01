package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;
import entidade.casas.AbstractCasa;
import interfaces.CasaEspecial;

public class Jogo {
	
	private IteratorRodada iteratorRodado;
	ArrayList<Jogador> listaDeJogadores;
	private Tabuleiro meuTabuleiro = Tabuleiro.getInstance();
	private AgregadorRodada agregadorRodada;
	private Dado dado;
	//jogo tem o dado e passar para o jogador da vez
	public Jogo() {
		listaDeJogadores = new ArrayList<Jogador>();
		agregadorRodada = new AgregadorRodada();
		dado = new Dado(12);
	}
	
	public boolean criarJogadores(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		int i=0;
		while(i<qtdJogadores) {
			Jogador jogador = new Jogador(nomeDoJogador.get(i),i+1 );
			listaDeJogadores.add(jogador);
			i++;
		}
		iteratorRodado = agregadorRodada.criarInteratorJogador(listaDeJogadores);
		return true;
	}
	
	public void JogadoresRodada() {
	         Jogador jogadorVez = iteratorRodado.proximoJogador();
	        
	         System.out.println("Jogo : "+ jogadorVez.getNome());	
	         
	         this.avancarPeca(jogadorVez);
	         if(jogadorVez.getMinhaPeca().getCasaAtual()>=100)
	        	System.out.println("FIm");
	}
	
	public Jogador jogadorDaVez() {
		return iteratorRodado.jogadorAtual();
	}
	
	int lancarDados() {
		return this.dado.lancarDado();
	}
	
	public void avancarPeca(Jogador jogadoDaVez) {
		int numero = this.lancarDados();
		int novaPosicao = jogadoDaVez.getMinhaPeca().getCasaAtual() + numero;
		System.out.println("Numero aleatorio: "+ numero);
		
		
		CasaEspecial casaBuscada;
		if(novaPosicao>=100) {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(99);
			
			jogadoDaVez.avancarPeca(casaBuscada);
			
		
		}else {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(novaPosicao-1);
			
			
			jogadoDaVez.avancarPeca(casaBuscada);
		
		}
	}
	
	
	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}

	
	
}
