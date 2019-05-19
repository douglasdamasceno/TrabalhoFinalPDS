package interfaces;

import entidades.casas.AbstractCasa;

public interface AbstractFabrica {
	public AbstractCasa criarCasa(String tipo);
}
