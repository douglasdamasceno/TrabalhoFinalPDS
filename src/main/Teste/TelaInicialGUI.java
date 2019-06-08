package main.Teste;

import java.util.ArrayList;

import controladores.ControladorJogo;

public class TelaInicialGUI {
	
	private ControladorJogo controlerJogador = ControladorJogo.getInstance();
	private  TelaMensagemGUI telaMensagemGUI;
	
	private static TelaInicialGUI telaInicialGUI;
	
	public static TelaInicialGUI getInstance() {
		if(telaInicialGUI==null) {
			telaInicialGUI = new TelaInicialGUI();
		}
		return telaInicialGUI;
	}
	
	private TelaInicialGUI () {
		telaMensagemGUI = new TelaMensagemGUI();
		iniciarJogo();
	}
	
	void iniciarJogo() {
		String entrada = telaMensagemGUI.showInputDialog("Digite 1 para jogar| 0 para sair");
        if(entrada.equals("1")) {
        	criarJanela();
        }
	}
	
	
	
	
	void criarJanela() {
		try {
    		String entrada = telaMensagemGUI.showInputDialog("Qual a qdd de jogadores?");
	        if(entrada != null){
	            int qtdJogadores = Integer.parseInt(entrada);
	            if(qtdJogadores>1 && qtdJogadores<=4) {
	            	 pegarNomesJogadores(qtdJogadores);
	            }
	            if(qtdJogadores==1)
	            	telaMensagemGUI.showMessageDialog("Não é possivel jogar só com 1 jogador");
           
	           
	        }  
	      }catch(Exception e) {
    		telaMensagemGUI.showMessageDialog("Digite uma qdd numerica de jogadores");
    	}
	}
	

	void pegarNomesJogadores(int qtdJogadores) {
		int i =0;
		ArrayList<String> listaDeNomes = new ArrayList<>();
		while(i< qtdJogadores) {
			try {
	    		String entrada = telaMensagemGUI.showInputDialog("meu Qual nome do jogadores");
		        if(entrada != null){
		           listaDeNomes.add(entrada);
		        }
		     i++;
	    	}catch(Exception e) {
	    		telaMensagemGUI.showMessageDialog("Digite um nome de jogador valido");
	    	}
		}
		controlerJogador.criarJogador(listaDeNomes,qtdJogadores);
        
	}
	
}
