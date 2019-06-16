package entidade.casas;

public abstract class AbstractCasa {
	
	private int casaDestino;
	private int nome;
	
	public AbstractCasa(int nome) {
		this.nome = nome;
	}
	
	public int getNome() {
		return nome;
	}
	
	public int getCasaDestino() {
		return casaDestino;
	}
	
	public void setCasaDestino(int casaDestino) {
		this.casaDestino = casaDestino;
	}
	
	
	
	
	
}
