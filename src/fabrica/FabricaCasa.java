package fabrica;

import entidade.Casa;
import entidades.casas.AbstractCasa;
import interfaces.AbstractFabrica;

public class FabricaCasa implements AbstractFabrica{

	@Override
	public AbstractCasa criarCasa(String tipo) {
		AbstractCasa casa = null;
		casa = new Casa(1, 1, "");
		return casa;
	}

	

}
