package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.RealizarSeguro1;

public class RealizarSeguro1Dao {
	Connection connection;
	
	public RealizarSeguro1Dao() {
		try {
			String url = "jdbc:sqlite:C:\\Users\\Familia\\Documents\\4º_Período_SI\\POO\\PROJETO\\src\\banco_de_dados\\banco_sqlite.db";
			this.connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public boolean inserir(RealizarSeguro1 realizarseguro1) {
		String sql = "INSERT INTO seguro(nome, email, cep, cpf, dataNasc, contato, inicioVigencia, fimVigencia) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, realizarseguro1.getNome());
			stmt.setString(2, realizarseguro1.getEmail());
			stmt.setString(3, realizarseguro1.getCep());
			stmt.setString(4, realizarseguro1.getCpf());
			stmt.setString(5, realizarseguro1.getDataNasc());
			stmt.setString(6, realizarseguro1.getContato());
			stmt.setString(7, realizarseguro1.getInicioVigencia());
			stmt.setString(8, realizarseguro1.getFimVigencia());
			stmt.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
