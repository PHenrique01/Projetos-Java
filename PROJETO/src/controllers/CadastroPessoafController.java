package controllers;

import services.CadastroPessoafService;
import views.CadastroPessoaFisicaView;

public class CadastroPessoafController {
	CadastroPessoaFisicaView cadastroPessoaFisicaView;
	
	public CadastroPessoafController(CadastroPessoaFisicaView view) {
		this.cadastroPessoaFisicaView = view;
	}
	
	public void cadastrar() {
		CadastroPessoafService service = new CadastroPessoafService();
		service.cadastrar(
				this.cadastroPessoaFisicaView.getTxtNome().getText(),
				this.cadastroPessoaFisicaView.getTxtEmail().getText(),
				this.cadastroPessoaFisicaView.getTxtSenha().getText());
	}
}
