package controllers;

import services.RealizarSeguro1Service;
import views.FazerSeguroPageView1;

public class RealizarSeguro1Controller {
	FazerSeguroPageView1 fazerSeguroPageView1;
	
	public RealizarSeguro1Controller(FazerSeguroPageView1 view) {
		this.fazerSeguroPageView1 = view;
	}
	
	public void realizarSeguro() {
		RealizarSeguro1Service service = new RealizarSeguro1Service();
		service.realizarSeguro(
				this.fazerSeguroPageView1.getTextNome().getText(),
				this.fazerSeguroPageView1.getTxtEmail().getText(),
				this.fazerSeguroPageView1.getTxtCep().getText(),
				this.fazerSeguroPageView1.getTxtCpf().getText(),
				this.fazerSeguroPageView1.getTextDataNasc().getText(),
				this.fazerSeguroPageView1.getTextContato().getText(),
				this.fazerSeguroPageView1.getTextInicioVigencia().getText(),
				this.fazerSeguroPageView1.getTextFimVigencia().getText()
				);
	}
}
