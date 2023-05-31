package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class TesteHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteHomePage frame = new TesteHomePage();
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
	public TesteHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(53, 53, 53));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 0, 3, (Color) new Color(36, 36, 36)));
		panel.setBackground(new Color(21, 21, 21));
		panel.setBounds(0, 0, 230, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro Auto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 210, 67);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fazer o seguro");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 107, 210, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Serviços adicionais");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 163, 210, 45);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Atendimento");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 219, 210, 45);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Fazer Login");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(52, 303, 120, 23);
		panel.add(btnNewButton);
		
		JTextPane txtpnAaaaaaaaa = new JTextPane();
		txtpnAaaaaaaaa.setForeground(new Color(255, 255, 255));
		txtpnAaaaaaaaa.setText("O Seguro Auto é um conjunto de proteções oferecidas pela seguradora para resguardar o seu automóvel e evitar ou aliviar prejuízos financeiros decorrentes de imprevistos que causem alguns tipos de danos ao veículos.");
		txtpnAaaaaaaaa.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnAaaaaaaaa.setBackground(new Color(53, 53, 53));
		txtpnAaaaaaaaa.setBounds(240, 79, 534, 62);
		contentPane.add(txtpnAaaaaaaaa);
		
		JLabel lblNewLabel_2 = new JLabel("Seguro Auto");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(240, 35, 534, 33);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(40, 40, 40));
		panel_1.setBounds(240, 160, 534, 1);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Algumas das coberturas mais contratadas no Seguro Auto");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(240, 182, 534, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Danos a terceiros");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(53, 53, 53));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(240, 234, 150, 20);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnRouboEFurto = new JRadioButton("Roubo e Furto");
		rdbtnRouboEFurto.setForeground(new Color(255, 255, 255));
		rdbtnRouboEFurto.setBackground(new Color(53, 53, 53));
		rdbtnRouboEFurto.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnRouboEFurto.setBounds(240, 302, 150, 20);
		contentPane.add(rdbtnRouboEFurto);
		
		JRadioButton rdbtnCoberturaDeColises = new JRadioButton("Cobertura de Colisões");
		rdbtnCoberturaDeColises.setForeground(new Color(255, 255, 255));
		rdbtnCoberturaDeColises.setBackground(new Color(53, 53, 53));
		rdbtnCoberturaDeColises.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnCoberturaDeColises.setBounds(365, 270, 184, 20);
		contentPane.add(rdbtnCoberturaDeColises);
		
		JRadioButton rdbtnIncndioEDanos = new JRadioButton("Incêndio e danos da Natureza");
		rdbtnIncndioEDanos.setForeground(new Color(255, 255, 255));
		rdbtnIncndioEDanos.setBackground(new Color(53, 53, 53));
		rdbtnIncndioEDanos.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnIncndioEDanos.setBounds(524, 234, 234, 20);
		contentPane.add(rdbtnIncndioEDanos);
		
		JRadioButton rdbtnCoberturaDeDanos = new JRadioButton("Cobertura de danos a Vidros");
		rdbtnCoberturaDeDanos.setForeground(new Color(255, 255, 255));
		rdbtnCoberturaDeDanos.setBackground(new Color(53, 53, 53));
		rdbtnCoberturaDeDanos.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnCoberturaDeDanos.setBounds(524, 302, 234, 20);
		contentPane.add(rdbtnCoberturaDeDanos);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
