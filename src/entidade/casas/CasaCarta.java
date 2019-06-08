package entidade.casas;

import java.util.ArrayList;

import entidade.Carta;
import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCarta extends AbstractCasa implements CasaEspecial{
	private Carta minhaCarta;
	
	public CasaCarta(float posicaoX,float posicaoY,int nome) {
		super(posicaoX, posicaoY, nome);
		minhaCarta = new Carta();
		
	}

	@Override
	public void executarAcao(Peca peca) {
		int posicao = minhaCarta.informarNumero();
		
		//posicoes estao erradas
		///chamo minha carta pego a posicao do arrayList;
		//depois passo a posicao
		
		//peca.setPosicaoX(this.posicaoX);
		//peca.setPosicaoY(posicaoY);
		peca.setCasaAtual(this.getNome()+ posicao);
		
	}
	
	

}
