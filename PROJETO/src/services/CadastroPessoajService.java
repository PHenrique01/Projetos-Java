package services;

import javax.swing.JOptionPane;

import daos.PessoaJuridicaDao;
import models.PessoaJuridica;

public class CadastroPessoajService implements ICadastroPessoajService{
	PessoaJuridicaDao pessoajDao = new PessoaJuridicaDao();
	
	@Override
	public boolean cadastrar(String nome, String email, String senha) {
		PessoaJuridica pessoaj = new PessoaJuridica(nome, email, senha);
		if(!email.contains("@") && email.length() < 3 && senha.length() < 3) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			return false;
		}else {
			JOptionPane.showMessageDialog(null, "CADASTRO FEITO COM SUCESSO!");
			return this.pessoajDao.inserir(pessoaj);
		}
	}
}
