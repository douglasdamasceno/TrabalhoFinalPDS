package fronteiras;

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
		while(i<qtdJogadores) {
			try {
	    		String entrada = TelaMensagem.getInstance().showInputDialog("Qual nome do jogadores");
		        if(entrada != null){
		           String nomeJogadores = entrada;
		           controlerJogador.criarJogador(nomeJogadores,qtdJogadores);
		        }
		     i++;
	    	}catch(Exception e) {
	    		TelaMensagem.getInstance().showMessageDialog("Digite uma qdd numerica de jogadores");
	    	}
		}
	}
}
