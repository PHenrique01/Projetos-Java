package controllers;

public class ValidacaoLoginSenha implements ValidacaoLoginController{
	
	@Override
	public void validar(String email, String senha) {
		if(senha.length() < 5) {
			throw new RuntimeException("ERRO!");
		}
	}
}
