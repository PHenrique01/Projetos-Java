package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.PessoaFisica;

public class PessoaFisicaDao {
	Connection connection;
	
	public PessoaFisicaDao() {
		try {
			String url = "jdbc:sqlite:C:\\Users\\Familia\\Documents\\4º_Período_SI\\POO\\PROJETO\\src\\banco_de_dados\\banco_sqlite.db";
			this.connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public boolean inserir(PessoaFisica pessoafisica) {
		String sql = "INSERT INTO pessoasf(nome, email, senha) values (?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, pessoafisica.getNome());
			stmt.setString(2, pessoafisica.getEmail());
			stmt.setString(3, pessoafisica.getSenha());
			stmt.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public ResultSet autenticar(String email, String senha) {
		String sql = "SELECT * FROM pessoasf WHERE email=? AND senha=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, senha);
			return stmt.executeQuery();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
