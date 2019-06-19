package fronteiras;

import java.util.ArrayList;
import java.util.Scanner;

import controladores.ControladorJogo;

public class TelaInicialConsole {

	private Scanner entrada;
	private ControladorJogo controladorJogo = ControladorJogo.getInstance();
	
	
	public TelaInicialConsole() {
		iniciarJogo();
	}
	
	void iniciarJogo() {
		System.out.println("Digite 1 para jogar 0 para sair: ");
		entrada = new Scanner(System.in);
		String operacao = entrada.nextLine();
		if(operacao.equals("1")) {
			qtdDeJogadores();
		}else if(operacao.equals("0")){
			System.out.println("Jogo encerrado!");
		}else {
			System.out.println("Valor invalido!");
			iniciarJogo();
		}
		
	}
	void qtdDeJogadores() {
		System.out.println("Digite a qtd de Jogadores: ");
		entrada = new Scanner(System.in);
		String operacao = entrada.nextLine();
		try {
			int valor = Integer.parseInt(operacao);
			if(valor==1) {
				System.out.println("Não é possivel jogar com apenas 1 jogador");
				qtdDeJogadores();
			}else if(valor>1 && valor<=4){
				informarNomes(valor);
			}else {
				System.out.println("Valor Invalido!!");
				qtdDeJogadores();
			}
		}catch (Exception e) {
			System.out.println("Valor invalido");
			qtdDeJogadores();
		}
	}
	void informarNomes(int qtdJogadores) {
		int i =0;
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		while(i<qtdJogadores) {
			System.out.println("Digite o nome do Jogado!");
			String nome = entrada.nextLine();
			if(!nome.isEmpty()) {
				listaDeNomes.add(nome);
			}else if(nome.isEmpty()){
				System.out.println("Digite novamente os "+qtdJogadores+" nomes:");
				informarNomes(qtdJogadores);
			}
			i++;
		}
		controladorJogo.criarJogador(listaDeNomes, qtdJogadores);
	}
}
