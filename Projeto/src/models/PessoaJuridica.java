package models;

public class PessoaJuridica {
	private String nome;
	private String email;
	private String cnpj;
	private String senha;
	
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public PessoaJuridica(String nome, String email, String cnpj, String senha) {
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.senha = senha;
	}
}
