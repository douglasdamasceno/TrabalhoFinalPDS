package entidade;


import interfaces.CasaEspecial;

public class Jogador {
	private String nome;
	private Peca minhaPeca;
	private int idJogador;
	private Dado dado;
	
	public Jogador(String nome,int idJogador) {
		dado = new Dado(12);
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
	
	public void avancarPeca(CasaEspecial novaCasa) {		
		novaCasa.executarAcao(minhaPeca);		
	}
	
	public int lancarDados() {
		return this.dado.lancarDado();
	}
	
	
	public int getIdJogador() {
		return idJogador;
	}

	public Peca getMinhaPeca() {
		return minhaPeca;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", minhaPeca=" + minhaPeca + ", idJogador=" + idJogador + "]";
	}
	

}
