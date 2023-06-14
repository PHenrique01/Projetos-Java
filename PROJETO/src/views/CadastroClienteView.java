package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.LoginPessoaFisicaController;
import controllers.LoginPessoaJuridicaController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroClienteView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteView frame = new CadastroClienteView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroClienteView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 40, 40));
		panel.setBounds(0, 0, 165, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro");
		lblNewLabel.setBounds(33, 11, 104, 33);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bem vindo de volta!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 72, 134, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Acesse sua conta");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(33, 116, 104, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("agora mesmo.");
		lblNewLabel_1_1_1.setBounds(43, 136, 86, 14);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginClienteView loginCliente = new LoginClienteView();
				loginCliente.setVisible(true);
				setVisible(false);
			}
		});
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEntrar.setBounds(33, 195, 96, 23);
		panel.add(btnEntrar);
		
		JLabel lblCriarConta = new JLabel("CRIAR CONTA");
		lblCriarConta.setForeground(new Color(40, 40, 40));
		lblCriarConta.setFont(new Font("Arial", Font.BOLD, 28));
		lblCriarConta.setBounds(200, 11, 193, 33);
		contentPane.add(lblCriarConta);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Escolha uma das opções");
		lblNewLabel_1_1_2.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(223, 55, 154, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("a seguir");
		lblNewLabel_1_1_1_1.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(270, 73, 45, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnPessoaFisica = new JButton("Pessoa Física");
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CadastroPessoaFisicaView cadastroPessoaF = new CadastroPessoaFisicaView();
//				cadastroPessoaF.setVisible(true);
//				setVisible(false);
				
				LoginPessoaFisicaController loginPessoaf = new LoginPessoaFisicaController(null, null);
				loginPessoaf.cadastrarAction();
			}
		});
		btnPessoaFisica.setBounds(200, 134, 193, 23);
		contentPane.add(btnPessoaFisica);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Jurídica");
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CadastroPessoaJuridicaView cadastroPessoaJ = new CadastroPessoaJuridicaView();
//				cadastroPessoaJ.setVisible(true);
//				setVisible(false);
				
				LoginPessoaJuridicaController loginPessoaj = new LoginPessoaJuridicaController(null, null);
				loginPessoaj.cadastrarAction();
			}
		});
		btnPessoaJuridica.setBounds(200, 194, 193, 23);
		contentPane.add(btnPessoaJuridica);
	}
}
