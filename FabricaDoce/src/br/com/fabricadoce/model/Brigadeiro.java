package br.com.fabricadoce.model;

public class Brigadeiro extends Doce{
	
	private double pesoChocolate;

	public double getPesoChocolate() {
		return pesoChocolate;
	}

	public void setPesoChocolate(double pesoChocolate) {
		this.pesoChocolate = pesoChocolate;
	}
	
	public String DadosBrigadeiro() 
	{
		return "\nNome do Brigadeiro: " + getNomeDoce() +				
				"\nPeso do Açucar: " + getPesoAcucar() + 
				"\nPeso do Chocolate: " + getPesoChocolate() ;
	}
	
	public void retornarDados() {
		System.out.println("\nNome do Brigadeiro: " + getNomeDoce() +
						   "\nPeso do Açucar: " + getPesoAcucar() + 
						   "\nPeso do Chocolate: " + getPesoChocolate());
	}
	
	public double retornarPesoTotal()
	{
		double pesoTotal = getPesoAcucar() + getPesoChocolate();
		return pesoTotal;
	}
}
