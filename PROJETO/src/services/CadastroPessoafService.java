package services;

import javax.swing.JOptionPane;

import daos.PessoaFisicaDao;
import models.PessoaFisica;

public class CadastroPessoafService implements ICadastroPessoafService{
	PessoaFisicaDao pessoafDao = new PessoaFisicaDao();
	
	
	@Override
	public boolean cadastrar(String nome, String email, String senha) {
		PessoaFisica pessoaf = new PessoaFisica(nome, email, senha);
		if(!email.contains("@") && email.length() < 3 && senha.length() < 3) {
//			System.out.println("erro!");
			JOptionPane.showMessageDialog(null, "ERRO!");
			return false;
		}else {
//			System.out.println("sucesso!");
			JOptionPane.showMessageDialog(null, "CADASTRO FEITO COM SUCESSO!");
			return this.pessoafDao.inserir(pessoaf);
		}
	}	
}
