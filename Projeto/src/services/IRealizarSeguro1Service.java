package services;

public interface IRealizarSeguro1Service {
	public boolean realizarSeguro(String nome, String email, String cep, String cpf, String dataNasc, String contato, String inicioVigencia, String fimVigencia);
}
