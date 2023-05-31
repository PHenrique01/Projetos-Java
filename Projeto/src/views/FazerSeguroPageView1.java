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
import javax.swing.JTextField;

public class FazerSeguroPageView1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEmail;
	private JTextField txtSexo;
	private JTextField txtCep;
	private JTextField txtCpf;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FazerSeguroPageView1 frame = new FazerSeguroPageView1();
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
	public FazerSeguroPageView1() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(279, 65, 450, 2);
		contentPane.add(panel_1);
		
		JLabel lblFazerOSeguro = new JLabel("Fazer o seguro");
		lblFazerOSeguro.setBackground(new Color(255, 255, 255));
		lblFazerOSeguro.setHorizontalAlignment(SwingConstants.CENTER);
		lblFazerOSeguro.setForeground(new Color(0, 0, 0));
		lblFazerOSeguro.setFont(new Font("Arial", Font.BOLD, 20));
		lblFazerOSeguro.setBounds(240, 0, 534, 40);
		contentPane.add(lblFazerOSeguro);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(279, 60, 10, 10);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(420, 60, 10, 10);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_2.setBackground(Color.BLACK);
		panel_2_2.setBounds(560, 60, 10, 10);
		contentPane.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2_3.setBackground(Color.BLACK);
		panel_2_3.setBounds(719, 60, 10, 10);
		contentPane.add(panel_2_3);
		
		JLabel lblNewLabel_2 = new JLabel("Seguro");
		lblNewLabel_2.setForeground(new Color(191, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(260, 78, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Veiculo");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(407, 78, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Segurado");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(541, 78, 60, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Planos e Preços");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(668, 78, 99, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(240, 137, 534, 200);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 22, 46, 14);
		panel_3.add(lblNewLabel_2_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pessoa Física");
		rdbtnNewRadioButton.setBounds(6, 54, 109, 23);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPessoaJurdica = new JRadioButton("Pessoa Jurídica");
		rdbtnPessoaJurdica.setBounds(10, 89, 109, 23);
		panel_3.add(rdbtnPessoaJurdica);
		
		JPanel panel_PessoaF = new JPanel();
		panel_PessoaF.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_PessoaF.setBounds(121, 0, 413, 200);
		panel_3.add(panel_PessoaF);
		panel_PessoaF.setLayout(null);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nome:");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(10, 11, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setText("Nome");
		textField.setForeground(new Color(154, 154, 154));
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBackground(new Color(223, 223, 223));
		textField.setBounds(10, 30, 193, 31);
		panel_PessoaF.add(textField);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("E-mail:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1.setBounds(10, 72, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_1);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setText("E-mail");
		txtEmail.setForeground(new Color(154, 154, 154));
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(223, 223, 223));
		txtEmail.setBounds(10, 91, 193, 31);
		panel_PessoaF.add(txtEmail);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Sexo:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2.setBounds(10, 133, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2);
		
		txtSexo = new JTextField();
		txtSexo.setHorizontalAlignment(SwingConstants.CENTER);
		txtSexo.setText("----");
		txtSexo.setToolTipText("");
		txtSexo.setForeground(new Color(154, 154, 154));
		txtSexo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSexo.setColumns(10);
		txtSexo.setBackground(new Color(223, 223, 223));
		txtSexo.setBounds(10, 152, 95, 31);
		panel_PessoaF.add(txtSexo);
		
		txtCep = new JTextField();
		txtCep.setToolTipText("");
		txtCep.setText("CEP");
		txtCep.setForeground(new Color(154, 154, 154));
		txtCep.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCep.setColumns(10);
		txtCep.setBackground(new Color(223, 223, 223));
		txtCep.setBounds(210, 91, 193, 31);
		panel_PessoaF.add(txtCep);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("CEP:");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1_1.setBounds(210, 72, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_1_1);
		
		txtCpf = new JTextField();
		txtCpf.setToolTipText("");
		txtCpf.setText("CPF");
		txtCpf.setForeground(new Color(154, 154, 154));
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCpf.setColumns(10);
		txtCpf.setBackground(new Color(223, 223, 223));
		txtCpf.setBounds(210, 30, 193, 31);
		panel_PessoaF.add(txtCpf);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("CPF:");
		lblNewLabel_2_1_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_3.setBounds(210, 11, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_3);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setText("----");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(154, 154, 154));
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(223, 223, 223));
		textField_3.setBounds(128, 152, 95, 31);
		panel_PessoaF.add(textField_3);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("Data de Nasc:");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1.setBounds(128, 133, 83, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2_1);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setText("----");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(new Color(154, 154, 154));
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(223, 223, 223));
		textField_4.setBounds(255, 152, 95, 31);
		panel_PessoaF.add(textField_4);
		
		JLabel lblNewLabel_2_1_2_2_2 = new JLabel("Contato:");
		lblNewLabel_2_1_2_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_2.setBounds(255, 133, 53, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2_2);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Dados do Segurado");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1.setBounds(240, 121, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1);
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
