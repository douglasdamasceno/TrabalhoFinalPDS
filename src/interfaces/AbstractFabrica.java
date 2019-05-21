package interfaces;

import entidade.casas.AbstractCasa;

public interface AbstractFabrica {
	public AbstractCasa criarCasa(int tipo,float posicaoX, float posicaoY, String nome);
}
