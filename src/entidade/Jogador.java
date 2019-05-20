package entidade;

public class Jogador {
	private String nome;
	private Peca minhaPeca;
	private int idJogador;
	private String numeroDaCasaAtual;
	private Dado dados;
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
