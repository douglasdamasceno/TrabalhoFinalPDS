package fronteiras;

import java.util.ArrayList;

import controladores.ControladorJogo;
import controladores.IteratorRodada;
import entidade.Jogador;
import entidade.Jogo;

public class MainTestarIterator {

	public static void main(String[] args) {
		Jogador[] lisJogador = new Jogador[3];
		Jogador j1 = new Jogador("Douglas ",1);
		Jogador j2 = new Jogador("Maria ",2);
		Jogador j3 = new Jogador("Jo ",3);
		lisJogador[0] = j1;
		lisJogador[1] = j2;
		lisJogador[2] = j3;
		
		
		
		//IteratorRodada TR = new IteratorRodada(lisJogador);
		
		
//		while(TR.existeProximoJogador()) {
//			System.out.println(TR.proximoJogador().getNome());
//		}
		
		ControladorJogo CJ = ControladorJogo.getInstance();
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		listaDeNomes.add("Douglas");
		listaDeNomes.add("Jose");
		listaDeNomes.add("Jo");
		CJ.criarJogador(listaDeNomes, 3);
		

//		Jogo jogo = Jogo.getInstance();
//		//TesteConsole TC = new TesteConsole();
//		
//		jogo.criarJogadores(listaDeNomes, 3);
//		
//		jogo.JogadoresRodada();
	}

}
