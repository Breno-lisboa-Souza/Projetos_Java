package br.com.vetorobjeto.teste;

import javax.swing.JOptionPane;

import br.com.vetorobjeto.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno();
		
		aluno.setNome("Breno");
		aluno.setIdade(19);
		aluno.setRm(222044);*/
		
		Aluno [] alunoVetor = new Aluno[3];
		
		/*
		alunoVetor[0] = new Aluno();
		alunoVetor[0].setNome("Breno");
		alunoVetor[0].setIdade(19);
		alunoVetor[0].setRm(222044);
		*/
		
		String nome = "";
		int idade = 0;
		int rm = 0;
		for (int i = 0; i < 3; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
			rm = Integer.parseInt(JOptionPane.showInputDialog("Digite o rm: "));
			
			
			alunoVetor[i] = new Aluno();
			alunoVetor[i].setNome(nome);
			alunoVetor[i].setIdade(idade);
			alunoVetor[i].setRm(rm);
		
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(alunoVetor[i].getNome()+ " " + alunoVetor[i].getIdade() + " " + alunoVetor[i].getRm() + "\n");
		}

	}

}
