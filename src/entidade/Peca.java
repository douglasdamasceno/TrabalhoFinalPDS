package entidade;
import JGamePlay.Sprite;
import entidade.casas.AbstractCasa;
import entidade.casas.CasaCobra;
import entidade.casas.CasaEscada;

public class Peca{
	
	private int casaAtual;
	private float posicaoX;
	private float posicaoY;
	public Peca(int id) {
		this.casaAtual = 1;
		this.posicaoX = 45;
		this.posicaoY = 610;
	}
	
	
	public void moveHouse(AbstractCasa  casa) {
		if(this.getPosicaoX() <= casa.getPosicaoX() || this.getPosicaoY() <= casa.getPosicaoY()) {
			if(casa instanceof CasaEscada) {
				CasaEscada casaE  = (CasaEscada.class).cast(casa);
				casaE.executarAcao(posicaoX,posicaoY);
			}else {
				posicaoX = casa.getPosicaoX();
				posicaoY = casa.getPosicaoY();
				this.casaAtual = casa.getNome();
			}
		}
	}
	

	public int getCasaAtual() {
		return this.casaAtual;
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
