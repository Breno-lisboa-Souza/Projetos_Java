package br.com.projetoteste.teste;

public class Teste {

	public static void main(String[] args) {
		
		int idade = 18;
		String nome = "Breno";
		double salarioDouble = 1235.23;
		float salarioFloat = 1325.78f;
		
		System.out.println(idade);
		System.out.println(nome);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println("Meu nome é " + nome);
		System.out.println("Meu nome é " + nome + " e a minha idade é " + idade);
		System.out.println("Meu nome é " + nome + ", a minha idade é " + idade + " anos e ganho R$" + salarioDouble + " de salário");
		System.out.println("Meu nome é " + nome + " \na minha idade é " + idade + " anos  \nganho R$" + salarioDouble + " de salário");

	}

}
