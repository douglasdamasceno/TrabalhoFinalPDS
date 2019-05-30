package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCobra extends AbstractCasa implements CasaEspecial{
	private float posicaoFinalX;
	private float posicaoFinalY;
	private int casaFinal;
	public CasaCobra(float posicaoX, float posicaoY, int nome,float posicaoFinalX,float posicaoFinalY,int casaFinal) {
		super(posicaoX, posicaoY, nome);
		this.posicaoFinalX = posicaoFinalX;
		this.posicaoFinalY = posicaoFinalY;
		this.casaFinal = casaFinal;
	
	}

	@Override
	public void executarAcao(Peca peca) {
		peca.setPosicaoX(posicaoFinalX);
		peca.setPosicaoY(posicaoFinalY);
		peca.setCasaAtual(casaFinal);
	}

	
	
}
