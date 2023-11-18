package br.com.terceiroprojeto.teste;

public class Teste {

	public static void main(String[] args) {
		//Conversões de valores
		
		String teste = "18";
		String testeDois = "36";
		String testeResultado = teste + testeDois;
		
		System.out.println("Ao realizar a soma entre numeros como string ocorre a concatenação dos mesmos: " + testeResultado);
		
		String testeTres = "18";
		String testeQuatro = "36";
		int testeTresConvertido = Integer.parseInt(testeTres);
		int testeQuatroConvertido = Integer.parseInt(testeQuatro);
		int testeResultadoDois = testeTresConvertido + testeQuatroConvertido;
		
		System.out.println("Ao convertê-los em numeros inteiros a soma tras o resultado desejado: " + testeResultadoDois);
		
	}

}
