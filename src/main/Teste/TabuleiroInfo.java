package main.Teste;


import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Window;
import entidade.Jogador;
import fronteiras.TelaFimJogo;
import interfaces.CasaEspecial;


public class TabuleiroInfo {
	private static TabuleiroInfo tabuleiroInfo;
	
	
	
	private TabuleiroInfo() {
		}
	
	 public static TabuleiroInfo getInstace(){
	        if(tabuleiroInfo == null) tabuleiroInfo = new TabuleiroInfo();
	        return tabuleiroInfo;
	}
	 
	 
	 public boolean rolarDadoJogador() {
		return false;
				}
	 
	 
	 
	 
	public void exibirTabuleiro(){
			}

	}
