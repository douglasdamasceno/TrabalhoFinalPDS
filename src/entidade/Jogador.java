package entidade;

import entidade.casas.AbstractCasa;
import entidade.casas.CasaCobra;
import entidade.casas.CasaEscada;

public class Jogador {
	private String nome;
	private Peca minhaPeca;
	private int idJogador;
	private SpritePeca spritePeca;
	
	
	///criar um classe estaticas para salvar as info da rodade talvez no jogo que vai
	//pegar do jogador da vez
	
	public Jogador(String nome,int idJogador) {
		this.nome = nome;
		this.idJogador = idJogador;
		this.minhaPeca = new Peca(idJogador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void colocarPecaNoTabuleiro() {
		this.spritePeca.draw();
	}
	
	
	
	public void avancarPeca(AbstractCasa novaCasa) {
		System.out.println("Posicao Inicial "+ minhaPeca.getCasaAtual());
		
		minhaPeca.setCasaAtual(novaCasa.getNome());
		System.out.println("Nova posicao " + minhaPeca.getCasaAtual());
		
		System.out.println("Tipo de Casa : "+ novaCasa.getClass().getSimpleName());		
		System.out.println("Antes de Move: X"+ minhaPeca.getPosicaoX()+" Y: " +minhaPeca.getPosicaoY());
			
		
		
		if(novaCasa instanceof CasaEscada) {
			CasaEscada casaEscada  = (CasaEscada.class).cast(novaCasa);
			casaEscada.executarAcao(minhaPeca);
			
			
		}else if(novaCasa instanceof CasaCobra) {
			CasaCobra casaCobra  = (CasaCobra.class).cast(novaCasa);
			casaCobra.executarAcao(minhaPeca);
		}else {
			minhaPeca.setPosicaoX(novaCasa.getPosicaoX());
			minhaPeca.setPosicaoY(novaCasa.getPosicaoY());
		}
		
		
		//this.minhaPeca.moveHouse(novaCasa);
			
		System.out.println("Depois de Move : X"+ minhaPeca.getPosicaoX()+" Y: " +minhaPeca.getPosicaoY());
			
		System.out.println("---------------------------------------------------");
			
	}
	
	
	
	public Peca getMinhaPeca() {
		return minhaPeca;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", minhaPeca=" + minhaPeca + ", idJogador=" + idJogador + ", spritePeca=" + spritePeca + " ]";
	}
	

}
