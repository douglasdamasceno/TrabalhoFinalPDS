package entidade;

public class Peca{
	
	private int casaAtualNumero;
	private float posicaoX;
	private float posicaoY;
	
	public Peca(int id) {
		this.casaAtualNumero = 1;
		this.posicaoX = 45;
		this.posicaoY = 610;
	}
	
	public int getCasaAtual() {
		return this.casaAtualNumero;
	}
	
	public void setCasaAtual(int casa) {
		this.casaAtualNumero = casa;
	}
	
	public float getPosicaoX() {
		return posicaoX;
	}
	
	public void setPosicaoX(float posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public float getPosicaoY() {
		return posicaoY;
	}
	
	public void setPosicaoY(float posicaoY) {
		this.posicaoY = posicaoY;
	}
	
}
