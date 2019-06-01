package main.Teste;

import entidade.Jogador;

public class TelaFimJogo {
	
	public TelaFimJogo(Jogador jogador) {
		inforDoCampeao(jogador);
	}
	
	public void inforDoCampeao(Jogador jogador) {
		System.out.println("Camepao ");
		System.out.println(jogador.toString());
	}
	
}
