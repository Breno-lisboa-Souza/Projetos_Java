package br.com.motorola.testes;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class ProgramaInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular();
		CelularDAO celulardao = new CelularDAO(con);
		
		celular.setSouzaModelo("Motorolaaaaaaa");
		celular.setSouzaPeso(500);
		celular.setSouzaAlturaDaTela(9);
		celular.setSouzaLarguraDaTela(4);
		System.out.println(celulardao.SouzaInserir(celular));
		
		Conexao.fecharConexao(con);

	}

}