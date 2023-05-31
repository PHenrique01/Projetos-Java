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

public class CadastroCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
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
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Selecione uma das opções");
		lblNewLabel_1_1_2.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(223, 55, 154, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("a seguir");
		lblNewLabel_1_1_1_1.setForeground(new Color(40, 40, 40));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(270, 73, 45, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pessoa Física");
		rdbtnNewRadioButton.setBounds(200, 120, 193, 33);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(223, 223, 223));
		
		JRadioButton rdbtnPessoaJurdica = new JRadioButton("Pessoa Jurídica");
		rdbtnPessoaJurdica.setBackground(new Color(223, 223, 223));
		rdbtnPessoaJurdica.setBounds(200, 168, 193, 33);
		contentPane.add(rdbtnPessoaJurdica);
		
		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnContinuar.setBounds(245, 227, 108, 23);
		contentPane.add(btnContinuar);
	}
}
