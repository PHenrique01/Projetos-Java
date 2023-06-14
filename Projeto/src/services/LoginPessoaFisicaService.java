package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controllers.ValidacaoLoginController;
import controllers.ValidacaoLoginEmail;
import controllers.ValidacaoLoginSenha;
import daos.PessoaFisicaDao;

public class LoginPessoaFisicaService implements ILoginClienteService{
	private List<ValidacaoLoginController> validacoes = new ArrayList<>();
	
	public LoginPessoaFisicaService() {
		this.validacoes.add(new ValidacaoLoginEmail());
		this.validacoes.add(new ValidacaoLoginSenha());
	}
	
	private PessoaFisicaDao pessoafDao = new PessoaFisicaDao();
	
	public boolean autenticar(String email, String senha) {
		try {
			this.validacoes.forEach(validacao -> validacao.validar(email, senha));
			ResultSet resultado = pessoafDao.autenticar(email, senha);
			if(resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage().toString());
		}
		return false;
	}
}
