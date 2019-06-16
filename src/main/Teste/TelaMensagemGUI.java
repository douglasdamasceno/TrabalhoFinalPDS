package main.Teste;


import javax.swing.JOptionPane;

public class TelaMensagemGUI {

	public TelaMensagemGUI() {}
	
	public String showInputDialog(String texto) {
		String entrada = JOptionPane.showInputDialog(texto);
		return entrada;
	}
	public void showMessageDialog(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	
	
}
