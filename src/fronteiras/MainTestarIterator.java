package fronteiras;

import controladores.IteratorRodada;
import entidade.Jogador;

public class MainTestarIterator {

	public static void main(String[] args) {
		Jogador[] lisJogador = new Jogador[3];
		Jogador j1 = new Jogador("Douglas ",1);
		Jogador j2 = new Jogador("Maria ",2);
		Jogador j3 = new Jogador("Jo ",3);
		lisJogador[0] = j1;
		lisJogador[1] = j2;
		lisJogador[2] = j3;
		
		IteratorRodada TR = new IteratorRodada(lisJogador);
		while(TR.existeProximoJogador()) {
			System.out.println(TR.proximoJogador().getNome());
		}
	}

}
