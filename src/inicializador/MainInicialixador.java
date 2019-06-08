package inicializador;

public class MainInicialixador {

	public static void main(String[] args) {
		InicializadorJanela IJ = InicializadorJanela.getInstance();
		
		IJ.iniciarListasPosicao();
		
		int i =0;
		int j =1;
		while(i<100) {
		System.out.println("Posicao X "+ j +" : " + IJ.getListaPosicaoX().get(i)+" Posicao Y "+ j +" : " + IJ.getListaPosicaoY().get(i));
		
		j++;
		i++;
		}
	}

}
