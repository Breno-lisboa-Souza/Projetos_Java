package br.com.fabricaveiculos.model;

public class Carro extends Veiculo {
	
	private int quantidadePortas;
	private double pesoEngate;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public double getPesoEngate() {
		return pesoEngate;
	}
	public void setPesoEngate(double pesoEngate) {
		this.pesoEngate = pesoEngate;
	}
	
	public void mostrarAtributos() {
		System.out.println("\nModelo do carro: " + getModelo() +
						   "\nPeso do carro: " + getPeso() + 
						   "\nPortas do carro: " + getQuantidadePortas() +
						   "\nPeso engate: " + getPesoEngate());
	}
	
	public double pesoTotal()
	{
		double pesoTotal = getPesoEngate() + getPeso();
		return pesoTotal;
	}
	

}
