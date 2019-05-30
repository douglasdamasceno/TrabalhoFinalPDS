package fronteiras;

import entidade.Jogador;

public class TelaJogadorInfo {
	private Jogador jogador;
	public TelaJogadorInfo(Jogador jogador) {
		this.jogador = jogador;
		inforJogador();
	}
	
	public void inforJogador() {
		if(jogador!=null) {
			System.out.println(this.jogador.toString());
		}else {
			System.out.println("Jogador nulo");
		}
	}
}
