package fronteiras;

import java.util.ArrayList;

import controladores.IteratorRodada;
import entidade.Jogador;

public class MainTestarIterator {

	public static void main(String[] args) {
		Jogador[] lisJogador = new [3]Jogador;
		Jogador j1 = new Jogador("Douglas ",1);
		Jogador j2 = new Jogador("Maria ",2);
		Jogador j3 = new Jogador("Jo ",3);
		lisJogador.add(j1);
		lisJogador.add(j2);
		lisJogador.add(j3);
		
		IteratorRodada TR = new IteratorRodada(lisJogador);
	}

}
