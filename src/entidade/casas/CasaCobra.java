package entidade.casas;

import interfaces.CasaEspecial;

public class CasaCobra extends AbstractCasa implements CasaEspecial{
	private float posicaoFinalX;
	private float posicaoFinalY;
	
	public CasaCobra(float posicaoX, float posicaoY, int nome,float posicaoFinalX,float posicaoFinalY) {
		super(posicaoX, posicaoY, nome);
		this.posicaoFinalX = posicaoFinalX;
		this.posicaoFinalY = posicaoFinalY;
	
	}

	@Override
	public void executarAcao(float posicaoX, float posicaoY) {
		posicaoX = posicaoFinalX;
		posicaoY = posicaoFinalY;
	}

	
	
}
