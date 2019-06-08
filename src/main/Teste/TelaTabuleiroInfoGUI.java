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
	private Color cor;
	private Color cor2;
			//fontes
	private	Font fonte;
	private	Font fonte2;
	private	Font fonte3;
			
			
	private Sprite dado;
	
	
	private Jogador jogadorInfo;
	private CasaEspecial casaAtual;
	private int valorDoDado; 
	
	
	private ArrayList<SpritePeca> listasSpritePeca;
	private InicializadorSpritePeca inicializacaoSpritePeca; 
	private InicializadorJanela inicializadorPosicoes = InicializadorJanela.getInstance();
	
	
	private ArrayList<Float> casaPosicaoJanelaX;
	private ArrayList<Float> casaPosicaoJanelaY;
	
	
	//mesmo Tela tabuleiro 
	private TelaTabuleiroInfoGUI() {
		
		janela = new Window(1190,1000);
		
		backGround = new GameImage("recursos/fundo.jpg");
		
		keyBoard = janela.getKeyboard();
		
		fonte = new Font("serif", Font.BOLD, 24);
		fonte2 = new Font("Arial", Font.BOLD, 14);
		fonte3 = new Font("Monospaced", Font.BOLD, 14);
		
		cor = new Color(255,0, 0);
		cor2 = new Color(0,255, 0);
		
		dado = new Sprite("recursos/dadobotao.jpg");
		dado.setPosition(1050, 120);
		dado.setDimension(100, 100);
		
		listasSpritePeca = new ArrayList<SpritePeca>();
		inicializacaoSpritePeca = new InicializadorSpritePeca();
		
		
		casaPosicaoJanelaX = inicializadorPosicoes.getListaPosicaoX();
		casaPosicaoJanelaY = inicializadorPosicoes.getListaPosicaoY();
		
		
		inicializarPecasJogadores(2);
		
		
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
		//janela.drawText("Posicao Inicial: : "+posica,1050, 120, cor2,fonte2);
		janela.drawText("A VEZ É DO P1",1050, 30, cor,fonte3);
		janela.drawText(jogadorInfo.getNome(),1050, 60, cor,fonte2);
		//janela.drawText("Valor do Dados: "+no,1050, 90, cor2,fonte2);
		//janela.drawText("Posicao Atual: : "+posica,1050, 120, cor2,fonte2);
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
		 return true;
	}
	 
	 
	 
	 
	public void exibirTabuleiro(){
		backGround.draw();
	}

}
