package entidade;
import JGamePlay.Sprite;
import entidade.casas.AbstractCasa;

public class Peca{
	
	private Sprite peca;
	
	private float velocidade;
	private int casaAtual;
	
	//receber id do jogador / jogador que metodo colocarPecaNoTabuleiro chamar draw
	public Peca(int id) {
		this.peca = new Sprite("recursos/sprite/peca"+id+".png");
		this.peca.setPosition(40 + ((id-1)*10), 610);
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
			peca.setPosition(casa.getPosicaoX(),casa.getPosicaoY());
			this.casaAtual = Integer.parseInt(casa.getNome());
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

	
}
