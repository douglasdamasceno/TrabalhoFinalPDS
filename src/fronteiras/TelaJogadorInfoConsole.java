package fronteiras;

import java.util.Scanner;

import entidade.Jogador;
import interfaces.CasaEspecial;

public class TelaJogadorInfoConsole {
	private Jogador jogador;
	private int posicaoAnterior;
	private Scanner scan;
	private int numeroAleatorio;
	private CasaEspecial casa;
	private TelaFimJogoConsole telaFimJogoConsole;
	
	
	public TelaJogadorInfoConsole() {
	}
	
	public String rolarDadoJogador() {
		posicaoAnterior = jogador.getMinhaPeca().getCasaAtual();
		System.out.println("Vez do jogador: " + jogador.getNome());
		System.out.println("Posicao Inicial: " + posicaoAnterior);
		System.out.println("Digite enter para jogar os Dados:" );
		scan = new Scanner(System.in);
		
		String entrada = scan.nextLine();
		return entrada;
	}
	

	public void infoJogador() {
		
		System.out.println("Valor dos Dados: "+ numeroAleatorio);
		if((numeroAleatorio+ posicaoAnterior)==jogador.getMinhaPeca().getCasaAtual()) {
			System.out.println("Nova Posicao : "+ jogador.getMinhaPeca().getCasaAtual());
			System.out.println("Tipo: " + casa.getClass().getSimpleName());
		}else {
			System.out.println("Nova Posicao: "+ (numeroAleatorio+ posicaoAnterior));
			System.out.println("Tipo: " + casa.getClass().getSimpleName());
			System.out.println("Execacao da Acao da "+casa.getClass().getSimpleName()+" ...");
			System.out.println("Posicao Final: "+ jogador.getMinhaPeca().getCasaAtual());
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public TelaFimJogoConsole getTelaFimJogoConsole() {
		return telaFimJogoConsole;
	}

	
	public void FimDeJogo(int numero) {
		telaFimJogoConsole = new TelaFimJogoConsole(numero,jogador);
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

	
}
