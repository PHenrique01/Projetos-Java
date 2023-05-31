package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;

public class HomePageView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageView frame = new HomePageView();
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
	public HomePageView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 40, 40));
		panel.setBounds(0, 0, 719, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro Auto");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 109, 25);
		panel.add(lblNewLabel);
		
		JLabel lblFazerOSeguro = new JLabel("Fazer o seguro");
		lblFazerOSeguro.setForeground(Color.WHITE);
		lblFazerOSeguro.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFazerOSeguro.setBounds(144, 12, 109, 25);
		panel.add(lblFazerOSeguro);
		
		JLabel lblServiosAdicionais = new JLabel("Serviços adicionais");
		lblServiosAdicionais.setForeground(Color.WHITE);
		lblServiosAdicionais.setFont(new Font("Arial", Font.PLAIN, 16));
		lblServiosAdicionais.setBounds(276, 12, 137, 25);
		panel.add(lblServiosAdicionais);
		
		JLabel lblAtendimento = new JLabel("Atendimento");
		lblAtendimento.setForeground(Color.WHITE);
		lblAtendimento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblAtendimento.setBounds(440, 12, 88, 25);
		panel.add(lblAtendimento);
		
		JButton btnLogin = new JButton("Fazer login");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLogin.setBounds(570, 13, 123, 23);
		panel.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("Seguro Auto");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_2.setBounds(38, 118, 167, 33);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnAaaaaaaaa = new JTextPane();
		txtpnAaaaaaaaa.setBackground(new Color(255, 255, 255));
		txtpnAaaaaaaaa.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnAaaaaaaaa.setText("O Seguro Auto é um conjunto de proteções oferecidas pela seguradora para resguardar o seu automóvel e evitar ou aliviar prejuízos financeiros decorrentes de imprevistos que causem alguns tipos de danos ao veículos.");
		txtpnAaaaaaaaa.setBounds(38, 162, 612, 62);
		contentPane.add(txtpnAaaaaaaaa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(40, 40, 40));
		panel_1.setBounds(38, 251, 612, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(40, 40, 40));
		panel_2.setBounds(38, 322, 192, 160);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDanosATerceiros = new JLabel("Danos a terceiros");
		lblDanosATerceiros.setBounds(23, 5, 142, 19);
		lblDanosATerceiros.setForeground(Color.WHITE);
		lblDanosATerceiros.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2.add(lblDanosATerceiros);
		
		JTextPane txtpnSeguroParaTerceiros = new JTextPane();
		txtpnSeguroParaTerceiros.setFont(new Font("Arial", Font.BOLD, 12));
		txtpnSeguroParaTerceiros.setText("Seguro para terceiros é a cobertura que custeia os danos do carro de outra pessoa que foi atingido por você.");
		txtpnSeguroParaTerceiros.setBounds(10, 63, 172, 86);
		panel_2.add(txtpnSeguroParaTerceiros);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(40, 40, 40));
		panel_2_1.setBounds(250, 322, 192, 160);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblCoberturaDeColises = new JLabel("Cobertura de Colisões");
		lblCoberturaDeColises.setBounds(10, 5, 172, 19);
		lblCoberturaDeColises.setForeground(Color.WHITE);
		lblCoberturaDeColises.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2_1.add(lblCoberturaDeColises);
		
		JTextPane txtpnCoberturaParaPerda = new JTextPane();
		txtpnCoberturaParaPerda.setFont(new Font("Arial", Font.BOLD, 12));
		txtpnCoberturaParaPerda.setText("Cobertura para perda parcial ou total devido a colisões.");
		txtpnCoberturaParaPerda.setBounds(10, 63, 172, 86);
		panel_2_1.add(txtpnCoberturaParaPerda);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(40, 40, 40));
		panel_2_2.setBounds(458, 322, 192, 160);
		contentPane.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblIncndioEDanos = new JLabel("Incêndio e danos");
		lblIncndioEDanos.setBounds(25, 5, 137, 19);
		lblIncndioEDanos.setForeground(Color.WHITE);
		lblIncndioEDanos.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2_2.add(lblIncndioEDanos);
		
		JLabel lblDaNatureza = new JLabel("da Natureza");
		lblDaNatureza.setBounds(46, 29, 99, 19);
		lblDaNatureza.setForeground(Color.WHITE);
		lblDaNatureza.setFont(new Font("Arial", Font.BOLD, 16));
		panel_2_2.add(lblDaNatureza);
		
		JTextPane txtpnCoberturaParaEnchentes = new JTextPane();
		txtpnCoberturaParaEnchentes.setFont(new Font("Arial", Font.BOLD, 12));
		txtpnCoberturaParaEnchentes.setText("Cobertura para enchentes, quedas de árvores, temporais, incêndio, etc.");
		txtpnCoberturaParaEnchentes.setBounds(10, 63, 172, 86);
		panel_2_2.add(txtpnCoberturaParaEnchentes);
		
		JLabel lblNewLabel_2_1 = new JLabel("Algumas das coberturas mais contratadas no Seguro Auto");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(38, 266, 559, 33);
		contentPane.add(lblNewLabel_2_1);
	}
}
