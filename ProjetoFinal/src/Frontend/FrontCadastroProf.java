package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Beakend.CadastroProfessores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontCadastroProf extends JFrame {

	private JPanel contentPane;
	private JTextField tfEnderecoRua;
	private JTextField tfEnderecoNumero;
	private JTextField tfEnderecoCep;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfIdade;
	private JTextField tfTelefone;
	private JTextField tfLogin;
	private JTextField tfSenha;
	private JTextField tfAgencia;
	private JTextField tfConta;
	private JTextField tfCpf;
	private JTextField tfMateria;
	private JTextField tfCidade;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontCadastroProf frame = new FrontCadastroProf();
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
	public FrontCadastroProf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
//______________________________________________________________________________________________________________________________________________________________________

		/**
		 * Começo Mascara.
		 */

		MaskFormatter mCpf;
		try {

			mCpf = new MaskFormatter("###.###.###-##");

		} catch (Exception e) {
			mCpf = null;
		}

		MaskFormatter mCep;
		try {

			mCep = new MaskFormatter("#####-###");

		} catch (Exception e) {
			mCep = null;
		}

		MaskFormatter mIdade;
		try {

			mIdade = new MaskFormatter("##");

		} catch (Exception e) {
			mIdade = null;
		}

		MaskFormatter mTelefone;
		try {

			mTelefone = new MaskFormatter("+##(##)#####-####");

		} catch (Exception e) {
			mTelefone = null;
		}

		MaskFormatter mAgencia;
		try {

			mAgencia = new MaskFormatter("####");

		} catch (Exception e) {
			mAgencia = null;
		}

		MaskFormatter mConta;
		try {

			mConta = new MaskFormatter("#####-#");

		} catch (Exception e) {
			mConta = null;
		}

		/**
		 * Final Mascara.
		 */

//______________________________________________________________________________________________________________________________________________________________________

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 683, 274);
		contentPane.add(contentPane_1);
//______________________________________________________________________________________________________________________________________________________________________
		/**
		 * Começo JLabel.
		 */

		JLabel lblCadastroProfessor = new JLabel("Cadastro Professores ");
		lblCadastroProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroProfessor.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblCadastroProfessor.setBounds(10, 11, 653, 32);
		contentPane_1.add(lblCadastroProfessor);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNome.setBounds(10, 54, 53, 13);
		contentPane_1.add(lblNome);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEmail.setBounds(10, 78, 53, 13);
		contentPane_1.add(lblEmail);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdade.setFont(new Font("Arial", Font.PLAIN, 11));
		lblIdade.setBounds(10, 102, 53, 13);
		contentPane_1.add(lblIdade);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTelefone.setBounds(10, 126, 53, 13);
		contentPane_1.add(lblTelefone);

		JLabel lblEndereco = new JLabel("Rua:");
		lblEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEndereco.setBounds(10, 150, 53, 13);
		contentPane_1.add(lblEndereco);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumero.setBounds(10, 174, 53, 13);
		contentPane_1.add(lblNumero);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.LEFT);
		lblCep.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCep.setBounds(10, 198, 29, 13);
		contentPane_1.add(lblCep);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLogin.setBounds(405, 54, 53, 13);
		contentPane_1.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha.setBounds(405, 78, 53, 13);
		contentPane_1.add(lblSenha);

		JLabel lblConta = new JLabel("Ag\u00EAncia:");
		lblConta.setHorizontalAlignment(SwingConstants.LEFT);
		lblConta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblConta.setBounds(405, 102, 53, 13);
		contentPane_1.add(lblConta);

		JLabel lblSenha_1_1 = new JLabel("Nr Conta:");
		lblSenha_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1.setBounds(405, 126, 53, 13);
		contentPane_1.add(lblSenha_1_1);

		JLabel lblSenha_1_1_1 = new JLabel("Cpf:");
		lblSenha_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1.setBounds(405, 150, 38, 13);
		contentPane_1.add(lblSenha_1_1_1);

		JLabel lblSenha_1_1_1_1 = new JLabel("Mat\u00E9ria:");
		lblSenha_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1_1.setBounds(405, 174, 53, 13);
		contentPane_1.add(lblSenha_1_1_1_1);

		JLabel lblSenha_1_1_1_1_2 = new JLabel("Cidade:");
		lblSenha_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1_1_2.setBounds(405, 198, 53, 13);
		contentPane_1.add(lblSenha_1_1_1_1_2);

		JLabel lblErro1 = new JLabel("");
		lblErro1.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro1.setBounds(286, 53, 46, 14);
		contentPane_1.add(lblErro1);

		JLabel lblErro2 = new JLabel("");
		lblErro2.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro2.setBounds(286, 77, 46, 14);
		contentPane_1.add(lblErro2);

		JLabel lblErro3 = new JLabel("");
		lblErro3.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro3.setBounds(286, 101, 46, 14);
		contentPane_1.add(lblErro3);

		JLabel lblErro4 = new JLabel("");
		lblErro4.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro4.setBounds(286, 125, 46, 14);
		contentPane_1.add(lblErro4);

		JLabel lblErro5 = new JLabel("");
		lblErro5.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro5.setBounds(286, 149, 46, 14);
		contentPane_1.add(lblErro5);

		JLabel lblErro6 = new JLabel("");
		lblErro6.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro6.setBounds(286, 173, 46, 14);
		contentPane_1.add(lblErro6);

		JLabel lblErro7 = new JLabel("");
		lblErro7.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro7.setBounds(286, 197, 46, 14);
		contentPane_1.add(lblErro7);

		JLabel lblErro8 = new JLabel("");
		lblErro8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro8.setBounds(349, 54, 46, 14);
		contentPane_1.add(lblErro8);

		JLabel lblErro9 = new JLabel("");
		lblErro9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro9.setBounds(349, 77, 46, 14);
		contentPane_1.add(lblErro9);

		JLabel lblErro10 = new JLabel("");
		lblErro10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro10.setBounds(349, 101, 46, 14);
		contentPane_1.add(lblErro10);

		JLabel lblErro11 = new JLabel("");
		lblErro11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro11.setBounds(349, 125, 46, 14);
		contentPane_1.add(lblErro11);

		JLabel lblErro12 = new JLabel("");
		lblErro12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro12.setBounds(349, 149, 46, 14);
		contentPane_1.add(lblErro12);

		JLabel lblErro13 = new JLabel("");
		lblErro13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro13.setBounds(349, 173, 46, 14);
		contentPane_1.add(lblErro13);

		JLabel lblErro14 = new JLabel("");
		lblErro14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro14.setBounds(349, 197, 46, 14);
		contentPane_1.add(lblErro14);

		JLabel lblSucesso = new JLabel("Cadastro Realizado Com Sucesso!");
		lblSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblSucesso.setBounds(10, 225, 210, 38);
		contentPane_1.add(lblSucesso);
		lblSucesso.setVisible(false);

		JLabel lblErroCadastro = new JLabel("N\u00E3o foi possivel realizar o cadastro!");
		lblErroCadastro.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblErroCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErroCadastro.setBounds(463, 222, 200, 41);
		contentPane_1.add(lblErroCadastro);
		lblErroCadastro.setVisible(false);
		/**
		 * Final JLabel.
		 */
//______________________________________________________________________________________________________________________________________________________________________

		/**
		 * Começo JTextField.
		 */

		tfEnderecoRua = new JTextField();
		tfEnderecoRua.setBounds(66, 146, 210, 20);
		contentPane_1.add(tfEnderecoRua);
		tfEnderecoRua.setColumns(10);

		tfEnderecoNumero = new JTextField();
		tfEnderecoNumero.setColumns(10);
		tfEnderecoNumero.setBounds(66, 170, 210, 20);
		contentPane_1.add(tfEnderecoNumero);

		tfEnderecoCep = new JFormattedTextField(mCep);
		tfEnderecoCep.setColumns(10);
		tfEnderecoCep.setBounds(66, 194, 210, 20);
		contentPane_1.add(tfEnderecoCep);

		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(66, 50, 210, 20);
		contentPane_1.add(tfNome);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(66, 74, 210, 20);
		contentPane_1.add(tfEmail);

		tfIdade = new JFormattedTextField(mIdade);
		tfIdade.setColumns(10);
		tfIdade.setBounds(66, 98, 210, 20);
		contentPane_1.add(tfIdade);

		tfTelefone = new JFormattedTextField(mTelefone);
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(66, 122, 210, 20);
		contentPane_1.add(tfTelefone);

		tfLogin = new JTextField();
		tfLogin.setColumns(10);
		tfLogin.setBounds(453, 50, 210, 20);
		contentPane_1.add(tfLogin);

		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBounds(453, 74, 210, 20);
		contentPane_1.add(tfSenha);

		tfAgencia = new JFormattedTextField(mAgencia);
		tfAgencia.setColumns(10);
		tfAgencia.setBounds(453, 98, 210, 20);
		contentPane_1.add(tfAgencia);

		tfConta = new JFormattedTextField(mConta);
		tfConta.setColumns(10);
		tfConta.setBounds(453, 122, 210, 20);
		contentPane_1.add(tfConta);

		tfCpf = new JFormattedTextField(mCpf);
		tfCpf.setColumns(10);
		tfCpf.setBounds(453, 146, 210, 20);
		contentPane_1.add(tfCpf);

		tfMateria = new JFormattedTextField();
		tfMateria.setColumns(10);
		tfMateria.setBounds(453, 170, 210, 20);
		contentPane_1.add(tfMateria);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(453, 194, 210, 20);
		contentPane_1.add(tfCidade);

		/**
		 * Final JTextField.
		 */
//______________________________________________________________________________________________________________________________________________________________________
		/**
		 * Começo JButton.
		 */
		JButton btnAvancar2 = new JButton("Avan\u00E7ar");
		btnAvancar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int verifica = 0;
				lblErro1.setVisible(false);
				lblErro2.setVisible(false);
				lblErro3.setVisible(false);
				lblErro4.setVisible(false);
				lblErro5.setVisible(false);
				lblErro6.setVisible(false);
				lblErro7.setVisible(false);
				lblErro8.setVisible(false);
				lblErro9.setVisible(false);
				lblErro10.setVisible(false);
				lblErro11.setVisible(false);
				lblErro12.setVisible(false);
				lblErro13.setVisible(false);
				lblErro14.setVisible(false);
				lblSucesso.setVisible(false);
				lblErroCadastro.setVisible(false);

				CadastroProfessores c = new CadastroProfessores();

				if (c.stringNoDigits(tfNome.getText()) == false || tfNome.getText().isEmpty()) {
					lblErro1.setText("X");
					lblErro1.setVisible(true);
					verifica++;
				}

				if (tfEmail.getText().isEmpty() || c.stringVerificaEmail(tfEmail.getText()) == false) {
					lblErro2.setText("X");
					lblErro2.setVisible(true);
					verifica++;
				}

				if (tfIdade.getText().isEmpty() || tfIdade.getText().length() > 2
						|| c.stringOnlyDigits(tfIdade.getText()) == false) {
					lblErro3.setText("X");
					lblErro3.setVisible(true);
					verifica++;
				}

				if (tfTelefone.getText().isEmpty() || c.stringVerificaTelefone(tfTelefone.getText()) == false) {
					lblErro4.setText("X");
					lblErro4.setVisible(true);
					verifica++;
				}

				if (c.stringNoDigits(tfCidade.getText()) == false || tfCidade.getText().isEmpty()
						|| tfCidade.getText().length() > 20) {
					lblErro14.setText("X");
					lblErro14.setVisible(true);
					verifica++;
				}

				if (tfEnderecoRua.getText().isEmpty()) {
					lblErro5.setText("X");
					lblErro5.setVisible(true);
					verifica++;
				}

				if (tfEnderecoNumero.getText().isEmpty() || tfEnderecoNumero.getText().length() > 7
						|| c.stringOnlyDigits(tfEnderecoNumero.getText()) == false) {
					lblErro6.setText("X");
					lblErro6.setVisible(true);
					verifica++;
				}

				if (tfEnderecoCep.getText().isEmpty() || c.stringVerificaCep(tfEnderecoCep.getText()) == false) {
					lblErro7.setText("X");
					lblErro7.setVisible(true);
					verifica++;
				}

				if (tfLogin.getText().isEmpty() || tfLogin.getText().length() > 25) {
					lblErro8.setText("X");
					lblErro8.setVisible(true);
					verifica++;
				}

				if (tfSenha.getText().isEmpty() || tfSenha.getText().length() > 25) {
					lblErro9.setText("X");
					lblErro9.setVisible(true);
					verifica++;
				}

				if (c.stringOnlyDigits(tfAgencia.getText()) == false || tfAgencia.getText().length() > 4
						|| tfAgencia.getText().isEmpty()) {
					lblErro10.setText("X");
					lblErro10.setVisible(true);
					verifica++;
				}

				if (c.stringVerificaConta(tfConta.getText()) == false || tfConta.getText().isEmpty()) {
					lblErro11.setText("X");
					lblErro11.setVisible(true);
					verifica++;
				}

				if (c.stringVerificaCpf(tfCpf.getText()) == false || tfCpf.getText().isEmpty()) {
					lblErro12.setText("X");
					lblErro12.setVisible(true);
					verifica++;
				}

				if (c.stringNoDigits(tfMateria.getText()) == false || tfMateria.getText().isEmpty()
						|| tfMateria.getText().length() > 30) {
					lblErro13.setText("X");
					lblErro13.setVisible(true);
					verifica++;
				}

				if (verifica == 0) {

					if (c.cadastrarProfessor(tfNome.getText().trim().replace("  ", " "), tfEmail.getText().trim(),
							Integer.parseInt(tfIdade.getText().trim()),
							tfTelefone.getText().trim().replace("(", "").replace(")", "").replace("-", "").replace("+",
									""),
							tfCidade.getText().replace("  ", " ").trim(),
							tfEnderecoRua.getText().replace("  ", " ").trim(),
							Integer.parseInt(tfEnderecoNumero.getText().trim()),
							Integer.parseInt(tfEnderecoCep.getText().trim().replace("-", "")), tfLogin.getText().trim(),
							tfSenha.getText().trim(), tfAgencia.getText().trim(),
							tfConta.getText().replace("-", "").trim(),
							tfCpf.getText().trim().replace(".", "").replace("-", ""),
							tfMateria.getText().replace("  ", " ").trim(), caminhoArquivo) == true) {

						lblSucesso.setVisible(true);

					} else {

						lblErroCadastro.setVisible(true);

					}

				}
			}
		});

		btnAvancar2.setBounds(238, 240, 101, 23);
		contentPane_1.add(btnAvancar2);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				IntranetProf exibir = new IntranetProf();
				exibir.setVisible(true);

				dispose();

			}
		});
		btnVoltar.setBounds(349, 240, 104, 23);
		contentPane_1.add(btnVoltar);

	}

}