package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class CasaEscada extends AbstractCasa implements CasaEspecial{

	private int casaFinal;
	
	public CasaEscada(int nome,int casaFinal) {
		super(nome);
		this.casaFinal = casaFinal;
	}
	
	@Override
	public void executarAcao(Peca peca) {
		subir(peca);
	}
	
	public void subir(Peca peca) {
		peca.setCasaAtual(casaFinal);
	}
	
}
