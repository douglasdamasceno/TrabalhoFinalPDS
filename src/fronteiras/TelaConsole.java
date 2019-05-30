package fronteiras;

import java.util.ArrayList;
import java.util.Scanner;

import controladores.ControladorJogo;

public class TelaConsole {

	private Scanner entrada;
	private ControladorJogo controladorJogo = ControladorJogo.getInstance();
	
	
	public TelaConsole() {
		iniciarJogo();
	}
	
	void iniciarJogo() {
		System.out.println("Digite 1 para jogar 0 para sair: ");
		entrada = new Scanner(System.in);
		String operacao = entrada.nextLine();
		if(operacao.equals("1")) {
			qtdDeJogadores();
		}else {
			System.out.println("Jogo encerrado!");
		}
		
	}
	void qtdDeJogadores() {
		System.out.println("Digite a qtd de Jogadores: ");
		entrada = new Scanner(System.in);
		String operacao = entrada.nextLine();
		int valor = Integer.parseInt(operacao);
		if(valor==1) {
			System.out.println("Não é possivel jogar com apenas 1 jogador");
			qtdDeJogadores();
		}else if(valor>1 && valor<=4){
			System.out.println("entrou");
			informarNomes(valor);
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
		//aqui vai chamar a outra tela
		controladorJogo.criarJogador(listaDeNomes, qtdJogadores);
	}
}
