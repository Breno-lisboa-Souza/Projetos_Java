package br.com.montadora.model;

public class Moto extends Veiculo{

	private int QuantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return QuantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		QuantidadeAdesivos = quantidadeAdesivos;
	}
	
	public String AtributosMoto() {
		return "\nModelo da moto: " + getModelo() +
				"\nPeso da moto: " + getPeso() + 
				"\nAdesivos na moto: " + getQuantidadeAdesivos() ;
	}
}
