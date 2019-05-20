package fronteiras;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Sound;
import JGamePlay.Sprite;
import JGamePlay.Window;
import entidade.Peca;

public class TelaJogo {
	public static void main(String[] args) {
		Window janela = new Window(1190,1000);
		
		Keyboard key = janela.getKeyboard();
		
		GameImage backGround = new GameImage("recursos/serpentes2.png");
		
		
		float proximoCasaX = 445;
		
		float proximaCasaY = 533.2f;
		//vermelha
		Color cor = new Color(255,0, 0);
		Color cor2 = new Color(0,255, 0);
		//fontes
		Font fonte = new Font("serif", Font.BOLD, 24);
		Font fonte2 = new Font("Arial", Font.BOLD, 14);
		Font fonte3 = new Font("Monospaced", Font.BOLD, 14);
		//Casa c2 = new Casa(proximoCasaX,proximaCasaY,"12");
		
		
		Sprite dado = new Sprite("recursos/dadobotao.jpg");
		
		dado.setPosition(1050, 120);
		dado.setDimension(100, 100);
		
		
		backGround.draw();
		dado.draw();
		
		boolean executando = true;
		while (executando) {
			
			backGround.draw();
			dado.draw();
			
			
			janela.drawText("A VEZ É DO P1",1050, 30, cor,fonte3);
			janela.drawText("Game",1050, 60, cor,fonte2);
			janela.drawText("CLICK NO DADO",1050, 90, cor2,fonte2);
			
				
			if(key.keyDown(Keyboard.ESCAPE_KEY)) {
				executando = false;
			}	
				
			janela.display();
			
		}
			
		janela.exit();
	}
}
