package fronteiras;


public class TelaInicial {
	public TelaInicial() {
		criarJanela();
	}
	
	void criarJanela() {
		try {
    		String entrada = TelaMensagem.getInstance().showInputDialog("Qual a qdd de jogadores?");
	        if(entrada != null){
	            int qtdJogadores = Integer.parseInt(entrada);
	            if(qtdJogadores>1) {
	            	TelaJogador telaJogador = new TelaJogador(qtdJogadores);
		            telaJogador.pegarNomesJogadores();
	            }
	            if(qtdJogadores==1)
	            	TelaMensagem.getInstance().showMessageDialog("Não é possivel jogar só com 1 jogador");
           
	           
	        }  
	      }catch(Exception e) {
    		TelaMensagem.getInstance().showMessageDialog("Digite uma qdd numerica de jogadores");
    	}
	}
	
}
