package entidade;
import JGamePlay.Sprite;

public class Peca{
	
	private Sprite peca;
	private float ajustePosicao;
	float velocidade;
	
	public Peca(String nomeDaImagem) {
		this.peca = new Sprite("recursos/sprite/"+nomeDaImagem+".png");
		this.peca.setPosition(40, 610);
		this.peca.setDimension(50, 50);
		this.ajustePosicao =0;
		this.velocidade = 4f;
		this.peca.setVelocityX(velocidade);
	}
	
	public void draw() {
		this.peca.draw();
	}
	
	public void moveHouse(int faceDado,Casa casa) {
		if(this.getPosicaoX() <= casa.getPosicaoX() || this.getPosicaoY() <= casa.getPosicaoY()) {
			peca.setPosition(casa.getPosicaoX(),casa.getPosicaoY());
		}
	}
	
	public void subirUmaLinha() {
			ajustePosicao -= 1.8f;
			//sube para linha de cia do tabuleiro
			this.peca.setPosition(peca.getPosition().x, peca.getPosition().y - (75 + this.ajustePosicao));
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

	public void setPeca(Sprite peca) {
		this.peca = peca;
	}

	
	
	
	
	
	
}
