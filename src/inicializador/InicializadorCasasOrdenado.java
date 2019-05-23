package inicializador;


import java.util.ArrayList;

import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;

public class InicializadorCasasOrdenado {
	
	private static InicializadorCasasOrdenado inicializadorCasas;
	private AbstractFabrica minhaFabrica;
	private ArrayList<AbstractCasa> listaDeCasa;
	
	public static InicializadorCasasOrdenado getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasasOrdenado();
        return inicializadorCasas;	
	}
	
	private InicializadorCasasOrdenado(){
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
		i= 11;
		posicaoX = 945;
		countX =0;
		while(i<=20) {
			casa = minhaFabrica.criarCasa(i, posicaoX -(proximaCasaX * countX),543.2f , i);
			listaDeCasa.add(casa);
			i++;
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
		
		i= 31;
		posicaoX =945;
		countX =0;
		while(i<=40) {
			casa = minhaFabrica.criarCasa(i, posicaoX -(proximaCasaX * countX),415.6f , i);
			listaDeCasa.add(casa);
			i++;
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
		
		i= 51;
		posicaoX =945;
		countX =0;
		while(i<=60) {
			casa = minhaFabrica.criarCasa(i, posicaoX -(proximaCasaX * countX),278 , i);
			listaDeCasa.add(casa);
			i++;
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
		
		
		i= 71;
		posicaoX = 945;
		countX =0;
		while(i<=80) {
			casa = minhaFabrica.criarCasa(i, posicaoX -(proximaCasaX * countX),140.4f, i);
			listaDeCasa.add(casa);
			i++;
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
		
		i= 91;
		posicaoX =945;
		countX =0;
		while(i<=100) {
			casa = minhaFabrica.criarCasa(i, posicaoX -(proximaCasaX * countX), 7.2f, i);
			listaDeCasa.add(casa);
			i++;
			countX++;
		}

		return listaDeCasa;
	}
	
	
}
