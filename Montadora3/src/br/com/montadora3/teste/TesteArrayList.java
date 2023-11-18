package br.com.montadora3.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora3.model.Carro;
import br.com.montadora3.model.Moto;

public class TesteArrayList {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.setModelo("Civic");
		carro.setPeso(1235.27);
		carro.setQuantidadePortas(4);
		
		Carro carroDois = new Carro();
		
		carroDois.setModelo("HRV");
		carroDois.setPeso(1475.27);
		carroDois.setQuantidadePortas(4);
		
		List<Carro> vetorListaCarro = new ArrayList<Carro>();
		
		vetorListaCarro.add(carroDois);
		
		for(Carro c : vetorListaCarro) {
			System.out.println(c.getModelo() + " " + c.getPeso() + " " + c.getQuantidadePortas());
		}
		
		
		
		Moto moto = new Moto();
		
		moto.setModelo("Suzuki");
		moto.setPeso(335.27);
		moto.setQuantidadeAdesivos(1);
		
		Moto motoDois = new Moto();
		
		motoDois.setModelo("Yamaha");
		motoDois.setPeso(275.27);
		motoDois.setQuantidadeAdesivos(5);
		
		List<Moto> vetorListaMoto = new ArrayList<Moto>();
		
		vetorListaMoto.add(motoDois);
		
		for(Moto m : vetorListaMoto) {
			System.out.println(m.getModelo() + " " + m.getPeso() + " " + m.getQuantidadeAdesivos());
		}
		

	}

}
