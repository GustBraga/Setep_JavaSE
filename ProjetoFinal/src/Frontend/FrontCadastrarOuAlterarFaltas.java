package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beakend.CadastroProfessores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontCadastrarOuAlterarFaltas extends JFrame {

	private JPanel contentPane;
	private JTextField tfCadNome;
	private JTextField tfCadFalta;
	private JTextField tfCadMateria;
	private JTextField tfAlteraNome;
	private JTextField tfAlteraFalta;
	private JTextField tfAlteraMateria;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontCadastrarOuAlterarFaltas frame = new FrontCadastrarOuAlterarFaltas();
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
	public FrontCadastrarOuAlterarFaltas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 607, 32);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel jframeAlteraFaltas = new JPanel();
		jframeAlteraFaltas.setBounds(330, 86, 287, 209);
		contentPane.add(jframeAlteraFaltas);
		jframeAlteraFaltas.setLayout(null);
		jframeAlteraFaltas.setVisible(false);
		
		JPanel jframeCadastroFaltas = new JPanel();
		jframeCadastroFaltas.setBounds(10, 86, 287, 209);
		contentPane.add(jframeCadastroFaltas);
		jframeCadastroFaltas.setLayout(null);
		jframeCadastroFaltas.setVisible(false);


//________________________________________________________________________________________________________________________________________________________________________________

		/**
		 * Começo JLabel.
		 */
		
		JLabel lblPlataformaDeFaltas = new JLabel("Plataforma de Faltas");
		lblPlataformaDeFaltas.setBounds(10, 11, 607, 32);
		lblPlataformaDeFaltas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlataformaDeFaltas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(lblPlataformaDeFaltas);

		JLabel lblNewLabel_4 = new JLabel("Altera\u00E7\u00E3o de Faltas");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 11, 267, 27);
		jframeAlteraFaltas.add(lblNewLabel_4);

		JLabel lblNewLabel_1_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1_1.setBounds(10, 49, 89, 14);
		jframeAlteraFaltas.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Nova Falta:");
		lblNewLabel_2_1.setBounds(10, 74, 89, 14);
		jframeAlteraFaltas.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3_1.setBounds(10, 99, 89, 14);
		jframeAlteraFaltas.add(lblNewLabel_3_1);

		JLabel lblNewLabel = new JLabel("Cadastro de Faltas");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 267, 27);
		jframeCadastroFaltas.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1.setBounds(10, 49, 86, 14);
		jframeCadastroFaltas.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Falta:");
		lblNewLabel_2.setBounds(10, 74, 86, 14);
		jframeCadastroFaltas.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3.setBounds(10, 96, 86, 14);
		jframeCadastroFaltas.add(lblNewLabel_3);
		
		JLabel lblErro1 = new JLabel("");
		lblErro1.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro1.setBounds(255, 49, 22, 14);
		jframeCadastroFaltas.add(lblErro1);

		JLabel lblErro2 = new JLabel("");
		lblErro2.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro2.setBounds(255, 74, 22, 14);
		jframeCadastroFaltas.add(lblErro2);

		JLabel lblErro3 = new JLabel("");
		lblErro3.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro3.setBounds(255, 96, 22, 14);
		jframeCadastroFaltas.add(lblErro3);

		JLabel lblErro4 = new JLabel("");
		lblErro4.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro4.setBounds(251, 49, 26, 14);
		jframeAlteraFaltas.add(lblErro4);

		JLabel lblErro5 = new JLabel("");
		lblErro5.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro5.setBounds(251, 74, 26, 14);
		jframeAlteraFaltas.add(lblErro5);

		JLabel lblErro6 = new JLabel("");
		lblErro6.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro6.setBounds(251, 99, 26, 14);
		jframeAlteraFaltas.add(lblErro6);

		JLabel lblCadSucesso = new JLabel("Falta Cadastrada com Sucesso!");
		lblCadSucesso.setBounds(186, 131, 267, 46);
		contentPane.add(lblCadSucesso);
		lblCadSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCadSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadSucesso.setVisible(false);

		JLabel lblAlteraSucesso = new JLabel("Falta Alterada Com Sucesso!");
		lblAlteraSucesso.setBounds(196, 200, 267, 40);
		contentPane.add(lblAlteraSucesso);
		lblAlteraSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlteraSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblAlteraSucesso.setVisible(false);

		JLabel lblErroAlteraFalta = new JLabel("Nome e/ou Mat\u00E9ria n\u00E3o Cadastrados!");
		lblErroAlteraFalta.setFont(new Font("Arial", Font.PLAIN, 13));
		lblErroAlteraFalta.setHorizontalAlignment(SwingConstants.CENTER);
		lblErroAlteraFalta.setBounds(20, 132, 257, 32);
		jframeAlteraFaltas.add(lblErroAlteraFalta);
		lblErroAlteraFalta.setVisible(false);
		
		/**
		 * Fim JLabel.
		 */
		
//________________________________________________________________________________________________________________________________________________________________________________
		
		/**
		 * Começo JTextField.
		 */
		
		tfAlteraNome = new JTextField();
		tfAlteraNome.setColumns(10);
		tfAlteraNome.setBounds(127, 46, 114, 20);
		jframeAlteraFaltas.add(tfAlteraNome);

		tfAlteraFalta = new JTextField();
		tfAlteraFalta.setColumns(10);
		tfAlteraFalta.setBounds(127, 71, 114, 20);
		jframeAlteraFaltas.add(tfAlteraFalta);

		tfAlteraMateria = new JTextField();
		tfAlteraMateria.setColumns(10);
		tfAlteraMateria.setBounds(127, 96, 114, 20);
		jframeAlteraFaltas.add(tfAlteraMateria);
		
		tfCadNome = new JTextField();
		tfCadNome.setBounds(106, 49, 114, 20);
		jframeCadastroFaltas.add(tfCadNome);
		tfCadNome.setColumns(10);

		tfCadFalta = new JTextField();
		tfCadFalta.setColumns(10);
		tfCadFalta.setBounds(106, 71, 114, 20);
		jframeCadastroFaltas.add(tfCadFalta);

		tfCadMateria = new JTextField();
		tfCadMateria.setColumns(10);
		tfCadMateria.setBounds(106, 93, 114, 20);
		jframeCadastroFaltas.add(tfCadMateria);

		/**
		 * Fim JTextField.
		 */
		
//________________________________________________________________________________________________________________________________________________________________________________
		
		/**
		 * Começo JButton.
		 */

		JButton btnCadastroFaltas = new JButton("Cadastrar Faltas");
		btnCadastroFaltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeCadastroFaltas.setVisible(true);
				jframeAlteraFaltas.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

			}
		});
		btnCadastroFaltas.setBounds(0, 11, 287, 23);
		panel.add(btnCadastroFaltas);

		JButton btnAlterarFaltas = new JButton("Alterar Faltas");
		btnAlterarFaltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeAlteraFaltas.setVisible(true);
				jframeCadastroFaltas.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

			}
		});
		btnAlterarFaltas.setBounds(319, 11, 288, 23);
		panel.add(btnAlterarFaltas);

		JButton btnCadastraFalta = new JButton("Avan\u00E7ar");
		btnCadastraFalta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProfessores c = new CadastroProfessores();

				int verifica = 0;
				lblErro1.setVisible(false);
				lblErro2.setVisible(false);
				lblErro3.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

				if (c.stringNoDigits(tfCadNome.getText()) == false || tfCadNome.getText().isEmpty()) {

					lblErro1.setText("X");
					lblErro1.setVisible(true);
					verifica++;

				}

				if (c.stringVerificaFalta(tfCadFalta.getText()) == false || tfCadFalta.getText().isEmpty()) {

					lblErro2.setText("X");
					lblErro2.setVisible(true);
					verifica++;

				}

				if (c.stringNoDigits(tfCadMateria.getText()) == false || tfCadMateria.getText().length() > 30
						|| tfCadMateria.getText().isEmpty()) {

					lblErro3.setText("X");
					lblErro3.setVisible(true);
					verifica++;

				}
				if (verifica == 0) {

					if (c.cadastrarFaltas(tfCadNome.getText().trim().replace("  ", " "), tfCadFalta.getText().trim(),
							tfCadMateria.getText().trim().replace("  ", " "), caminhoArquivo) == true) {

						lblCadSucesso.setVisible(true);

						jframeCadastroFaltas.setVisible(false);

					}

				}

			}
		});
		btnCadastraFalta.setBounds(106, 175, 89, 23);
		jframeCadastroFaltas.add(btnCadastraFalta);

		JButton btnAlteraFalta = new JButton("Avan\u00E7ar");
		btnAlteraFalta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProfessores c = new CadastroProfessores();

				int verifica = 0;
				lblErro4.setVisible(false);
				lblErro5.setVisible(false);
				lblErro6.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

				if (c.stringNoDigits(tfAlteraNome.getText()) == false || tfAlteraNome.getText().isEmpty()) {

					lblErro4.setText("X");
					lblErro4.setVisible(true);
					verifica++;

				}

				if (c.stringVerificaFalta(tfAlteraFalta.getText()) == false || tfAlteraFalta.getText().isEmpty()) {

					lblErro5.setText("X");
					lblErro5.setVisible(true);
					verifica++;

				}

				if (c.stringNoDigits(tfAlteraMateria.getText()) == false || tfAlteraMateria.getText().length() > 30
						|| tfAlteraMateria.getText().isEmpty()) {

					lblErro6.setText("X");
					lblErro6.setVisible(true);
					verifica++;

				}
				if (verifica == 0) {

					if (c.alterarFaltas(tfAlteraNome.getText().trim().replace("  ", " "), tfAlteraMateria.getText().trim().replace("  ", " "), tfAlteraFalta.getText().trim(),
							caminhoArquivo) == true) {

						lblAlteraSucesso.setVisible(true);

						jframeAlteraFaltas.setVisible(false);

					} else {

						lblErroAlteraFalta.setVisible(true);

					}

				}
			}
		});
		btnAlteraFalta.setBounds(106, 175, 89, 23);
		jframeAlteraFaltas.add(btnAlteraFalta);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				IntranetProf exibir = new IntranetProf();
				exibir.setVisible(true);

				dispose();

			}
		});
		btnVoltar.setBounds(267, 322, 89, 23);
		contentPane.add(btnVoltar);

	}
}
