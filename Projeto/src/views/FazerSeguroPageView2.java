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

public class FazerSeguroPageView2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNmeroDaPlaca;
	private JTextField txtNmeroDoChassi;
	private JTextField txtModeloDoPlaca;
	private JTextField txtCorDoVeiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FazerSeguroPageView2 frame = new FazerSeguroPageView2();
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
	public FazerSeguroPageView2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(260, 78, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Veiculo");
		lblNewLabel_2_1.setForeground(new Color(191, 0, 0));
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
		panel_3.setBounds(240, 137, 534, 98);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 22, 46, 14);
		panel_3.add(lblNewLabel_2_1_1);
		
		txtNmeroDaPlaca = new JTextField();
		txtNmeroDaPlaca.setToolTipText("");
		txtNmeroDaPlaca.setText("Número da Placa");
		txtNmeroDaPlaca.setForeground(new Color(154, 154, 154));
		txtNmeroDaPlaca.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNmeroDaPlaca.setColumns(10);
		txtNmeroDaPlaca.setBackground(new Color(223, 223, 223));
		txtNmeroDaPlaca.setBounds(131, 41, 193, 31);
		panel_3.add(txtNmeroDaPlaca);
		
		txtNmeroDoChassi = new JTextField();
		txtNmeroDoChassi.setToolTipText("");
		txtNmeroDoChassi.setText("Número do Chassi");
		txtNmeroDoChassi.setForeground(new Color(154, 154, 154));
		txtNmeroDoChassi.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNmeroDoChassi.setColumns(10);
		txtNmeroDoChassi.setBackground(new Color(223, 223, 223));
		txtNmeroDoChassi.setBounds(331, 41, 193, 31);
		panel_3.add(txtNmeroDoChassi);
		
		JLabel lblNewLabel_2_1_2_3_1 = new JLabel("Chassi:");
		lblNewLabel_2_1_2_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_3_1.setBounds(331, 22, 46, 14);
		panel_3.add(lblNewLabel_2_1_2_3_1);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("Placa:");
		lblNewLabel_2_1_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_4.setBounds(131, 22, 46, 14);
		panel_3.add(lblNewLabel_2_1_2_4);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Placa e Chassi");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1.setBounds(240, 121, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(240, 279, 534, 76);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 11, 46, 14);
		panel_5.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_4_1 = new JLabel("Modelo:");
		lblNewLabel_2_1_2_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_4_1.setBounds(131, 11, 46, 14);
		panel_5.add(lblNewLabel_2_1_2_4_1);
		
		txtModeloDoPlaca = new JTextField();
		txtModeloDoPlaca.setToolTipText("");
		txtModeloDoPlaca.setText("Modelo do Veiculo");
		txtModeloDoPlaca.setForeground(new Color(154, 154, 154));
		txtModeloDoPlaca.setFont(new Font("Arial", Font.PLAIN, 12));
		txtModeloDoPlaca.setColumns(10);
		txtModeloDoPlaca.setBackground(new Color(223, 223, 223));
		txtModeloDoPlaca.setBounds(131, 30, 193, 31);
		panel_5.add(txtModeloDoPlaca);
		
		txtCorDoVeiculo = new JTextField();
		txtCorDoVeiculo.setToolTipText("");
		txtCorDoVeiculo.setText("Cor do Veiculo");
		txtCorDoVeiculo.setForeground(new Color(154, 154, 154));
		txtCorDoVeiculo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCorDoVeiculo.setColumns(10);
		txtCorDoVeiculo.setBackground(new Color(223, 223, 223));
		txtCorDoVeiculo.setBounds(331, 30, 193, 31);
		panel_5.add(txtCorDoVeiculo);
		
		JLabel lblNewLabel_2_1_2_3_1_1 = new JLabel("Cor:");
		lblNewLabel_2_1_2_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_3_1_1.setBounds(331, 11, 46, 14);
		panel_5.add(lblNewLabel_2_1_2_3_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Dados do Veiculo");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1_1.setBounds(240, 263, 111, 14);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5_1.setBounds(240, 402, 534, 76);
		contentPane.add(panel_5_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_1.setBounds(10, 11, 46, 14);
		panel_5_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Opcionais:");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1_1.setBounds(129, 11, 109, 14);
		panel_5_1.add(lblNewLabel_2_1_2_2_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_2 = new JLabel("Acessórios:");
		lblNewLabel_2_1_2_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1_2.setBounds(265, 11, 95, 14);
		panel_5_1.add(lblNewLabel_2_1_2_2_1_2);
		
		JLabel lblNewLabel_2_1_2_2_1_2_1 = new JLabel("Equipamento:");
		lblNewLabel_2_1_2_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_2_1_2_1.setBounds(398, 11, 95, 14);
		panel_5_1.add(lblNewLabel_2_1_2_2_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Teste1", "Teste2"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(398, 30, 109, 31);
		panel_5_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Teste1", "Teste2"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(129, 30, 109, 31);
		panel_5_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Teste1", "Teste2"}));
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(265, 30, 109, 31);
		panel_5_1.add(comboBox_2);
		
		JButton btnNewButton_1 = new JButton("CONTINUAR");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(434, 535, 119, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("Opcionais e Acessórios");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1_1_1_1.setBounds(240, 384, 135, 14);
		contentPane.add(lblNewLabel_2_2_1_1_1_1);
	}
}
