package br.com.motorola.conexao;

import br.com.motorola.conexao.Arquivo;

public class ArquivoConf {

	public static void main(String[] args) {

		String ArqConfig = "Acesso.con";
		
		String USER = "root";
		String PASS = "*123456HAS*";
		
		String print = USER+";"+PASS+";";
		Arquivo.Write(ArqConfig,print);

	}

}
