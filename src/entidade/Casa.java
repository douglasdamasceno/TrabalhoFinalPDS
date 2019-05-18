package entidade;
import JGamePlay.Sprite;

public class Casa {
	
	Sprite casa;
	private float posicaoX;
	private float posicaoY;
	private String nome;
	public Casa(float posicaoX,float posicaoY,String nome) {
		
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.nome = nome;
		this.casa = new Sprite("");
		this.casa.setPosition(posicaoX,posicaoY);
		//this.casa.setDimension(80, 80);
		this.casa.draw();
	}

	public float getPosicaoX() {
		return (float) casa.getPosition().x;
	}

	
	public float getPosicaoY() {
		return (float) casa.getPosition().y;
	}

}
