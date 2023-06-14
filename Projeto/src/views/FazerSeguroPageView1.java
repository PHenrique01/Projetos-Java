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

import controllers.RealizarSeguro1Controller;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Event;
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
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FazerSeguroPageView1 extends JFrame {

	private JPanel contentPane;
	private JTextField TxtNome;
	private JTextField TxtEmail;
	private JTextField TxtCep;
	private JTextField TxtCpf;
	private JTextField TxtDataNasc;
	private JTextField TxtContato;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField txtRazoSocial;
	private JTextField TxtInicioVigencia;
	private JTextField TxtFimVigencia;
	
	private RealizarSeguro1Controller realizarSeguro1Controller;

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
		this.realizarSeguro1Controller = new RealizarSeguro1Controller(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_PessoaF = new JPanel();
		panel_PessoaF.setBounds(361, 137, 413, 200);
		contentPane.add(panel_PessoaF);
		panel_PessoaF.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_PessoaF.setLayout(null);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nome:");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(10, 11, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2);
		
		TxtNome = new JTextField();
		TxtNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtNome.getText().equals("Nome")) {
					TxtNome.setText("");
					TxtNome.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtNome.getText().equals("")) {
					TxtNome.setText("Nome");
					TxtNome.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtNome.setToolTipText("");
		TxtNome.setText("Nome");
		TxtNome.setForeground(new Color(154, 154, 154));
		TxtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtNome.setColumns(10);
		TxtNome.setBackground(new Color(223, 223, 223));
		TxtNome.setBounds(10, 30, 193, 31);
		panel_PessoaF.add(TxtNome);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("E-mail:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1.setBounds(10, 72, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_1);
		
		TxtEmail = new JTextField();
		TxtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtEmail.getText().equals("E-mail")) {
					TxtEmail.setText("");
					TxtEmail.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtEmail.getText().equals("")) {
					TxtEmail.setText("E-mail");
					TxtEmail.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtEmail.setToolTipText("");
		TxtEmail.setText("E-mail");
		TxtEmail.setForeground(new Color(154, 154, 154));
		TxtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtEmail.setColumns(10);
		TxtEmail.setBackground(new Color(223, 223, 223));
		TxtEmail.setBounds(10, 91, 193, 31);
		panel_PessoaF.add(TxtEmail);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Sexo:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2.setBounds(10, 133, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2);
		
		TxtCep = new JTextField();
		TxtCep.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtCep.getText().equals("CEP")) {
					TxtCep.setText("");
					TxtCep.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtCep.getText().equals("")) {
					TxtCep.setText("CEP");
					TxtCep.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtCep.setToolTipText("");
		TxtCep.setText("CEP");
		TxtCep.setForeground(new Color(154, 154, 154));
		TxtCep.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtCep.setColumns(10);
		TxtCep.setBackground(new Color(223, 223, 223));
		TxtCep.setBounds(210, 91, 193, 31);
		panel_PessoaF.add(TxtCep);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("CEP:");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1_1.setBounds(210, 72, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_1_1);
		
		TxtCpf = new JTextField();
		TxtCpf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtCpf.getText().equals("CPF")) {
					TxtCpf.setText("");
					TxtCpf.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtCpf.getText().equals("")) {
					TxtCpf.setText("CPF");
					TxtCpf.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtCpf.setToolTipText("");
		TxtCpf.setText("CPF");
		TxtCpf.setForeground(new Color(154, 154, 154));
		TxtCpf.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtCpf.setColumns(10);
		TxtCpf.setBackground(new Color(223, 223, 223));
		TxtCpf.setBounds(210, 30, 193, 31);
		panel_PessoaF.add(TxtCpf);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("CPF:");
		lblNewLabel_2_1_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_3.setBounds(210, 11, 46, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_3);
		
		TxtDataNasc = new JTextField();
		TxtDataNasc.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtDataNasc.getText().equals("/    /")) {
					TxtDataNasc.setText("");
					TxtDataNasc.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtDataNasc.getText().equals("")) {
					TxtDataNasc.setText("/    /");
					TxtDataNasc.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtDataNasc.setToolTipText("");
		TxtDataNasc.setText("/    /");
		TxtDataNasc.setHorizontalAlignment(SwingConstants.CENTER);
		TxtDataNasc.setForeground(new Color(154, 154, 154));
		TxtDataNasc.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtDataNasc.setColumns(10);
		TxtDataNasc.setBackground(new Color(223, 223, 223));
		TxtDataNasc.setBounds(128, 152, 95, 31);
		panel_PessoaF.add(TxtDataNasc);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("Data de Nasc:");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1.setBounds(128, 133, 83, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2_1);
		
		TxtContato = new JTextField();
		TxtContato.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtContato.getText().equals("----")) {
					TxtContato.setText("");
					TxtContato.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtContato.getText().equals("")) {
					TxtContato.setText("----");
					TxtContato.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtContato.setToolTipText("");
		TxtContato.setText("----");
		TxtContato.setHorizontalAlignment(SwingConstants.CENTER);
		TxtContato.setForeground(new Color(154, 154, 154));
		TxtContato.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtContato.setColumns(10);
		TxtContato.setBackground(new Color(223, 223, 223));
		TxtContato.setBounds(255, 152, 95, 31);
		panel_PessoaF.add(TxtContato);
		
		JLabel lblNewLabel_2_1_2_2_2 = new JLabel("Contato:");
		lblNewLabel_2_1_2_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_2.setBounds(255, 133, 53, 14);
		panel_PessoaF.add(lblNewLabel_2_1_2_2_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(10, 152, 95, 31);
		panel_PessoaF.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "M", "F"}));
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 0, 3, (Color) new Color(36, 36, 36)));
		panel.setBackground(new Color(21, 21, 21));
		panel.setBounds(0, 0, 230, 569);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro Auto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 38, 210, 67);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fazer o seguro");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 45, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 160, 210, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Serviços adicionais");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 248, 210, 45);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Atendimento");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 335, 210, 45);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Logado");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(52, 462, 120, 23);
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
		
		JButton btnPessoaFisica = new JButton("Pessoa Fisica");
		btnPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_PessoaF.setVisible(true);
			}
		});
		btnPessoaFisica.setBounds(10, 54, 109, 23);
		panel_3.add(btnPessoaFisica);
		
		JButton btnPessoaJuridica = new JButton("Pessoa Jurídica");
		btnPessoaJuridica.setBounds(10, 104, 109, 23);
		panel_3.add(btnPessoaJuridica);
		
		JPanel panel_PessoaJ = new JPanel();
		panel_PessoaJ.setBounds(121, 0, 413, 200);
		panel_3.add(panel_PessoaJ);
		panel_PessoaJ.setLayout(null);
		panel_PessoaJ.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 0, 403, 200);
		panel_PessoaJ.add(panel_4);
		panel_4.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("Nome:");
		lblNewLabel_2_1_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_4.setBounds(10, 11, 46, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_4);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setText("Nome");
		textField_1.setForeground(new Color(154, 154, 154));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(223, 223, 223));
		textField_1.setBounds(10, 30, 193, 31);
		panel_PessoaJ.add(textField_1);
		
		JLabel lblNewLabel_2_1_2_1_2 = new JLabel("E-mail:");
		lblNewLabel_2_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1_2.setBounds(10, 72, 46, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_1_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setText("E-mail");
		textField_2.setForeground(new Color(154, 154, 154));
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(223, 223, 223));
		textField_2.setBounds(10, 91, 193, 31);
		panel_PessoaJ.add(textField_2);
		
		JLabel lblNewLabel_2_1_2_2_3 = new JLabel("Razão Social:");
		lblNewLabel_2_1_2_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_3.setBounds(10, 133, 76, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_2_3);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setText("CEP");
		textField_5.setForeground(new Color(154, 154, 154));
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(223, 223, 223));
		textField_5.setBounds(210, 91, 193, 31);
		panel_PessoaJ.add(textField_5);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("CEP:");
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1_1_1.setBounds(210, 72, 46, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setText("CPF");
		textField_6.setForeground(new Color(154, 154, 154));
		textField_6.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(223, 223, 223));
		textField_6.setBounds(210, 30, 193, 31);
		panel_PessoaJ.add(textField_6);
		
		JLabel lblNewLabel_2_1_2_3_1 = new JLabel("CNPJ:");
		lblNewLabel_2_1_2_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_3_1.setBounds(210, 11, 46, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_3_1);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setText("----");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(new Color(154, 154, 154));
		textField_8.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(223, 223, 223));
		textField_8.setBounds(210, 158, 95, 31);
		panel_PessoaJ.add(textField_8);
		
		JLabel lblNewLabel_2_1_2_2_2_1 = new JLabel("Contato:");
		lblNewLabel_2_1_2_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_2_1.setBounds(210, 133, 53, 14);
		panel_PessoaJ.add(lblNewLabel_2_1_2_2_2_1);
		
		txtRazoSocial = new JTextField();
		txtRazoSocial.setToolTipText("");
		txtRazoSocial.setText("Razão Social");
		txtRazoSocial.setForeground(new Color(154, 154, 154));
		txtRazoSocial.setFont(new Font("Arial", Font.PLAIN, 12));
		txtRazoSocial.setColumns(10);
		txtRazoSocial.setBackground(new Color(223, 223, 223));
		txtRazoSocial.setBounds(10, 157, 193, 31);
		panel_PessoaJ.add(txtRazoSocial);
		btnPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_PessoaJ.setVisible(true);
				panel_PessoaF.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Dados do Segurado");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1.setBounds(240, 121, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(240, 360, 534, 76);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 11, 46, 14);
		panel_5.add(lblNewLabel_2_1_1_1);
		
		JRadioButton rdbtnIndividual = new JRadioButton("Individual");
		rdbtnIndividual.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnIndividual.setBounds(10, 35, 109, 23);
		panel_5.add(rdbtnIndividual);
		
		JRadioButton rdbtnAutoCorretor = new JRadioButton("Seguro auto Corretor ");
		rdbtnAutoCorretor.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnAutoCorretor.setBounds(157, 35, 148, 23);
		panel_5.add(rdbtnAutoCorretor);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Tipo de Seguro");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1_1.setBounds(240, 344, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5_1.setBounds(240, 460, 534, 76);
		contentPane.add(panel_5_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_1.setBounds(10, 11, 46, 14);
		panel_5_1.add(lblNewLabel_2_1_1_1_1);
		
		TxtInicioVigencia = new JTextField();
		TxtInicioVigencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtInicioVigencia.getText().equals("/    /")) {
					TxtInicioVigencia.setText("");
					TxtInicioVigencia.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtInicioVigencia.getText().equals("")) {
					TxtInicioVigencia.setText("/    /");
					TxtInicioVigencia.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtInicioVigencia.setToolTipText("");
		TxtInicioVigencia.setText("/    /");
		TxtInicioVigencia.setHorizontalAlignment(SwingConstants.CENTER);
		TxtInicioVigencia.setForeground(new Color(154, 154, 154));
		TxtInicioVigencia.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtInicioVigencia.setColumns(10);
		TxtInicioVigencia.setBackground(new Color(223, 223, 223));
		TxtInicioVigencia.setBounds(78, 30, 109, 31);
		panel_5_1.add(TxtInicioVigencia);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Inicio da Vigência:");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1_1.setBounds(78, 11, 109, 14);
		panel_5_1.add(lblNewLabel_2_1_2_2_1_1);
		
		TxtFimVigencia = new JTextField();
		TxtFimVigencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TxtFimVigencia.getText().equals("/    /")) {
					TxtFimVigencia.setText("");
					TxtFimVigencia.setForeground(new Color(0, 0, 0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TxtFimVigencia.getText().equals("")) {
					TxtFimVigencia.setText("/    /");
					TxtFimVigencia.setForeground(new Color(154, 154, 154));
				}
			}
		});
		TxtFimVigencia.setToolTipText("");
		TxtFimVigencia.setText("/    /");
		TxtFimVigencia.setHorizontalAlignment(SwingConstants.CENTER);
		TxtFimVigencia.setForeground(new Color(154, 154, 154));
		TxtFimVigencia.setFont(new Font("Arial", Font.PLAIN, 12));
		TxtFimVigencia.setColumns(10);
		TxtFimVigencia.setBackground(new Color(223, 223, 223));
		TxtFimVigencia.setBounds(214, 30, 109, 31);
		panel_5_1.add(TxtFimVigencia);
		
		JLabel lblNewLabel_2_1_2_2_1_2 = new JLabel("Fim da Vigência:");
		lblNewLabel_2_1_2_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1_2.setBounds(214, 11, 95, 14);
		panel_5_1.add(lblNewLabel_2_1_2_2_1_2);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarSeguro1Controller.realizarSeguro();
			}
		});
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnFinalizar.setBounds(434, 542, 119, 23);
		contentPane.add(btnFinalizar);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Vigência");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1_1_1.setBounds(240, 442, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1_1_1);
	}

	public JTextField getTextNome() {
		return TxtNome;
	}

	public void setTextNome(JTextField textNome) {
		this.TxtNome = textNome;
	}

	public JTextField getTxtEmail() {
		return TxtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.TxtEmail = txtEmail;
	}

	public JTextField getTxtCep() {
		return TxtCep;
	}

	public void setTxtCep(JTextField txtCep) {
		this.TxtCep = txtCep;
	}

	public JTextField getTxtCpf() {
		return TxtCpf;
	}

	public void setTxtCpf(JTextField txtCpf) {
		this.TxtCpf = txtCpf;
	}

	public JTextField getTextDataNasc() {
		return TxtDataNasc;
	}

	public void setTextDataNasc(JTextField textDataNasc) {
		this.TxtDataNasc = textDataNasc;
	}

	public JTextField getTextContato() {
		return TxtContato;
	}

	public void setTextContato(JTextField textContato) {
		this.TxtContato = textContato;
	}

	public JTextField getTextInicioVigencia() {
		return TxtInicioVigencia;
	}

	public void setTextInicioVigencia(JTextField textInicioVigencia) {
		this.TxtInicioVigencia = textInicioVigencia;
	}

	public JTextField getTextFimVigencia() {
		return TxtFimVigencia;
	}

	public void setTextFimVigencia(JTextField textFimVigencia) {
		this.TxtFimVigencia = textFimVigencia;
	}
	
}
