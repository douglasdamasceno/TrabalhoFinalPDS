package fronteiras;

import controladores.ControladorGameSom;
import controladores.ControladorRodada;
import entidade.Jogador;

public class Main {

	public static void main(String[] args) {
		Jogador j1 =  new Jogador("Jose");
		Jogador j2 =  new Jogador("Maria");
		Jogador j3 =  new Jogador("Carlos");
		Jogador j4 = new Jogador("Jo");
		Jogador[] listaJogadores = new Jogador[4] ;
		listaJogadores[0] = j1;
		listaJogadores[1] = j2;
		listaJogadores[2] = j3;
		listaJogadores[3] = j4;
		
		
		ControladorRodada conR = new ControladorRodada(listaJogadores);
		
		System.out.println("Nome "+ listaJogadores[0].getNome());
		System.out.println("nome "+ listaJogadores[1].getNome());
		System.out.println("nome "+ listaJogadores[2].getNome());
		System.out.println("nome "+ listaJogadores[3].getNome());
		
		
		System.out.println("Primeiro Jogador "+ conR.primeiroJogador().getNome());
		
		System.out.println("Proimo jogador "+ conR.proximoJogador().getNome());
		System.out.println("Proimo jogador "+ conR.proximoJogador().getNome());
		
		//TelaMensagem CM = TelaMensagem.getInstance();
		
		//System.out.println(CM.showInputDialog("Diga"));
		
		//TelaInicial te = new TelaInicial();
		
		
		
	}

}
