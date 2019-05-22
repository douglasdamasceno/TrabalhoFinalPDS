package inicializador;

import java.util.ArrayList;

import entidade.casas.AbstractCasa;
import entidade.casas.Casa;
import fabrica.FabricaCasa;
import interfaces.AbstractFabrica;

public class InicializadorCasas {
	
	private static InicializadorCasas inicializadorCasas;
	private AbstractFabrica minhaFabrica;
	private ArrayList<AbstractCasa> listaDeCasa;
	
	public static InicializadorCasas getInstance() {
		if (inicializadorCasas == null)
            inicializadorCasas = new InicializadorCasas();
        return inicializadorCasas;	
	}
	
	private InicializadorCasas(){
		listaDeCasa = new ArrayList<>();	
		minhaFabrica = new FabricaCasa();
    }
	
	public ArrayList<AbstractCasa> iniciarCasas(){
		float posicaoX = 45;
		float proximaCasaX =  100;
		AbstractCasa casa;
		
		int countX =0;
		
		int i=1;
		
		while(i<=10) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX), 610, i+"");
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		i= 20;
		posicaoX =45;
		countX =0;
		while(i>=11) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),533.2f , i+"");
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		i=21;
		posicaoX =45;
		countX =0;
		while(i<=30) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),464.4f , i+"");
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		i= 40;
		posicaoX =45;
		countX =0;
		while(i>=31) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),395.6f , i+"");
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		
		i= 41;
		posicaoX =45;
		countX =0;
		while(i<=50) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),326.8f , i+"");
			listaDeCasa.add(casa);
			i++;
			countX++;
		}
		
		i= 51;
		posicaoX =45;
		countX =0;
		while(i>=60) {
			casa = minhaFabrica.criarCasa(i, posicaoX +(proximaCasaX * countX),0f , i+"");
			listaDeCasa.add(casa);
			i--;
			countX++;
		}
		
		
		for (AbstractCasa abstractCasa : listaDeCasa) {
			System.out.println(abstractCasa.getClass().getSimpleName()+" " +abstractCasa.getNome()+" posicao X= "+abstractCasa.getPosicaoX() +" Y:"+ abstractCasa.getPosicaoY());
		}
		return listaDeCasa;
	}
	
	public static void main(String[] args) {
		InicializadorCasas IC = InicializadorCasas.getInstance();
		IC.iniciarCasas();
	}
}
