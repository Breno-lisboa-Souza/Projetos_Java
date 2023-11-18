package br.com.montadora.model;

public class Carro extends Veiculo{
	
	private int QuantidadePortas;

	public int getQuantidadePortas() {
		return QuantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}
	
	public String AtributosCarro() {
		return "\nModelo do carro: " + getModelo() +
				"\nPeso do carro: " + getPeso() + 
				"\nPortas no carro: " + getQuantidadePortas() ;
	}

}
