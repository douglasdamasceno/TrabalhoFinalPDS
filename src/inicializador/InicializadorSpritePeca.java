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
        	SpritePeca peca = new SpritePeca("recursos/sprite/peca"+(i+1)+".png");
            listaDeSpritePecas.add(peca);
        }
    }
    
    public ArrayList<SpritePeca> getPecas(){
        return listaDeSpritePecas;
    }
    
}
