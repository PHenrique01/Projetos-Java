package services;

import javax.swing.JOptionPane;

import daos.RealizarSeguro1Dao;
import models.RealizarSeguro1;

public class RealizarSeguro1Service implements IRealizarSeguro1Service{
	RealizarSeguro1Dao realizarsDao = new RealizarSeguro1Dao();
	
	@Override
	public boolean realizarSeguro(String nome, String email, String cep, String cpf, String dataNasc, String contato, String inicioVigencia, String fimVigencia) {
		RealizarSeguro1 realizars = new RealizarSeguro1(nome, email, cep, cpf, dataNasc, contato, inicioVigencia, fimVigencia);
		JOptionPane.showMessageDialog(null, "PRIMERIA ETAPA FEITO COM SUCESSO!");
		return this.realizarsDao.inserir(realizars);
	}
}
