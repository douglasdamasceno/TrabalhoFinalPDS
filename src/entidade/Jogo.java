package entidade;

import java.util.ArrayList;

import interfaces.AgregadorIterator;
import interfaces.CasaEspecial;
import interfaces.IteratorJogador;

public class Jogo {
	
	private IteratorJogador iteratorRodado;
	ArrayList<Jogador> listaDeJogadores;
	private Tabuleiro meuTabuleiro = Tabuleiro.getInstance();
	private AgregadorIterator agregadorRodada;
	private int numeroGerado;
	private CasaEspecial casaDaRodada;
	
	public Jogo() {
		listaDeJogadores = new ArrayList<Jogador>();
		agregadorRodada = new AgregadorRodada();
		numeroGerado = 0;
	}
	
	public boolean criarJogadores(ArrayList<String> nomeDoJogador,int qtdJogadores) {
		int i=0;
		while(i<qtdJogadores) {
			Jogador jogador = new Jogador(nomeDoJogador.get(i),i+1 );
			listaDeJogadores.add(jogador);
			i++;
		}
		iteratorRodado =  agregadorRodada.criarInteratorJogador(listaDeJogadores);
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
	

	public void avancarPeca(Jogador jogadoDaVez) {
		int numero = jogadoDaVez.lancarDados();
		int novaPosicao = jogadoDaVez.getMinhaPeca().getCasaAtual() + numero;
		if(novaPosicao>=100) {
			casaDaRodada = meuTabuleiro.getListaDeCasas().get(99);
			jogadoDaVez.avancarPeca(casaDaRodada);
		}else {
			casaDaRodada = meuTabuleiro.getListaDeCasas().get(novaPosicao-1);
			jogadoDaVez.avancarPeca(casaDaRodada);
		}
		this.setNumeroGerado(numero);
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
