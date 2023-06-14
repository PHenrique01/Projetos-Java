package daos;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoSQLitePj {
private final ConexaoSQLite conexaoSQLite;
	
	
	public CriarBancoSQLitePj(ConexaoSQLite pConexaoSQLite) {
		this.conexaoSQLite = pConexaoSQLite;
	}
	
	public void criarTabelaPessoaj() {
		String sql =
				"CREATE TABLE IF NOT EXISTS pessoasj"
				+"("
				+"id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"nome VARCHAR(250) NOT NULL,"
				+"email VARCHAR(250) NOT NULL,"
				+"senha VARCHAR(150) NOT NULL"
				+");";
		
		
		//executando o sql de criar tabelas
		
		boolean conectou = false;
		
		try {
			conectou = this.conexaoSQLite.conectar();
			
			Statement stmt = this.conexaoSQLite.criarStatement();
			
			stmt.execute(sql);
			
			System.out.println("Tabela de Pessoa Jurídica criada!");
		} catch (SQLException e) {
			//mensagem de erro na criação da tabela
		}finally {
			if(conectou) {
				this.conexaoSQLite.desconectar();
			}
		}
	}
}
