package entidade.casas;

public abstract class AbstractCasa {
	private float posicaoX;
	private float posicaoY;
	private String nome;
	
	public AbstractCasa(float posicaoX, float posicaoY, String nome) {
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
	
	public String getNome() {
		return nome;
	}
	
	
	
}
