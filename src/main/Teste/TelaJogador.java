package main.Teste;

import java.util.ArrayList;

import controladores.ControladorJogo;

public class TelaJogador {
	private int qtdJogadores;
	private ControladorJogo controlerJogador = ControladorJogo.getInstance();
	
	public TelaJogador(int qddJogadores) {
		this.qtdJogadores =qddJogadores;
	}
	
	void pegarNomesJogadores() {
		int i =0;
		ArrayList<String> listaDeNomes = new ArrayList<>();
		while(i<qtdJogadores) {
			try {
	    		String entrada = TelaMensagem.getInstance().showInputDialog("Qual nome do jogadores");
		        if(entrada != null){
		           listaDeNomes.add(entrada);
		        }
		     i++;
	    	}catch(Exception e) {
	    		TelaMensagem.getInstance().showMessageDialog("Digite uma qdd numerica de jogadores");
	    	}
		}
		controlerJogador.criarJogador(listaDeNomes,qtdJogadores);
        
	}
}
