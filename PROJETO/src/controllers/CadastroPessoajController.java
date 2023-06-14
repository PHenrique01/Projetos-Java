package controllers;

import services.CadastroPessoajService;
import views.CadastroPessoaJuridicaView;

public class CadastroPessoajController {
	CadastroPessoaJuridicaView cadastroPessoaJuridicaView;
	
	public CadastroPessoajController(CadastroPessoaJuridicaView view) {
		this.cadastroPessoaJuridicaView = view;
	}
	
	public void cadastrar() {
		CadastroPessoajService service = new CadastroPessoajService();
		service.cadastrar(
				this.cadastroPessoaJuridicaView.getTxtNome().getText(),
				this.cadastroPessoaJuridicaView.getTxtEmail().getText(),
				this.cadastroPessoaJuridicaView.getTxtSenha().getText());
	}
}
