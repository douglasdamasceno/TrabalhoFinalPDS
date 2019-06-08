package main.Teste;


import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Sprite;
import JGamePlay.Window;
import entidade.Jogador;
import entidade.SpritePeca;
import fronteiras.TelaFimJogoConsole;
import inicializador.InicializadorJanela;
import inicializador.InicializadorSpritePeca;
import interfaces.CasaEspecial;


public class TelaTabuleiroInfoGUI {
	
	private static TelaTabuleiroInfoGUI tabuleiroInfo;
	private Window janela;
	
	//terá array de spritePeca
	//terá as posicao X e Y arrays
	private GameImage backGround;
	
	private Keyboard keyBoard ;
	
	//vermelha
	private Color red;
	private Color preto;
			//fontes
	private	Font serif;
	private	Font arial;
	private	Font monospaced;
			
			
	private Sprite dado;
	
	
	private Jogador jogadorInfo;
	private CasaEspecial casaAtual;
	private int valorDoDado; 
	
	
	private ArrayList<SpritePeca> listasSpritePeca;
	private InicializadorSpritePeca inicializacaoSpritePeca; 
	private InicializadorJanela inicializadorPosicoes = InicializadorJanela.getInstance();
	
	
	private ArrayList<Float> casaPosicaoJanelaX;
	private ArrayList<Float> casaPosicaoJanelaY;
	
	
	private TelaTabuleiroInfoGUI() {
		janela = new Window(1190,1000);
		backGround = new GameImage("recursos/fundo.jpg");
		keyBoard = janela.getKeyboard();
		
		serif = new Font("serif", Font.BOLD, 24);
		arial = new Font("Arial", Font.BOLD, 14);
		monospaced = new Font("Monospaced", Font.BOLD, 14);
		red = new Color(255,0, 0);
		preto = new Color(0,0, 0);
		
		dado = new Sprite("recursos/dadobotao.jpg");
		dado.setPosition(1050, 120);
		dado.setDimension(100, 100);
		
		listasSpritePeca = new ArrayList<SpritePeca>();
		inicializacaoSpritePeca = new InicializadorSpritePeca();
		
		casaPosicaoJanelaX = inicializadorPosicoes.getListaPosicaoX();
		casaPosicaoJanelaY = inicializadorPosicoes.getListaPosicaoY();
	}
	
	
	public void inicializarPecasJogadores(int qtdJogador) {
		int i =0;
		while(i<qtdJogador) {
			listasSpritePeca.add(inicializacaoSpritePeca.getPecas().get(i));
			i++;
		}
	}
	
	public void exibirPecasJogadores() {
		for (SpritePeca spritePeca : listasSpritePeca) {
			spritePeca.draw();
		}
	}
	public static TelaTabuleiroInfoGUI getInstace(){
        if(tabuleiroInfo == null) tabuleiroInfo = new TelaTabuleiroInfoGUI();
        return tabuleiroInfo;
	}
		
	
	public void inforJogador() {
		janela.drawText("Posicao Inicial: "+jogadorInfo.getMinhaPeca().getCasaAtual(),1045, 120, preto,arial);
		janela.drawText(valorDoDado+"",1045, 100, preto,arial);
		janela.drawText("Valor do Dados: ",1045, 90, preto,arial);
		janela.drawText("id "+jogadorInfo.getIdJogador() +jogadorInfo.getNome(),1045, 60, red,arial);
		janela.drawText("Jogador da Vez",1045, 30, preto,arial);
		
		janela.drawText("Posicao Atual : "+ jogadorInfo.getMinhaPeca().getCasaAtual(),1045, 140, preto,arial);
		//janela.drawText("Tipo : "+ casaAtual.getNome(),1050, 120, preto,arial);
	}
	
	public void posicaoSpritePeca() {
		for (SpritePeca  sprite: listasSpritePeca) {
			if(sprite.getId()== this.jogadorInfo.getIdJogador()) {
				int posicao = jogadorInfo.getMinhaPeca().getCasaAtual()-1;
				
				float posicaoX = casaPosicaoJanelaX.get(posicao);
				float posicaoY =  casaPosicaoJanelaY.get(posicao);
				
				sprite.setPosicao(posicaoX, posicaoY);
			}
		}
	}
	
	
///usando controlador
	public void setJogadorInfo(Jogador jogadorInfo) {
		this.jogadorInfo = jogadorInfo;
	}

	public void setCasaAtual(CasaEspecial casaAtual) {
		this.casaAtual = casaAtual;
	}

	public void setValorDoDado(int valorDoDado) {
		this.valorDoDado = valorDoDado;
	}


	///--------------
	public void atualizarTabuleiro() {
		janela.display();
	}
	
	
	 public boolean rolarDadoJogador() {
		 while(!keyBoard.keyDown(Keyboard.SPACE_KEY)) {
			 System.out.println("Aperte o Space");
		 }
		 System.out.println("saiu  ");
		 return true;
	}
	 
	 
	 
	 
	public void exibirTabuleiro(){
		backGround.draw();
	}

}
