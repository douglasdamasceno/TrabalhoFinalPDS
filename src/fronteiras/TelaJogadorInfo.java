package fronteiras;

import java.util.Scanner;

import entidade.Jogador;

public class TelaJogadorInfo {
	private Jogador jogador;
	public TelaJogadorInfo() {
	}
	
	public String rolarDadoJogador() {
		System.out.println("Digite enter para jogar os Dados:" );
		Scanner scan = new Scanner(System.in);
		String entrada = scan.nextLine();
		return entrada;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public void Tese() {
		System.out.println("Jogador Tela "+ jogador.toString());
	}
}
