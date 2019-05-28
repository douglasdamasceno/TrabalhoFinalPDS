package main.Teste;


import javax.swing.JOptionPane;

public class TelaMensagem {
	private static TelaMensagem controleMensagem;
	
	public static TelaMensagem getInstance() {
		if(controleMensagem == null) controleMensagem = new TelaMensagem();
		return controleMensagem;
	}
	//pegar ipunt
	public String showInputDialog(String texto) {
		String entrada = JOptionPane.showInputDialog(texto);
		return entrada;
	}
	//alerta
	public void showMessageDialog(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	
	
}
