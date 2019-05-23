package entidade.casas;

public abstract class AbstractCasa {
	private float posicaoX;
	private float posicaoY;
	private int nome;
	
	public AbstractCasa(float posicaoX, float posicaoY, int nome) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.nome = nome;
	}
	public float getPosicaoX() {
		return posicaoX;
	}
	
	public float getPosicaoY() {
		return posicaoY;
	}
	
	public int getNome() {
		return nome;
	}
	
	
	
}
