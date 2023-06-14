package models;

public class RealizarSeguro1 {
	private String nome;
	private String email;
	private String cep;
	private String cpf;
	private String dataNasc;
	private String contato;
	private String inicioVigencia;
	private String fimVigencia;
	
	public RealizarSeguro1(String nome, String email, String cep, String cpf, String dataNasc, String contato, String inicioVigencia, String fimVigencia) {
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.contato = contato;
		this.inicioVigencia = inicioVigencia;
		this.fimVigencia = fimVigencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(String inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public String getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(String fimVigencia) {
		this.fimVigencia = fimVigencia;
	}
}
