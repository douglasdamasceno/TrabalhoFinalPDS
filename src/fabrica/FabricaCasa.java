package fabrica;

import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import entidade.casas.CasaEscada;
import interfaces.AbstractFabrica;

public class FabricaCasa implements AbstractFabrica{

	@Override
	public AbstractCasa criarCasa(int tipo,float posicaoX, float posicaoY, String nome) {
		AbstractCasa casa = null;
		if(tipo==3 || tipo==6 || tipo==14 || tipo==27 || tipo==39 || tipo==41 || tipo==69 || tipo==89) {
			casa = new CasaEscada(posicaoX, posicaoY, nome, 1, 1);
		}else if(tipo==15) {
			
		}
		casa = new Casa(1, 1, "");
		return casa;
	}
	
	//Casas Tipo Escada 
	// numeros 3=39, 6=16 ,14=32 ,27=55,39=43,41=85,69=87,89=91
	//Casas Cobras
	// numeros 15=9 ,42=17, 49=12, 57=46, 75=47, 88=36,97=65, 

}
