package entidade.som;

import JGamePlay.Sound;

public class ThilhaSonora {
	private Sound thilhaSonora;
	
	public ThilhaSonora() {
		thilhaSonora = new Sound("recursos/audio/click.wav");
	}
	
	
	public void trocarThilharSonora() {
		this.thilhaSonora.play();
		this.thilhaSonora.setRepeat(true);
	}
	
	public void pausarThilharSonora() {
		this.thilhaSonora.pause();
	}
	public void pararThilharSonora() {
		this.thilhaSonora.stop();
	}
}
