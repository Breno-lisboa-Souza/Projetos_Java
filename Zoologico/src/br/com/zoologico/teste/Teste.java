package br.com.zoologico.teste;

import br.com.zoologico.model.Mamifero;
import br.com.zoologico.model.Reptil;

public class Teste {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome("Dogus");
		mamifero.setPeso(12.5);
		mamifero.setTempoGestacao(9);
		
		System.out.println("Nome do Mamifero: " + mamifero.getNome());
		System.out.println("Peso do Mamifero: " + mamifero.getPeso());
		System.out.println("Tempo de gestacao: " + mamifero.getTempoGestacao());
		
		
		//instanciando Reptil
		
		Reptil reptil = new Reptil();
		
		reptil.setNome("Silik");
		reptil.setPeso(7);
		reptil.setCorPrincipalPele("Azul");
		
		System.out.println("\nNome do Reptil: " + reptil.getNome());
		System.out.println("Peso do Reptil: " + reptil.getPeso());
		System.out.println("Cor principal da pele: " + reptil.getCorPrincipalPele());

	}

}
