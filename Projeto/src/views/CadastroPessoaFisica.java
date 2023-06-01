package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

public class CadastroPessoaFisica extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmailcpf;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoaFisica frame = new CadastroPessoaFisica();
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
	public CadastroPessoaFisica() {
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
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(33, 195, 96, 23);
		panel.add(btnNewButton);
		
		JLabel lblCriarConta = new JLabel("CRIAR CONTA");
		lblCriarConta.setForeground(new Color(40, 40, 40));
		lblCriarConta.setFont(new Font("Arial", Font.BOLD, 28));
		lblCriarConta.setBounds(200, 11, 193, 33);
		contentPane.add(lblCriarConta);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Preencha seus dados");
		lblNewLabel_1_1_2.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(234, 55, 122, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnContinuar = new JButton("CADASTRAR");
		btnContinuar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnContinuar.setBounds(234, 233, 118, 23);
		contentPane.add(btnContinuar);
		
		txtNome = new JTextField();
		txtNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNome.getText().equals("Nome")) {
					txtNome.setText("");
					txtNome.setForeground(new Color(154, 154, 154));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNome.getText().equals("")) {
					txtNome.setText("Nome");
					txtNome.setForeground(new Color(154, 154, 154));
				} 
			}
		});
		txtNome.setForeground(new Color(154, 154, 154));
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setText("Nome");
		txtNome.setBackground(new Color(223, 223, 223));
		txtNome.setToolTipText("");
		txtNome.setBounds(200, 95, 193, 31);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmailcpf = new JTextField();
		txtEmailcpf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailcpf.getText().equals("E-mail/CPF")) {
					txtEmailcpf.setText("");
					txtEmailcpf.setForeground(new Color(154, 154, 154));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailcpf.getText().equals("")) {
					txtEmailcpf.setText("E-mail/CPF");
					txtEmailcpf.setForeground(new Color(154, 154, 154));
				}
			}
		});
		txtEmailcpf.setForeground(new Color(154, 154, 154));
		txtEmailcpf.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmailcpf.setText("E-mail/CPF");
		txtEmailcpf.setToolTipText("");
		txtEmailcpf.setColumns(10);
		txtEmailcpf.setBackground(new Color(223, 223, 223));
		txtEmailcpf.setBounds(200, 137, 193, 31);
		contentPane.add(txtEmailcpf);
		
		txtSenha = new JTextField();
		txtSenha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtSenha.getText().equals("Senha")) {
					txtSenha.setText("");
					txtSenha.setForeground(new Color(154, 154, 154));
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
		txtSenha.setBounds(200, 179, 193, 31);
		contentPane.add(txtSenha);
	}
}
