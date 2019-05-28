package main.Teste;

import java.util.ArrayList;

import JGamePlay.GameImage;
import JGamePlay.Window;
import entidade.Jogador;
import entidade.Peca;
import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import inicializador.InicializadorCasas;

public class TesteMain {

	public static void main(String[] args) {
		Window janela = new Window(1190,1000);
		
		GameImage backGround = new GameImage("recursos/serpentes2.png");
		
		//Peca pe = new Peca(1);
		Jogador j1 =  new Jogador("Jose",1);
		Jogador j2 =  new Jogador("Maria",2);
		
		InicializadorCasas IniCa = InicializadorCasas.getInstance();
		
//		ArrayList<AbstractCasa> listaDeCasa = IniCa.iniciarCasas();
//		
//		for (AbstractCasa abstractCasa : listaDeCasa) {
//		System.out.println(abstractCasa.getNome());
//		}
		int i =0;
		int j =0;
		while (i==1) {
			
			backGround.draw();
			//pe.draw();
			//AbstractCasa casa =  IniCa.iniciarCasas().get(i);
			//System.out.println(casa.getNome()+ " Tipo : "+ casa.getClass().getSimpleName());
			
			
			j1.colocarPecaNoTabuleiro();
			j1.avancarPeca();
		
			
			i++;
			janela.display();
			
			
			
			
	
		}
		//janela.exit();
	
	
	
	
	}

}
