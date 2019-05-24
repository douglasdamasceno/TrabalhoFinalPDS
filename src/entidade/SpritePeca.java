package entidade;

import JGamePlay.Sprite;
import entidade.casas.AbstractCasa;
import entidade.casas.CasaEscada;

public class SpritePeca {
	private Sprite peca;
	private float velocidade;
	private int casaAtual;
	
	public SpritePeca(int id) {
		this.peca = new Sprite("recursos/sprite/peca"+id+".png");
		this.peca.setPosition(45, 610);
		this.peca.setDimension(60, 60);
		this.velocidade = 4f;
		this.casaAtual = 1;
		this.peca.setVelocityX(velocidade);
		
	}
	
	public void draw() {
		this.peca.draw();
	}
	
	
	public void moveHouse(AbstractCasa  casa) {
		if(this.getPosicaoX() <= casa.getPosicaoX() || this.getPosicaoY() <= casa.getPosicaoY()) {
			if(casa instanceof CasaEscada) {
				CasaEscada casaE  = (CasaEscada.class).cast(casa);
				float novaPosicaoX =0,novaPosicaoY = 0;
				casaE.executarAcao(novaPosicaoX,novaPosicaoY);
				peca.setPosition(novaPosicaoX, novaPosicaoY);
			}else {
				peca.setPosition(casa.getPosicaoX(),casa.getPosicaoY());
				this.casaAtual = casa.getNome();
			}
		}
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
