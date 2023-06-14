package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.LoginPessoaFisicaController;
import services.ILoginClienteService;
import services.LoginPessoaFisicaService;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPessoaFisicaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private LoginPessoaFisicaController loginController;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPessoaFisicaView frame = new LoginPessoaFisicaView();
					ILoginClienteService loginService = new LoginPessoaFisicaService();
					frame.loginController = new LoginPessoaFisicaController(frame, loginService);
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
	public LoginPessoaFisicaView() {
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Crie a sua conta");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(39, 115, 90, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("agora mesmo.");
		lblNewLabel_1_1_1.setBounds(43, 136, 86, 14);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("CRIAR CONTA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroClienteView cadastroClient = new CadastroClienteView();
				cadastroClient.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(21, 195, 119, 23);
		panel.add(btnNewButton);
		
		JLabel lblCriarConta = new JLabel("LOGIN");
		lblCriarConta.setForeground(new Color(40, 40, 40));
		lblCriarConta.setFont(new Font("Arial", Font.BOLD, 28));
		lblCriarConta.setBounds(254, 11, 88, 33);
		contentPane.add(lblCriarConta);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Preencha seus dados");
		lblNewLabel_1_1_2.setForeground(new Color(145, 145, 145));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(234, 48, 122, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginController.autenticar();
			}
		});
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEntrar.setBounds(234, 203, 118, 23);
		contentPane.add(btnEntrar);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmail.getText().equals("E-mail")) {
					txtEmail.setText("");
					txtEmail.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmail.getText().equals("")) {
					txtEmail.setText("E-mail");
					txtEmail.setForeground(new Color(154, 154, 154));
				}
			}
		});
		txtEmail.setForeground(new Color(154, 154, 154));
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmail.setText("E-mail");
		txtEmail.setToolTipText("");
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(223, 223, 223));
		txtEmail.setBounds(200, 107, 193, 31);
		contentPane.add(txtEmail);
		
		txtSenha = new JTextField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSenha.getText().equals("Senha")) {
					txtSenha.setText("");
					txtSenha.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSenha.getText().equals("")) {
					txtSenha.setText("Senha");
					txtSenha.setForeground(new Color(154, 154, 154));
				}
			}
		});
		txtSenha.setForeground(new Color(154, 154, 154));
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSenha.setText("Senha");
		txtSenha.setToolTipText("");
		txtSenha.setColumns(10);
		txtSenha.setBackground(new Color(223, 223, 223));
		txtSenha.setBounds(200, 149, 193, 31);
		contentPane.add(txtSenha);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Pessoa Física");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(234, 70, 122, 14);
		contentPane.add(lblNewLabel_1_1_2_1);
	}

	public JTextField getTxtEmailcpf() {
		return txtEmail;
	}

	public void setTxtEmailcpf(JTextField txtEmailcpf) {
		this.txtEmail = txtEmailcpf;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JTextField txtSenha) {
		this.txtSenha = txtSenha;
	}
	
	
}
