package fabrica;

import entidade.casas.Casa;
import entidade.casas.CasaCarta;
import entidade.casas.CasaCobra;
import entidade.casas.CasaEscada;
import interfaces.AbstractFabrica;
import interfaces.CasaEspecial;

public class FabricaCasa implements AbstractFabrica{

	@Override
	public CasaEspecial criarCasa(int tipo,float posicaoX, float posicaoY, int nome) {
		CasaEspecial casa = null;
		//casas escadas
		if(tipo==3 || tipo==6 || tipo==14 || tipo==27 || tipo==39 || tipo==41 || tipo==69 || tipo==89) {
			if(tipo==3) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 345, 415.6f,37);
			}else if(tipo==6) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 445, 543.2f,16);
			}else if(tipo==14) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 845, 415.6f,32);
			}else if(tipo==27) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 545, 278,55);
			}else if(tipo==39) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 245, 346.8f,43);
			}else if(tipo==41) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 445, 71.6f,85);
			}else if(tipo==69) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 645, 71.6f,87);
			}else if(tipo==89) {
				casa = new CasaEscada(posicaoX, posicaoY, nome, 945, 7.2f,91);
			}
		}//casas cobras
		else if(tipo==15 || tipo==42 || tipo==49 || tipo==57 || tipo==75 || tipo==88 || tipo==97) {
			if(tipo==15) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 845, 610,9);
			}else if(tipo==42) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 345, 543.2f,17);
			}else if(tipo==49) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 845, 543.2f,12);
			}else if(tipo==57) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 545, 346.8f,46);
			}else if(tipo==75) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 645, 346.8f,47);
			}else if(tipo==88) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 445, 415.6f,36);
			}else if(tipo==97) {
				casa = new CasaCobra(posicaoX, posicaoY, nome, 445, 209.2f,65);
			}
		}//casas cartas
//		else if(tipo==4 || tipo==21 || tipo==26 || tipo==52 || tipo==72 || tipo==80 || tipo==86){
//			if(tipo==4) {
//				casa = new CasaCarta(posicaoX, posicaoY, nome, posicaoX1, 610, posicaoX2, 610, posicaoX3, 610);
//			}
//		}
		else {
			casa = new Casa(posicaoX, posicaoY, nome);
		}
		return casa;
	}
	
	
}
