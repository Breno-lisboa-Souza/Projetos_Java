package br.com.motorola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.motorola.model.Celular;

public class CelularDAO {
	
	private Connection con = null;

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CelularDAO(Connection con) {
		setCon(con);
	}
	
	public String SouzaInserir(Celular celular) {
		String sql = "insert into Celular(SouzaModelo, SouzaPeso, SouzaAlturaDaTela, SouzaLarguraDaTela) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getSouzaModelo());
			ps.setInt(2, celular.getSouzaPeso());
			ps.setInt(3, celular.getSouzaAlturaDaTela());
			ps.setInt(4, celular.getSouzaLarguraDaTela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String SouzaDeletarSemWhere() {
		String sql = "delete from Celular";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String SouzaModificar(Celular celular) {
		String sql = "update Celular set SouzaModelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getSouzaModelo());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao modificar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Celular> SouzaRetornarDados(){
		String sql = "select * from Celular";
		ArrayList<Celular> retornarCelular = new ArrayList<Celular>();
		try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
					if (rs != null)
					{
						while(rs.next())
						{
							Celular celular = new Celular();
							celular.setSouzaModelo(rs.getString(1));
							celular.setSouzaPeso(rs.getInt(2));
							celular.setSouzaAlturaDaTela(rs.getInt(3));
							celular.setSouzaLarguraDaTela(rs.getInt(4));
							retornarCelular.add(celular);
						}
						return retornarCelular;
					}
					else 
					{
						return null;
					}
			}
			catch (SQLException e)
			{
					return null;
			}
	}

}
