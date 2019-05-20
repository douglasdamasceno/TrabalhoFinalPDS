package controladores;


import entidade.Jogador;
import interfaces.IteratorJogador;

public class ControladorRodada implements IteratorJogador{
	
	private Jogador[] listaJogadores;
	private int posicao;
	
	public ControladorRodada(Jogador[] listaJogadores) {
		this.listaJogadores = listaJogadores;
		posicao = 0;
	}
	
	@Override
	public Jogador primeiroJogador() {
		return listaJogadores[0];
	}

	@Override
	public Jogador proximoJogador() {
		Jogador proximoJogador = listaJogadores[posicao];
		this.posicao++;
		if(proximoJogador==null) {
			return listaJogadores[0];
		}	
		return proximoJogador;
	}

	@Override
	public boolean existeProximoJogador() {
		if(posicao>=listaJogadores.length || listaJogadores[posicao]==null) {
			posicao =0;
		}
		return true;
	}

	@Override
	public Jogador jogadorAtual() {
		return listaJogadores[posicao];
	}

}
