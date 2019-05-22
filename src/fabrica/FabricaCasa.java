package fabrica;

import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import entidade.casas.CasaCobra;
import entidade.casas.CasaEscada;
import interfaces.AbstractFabrica;

public class FabricaCasa implements AbstractFabrica{

	@Override
	public AbstractCasa criarCasa(int tipo,float posicaoX, float posicaoY, String nome) {
		AbstractCasa casa = null;
		if(tipo==3 || tipo==6 || tipo==14 || tipo==27 || tipo==39 || tipo==41 || tipo==69 || tipo==89) {
			if(tipo==3) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 345, 395.6f);
			}else if(tipo==6) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 445, 533.2f);
			}else if(tipo==14) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 845, 395.6f);
			}else if(tipo==27) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 545, 258);
			}else if(tipo==39) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 245, 326.8f);
			}else if(tipo==41) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 445, 51.6f);
			}else if(tipo==69) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 645, 51.6f);
			}else if(tipo==89) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 945, -17.2f);
			}
		}else if(tipo==15 || tipo==42 || tipo==49 || tipo==57 || tipo==75 || tipo==88 || tipo==97) {
			if(tipo==15) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 845, 610);
			}else if(tipo==42) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 345, 533.2f);
			}else if(tipo==49) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 845, 533.2f);
			}else if(tipo==57) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 545, 326.8f);
			}else if(tipo==75) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 645, 326.8f);
			}else if(tipo==88) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 445, 395.6f);
			}else if(tipo==97) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 445, 189.2f);
			}
		}else {
			casa = new Casa(posicaoX, posicaoY, nome);
		}
		return casa;
	}
	
	
}
