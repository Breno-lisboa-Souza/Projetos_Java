 package br.com.montadora3.teste;

import javax.swing.JOptionPane;

import br.com.montadora3.model.Carro;

public class Teste {

	public static void main(String[] args) {

		Carro [] carroVetor = new Carro[3];
		
		String modelo = "";
		int peso = 0;
		int quantidadePortas = 0;
		
		for (int i = 0; i < 3; i++) {
			modelo = JOptionPane.showInputDialog("Digite o modelo: ");
			peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso: "));
			quantidadePortas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas: "));
			
			
			carroVetor[i] = new Carro();
			carroVetor[i].setModelo(modelo);
			carroVetor[i].setPeso(peso);
			carroVetor[i].setQuantidadePortas(quantidadePortas);
		
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(carroVetor[i].getModelo()+ " " + carroVetor[i].getPeso() + " " + carroVetor[i].getQuantidadePortas() + "\n");
		}

	}

}
