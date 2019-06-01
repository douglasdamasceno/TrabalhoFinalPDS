package controladores;


import java.util.ArrayList;

import entidade.Jogador;
import interfaces.IteratorJogador;

public class IteratorRodada implements IteratorJogador{
	
	private ArrayList<Jogador> listasDeJogadores;
	private int posicao;
	
	
	public IteratorRodada(ArrayList<Jogador> listaDeJogadores) {
		this.listasDeJogadores = listaDeJogadores;
		posicao = 0;
	}

	
	@Override
	public Jogador primeiroJogador() {
		return listasDeJogadores.get(0);
	}

	@Override
	public Jogador proximoJogador() {
		Jogador proximoJogador = listasDeJogadores.get(posicao);
		this.posicao++;
		if(proximoJogador==null) {
			return listasDeJogadores.get(0);
		}	
		return proximoJogador;
	}

	@Override
	public boolean existeProximoJogador() {
		if(posicao>=listasDeJogadores.size() || listasDeJogadores.get(posicao)==null) {
			posicao=0;
		}
		return true;
	}

	@Override
	public Jogador jogadorAtual() {
		if(posicao==listasDeJogadores.size())
			posicao =0;
		return listasDeJogadores.get(posicao);
	}

}
