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
		System.out.println("#Jogador Posicao Inicial "+ minhaPeca.getCasaAtual());
		
		//minhaPeca.setCasaAtual(novaCasa.getNome());
		System.out.println("#Jogador Antes de Move: X"+ minhaPeca.getPosicaoX()+" Y: " +minhaPeca.getPosicaoY());
		
		novaCasa.executarAcao(minhaPeca);
		
		System.out.println("#Jogador Nova posicao " + minhaPeca.getCasaAtual());
		
		System.out.println("#Jogador Tipo de Casa : "+ novaCasa.getClass().getSimpleName());		
			
		
		
		
//		if(novaCasa instanceof CasaEscada) {
//			CasaEscada casaEscada  = (CasaEscada.class).cast(novaCasa);
//			casaEscada.executarAcao(minhaPeca);
//			
//			
//		}else if(novaCasa instanceof CasaCobra) {
//			CasaCobra casaCobra  = (CasaCobra.class).cast(novaCasa);
//			casaCobra.executarAcao(minhaPeca);
//		}else {
//			minhaPeca.setPosicaoX(novaCasa.getPosicaoX());
//			minhaPeca.setPosicaoY(novaCasa.getPosicaoY());
//		}
		
		
			
		System.out.println("#Jogador Depois de Move : X"+ minhaPeca.getPosicaoX()+" Y: " +minhaPeca.getPosicaoY());
			
		
			
	}
	
	
	
	public Peca getMinhaPeca() {
		return minhaPeca;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", minhaPeca=" + minhaPeca + ", idJogador=" + idJogador + "]";
	}
	

}
