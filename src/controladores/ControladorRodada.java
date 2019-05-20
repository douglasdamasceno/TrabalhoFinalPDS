package controladores;

import java.util.ArrayList;

import entidade.Jogador;
import interfaces.IteratorJogador;

public class ControladorRodada implements IteratorJogador{
	
	//ArrayList<Jogador> listaDeJogadores;
	private Jogador[] listaJogadores;
	private int posicao;
	
	public ControladorRodada(Jogador[] listaJogadores) {
	//	listaDeJogadores = new ArrayList<Jogador>();
		this.listaJogadores = listaJogadores;
		posicao = 0;
	}
	
	public void addJogador(Jogador jogador) {
		//listaDeJogadores.add(jogador);
	}
	
	@Override
	public Jogador primeiroJogador() {
		//return listaDeJogadores.get(0);
		return listaJogadores[0];
	}

	@Override
	public Jogador proximoJogador() {
		this.posicao = posicao + 1;
		Jogador proximoJogador = listaJogadores[posicao];
		if(proximoJogador==null) {
			posicao = 0;
		}	
			proximoJogador = this.primeiroJogador();
		System.out.println("ook "+ proximoJogador.getNome());
		return proximoJogador;
	}

	@Override
	public boolean existeProximoJogador() {
		
		return false;
	}

	@Override
	public Jogador jogadorAtual() {
		return listaJogadores[posicao];
	}

}
