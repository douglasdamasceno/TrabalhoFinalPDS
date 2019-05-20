package entidades.casas;

import JGamePlay.Sprite;

public abstract class AbstractCasa {
	private Sprite casaSprite;
	private float posicaoX;
	private float posicaoY;
	private String nome;
	
	public AbstractCasa(float posicaoX, float posicaoY, String nome) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.nome = nome;
		this.casaSprite = new Sprite("");
		this.casaSprite.setPosition(posicaoX,posicaoY);
		
	}
	public float getPosicaoX() {
		return posicaoX;
	}
	
	public float getPosicaoY() {
		return posicaoY;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	
}
