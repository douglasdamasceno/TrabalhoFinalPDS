package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCarta extends AbstractCasa implements CasaEspecial{

	public CasaCarta(float posicaoX, float posicaoY, int nome) {
		super(posicaoX, posicaoY, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executarAcao(Peca peca) {
		//posicoes estao erradas
		peca.setPosicaoX(this.getPosicaoX());
		peca.setPosicaoY(this.getPosicaoY());
		peca.setCasaAtual(this.getNome());
		
	}

}
