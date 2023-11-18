package br.com.motorola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.motorola.conexao.Arquivo;

public class ConexaoFactory {

public static void main(String[] args) throws SQLException 	{
		
		Connection conexao = null;
		String url = "jdbc:mysql://localhost:3307/teste";
		
		String ArqConfig = "Acesso.con";
		
		String conteudo = Arquivo.Read(ArqConfig);
		String c1 = conteudo.split(";")[0];
		String c2 = conteudo.split(";")[1];
		
		conexao = DriverManager.getConnection(url, c1, c2);
		System.out.println("Abriu a conexão.");
		conexao.close();
	}

}
