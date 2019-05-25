package fronteiras;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteConsole {

	private Scanner entrada;
	public TesteConsole() {
		
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
		}else if(valor>=1 && valor<=4){
			informarNomes(valor);
		}
	
	}
	void informarNomes(int qtdJogadores) {
		int i =0;
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		while(i<qtdJogadores) {
			String nome = entrada.nextLine();
			if(!nome.isEmpty()) {
				listaDeNomes.add(nome);
			}
			i++;
		}
		
	}
}
