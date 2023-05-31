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

public class LoginCliente2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmailcnpj;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginCliente2 frame = new LoginCliente2();
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
	public LoginCliente2() {
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
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(21, 195, 119, 23);
		panel.add(btnNewButton);
		
		JLabel lblCriarConta = new JLabel("LOGIN");
		lblCriarConta.setForeground(new Color(40, 40, 40));
		lblCriarConta.setFont(new Font("Arial", Font.BOLD, 28));
		lblCriarConta.setBounds(254, 11, 88, 33);
		contentPane.add(lblCriarConta);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Preencha seus dados");
		lblNewLabel_1_1_2.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(234, 55, 122, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnContinuar = new JButton("ENTRAR");
		btnContinuar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnContinuar.setBounds(234, 203, 118, 23);
		contentPane.add(btnContinuar);
		
		txtEmailcnpj = new JTextField();
		txtEmailcnpj.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailcnpj.getText().equals("E-mail/CNPJ")) {
					txtEmailcnpj.setText("");
					txtEmailcnpj.setForeground(new Color(154, 154, 154));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailcnpj.getText().equals("")) {
					txtEmailcnpj.setText("E-mail/CNPJ");
					txtEmailcnpj.setForeground(new Color(154, 154, 154));
				}
			}
		});
		txtEmailcnpj.setForeground(new Color(154, 154, 154));
		txtEmailcnpj.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmailcnpj.setText("E-mail/CNPJ");
		txtEmailcnpj.setToolTipText("");
		txtEmailcnpj.setColumns(10);
		txtEmailcnpj.setBackground(new Color(223, 223, 223));
		txtEmailcnpj.setBounds(200, 107, 193, 31);
		contentPane.add(txtEmailcnpj);
		
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
		txtSenha.setBounds(200, 149, 193, 31);
		contentPane.add(txtSenha);
	}
}
