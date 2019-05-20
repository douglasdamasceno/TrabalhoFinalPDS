package entidade.sons;

import JGamePlay.Sound;

public class EfeitosSonoros {
	private Sound avancarCasa;
	private Sound retrocederCasa;
	
	public EfeitosSonoros() {
		avancarCasa = new Sound("recursos/audio/avancarCasa.wav");
		retrocederCasa= new Sound("recursos/audio/retrocederCasas.wav");
	}
	
	public void trocarAvancarCasa() {
		this.avancarCasa.play();
	}
	public void trocarRetrocederCasa() {
		this.retrocederCasa.play();
	}
	
}
