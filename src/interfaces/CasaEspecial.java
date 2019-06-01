package interfaces;

import entidade.Peca;

public interface CasaEspecial {
	public void executarAcao(Peca peca);
	
	public int getNome();
	public float getPosicaoY();
	public float getPosicaoX();
	
}
