package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;
import entidade.casas.AbstractCasa;

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
	//parametros com informação de posicao atual nome do jogador para subi para o controle
	public void JogadoresRodada(String comando,Jogador jogador) {
		
		 while (iteratorRodado.existeProximoJogador()) {
	         Jogador jogadorVez = iteratorRodado.proximoJogador();
	         jogador = jogadorVez;
	         System.out.println(jogadorVez.getNome());	
	         //jogadorVez.avancarPeca();
	         this.avancarPeca(jogadorVez);
	         if(jogadorVez.getMinhaPeca().getCasaAtual()>=100)
	        	 break;
		 }
	}
	
	
	int lancarDados() {
		return this.dado.lancarDado();
	}
	
	public void avancarPeca(Jogador jogadoDaVez) {
		int numero = this.lancarDados();
		int novaPosicao = jogadoDaVez.getMinhaPeca().getCasaAtual() + numero;
		System.out.println("Numero aleatorio: "+ numero);
		//System.out.println("Posicao Inicial "+ minhaPeca.getCasaAtual());
		
		//minhaPeca.setCasaAtual(novaPosicao);
		
		//System.out.println("Numero aleatorio "+ numero);
		///System.out.println("Nova posicao " + novaPosicao);
		
		AbstractCasa casaBuscada;
		if(novaPosicao>=100) {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(99);
			
			jogadoDaVez.avancarPeca(casaBuscada);
			
			//System.out.println("---------------------------------------------------");
			
		///	jogadoDaVez.getMinhaPeca().setCasaAtual(casaBuscada.getNome());
			//this.minhaPeca.moveHouse(casaBuscada);
			//this.minhaPeca.setCasaAtual(casaBuscada.getNome());
			
			//this.spritePeca.moveHouse(casaBuscada);
			//this.spritePeca.setCasaAtual(casaBuscada.getNome());
			
			
			//return numero;
		}else {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(novaPosicao-1);
			
			
			jogadoDaVez.avancarPeca(casaBuscada);
			//System.out.println("Nova Posicao Atual: "+ jogadoDaVez.getMinhaPeca().getCasaAtual());
			
			//System.out.println("Casa Atual: "+ casaBuscada.getClass().getSimpleName());
			
			//System.out.println("---------------------------------------------------");
			
			//this.minhaPeca.moveHouse(casaBuscada);
			//this.minhaPeca.setCasaAtual(casaBuscada.getNome());
			
			
			//this.spritePeca.moveHouse(casaBuscada);
			//this.spritePeca.setCasaAtual(casaBuscada.getNome());
			
			
			//return numero;
		}
	}
	
	
	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}

	
	
}
