package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSQLite {
	private Connection conexao;
	
	
	public boolean conectar() {
		try {
			String url = "jdbc:sqlite:C:\\Users\\Familia\\Documents\\4º_Período_SI\\POO\\PROJETO\\src\\banco_de_dados\\banco_sqlite.db";
			
			this.conexao = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		
		System.out.println("conectou!");
		
		return true;
	}
	
	public boolean desconectar() {
		try {
			if(this.conexao.isClosed() == false) {
				this.conexao.close();
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		
		System.out.println("desconectou!");
		return true;
	}
	
	//Criando os statements para os sqls serem executados
	
	public Statement criarStatement() {
		try {
			return this.conexao.createStatement();
		} catch (SQLException e) {
			return null;
		}
	}
	
	public Connection getConexao() {
		return this.conexao;
	}
}
