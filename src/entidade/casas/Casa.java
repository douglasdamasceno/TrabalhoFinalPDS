package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class Casa extends AbstractCasa implements CasaEspecial{
	
	public Casa(float posicaoX, float posicaoY,int nome) {
		super(posicaoX, posicaoY, nome);
		this.setCasaDestino(getNome());
	}

	@Override
	public void executarAcao(Peca peca) {
		peca.setPosicaoX(this.getPosicaoX());
		peca.setPosicaoY(this.getPosicaoY());
		peca.setCasaAtual(this.getNome());
	}

}
