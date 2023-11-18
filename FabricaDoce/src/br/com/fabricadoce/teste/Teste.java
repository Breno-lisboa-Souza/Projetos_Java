package br.com.fabricadoce.teste;

import javax.swing.JOptionPane;

import br.com.fabricadoce.model.Brigadeiro;

public class Teste {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce(JOptionPane.showInputDialog("Nome do brigadeiro"));
		brigadeiro.setPesoAcucar(Double.parseDouble(JOptionPane.showInputDialog("Peso do açucar")));
		brigadeiro.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Peso do chocolate")));
		
		//System.out.println("Informações do brigadeiro: " + brigadeiro.DadosBrigadeiro());
		
		System.out.println("Peso total do brigadeiro: " + brigadeiro.retornarPesoTotal());
	}

}
