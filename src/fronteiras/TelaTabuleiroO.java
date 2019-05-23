package fronteiras;

import java.awt.Color;
import java.awt.Font;

import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Window;

public class TelaTabuleiroO {
	private static TelaTabuleiroO telaTabuleiro;
	private Window janela;        
    private Keyboard keyBoard;                             
    private GameImage backGround;        
    private Color cor;
	private Color cor2;
	private Font fonte;
	private Font fonte2;
	private Font fonte3;
	
	private TelaTabuleiroO () {
		cor = new Color(255,0, 0);
		cor2 = new Color(0,255, 0);
		fonte = new Font("serif", Font.BOLD, 24);
		fonte2 = new Font("Arial", Font.BOLD, 14);
		fonte3 = new Font("Monospaced", Font.BOLD, 14);
		janela = new Window(1190,1000);
		keyBoard = janela.getKeyboard();
		backGround = new GameImage("recursos/serpentes2.png");
		
		
		
	}
	
	
	public static TelaTabuleiroO getInstance() {
		if(telaTabuleiro==null)
			return telaTabuleiro = new TelaTabuleiroO();
		return telaTabuleiro;
	}
	
	
	public void drawJanela(){
        backGround.draw();
    }
    
    public void displayJanela(){
       janela.display();
    }


	

	

	public Window getJanela() {
		return janela;
	}


	
	public Keyboard getKeyBoard() {
		return keyBoard;
	}


	

	public GameImage getBackGround() {
		return backGround;
	}


	

	public Color getCor() {
		return cor;
	}


	

	public Color getCor2() {
		return cor2;
	}


	

	public Font getFonte() {
		return fonte;
	}

	public Font getFonte2() {
		return fonte2;
	}

	public Font getFonte3() {
		return fonte3;
	}
    
}
