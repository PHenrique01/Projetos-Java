package controllers;

public class ValidacaoLoginEmail implements ValidacaoLoginController{
	
	@Override
	public void validar(String email, String senha) {
		if(!email.contains("@") && email.length() < 5) {
			throw new RuntimeException("ERRO!");
		}
	}
}
