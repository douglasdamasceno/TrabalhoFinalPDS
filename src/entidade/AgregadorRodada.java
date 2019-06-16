package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;
import interfaces.AgregadorIterator;
import interfaces.IteratorJogador;

public class AgregadorRodada implements AgregadorIterator{
	private IteratorRodada iteratorJogador;
	
	public AgregadorRodada() {}

	@Override
	public IteratorJogador criarInteratorJogador(ArrayList<Jogador> listaDeJogadores) {
		iteratorJogador = new IteratorRodada(listaDeJogadores);
		return iteratorJogador;
	}
	
//	@Override
//	public IteratorRodada criarInteratorJogador(ArrayList<Jogador> listaDeJogadores) {
//		iteratorJogador = new IteratorRodada(listaDeJogadores);
//		return iteratorJogador;
//	}
	
	
//IteratorJogador
}
