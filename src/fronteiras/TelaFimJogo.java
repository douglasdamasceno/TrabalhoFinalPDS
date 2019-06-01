package fronteiras;

import entidade.Jogador;

public class TelaFimJogo {
	
	public TelaFimJogo(int numero,Jogador jogador) {
		inforDoCampeao(numero,jogador);
	}
	
	public void inforDoCampeao(int numero,Jogador jogador) {
		System.out.println("Valor dos Dados: "+numero);
		System.out.println("Nova Posicao : 100");
		System.out.println("Tipo: Casa");
		System.out.println("Campeao do Jogador "+ jogador.getNome());
	}
	
}
