package controladores;

import java.util.ArrayList;

import entidade.Jogador;
import interfaces.IteratorJogador;

public class ControladorRodada implements IteratorJogador{
	
	ArrayList<Jogador> listaDeJogadores;
	
	public ControladorRodada() {
		listaDeJogadores = new ArrayList<Jogador>();
		
	}
	
	public void addJogador() {
		
	}
	
	@Override
	public Jogador primeiroJogador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogador proximoJogador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeProximoJogador() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Jogador jogadorAtual() {
		// TODO Auto-generated method stub
		return null;
	}

}
