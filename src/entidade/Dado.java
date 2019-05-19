package entidade;

import java.util.Random;
//ok
public class Dado {
	private int valorFace;
	private int qtdFaces;
	
	public Dado(int qtdFaces) {
		this.qtdFaces= qtdFaces;
	}
	public int getValorFace() {
		return valorFace;
	}
	public void setValorFace(int valorFace) {
		this.valorFace = valorFace;
	}
	
	public void lancarDado() {
		 Random random = new Random();
	        this.valorFace = random.nextInt(qtdFaces)+1;
	}
	
}
