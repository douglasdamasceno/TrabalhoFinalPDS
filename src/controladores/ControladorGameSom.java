package controladores;

import JGamePlay.Sound;
import entidade.sons.EfeitosSonoros;

public class ControladorGameSom {
	private EfeitosSonoros efeitosSonoros;
	private Sound som ;
	public ControladorGameSom() {
		efeitosSonoros = new EfeitosSonoros();
		som = new Sound("recursos/audio/click.wav");
	}
	
	
	public void trocarEfeitosSonoros() {
		
		efeitosSonoros.trocarAvancarCasa();
	}
	
}
