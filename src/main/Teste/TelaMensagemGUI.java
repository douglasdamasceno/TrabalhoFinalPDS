package main.Teste;


import javax.swing.JOptionPane;

public class TelaMensagemGUI {
//	private TelaMensagemGUI controleMensagem;
	
//	public TelaMensagemGUI() {
//		if(controleMensagem == null) controleMensagem = new TelaMensagemGUI();
//		return controleMensagem;
//	}
	
	public TelaMensagemGUI() {
	
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
