package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;
import interfaces.CasaEspecial;

public class Jogo {
	
	private IteratorRodada iteratorRodado;
	ArrayList<Jogador> listaDeJogadores;
	private Tabuleiro meuTabuleiro = Tabuleiro.getInstance();
	private AgregadorRodada agregadorRodada;
	private Dado dado;
	private int numeroGerado;
	private CasaEspecial casaDaRodada;
	
	public Jogo() {
		listaDeJogadores = new ArrayList<Jogador>();
		agregadorRodada = new AgregadorRodada();
		dado = new Dado(12);
		numeroGerado = 0;
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
	
	public boolean JogadoresRodada() {
	         Jogador jogadorVez = iteratorRodado.proximoJogador();
	        
	  
	         this.avancarPeca(jogadorVez);
	         
	         
	         if(jogadorVez.getMinhaPeca().getCasaAtual()>=100) {
	        	return true;
	         }
			return false;	
	}
	
	public Jogador jogadorDaVez() {
		return iteratorRodado.jogadorAtual();
	}
	
	public int lancarDados() {
		return this.dado.lancarDado();
	}
	
	public void avancarPeca(Jogador jogadoDaVez) {
		int numero = this.lancarDados();
		int novaPosicao = jogadoDaVez.getMinhaPeca().getCasaAtual() + numero;
		
		this.setNumeroGerado(numero);
	
		if(novaPosicao>=100) {
			casaDaRodada = meuTabuleiro.getListaDeCasas().get(99);
			jogadoDaVez.avancarPeca(casaDaRodada);
		}else {
			casaDaRodada = meuTabuleiro.getListaDeCasas().get(novaPosicao-1);
			jogadoDaVez.avancarPeca(casaDaRodada);
		
		}
	}
	
	
	public ArrayList<Jogador> getListaDeJogadores() {
		return listaDeJogadores;
	}	
	
	public CasaEspecial getCasaDaRodada() {
		return casaDaRodada;
	}

	

	public int getNumeroGerado() {
		return numeroGerado;
	}

	
	
	public void setNumeroGerado(int numeroGerado) {
		this.numeroGerado = numeroGerado;
	}

	
	
}
