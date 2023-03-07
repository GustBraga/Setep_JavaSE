package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beakend.CadastroAlunos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class FrontRequerimento extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfMotivo;
	private JTextField tfProtocolo;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontRequerimento frame = new FrontRequerimento();
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
	public FrontRequerimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRequerimento = new JLabel("Abrir Requerimento");
		lblRequerimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequerimento.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblRequerimento.setBounds(10, 11, 457, 48);
		contentPane.add(lblRequerimento);

		JLabel lblNome = new JLabel("Nome Aluno:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNome.setBounds(10, 86, 78, 14);
		contentPane.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(168, 80, 256, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblMotivo = new JLabel("Motivo do Requerimento: ");
		lblMotivo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotivo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMotivo.setBounds(10, 117, 148, 14);
		contentPane.add(lblMotivo);

		tfMotivo = new JTextField();
		tfMotivo.setBounds(168, 111, 256, 20);
		contentPane.add(tfMotivo);
		tfMotivo.setColumns(10);

		JLabel lblProtocolo = new JLabel("Seu Protocolo \u00E9:");
		lblProtocolo.setHorizontalAlignment(SwingConstants.LEFT);
		lblProtocolo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblProtocolo.setBounds(10, 148, 136, 14);
		contentPane.add(lblProtocolo);

		tfProtocolo = new JTextField();
		tfProtocolo.setEditable(false);
		tfProtocolo.setColumns(10);
		tfProtocolo.setBounds(168, 142, 256, 20);
		contentPane.add(tfProtocolo);

		JLabel lblTextoRequerimento = new JLabel("Monte seu Requerimento:");
		lblTextoRequerimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblTextoRequerimento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTextoRequerimento.setBounds(10, 173, 148, 14);
		contentPane.add(lblTextoRequerimento);

		JTextArea tfTextoRequerimento = new JTextArea();
		tfTextoRequerimento.setBounds(10, 191, 457, 71);
		contentPane.add(tfTextoRequerimento);

		JLabel lblErro1 = new JLabel("X");
		lblErro1.setBounds(434, 86, 33, 14);
		contentPane.add(lblErro1);
		lblErro1.setVisible(false);

		JLabel lblErro2 = new JLabel("X");
		lblErro2.setBounds(434, 117, 33, 14);
		contentPane.add(lblErro2);
		lblErro2.setVisible(false);

		JLabel lblSucesso = new JLabel("Reequerimento Cadastrado com Sucesso!");
		lblSucesso.setBounds(10, 273, 243, 15);
		contentPane.add(lblSucesso);
		lblSucesso.setVisible(false);

		JLabel lblErroCad = new JLabel("Erro ao Cadastrar seu Requerimento!");
		lblErroCad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblErroCad.setBounds(263, 273, 204, 15);
		contentPane.add(lblErroCad);
		lblErroCad.setVisible(false);

		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblSucesso.setVisible(false);
				lblErroCad.setVisible(false);
				lblErro1.setVisible(false);
				lblErro2.setVisible(false);
				int verifica = 0;
				int protocolo = (int) (Math.random() * 10000000);

				CadastroAlunos c = new CadastroAlunos();

				if (tfNome.getText().isEmpty() || c.stringSoLetrasNome(tfNome.getText())) {

					lblErro1.setVisible(true);
					verifica++;
				}
				if (tfMotivo.getText().isEmpty() || tfMotivo.getText().length() > 100) {

					lblErro2.setVisible(true);
					verifica++;
				}

				if (verifica == 0) {

					if (c.abrirRequerimento(tfNome.getText().trim(), protocolo, tfMotivo.getText().trim(),
							tfTextoRequerimento.getText().trim(), caminhoArquivo)) {

						tfProtocolo.setText("Seu Protocolo é: " + Integer.toString(protocolo));
						lblSucesso.setVisible(true);

					} else {
						lblErroCad.setVisible(true);
					}

				}

			}
		});
		btnAvancar.setBounds(57, 299, 89, 23);
		contentPane.add(btnAvancar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuAluno exibir = new MenuAluno();
				exibir.setVisible(true);

				dispose();
			}
		});
		btnVoltar.setBounds(335, 299, 89, 23);
		contentPane.add(btnVoltar);

	}
}
