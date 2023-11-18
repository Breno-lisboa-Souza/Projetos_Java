package br.com.fabricaveiculos.teste;

import javax.swing.JOptionPane;

import br.com.fabricaveiculos.model.Carro;
import br.com.fabricaveiculos.model.Veiculo;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo((JOptionPane.showInputDialog("Modelo do carro: ")));
		carro.setPeso((Double.parseDouble(JOptionPane.showInputDialog("Peso do carro: "))));
		carro.setPesoEngate((Double.parseDouble(JOptionPane.showInputDialog("Peso do engate: "))));
		carro.setQuantidadePortas((Integer.parseInt(JOptionPane.showInputDialog("Portas do carro: "))));
		
		carro.mostrarAtributos();
		
		System.out.println("Peso total do veículo: " + carro.pesoTotal() );

	}

}
