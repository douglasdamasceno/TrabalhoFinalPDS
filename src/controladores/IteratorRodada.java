package controladores;


import java.util.ArrayList;

import entidade.Jogador;
import interfaces.IteratorJogador;

public class IteratorRodada implements IteratorJogador{
	
	//private Jogador[] listaJogadores;
	private ArrayList<Jogador> listasDeJogadores;
	private int posicao;
	
	
	public IteratorRodada(ArrayList<Jogador> listaDeJogadores) {
		//this.listaJogadores = listaJogadores;
		this.listasDeJogadores = listaDeJogadores;
		posicao = 0;
	}

	
	@Override
	public Jogador primeiroJogador() {
		return listasDeJogadores.get(0);
		//return listaJogadores[0];
	}

	@Override
	public Jogador proximoJogador() {
		//Jogador proximoJogador = listaJogadores[posicao];
		Jogador proximoJogador = listasDeJogadores.get(posicao);
		this.posicao++;
		if(proximoJogador==null) {
			return listasDeJogadores.get(0);
			//return listaJogadores[0];
		}	
		return proximoJogador;
	}

	@Override
	public boolean existeProximoJogador() {
//		if(posicao>=listaJogadores.length || listaJogadores[posicao]==null) {
//			posicao =0;
//		}
		if(posicao>=listasDeJogadores.size() || listasDeJogadores.get(posicao)==null) {
			posicao=0;
		}
		return true;
	}

	@Override
	public Jogador jogadorAtual() {
		return listasDeJogadores.get(posicao);
		//return listaJogadores[posicao];
	}

}
