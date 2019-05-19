package interfaces;

import entidade.Jogador;

public interface IteratorJogador {
	
	public Jogador primeiroJogador();
	public Jogador proximoJogador();
	public boolean existeProximoJogador();
	public Jogador jogadorAtual();
	
	
	
	
}
