package entidade;

import entidade.casas.AbstractCasa;

public class Jogador {
	private String nome;
	private Peca minhaPeca;
	private int idJogador;
	private Dado dados;
	private Tabuleiro meuTabuleiro = Tabuleiro.getInstance();
	//tem que ter um tabuleiro para pegar a casa
	
	
	public Jogador(String nome,int idJogador) {
		this.nome = nome;
		this.idJogador = idJogador;
		this.minhaPeca = new Peca(idJogador);
		this.dados = new Dado(12);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void colocarPecaNoTabuleiro() {
		this.minhaPeca.draw();
	}
	
	public int lancarDados() {
		return this.dados.lancarDado();
	}
	
	public int avancarPeca() {
		int numero = this.lancarDados();
		int novaPosicao = minhaPeca.getCasaAtual() + numero;
		System.out.println("---------------------------------------------------");
		System.out.println("Posicao Inicial "+ minhaPeca.getCasaAtual());
		minhaPeca.setCasaAtual(novaPosicao);
		System.out.println("Numero aleatorio "+ numero);
		System.out.println("Nova posicao " + novaPosicao);
		System.out.println("Nova Posicao Atual: "+ minhaPeca.getCasaAtual());
		AbstractCasa casaBuscada;
		if(novaPosicao>=100) {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(99);
			this.minhaPeca.moveHouse(casaBuscada);
			return numero;
		}else {
			casaBuscada = meuTabuleiro.getListaDeCasas().get(novaPosicao-1);
			this.minhaPeca.moveHouse(casaBuscada);
			return numero;
		}
	}
	
	public void moverPecaBonus(float posicaoX,float posicaoY) {
		minhaPeca.setPosicao(posicaoX, posicaoY);
	}
	
	public Peca getMinhaPeca() {
		return minhaPeca;
	}
	

}
