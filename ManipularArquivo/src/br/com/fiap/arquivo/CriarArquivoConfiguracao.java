package br.com.fiap.arquivo;

public class CriarArquivoConfiguracao {

	/**
	 * 
	 * @author Rafael Ronqui
	 */
	
	public static void main(String[] args) {
		
		String ArqConfig = "Configuracao2.con";
		
		String nome = "Breno";
		String login = "Master_Admin";
		String versao = "0.1";
		
		String print = nome+";"+login+";"+versao;
		Arquivo.Write(ArqConfig,print);
	}
}

