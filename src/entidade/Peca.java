package entidade;

public class Peca{
	
	private int casaAtualNumero;
	
	public Peca(int id) {
		this.casaAtualNumero = 1;
	}
	
	public int getCasaAtual() {
		return this.casaAtualNumero;
	}
	
	public void setCasaAtual(int casa) {
		this.casaAtualNumero = casa;
	}
}
