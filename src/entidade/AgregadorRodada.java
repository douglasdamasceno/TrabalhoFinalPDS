package entidade;

import java.util.ArrayList;

import controladores.IteratorRodada;
import interfaces.AgregadorIterator;

public class AgregadorRodada implements AgregadorIterator{
	private IteratorRodada iteratorJogador;
	
	public AgregadorRodada() {
	
	}
	@Override
	public IteratorRodada criarInteratorJogador(ArrayList<Jogador> listaDeJogadores) {
		iteratorJogador = new IteratorRodada(listaDeJogadores);
		return iteratorJogador;
	}
	

}
