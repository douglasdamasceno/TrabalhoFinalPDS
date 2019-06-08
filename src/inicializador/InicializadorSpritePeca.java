package inicializador;

import java.util.ArrayList;
import entidade.SpritePeca;

public class InicializadorSpritePeca {
	private ArrayList<SpritePeca> listaDeSpritePecas;
	
    public InicializadorSpritePeca(){
        listaDeSpritePecas = new ArrayList<SpritePeca>();
        criarPecas();
    }
    
    private void criarPecas(){
        for(int i=0; i<4; i++){
        	SpritePeca peca = new SpritePeca((i+1));
            listaDeSpritePecas.add(peca);
        }
    }
    
    public ArrayList<SpritePeca> getPecas(){
        return listaDeSpritePecas;
    }
    
}
