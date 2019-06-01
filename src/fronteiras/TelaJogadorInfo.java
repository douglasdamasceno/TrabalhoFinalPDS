package fronteiras;

import java.util.Scanner;

import entidade.Jogador;
import entidade.casas.AbstractCasa;
import interfaces.CasaEspecial;
import main.Teste.TelaFimJogo;

public class TelaJogadorInfo {
	private Jogador jogador;
	private Scanner scan;
	private int numeroAleatorio;
	private CasaEspecial casa;
	private TelaFimJogo telaFimJogoConsole;
	
	public TelaJogadorInfo() {
	}
	
	public String rolarDadoJogador() {
		System.out.println("Vez do jogador: " + jogador.getNome());
		System.out.println("Digite enter para jogar os Dados:" );
		scan = new Scanner(System.in);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public CasaEspecial getCasa() {
		return casa;
	}

	public void setCasa(CasaEspecial casa) {
		this.casa = casa;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public void infoJogador() {
		System.out.println("Posicao Atual : "+ jogador.getMinhaPeca().getCasaAtual());
		System.out.println("Numero Aleatorio : "+ numeroAleatorio);
		System.out.println("Jogador Tela "+ jogador.toString());
		System.out.println("Tipo: " + casa);
		System.out.println("-------------------------------------------------------");
	}
	
	public void FimDeJogo() {
		telaFimJogoConsole = new TelaFimJogo(jogador);
	}
	
}
