package fabrica;

import entidade.casas.Casa;
import entidade.casas.CasaCarta;
import entidade.casas.CasaCobra;
import entidade.casas.CasaEscada;
import interfaces.AbstractFabrica;
import interfaces.CasaEspecial;

public class FabricaCasa implements AbstractFabrica{

	@Override
	public CasaEspecial criarCasa(int tipo) {
		CasaEspecial casa = null;
		if(tipo==3 || tipo==6 || tipo==14 || tipo==27 || tipo==39 || tipo==41 || tipo==69 || tipo==89) {
			if(tipo==3) {
				casa = new CasaEscada(tipo,37);
			}else if(tipo==6) {
				casa = new CasaEscada(tipo,16);
			}else if(tipo==14) {
				casa = new CasaEscada(tipo,32);
			}else if(tipo==27) {
				casa = new CasaEscada(tipo,55);
			}else if(tipo==39) {
				casa = new CasaEscada(tipo,43);
			}else if(tipo==41) {
				casa = new CasaEscada(tipo,85);
			}else if(tipo==69) {
				casa = new CasaEscada(tipo,87);
			}else if(tipo==89) {
				casa = new CasaEscada(tipo,91);
			}
		}else if(tipo==15 || tipo==42 || tipo==49 || tipo==57 || tipo==75 || tipo==88 || tipo==97) {
			if(tipo==15) {
				casa = new CasaCobra(tipo,9);
			}else if(tipo==42) {
				casa = new CasaCobra(tipo,17);
			}else if(tipo==49) {
				casa = new CasaCobra(tipo,12);
			}else if(tipo==57) {
				casa = new CasaCobra(tipo,46);
			}else if(tipo==75) {
				casa = new CasaCobra(tipo, 47);
			}else if(tipo==88) {
				casa = new CasaCobra(tipo,36);
			}else if(tipo==97) {
				casa = new CasaCobra(tipo,65);
			}
		}else if(tipo==4 || tipo==21 || tipo==26 || tipo==52 || tipo==72 || tipo==80 || tipo==86){
				casa = new CasaCarta(tipo);
		}else {
			casa = new Casa(tipo);
		}
		return casa;
	}
}
