package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Beakend.CadastroAlunos;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class FrontCadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField tfEnderecoRua;
	private JTextField tfEnderecoNumero;
	private JTextField tfEnderecoCep;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfIdade;
	private JTextField tfTelefone;
	private JTextField tfNomeMae;
	private JTextField tfNomePai;
	private JTextField tfCidade;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";
	private JTextField tfCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontCadastroAluno frame = new FrontCadastroAluno();
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
	public FrontCadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 683, 274);
		contentPane.add(contentPane_1);
//____________________________________________________________________________________________________________________________________________________________________________________________________		
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

		/**
		 * Fim Mascara.
		 */
//____________________________________________________________________________________________________________________________________________________________________________________________________		
		/**
		 * Começo JLabel.
		 */

		JLabel lblCadastroAluno = new JLabel("Cadastro Alunos ");
		lblCadastroAluno.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroAluno.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblCadastroAluno.setBounds(10, 11, 653, 32);
		contentPane_1.add(lblCadastroAluno);

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

		JLabel lblSenha_1_1 = new JLabel("Nome M\u00E3e:");
		lblSenha_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1.setBounds(390, 78, 53, 13);
		contentPane_1.add(lblSenha_1_1);

		JLabel lblSenha_1_1_1_1 = new JLabel("Nome Pai:");
		lblSenha_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1_1.setBounds(390, 102, 53, 13);
		contentPane_1.add(lblSenha_1_1_1_1);

		JLabel lblSenha_1_1_1_1_2 = new JLabel("Cidade:");
		lblSenha_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1_1_2.setBounds(390, 54, 53, 13);
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
		lblErro8.setBounds(349, 54, 29, 14);
		contentPane_1.add(lblErro8);

		JLabel lblErro9 = new JLabel("");
		lblErro9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro9.setBounds(349, 77, 29, 14);
		contentPane_1.add(lblErro9);

		JLabel lblErro10 = new JLabel("");
		lblErro10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro10.setBounds(349, 101, 31, 14);
		contentPane_1.add(lblErro10);

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

		JLabel lblMatricula = new JLabel("");
		lblMatricula.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMatricula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatricula.setBounds(390, 150, 273, 41);
		contentPane_1.add(lblMatricula);
		lblMatricula.setVisible(false);

		JLabel lblSenha_1_1_1_1_1 = new JLabel("Cpf:");
		lblSenha_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha_1_1_1_1_1.setBounds(390, 125, 53, 13);
		contentPane_1.add(lblSenha_1_1_1_1_1);

		JLabel lblErro11 = new JLabel("");
		lblErro11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErro11.setBounds(347, 125, 31, 14);
		contentPane_1.add(lblErro11);
		/**
		 * Fim JLabel.
		 */

//____________________________________________________________________________________________________________________________________________________________________________________________________		

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

		tfNomeMae = new JTextField();
		tfNomeMae.setColumns(10);
		tfNomeMae.setBounds(453, 74, 210, 20);
		contentPane_1.add(tfNomeMae);

		tfNomePai = new JTextField();
		tfNomePai.setColumns(10);
		tfNomePai.setBounds(453, 98, 210, 20);
		contentPane_1.add(tfNomePai);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(453, 50, 210, 20);
		contentPane_1.add(tfCidade);

		tfCpf = new JFormattedTextField(mCpf);
		tfCpf.setColumns(10);
		tfCpf.setBounds(453, 122, 210, 20);
		contentPane_1.add(tfCpf);

		/**
		 * Fim JTextField.
		 */

//____________________________________________________________________________________________________________________________________________________________________________________________________		

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
				lblSucesso.setVisible(false);
				lblErroCadastro.setVisible(false);
				int matricula = (int) (Math.random() * 10000000);

				lblMatricula.setText("Sua Matrícula é: " + Integer.toString(matricula));

				CadastroAlunos c = new CadastroAlunos();

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
					lblErro8.setText("X");
					lblErro8.setVisible(true);
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

				if (c.stringNoDigits(tfNomeMae.getText()) == false || tfNomeMae.getText().isEmpty()) {
					lblErro9.setText("X");
					lblErro9.setVisible(true);
					verifica++;
				}

				if (c.stringNoDigits(tfNomePai.getText()) == false || tfNomePai.getText().isEmpty()) {
					lblErro10.setText("X");
					lblErro10.setVisible(true);
					verifica++;
				}

				if (c.stringVerificaCpf(tfCpf.getText()) == false || tfCpf.getText().isEmpty()) {
					lblErro10.setText("X");
					lblErro10.setVisible(true);
					verifica++;
				}

				if (verifica == 0) {

					c.setTelefone(tfTelefone.getText().trim().replace("(", "").replace(")", "").replace("-", "")
							.replace("+", ""));
					c.setEmail(tfEmail.getText().trim().replace("  ", " "));
					c.setEnderecoCep(Integer.parseInt(tfEnderecoCep.getText().trim().replace("-", "")));
					c.setEnderecoCidade(tfCidade.getText().trim().replace("  ", " "));
					c.setEnderecoNumero(Integer.parseInt(tfEnderecoNumero.getText().trim()));
					c.setEnderecoRua(tfEnderecoRua.getText().trim().replace("  ", " "));
					c.setIdade(Integer.parseInt(tfIdade.getText().trim()));
					c.setMatricula(matricula);
					c.setNomeCompleto(tfNome.getText().trim().replace("  ", " "));
					c.setNomeMae(tfNomeMae.getText().trim().replace("  ", " "));
					c.setNomePai(tfNomePai.getText().trim().replace("  ", " "));
					c.setCpf(tfCpf.getText().trim().replace(".", "").replace("-", ""));

					if (c.cadastrarAluno(caminhoArquivo)) {

						lblSucesso.setVisible(true);
						lblMatricula.setVisible(true);

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

				MenuAluno exibir = new MenuAluno();
				exibir.setVisible(true);

				dispose();

			}
		});
		btnVoltar.setBounds(349, 240, 104, 23);
		contentPane_1.add(btnVoltar);

	}
}
