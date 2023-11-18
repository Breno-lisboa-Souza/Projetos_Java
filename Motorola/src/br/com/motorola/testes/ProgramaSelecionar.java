package br.com.motorola.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;
import br.com.motorola.model.Celular;

public class ProgramaSelecionar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		CelularDAO celulardao = new CelularDAO(con);
		
		ArrayList<Celular> lista = celulardao.SouzaRetornarDados();
		
		if(lista != null)
		{
			for(Celular celular : lista)
			{
				System.out.println("Modelo do celular: " + celular.getSouzaModelo());
				System.out.println("Peso do celular: " + celular.getSouzaPeso());
				System.out.println("Altura da tela: " + celular.getSouzaAlturaDaTela());
				System.out.println("Largura da tela: " + celular.getSouzaLarguraDaTela() + "\n");
			}
		}

	}

}
