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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage1 frame = new HomePage1();
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
	public HomePage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
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
		
		JButton btnLogin = new JButton("Fazer Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginClienteView loginCliente = new LoginClienteView();
				loginCliente.setVisible(true);
				setVisible(false);
			}
		});
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLogin.setBounds(52, 303, 120, 23);
		panel.add(btnLogin);
		
		JButton btnNewButton_1 = new JButton("Atendimento");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(21, 21, 21));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setBounds(52, 231, 120, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Serviços adicionais");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(21, 21, 21));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setBounds(52, 175, 120, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Fazer o seguro");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(21, 21, 21));
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_3.setBounds(52, 119, 120, 23);
		panel.add(btnNewButton_3);
		
		JTextPane txtpnAaaaaaaaa = new JTextPane();
		txtpnAaaaaaaaa.setForeground(new Color(21, 21, 21));
		txtpnAaaaaaaaa.setText("O Seguro Auto é um conjunto de proteções oferecidas pela seguradora para resguardar o seu automóvel e evitar ou aliviar prejuízos financeiros decorrentes de imprevistos que causem alguns tipos de danos ao veículos.");
		txtpnAaaaaaaaa.setFont(new Font("Arial", Font.PLAIN, 14));
		txtpnAaaaaaaaa.setBackground(new Color(255, 255, 255));
		txtpnAaaaaaaaa.setBounds(240, 79, 534, 62);
		contentPane.add(txtpnAaaaaaaaa);
		
		JLabel lblNewLabel_2 = new JLabel("Seguro Auto");
		lblNewLabel_2.setForeground(new Color(21, 21, 21));
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
		lblNewLabel_2_1.setForeground(new Color(21, 21, 21));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(240, 182, 534, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Danos a terceiros");
		rdbtnNewRadioButton.setForeground(new Color(21, 21, 21));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(240, 234, 150, 20);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCoberturaDeColises = new JRadioButton("Cobertura de Colisões");
		rdbtnCoberturaDeColises.setForeground(new Color(21, 21, 21));
		rdbtnCoberturaDeColises.setBackground(new Color(255, 255, 255));
		rdbtnCoberturaDeColises.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnCoberturaDeColises.setBounds(524, 234, 184, 20);
		contentPane.add(rdbtnCoberturaDeColises);
		
		JRadioButton rdbtnIncndioEDanos = new JRadioButton("Incêndio e danos da Natureza");
		rdbtnIncndioEDanos.setForeground(new Color(21, 21, 21));
		rdbtnIncndioEDanos.setBackground(new Color(255, 255, 255));
		rdbtnIncndioEDanos.setFont(new Font("Arial", Font.BOLD, 14));
		rdbtnIncndioEDanos.setBounds(240, 302, 234, 20);
		contentPane.add(rdbtnIncndioEDanos);
		
		JRadioButton rdbtnCoberturaDeDanos = new JRadioButton("Cobertura de danos a Vidros");
		rdbtnCoberturaDeDanos.setForeground(new Color(21, 21, 21));
		rdbtnCoberturaDeDanos.setBackground(new Color(255, 255, 255));
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
