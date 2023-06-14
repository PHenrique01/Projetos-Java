package controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import services.ILoginClienteService;
import views.CadastroPessoaFisicaView;
import views.CadastroPessoaJuridicaView;
import views.HomePage2;
import views.LoginClienteView;
import views.LoginPessoaFisicaView;
import views.LoginPessoaJuridicaView;

public class LoginPessoaJuridicaController {
	private LoginPessoaJuridicaView view;
	private ILoginClienteService loginService;
	private HomePage2 homePage2 = new HomePage2();
	
	public LoginPessoaJuridicaController(LoginPessoaJuridicaView view, ILoginClienteService loginService) {
		this.view = view;
		this.loginService = loginService;
	}
	
	public void autenticar() {
		String email = view.getTxtEmailcpf().getText();
		String senha = view.getTxtSenha().getText();
		
		try {
			boolean autenticar = loginService.autenticar(email, senha);
			if(autenticar) {
				JOptionPane.showMessageDialog(view, "LOGADO");
				homePage2.setVisible(true);
				view.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(view, "USUÁRIO OU SENHA INVÁLIDOS");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(view, e.getMessage());
		}
	}
	
	public void cadastrarAction() {
		CadastroPessoaJuridicaView cadastroPessoajView = new CadastroPessoaJuridicaView();
		cadastroPessoajView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cadastroPessoajView.setVisible(true);
	}
}
