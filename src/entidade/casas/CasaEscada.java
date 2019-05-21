package entidade.casas;

import entidade.Jogador;
import interfaces.CasaEspecial;

public class CasaEscada extends AbstractCasa implements CasaEspecial{

	private float posicaoFinalX;
	private float posicaoFinalY;
	
	public CasaEscada(float posicaoX, float posicaoY, String nome,float posicaoFinalX,float posicaoFinalY) {
		super(posicaoX, posicaoY, nome);
		this.posicaoFinalX = posicaoFinalX;
		this.posicaoFinalY = posicaoFinalY;
	}

	
	
	@Override
	public void executarAcao(Jogador jogador) {}
	
	
	
	public float getPosicaoFinalX() {
		return posicaoFinalX;
	}

	

	public float getPosicaoFinalY() {
		return posicaoFinalY;
	}

}
