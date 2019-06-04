package entidade.casas;

import java.util.ArrayList;

import entidade.Carta;
import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCarta extends AbstractCasa implements CasaEspecial{
	private Carta minhaCarta;
	private ArrayList<Float> listaDePosicaoX;
	private ArrayList<Float> listaDePosicaoY;
	
	public CasaCarta(float posicaoX, float posicaoY, int nome,float posicaoX1,float posicaoY1,float posicaoX2,float posicaoY2,float posicaoX3,float posicaoY3) {
		super(posicaoX, posicaoY, nome);
		listaDePosicaoX = new ArrayList<Float>();
		listaDePosicaoY = new ArrayList<Float>();	
		this.addCasa(posicaoX1, posicaoY1, posicaoX2, posicaoY2, posicaoX3, posicaoY3);
		
	}

	@Override
	public void executarAcao(Peca peca) {
		int posicao = minhaCarta.informarNumero();
		float posicaoX = listaDePosicaoX.get(posicao);
		float posicaoY = listaDePosicaoY.get(posicao);
		
		//posicoes estao erradas
		///chamo minha carta pego a posicao do arrayList;
		//depois passo a posicao
		
		peca.setPosicaoX(posicaoX);
		peca.setPosicaoY(posicaoY);
		peca.setCasaAtual(this.getNome()+posicao+1);
		
	}
	
	public void addCasa(float posicaoX1,float posicaoY1,float posicaoX2,float posicaoY2,float posicaoX3,float posicaoY3) {
		listaDePosicaoX.add(posicaoX1);
		listaDePosicaoX.add(posicaoX2);
		listaDePosicaoX.add(posicaoX3);
		
		listaDePosicaoX.add(posicaoY1);
		listaDePosicaoX.add(posicaoY2);
		listaDePosicaoX.add(posicaoY3);
	}
	
	

}
