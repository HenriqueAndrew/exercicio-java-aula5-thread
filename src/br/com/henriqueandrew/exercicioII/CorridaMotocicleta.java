package br.com.henriqueandrew.exercicioII;

// @author Henrique Andrew da Silva

import java.util.ArrayList;


public class CorridaMotocicleta {
    
    private static int qtdCorridas = 10;
	private static ArrayList<Object> resultados = new ArrayList<Object>();
	
	
	public CorridaMotocicleta() {}
	
	public static void main(String[] args) {

		Corrida inicio = new Corrida();
		System.out.println(Corrida.getClassificacao());
		resultados.add(Corrida.getClassificacao());
		System.out.println(resultados);
		
			
	}
    
    

}
