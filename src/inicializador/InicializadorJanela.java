package inicializador;


import java.util.ArrayList;

import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;
import interfaces.CasaEspecial;

public class InicializadorJanela {
	
	private static InicializadorJanela inicializadorCasas;
	
	private ArrayList<Float> listaPosicaoX;
	private ArrayList<Float> listaPosicaoY;
	
	public static InicializadorJanela getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorJanela();
        return inicializadorCasas;	
	}
	
	private InicializadorJanela(){
		
		listaPosicaoX = new ArrayList<Float>();
		listaPosicaoY = new ArrayList<Float>();
	}
	
	public void iniciarListasPosicao(){
		float posicaoX = 45;
		float proximaCasaX =  100;
		CasaEspecial casa;
		
		int countX =0;
		
		int i=1;
		
		while(i<=10) {
			//lista Para Janela
			listaPosicaoX.add(posicaoX +(proximaCasaX * countX));
			listaPosicaoY.add(610.f);
			
			
			i++;
			countX++;
		}
		i= 11;
		posicaoX = 945;
		countX =0;
		while(i<=20) {
			//lista Para Janela
			listaPosicaoX.add(posicaoX - (proximaCasaX * countX));
			listaPosicaoY.add(543.2f);
			
			
			i++;
			countX++;
		}
		
		i=21;
		posicaoX =45;
		countX =0;
		while(i<=30) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX + (proximaCasaX * countX));
			listaPosicaoY.add(474.4f);
			
			
			i++;
			countX++;
		}
		
		i= 31;
		posicaoX =945;
		countX =0;
		while(i<=40) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX - (proximaCasaX * countX));
			listaPosicaoY.add(415.6f);
			
			
			
			i++;
			countX++;
		}
		
		
		i= 41;
		posicaoX =45;
		countX =0;
		while(i<=50) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX + (proximaCasaX * countX));
			listaPosicaoY.add(346.8f);
			
			
			
			i++;
			countX++;
		}
		
		i= 51;
		posicaoX =945;
		countX =0;
		while(i<=60) {
			//lista Para Janela
			listaPosicaoX.add(posicaoX - (proximaCasaX * countX));
			listaPosicaoY.add(278f);
			
			
			
			i++;
			countX++;
		}
		
		
		i= 61;
		posicaoX =45;
		countX =0;
		while(i<=70) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX + (proximaCasaX * countX));
			listaPosicaoY.add(209.2f);
			
			i++;
			countX++;
		}
		
		
		i= 71;
		posicaoX = 945;
		countX =0;
		while(i<=80) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX - (proximaCasaX * countX));
			listaPosicaoY.add(140.4f);
			
			
			
			i++;
			countX++;
		}
		
		i= 81;
		posicaoX =45;
		countX =0;
		while(i<=90) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX + (proximaCasaX * countX));
			listaPosicaoY.add(71.6f);
			
			
			
			i++;
			countX++;
		}
		
		i= 91;
		posicaoX =945;
		countX =0;
		while(i<=100) {
			
			//lista Para Janela
			listaPosicaoX.add(posicaoX - (proximaCasaX * countX));
			listaPosicaoY.add(7.2f);
					
			i++;
			countX++;
		}

	}

	public ArrayList<Float> getListaPosicaoX() {
		return listaPosicaoX;
	}

	public void setListaPosicaoX(ArrayList<Float> listaPosicaoX) {
		this.listaPosicaoX = listaPosicaoX;
	}

	public ArrayList<Float> getListaPosicaoY() {
		return listaPosicaoY;
	}

	public void setListaPosicaoY(ArrayList<Float> listaPosicaoY) {
		this.listaPosicaoY = listaPosicaoY;
	}
	
	
	
	
	
}
