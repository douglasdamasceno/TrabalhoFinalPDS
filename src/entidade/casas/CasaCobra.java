package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaCobra extends AbstractCasa implements CasaEspecial{
	private int casaDestino;
	public CasaCobra(int nome,int casaDestino) {
		super(nome);
		this.casaDestino = casaDestino;
	
	}
	
	@Override
	public void executarAcao(Peca peca) {
		descer(peca);	
	}

	public void descer(Peca peca) {
		peca.setCasaAtual(casaDestino);
	}
	
}
