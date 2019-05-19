package entidade;
import JGamePlay.Sprite;
import entidades.casas.AbstractCasa;

public class Peca{
	
	private Sprite peca;
	
	float velocidade;
	
	public Peca(String nomeDaImagem) {
		this.peca = new Sprite(nomeDaImagem);
		this.peca.setPosition(40, 610);
		this.peca.setDimension(50, 50);
		this.velocidade = 4f;
		this.peca.setVelocityX(velocidade);
	}
	
	public void draw() {
		this.peca.draw();
	}
	
	public void moveHouse(int faceDado,AbstractCasa  casa) {
		if(this.getPosicaoX() <= casa.getPosicaoX() || this.getPosicaoY() <= casa.getPosicaoY()) {
			peca.setPosition(casa.getPosicaoX(),casa.getPosicaoY());
		}
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

	
}
