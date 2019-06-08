package entidade.casas;

import entidade.Carta;
import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCarta extends AbstractCasa implements CasaEspecial{
	private Carta minhaCarta;
	
	public CasaCarta(int nome) {
		super(nome);
		minhaCarta = new Carta();
	}

	@Override
	public void executarAcao(Peca peca) {
		int posicao = minhaCarta.informarNumero();	
		peca.setCasaAtual(this.getNome()+ posicao);
	}
	
}