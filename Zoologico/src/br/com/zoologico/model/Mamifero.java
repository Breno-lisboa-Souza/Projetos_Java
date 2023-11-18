package br.com.zoologico.model;

public class Mamifero extends Animal{
	
	public double getTempoGestacao() {
		return TempoGestacao;
	}

	public void setTempoGestacao(double tempoGestacao) {
		TempoGestacao = tempoGestacao;
	}

	private double TempoGestacao;

}
