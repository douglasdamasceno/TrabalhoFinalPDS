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
				casa = new CasaEscada(nome,37);
			}else if(tipo==6) {
				casa = new CasaEscada(nome,16);
			}else if(tipo==14) {
				casa = new CasaEscada(nome,32);
			}else if(tipo==27) {
				casa = new CasaEscada(nome,55);
			}else if(tipo==39) {
				casa = new CasaEscada(nome,43);
			}else if(tipo==41) {
				casa = new CasaEscada(nome,85);
			}else if(tipo==69) {
				casa = new CasaEscada(nome,87);
			}else if(tipo==89) {
				casa = new CasaEscada(nome,91);
			}
		}//casas cobras
		else if(tipo==15 || tipo==42 || tipo==49 || tipo==57 || tipo==75 || tipo==88 || tipo==97) {
			if(tipo==15) {
				casa = new CasaCobra(nome,9);
			}else if(tipo==42) {
				casa = new CasaCobra(nome,17);
			}else if(tipo==49) {
				casa = new CasaCobra(nome,12);
			}else if(tipo==57) {
				casa = new CasaCobra(nome,46);
			}else if(tipo==75) {
				casa = new CasaCobra(nome, 47);
			}else if(tipo==88) {
				casa = new CasaCobra(nome,36);
			}else if(tipo==97) {
				casa = new CasaCobra(nome,65);
			}
		}//casas cartas
		else if(tipo==4 || tipo==21 || tipo==26 || tipo==52 || tipo==72 || tipo==80 || tipo==86){
				casa = new CasaCarta(nome);
			
		}
		else {
			casa = new Casa(nome);
		}
		return casa;
	}
	
	
}
