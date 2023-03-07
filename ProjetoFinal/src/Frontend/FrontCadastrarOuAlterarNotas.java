package Frontend;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Beakend.CadastroProfessores;

public class FrontCadastrarOuAlterarNotas extends JFrame {

	private JPanel contentPane;
	private JTextField tfCadNome;
	private JTextField tfCadNota;
	private JTextField tfCadMateria;
	private JTextField tfAlteraNome;
	private JTextField tfAlteraNota;
	private JTextField tfAlteraMateria;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontCadastrarOuAlterarNotas frame = new FrontCadastrarOuAlterarNotas();
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
	public FrontCadastrarOuAlterarNotas() {
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

		JPanel jframeAlteraNotas = new JPanel();
		jframeAlteraNotas.setBounds(330, 86, 287, 209);
		contentPane.add(jframeAlteraNotas);
		jframeAlteraNotas.setLayout(null);
		jframeAlteraNotas.setVisible(false);
		
		JPanel jframeCadastroNotas = new JPanel();
		jframeCadastroNotas.setBounds(10, 86, 287, 209);
		contentPane.add(jframeCadastroNotas);
		jframeCadastroNotas.setLayout(null);
		jframeCadastroNotas.setVisible(false);

//________________________________________________________________________________________________________________________________________________________________________________
	
		/**
		 * Começo JLabel.
		 */
		
		JLabel lblPlataformaDeNotas = new JLabel("Plataforma de Notas");
		lblPlataformaDeNotas.setBounds(10, 11, 607, 32);
		lblPlataformaDeNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlataformaDeNotas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(lblPlataformaDeNotas);
		
		JLabel lblNewLabel_4 = new JLabel("Altera\u00E7\u00E3o de Notas");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 11, 267, 27);
		jframeAlteraNotas.add(lblNewLabel_4);

		JLabel lblNewLabel_1_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1_1.setBounds(10, 49, 89, 14);
		jframeAlteraNotas.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Nova Nota:");
		lblNewLabel_2_1.setBounds(10, 74, 89, 14);
		jframeAlteraNotas.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3_1.setBounds(10, 99, 89, 14);
		jframeAlteraNotas.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Notas");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 267, 27);
		jframeCadastroNotas.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1.setBounds(10, 49, 86, 14);
		jframeCadastroNotas.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota:");
		lblNewLabel_2.setBounds(10, 74, 86, 14);
		jframeCadastroNotas.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3.setBounds(10, 96, 86, 14);
		jframeCadastroNotas.add(lblNewLabel_3);
		
		JLabel lblErro1 = new JLabel("");
		lblErro1.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro1.setBounds(255, 49, 22, 14);
		jframeCadastroNotas.add(lblErro1);

		JLabel lblErro2 = new JLabel("");
		lblErro2.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro2.setBounds(255, 74, 22, 14);
		jframeCadastroNotas.add(lblErro2);

		JLabel lblErro3 = new JLabel("");
		lblErro3.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro3.setBounds(255, 96, 22, 14);
		jframeCadastroNotas.add(lblErro3);

		JLabel lblErro4 = new JLabel("");
		lblErro4.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro4.setBounds(251, 49, 26, 14);
		jframeAlteraNotas.add(lblErro4);

		JLabel lblErro5 = new JLabel("");
		lblErro5.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro5.setBounds(251, 74, 26, 14);
		jframeAlteraNotas.add(lblErro5);

		JLabel lblErro6 = new JLabel("");
		lblErro6.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro6.setBounds(251, 99, 26, 14);
		jframeAlteraNotas.add(lblErro6);

		JLabel lblCadSucesso = new JLabel("Nota Cadastrada com Sucesso!");
		lblCadSucesso.setBounds(186, 131, 267, 46);
		contentPane.add(lblCadSucesso);
		lblCadSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCadSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadSucesso.setVisible(false);

		JLabel lblAlteraSucesso = new JLabel("Nota Alterada Com Sucesso!");
		lblAlteraSucesso.setBounds(196, 200, 267, 40);
		contentPane.add(lblAlteraSucesso);
		lblAlteraSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlteraSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblAlteraSucesso.setVisible(false);

		JLabel lblErroAlteraNota = new JLabel("Nome e/ou Mat\u00E9ria n\u00E3o Cadastrados!");
		lblErroAlteraNota.setFont(new Font("Arial", Font.PLAIN, 13));
		lblErroAlteraNota.setHorizontalAlignment(SwingConstants.CENTER);
		lblErroAlteraNota.setBounds(20, 132, 257, 32);
		jframeAlteraNotas.add(lblErroAlteraNota);
		lblErroAlteraNota.setVisible(false);
		
		/**
		 * Fim JLabel.
		 */

//________________________________________________________________________________________________________________________________________________________________________________
		
		/**
		 * Começo JTexteField.
		 */

		tfAlteraNome = new JTextField();
		tfAlteraNome.setColumns(10);
		tfAlteraNome.setBounds(127, 46, 114, 20);
		jframeAlteraNotas.add(tfAlteraNome);

		tfAlteraNota = new JTextField();
		tfAlteraNota.setColumns(10);
		tfAlteraNota.setBounds(127, 71, 114, 20);
		jframeAlteraNotas.add(tfAlteraNota);

		tfAlteraMateria = new JTextField();
		tfAlteraMateria.setColumns(10);
		tfAlteraMateria.setBounds(127, 96, 114, 20);
		jframeAlteraNotas.add(tfAlteraMateria);
		
		tfCadNome = new JTextField();
		tfCadNome.setBounds(106, 49, 114, 20);
		jframeCadastroNotas.add(tfCadNome);
		tfCadNome.setColumns(10);

		tfCadNota = new JTextField();
		tfCadNota.setColumns(10);
		tfCadNota.setBounds(106, 71, 114, 20);
		jframeCadastroNotas.add(tfCadNota);

		tfCadMateria = new JTextField();
		tfCadMateria.setColumns(10);
		tfCadMateria.setBounds(106, 93, 114, 20);
		jframeCadastroNotas.add(tfCadMateria);
		
		/**
		 * Fim JTexteField.
		 */
		
//________________________________________________________________________________________________________________________________________________________________________________
	
		/**
		 * Começo JButton.
		 */

		JButton btnCadastroNotas = new JButton("Cadastrar Notas");
		btnCadastroNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeCadastroNotas.setVisible(true);
				jframeAlteraNotas.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

			}
		});
		btnCadastroNotas.setBounds(0, 11, 287, 23);
		panel.add(btnCadastroNotas);

		JButton btnAlterarNotas = new JButton("Alterar Notas");
		btnAlterarNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeAlteraNotas.setVisible(true);
				jframeCadastroNotas.setVisible(false);
				lblCadSucesso.setVisible(false);
				lblAlteraSucesso.setVisible(false);

			}
		});
		btnAlterarNotas.setBounds(319, 11, 288, 23);
		panel.add(btnAlterarNotas);

		JButton btnCadastraNota = new JButton("Avan\u00E7ar");
		btnCadastraNota.addActionListener(new ActionListener() {
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

				if (c.verificaStringNotaQuebrada(tfCadNota.getText()) == false || tfCadNota.getText().isEmpty()) {

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

					if (c.cadastrarNotas(tfCadNome.getText().trim().replace("  ", " "), tfCadNota.getText().trim(),
							tfCadMateria.getText().trim().replace("  ", " "), caminhoArquivo) == true) {

						lblCadSucesso.setVisible(true);

						jframeCadastroNotas.setVisible(false);

					}

				}

			}
		});
		btnCadastraNota.setBounds(106, 175, 89, 23);
		jframeCadastroNotas.add(btnCadastraNota);

		JButton btnAlteraNota = new JButton("Avan\u00E7ar");
		btnAlteraNota.addActionListener(new ActionListener() {
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

				if (c.verificaStringNotaQuebrada(tfAlteraNota.getText()) == false || tfAlteraNota.getText().isEmpty()) {

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

					if (c.alterarNotas(tfAlteraNome.getText().trim().replace("  ", " "),
							tfAlteraMateria.getText().trim().replace("  ", " "), tfAlteraNota.getText().trim(),
							caminhoArquivo) == true) {

						lblAlteraSucesso.setVisible(true);

						jframeAlteraNotas.setVisible(false);

					} else {

						lblErroAlteraNota.setVisible(true);

					}

				}
			}
		});
		btnAlteraNota.setBounds(106, 175, 89, 23);
		jframeAlteraNotas.add(btnAlteraNota);

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
