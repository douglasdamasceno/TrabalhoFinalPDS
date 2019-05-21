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
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==6) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==14) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==27) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==39) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==41) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==69) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}else if(tipo==89) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
			}
		}else if(tipo==15 || tipo==42 || tipo==49 || tipo==57 || tipo==75 || tipo==88 || tipo==97) {
			if(tipo==15) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==42) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==49) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==57) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==75) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==88) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}else if(tipo==97) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 1, 0);
			}
		}else {
			casa = new Casa(posicaoX, posicaoY, nome);
		}
		return casa;
	}
	
	//Casas Tipo Escada 
	// numeros 3=37, 6=16 ,14=32 ,27=55,39=43,41=85,69=87,89=91
	
	
	//Casas Cobras
	// numeros 15=9 ,42=17, 49=12, 57=46, 75=47, 88=36,97=65, 

}
