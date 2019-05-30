package inicializador;

import java.util.ArrayList;

import entidade.casas.AbstractCasa;
import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;

public class InicializadorCasas {
	
	private static InicializadorCasas inicializadorCasas;
	private AbstractFabrica minhaFabrica;
	private ArrayList<AbstractCasa> listaDeCasa;
	
	public static InicializadorCasas getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasas();
        return inicializadorCasas;	
	}
	
	private InicializadorCasas(){
		listaDeCasa = new ArrayList<>();	
		minhaFabrica = new FabricaCasa();
    }
	
	public ArrayList<AbstractCasa> iniciarCasas(){
		float posicaoX = 45;
		float proximaCasaX =  100;
		AbstractCasa casa;
		
		int countX =0;
		
		int i=1;
		
		while(i<=10) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX), 610, i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		i= 20;
		posicaoX =45;
		countX =0;
		while(i>=11) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),543.2f , i);
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		i=21;
		posicaoX =45;
		countX =0;
		while(i<=30) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),474.4f , i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		i= 40;
		posicaoX =45;
		countX =0;
		while(i>=31) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),415.6f , i);
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		
		i= 41;
		posicaoX =45;
		countX =0;
		while(i<=50) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),346.8f , i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		i= 60;
		posicaoX =45;
		countX =0;
		while(i>=51) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),278 , i);
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		
		i= 61;
		posicaoX =45;
		countX =0;
		while(i<=70) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),209.2f , i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		
		i= 80;
		posicaoX =45;
		countX =0;
		while(i>=71) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),140.4f, i);
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		i= 81;
		posicaoX =45;
		countX =0;
		while(i<=90) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),71.6f , i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		i= 100;
		posicaoX =45;
		countX =0;
		while(i>=91) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX), 7.2f, i);
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		for (AbstractCasa abstractCasa : listaDeCasa) {
			System.out.println(abstractCasa.getNome() + abstractCasa.getClass().getSimpleName() +"X: " + abstractCasa.getPosicaoX() + "Y: "+abstractCasa.getPosicaoY());
		}
		return listaDeCasa;
	}
	
	
}
