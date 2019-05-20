package fronteiras;

import java.util.ArrayList;

import controladores.ControladorJogo;

public class TelaJogador {
	private int qtdJogadores;
	private ControladorJogo controlerJogador;
	
	public TelaJogador(int qddJogadores) {
		this.qtdJogadores =qddJogadores;
		controlerJogador = new ControladorJogo();
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
