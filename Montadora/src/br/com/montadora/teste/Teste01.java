package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;
import br.com.montadora.model.Moto;
import br.com.montadora.model.Veiculo;

public class Teste01 {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro"));
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro (em toneladas)")));
		carro.setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas do carro")));
		
		System.out.println("Atributos do carro: " + carro.AtributosCarro());
		
		Moto moto = new Moto();
		
		moto.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto"));
		moto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do moto (em quilogramas)")));
		moto.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de adesivos da moto")));
		
		System.out.println("\nAtributos da moto: " + moto.AtributosMoto());
	}

}
