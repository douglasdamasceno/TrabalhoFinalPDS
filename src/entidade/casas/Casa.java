package entidade.casas;

import entidade.Peca;
import interfaces.CasaEspecial;

public class Casa extends AbstractCasa implements CasaEspecial{
	
	public Casa(int nome) {
		super(nome);
		this.setCasaDestino(getNome());
	}

	@Override
	public void executarAcao(Peca peca) {
		peca.setCasaAtual(this.getNome());
	}

}
