package entidade.casas;

import JGamePlay.Sprite;
import interfaces.CasaEspecial;

public class CasaEscada extends AbstractCasa implements CasaEspecial{

	private float posicaoFinalX;
	private float posicaoFinalY;
	
	public CasaEscada(float posicaoX, float posicaoY, int nome,float posicaoFinalX,float posicaoFinalY) {
		super(posicaoX, posicaoY, nome);
		this.posicaoFinalX = posicaoFinalX;
		this.posicaoFinalY = posicaoFinalY;
	}

	
	
	@Override
	public void executarAcao(Sprite peca) {}
	
	
	
	public float getPosicaoFinalX() {
		return posicaoFinalX;
	}

	

	public float getPosicaoFinalY() {
		return posicaoFinalY;
	}

}
