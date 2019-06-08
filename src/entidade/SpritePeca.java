package entidade;

import JGamePlay.Sprite;

public class SpritePeca {
	private Sprite peca;
	private float velocidade;
	private int casaAtual;
	
	public SpritePeca(String nome) {
		this.peca = new Sprite(nome);
		this.peca.setPosition(45, 610);
		this.peca.setDimension(60, 60);
		this.velocidade = 4f;
		this.casaAtual = 1;
		this.peca.setVelocityX(velocidade);
		draw();
	}
	
	public void draw() {
		this.peca.draw();
	}
	
	
	public int getCasaAtual() {
		return this.casaAtual;
	}
	
	public void setCasaAtual(int novaPosicao) {
		this.casaAtual = novaPosicao;
	}

	
	public float getPosicaoX() {
		return (float) peca.getPosition().x;
	}
	public float getPosicaoY() {
		return (float) peca.getPosition().y;
	}

	public Sprite getPeca() {
		return peca;
	}
	//jogador chamar
	public void setPosicao(float posicaoX,float posicaoY) {
		peca.setPosition(posicaoX, posicaoY);
	}

	

}
