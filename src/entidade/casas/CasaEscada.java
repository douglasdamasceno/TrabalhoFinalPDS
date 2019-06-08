package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaEscada extends AbstractCasa implements CasaEspecial{

	private float posicaoFinalX;
	private float posicaoFinalY;
	private int casaFinal;
	
	public CasaEscada(int nome,int casaFinal) {
		super(nome);
		this.casaFinal = casaFinal;
	}

	public float getPosicaoFinalX() {
		return posicaoFinalX;
	}

	public float getPosicaoFinalY() {
		return posicaoFinalY;
	}
	
	@Override
	public void executarAcao(Peca peca) {
		peca.setCasaAtual(casaFinal);
	}
}
