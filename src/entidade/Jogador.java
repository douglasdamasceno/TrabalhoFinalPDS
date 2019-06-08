package entidade;


import interfaces.CasaEspecial;

public class Jogador {
	private String nome;
	private Peca minhaPeca;
	private int idJogador;
	
	
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

	
	public void avancarPeca(CasaEspecial novaCasa) {		
		
		novaCasa.executarAcao(minhaPeca);		
	}
	
	
	public Peca getMinhaPeca() {
		return minhaPeca;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", minhaPeca=" + minhaPeca + ", idJogador=" + idJogador + "]";
	}
	

}
