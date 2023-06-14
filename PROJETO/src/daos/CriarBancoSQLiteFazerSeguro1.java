package daos;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoSQLiteFazerSeguro1 {
	private final ConexaoSQLite conexaoSQLite;
	
	public CriarBancoSQLiteFazerSeguro1(ConexaoSQLite pConexaoSQLite) {
		this.conexaoSQLite = pConexaoSQLite;
	}
	
	public void criarTabelaFazerSeguro1() {
		String sql =
				"CREATE TABLE IF NOT EXISTS seguro"
				+"("
				+"id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"nome VARCHAR(250) NOT NULL,"
				+"email VARCHAR(250) NOT NULL,"
				+"cep VARCHAR(20) NOT NULL,"
				+"cpf  VARCHAR(11) NOT NULL,"
				+"dataNasc VARCHAR(10) NOT NULL,"
				+"contato VARCHAR(10) NOT NULL,"
				+"inicioVigencia VARCHAR(10) NOT NULL,"
				+"fimVigencia VARCHAR(10) NOT NULL"
				+");";
		
		
		//executando o sql de criar tabelas
		
		boolean conectou = false;
		
		try {
			conectou = this.conexaoSQLite.conectar();
			
			Statement stmt = this.conexaoSQLite.criarStatement();
			
			stmt.execute(sql);
			
			System.out.println("Tabela de Realizar Seguro 01 criada!");
		} catch (SQLException e) {
			//mensagem de erro na criação da tabela
		}finally {
			if(conectou) {
				this.conexaoSQLite.desconectar();
			}
		}
	}
	
}
