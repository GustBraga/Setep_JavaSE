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

import Beakend.CadastroAlunos;

public class FrontVisualizar extends JFrame {
	
	private JPanel contentPane;
	private JTextField tfNotaNome;
	private JTextField tfNotaMateria;
	private JTextField tfFaltaNome;
	private JTextField tfFaltaMateria;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontVisualizar frame = new FrontVisualizar();
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
	public FrontVisualizar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlataformaDeNotas = new JLabel("Plataforma de Notas");
		lblPlataformaDeNotas.setBounds(10, 11, 607, 32);
		lblPlataformaDeNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlataformaDeNotas.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(lblPlataformaDeNotas);

		JPanel panel = new JPanel();
		panel.setBounds(10, 54, 607, 32);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel jframeAlteraNotas = new JPanel();
		jframeAlteraNotas.setBounds(330, 86, 287, 209);
		contentPane.add(jframeAlteraNotas);
		jframeAlteraNotas.setLayout(null);
		jframeAlteraNotas.setVisible(false);

		JLabel lblNewLabel_4 = new JLabel("Visualizar Faltas");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 11, 267, 27);
		jframeAlteraNotas.add(lblNewLabel_4);

		JLabel lblNewLabel_1_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1_1.setBounds(10, 49, 89, 14);
		jframeAlteraNotas.add(lblNewLabel_1_1);

		JLabel lblNewLabel_3_1 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3_1.setBounds(10, 99, 89, 14);
		jframeAlteraNotas.add(lblNewLabel_3_1);

		tfFaltaNome = new JTextField();
		tfFaltaNome.setColumns(10);
		tfFaltaNome.setBounds(127, 46, 114, 20);
		jframeAlteraNotas.add(tfFaltaNome);

		tfFaltaMateria = new JTextField();
		tfFaltaMateria.setColumns(10);
		tfFaltaMateria.setBounds(127, 96, 114, 20);
		jframeAlteraNotas.add(tfFaltaMateria);

		JPanel jframeCadastroNotas = new JPanel();
		jframeCadastroNotas.setBounds(10, 86, 287, 209);
		contentPane.add(jframeCadastroNotas);
		jframeCadastroNotas.setLayout(null);
		jframeCadastroNotas.setVisible(false);

		JLabel lblNewLabel = new JLabel("Visualizar Notas");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 267, 27);
		jframeCadastroNotas.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome Aluno:");
		lblNewLabel_1.setBounds(10, 49, 86, 14);
		jframeCadastroNotas.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Mat\u00E9ria:");
		lblNewLabel_3.setBounds(10, 96, 86, 14);
		jframeCadastroNotas.add(lblNewLabel_3);

		tfNotaNome = new JTextField();
		tfNotaNome.setBounds(106, 49, 114, 20);
		jframeCadastroNotas.add(tfNotaNome);
		tfNotaNome.setColumns(10);

		tfNotaMateria = new JTextField();
		tfNotaMateria.setColumns(10);
		tfNotaMateria.setBounds(106, 93, 114, 20);
		jframeCadastroNotas.add(tfNotaMateria);

		JLabel lblErro1 = new JLabel("");
		lblErro1.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro1.setBounds(255, 49, 22, 14);
		jframeCadastroNotas.add(lblErro1);

		JLabel lblErro3 = new JLabel("");
		lblErro3.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro3.setBounds(255, 96, 22, 14);
		jframeCadastroNotas.add(lblErro3);

		JLabel lblErro4 = new JLabel("");
		lblErro4.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro4.setBounds(251, 49, 26, 14);
		jframeAlteraNotas.add(lblErro4);

		JLabel lblErro6 = new JLabel("");
		lblErro6.setHorizontalAlignment(SwingConstants.LEFT);
		lblErro6.setBounds(251, 99, 26, 14);
		jframeAlteraNotas.add(lblErro6);

		JLabel lblNotaSucesso = new JLabel("");
		lblNotaSucesso.setBounds(186, 131, 267, 46);
		contentPane.add(lblNotaSucesso);
		lblNotaSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNotaSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaSucesso.setVisible(false);

		JLabel lblFaltaSucesso = new JLabel("");
		lblFaltaSucesso.setBounds(196, 200, 267, 40);
		contentPane.add(lblFaltaSucesso);
		lblFaltaSucesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaltaSucesso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblFaltaSucesso.setVisible(false);

		JButton btn = new JButton("Visualizar Notas");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeCadastroNotas.setVisible(true);
				jframeAlteraNotas.setVisible(false);
				lblNotaSucesso.setVisible(false);
				lblFaltaSucesso.setVisible(false);

			}
		});
		btn.setBounds(0, 11, 287, 23);
		panel.add(btn);

		JButton btnAlterarNotas = new JButton("Visualizar Faltas");
		btnAlterarNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jframeAlteraNotas.setVisible(true);
				jframeCadastroNotas.setVisible(false);
				lblNotaSucesso.setVisible(false);
				lblFaltaSucesso.setVisible(false);

			}
		});
		btnAlterarNotas.setBounds(319, 11, 288, 23);
		panel.add(btnAlterarNotas);

		JButton btnCadastraNota = new JButton("Avan\u00E7ar");
		btnCadastraNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroAlunos c = new CadastroAlunos();

				int verifica = 0;
				lblErro1.setVisible(false);
				lblErro3.setVisible(false);
				lblNotaSucesso.setVisible(false);
				lblFaltaSucesso.setVisible(false);

				if (c.stringNoDigits(tfNotaNome.getText()) == false || tfNotaNome.getText().isEmpty()) {

					lblErro1.setText("X");
					lblErro1.setVisible(true);
					verifica++;

				}


				if (c.stringNoDigits(tfNotaMateria.getText()) == false || tfNotaMateria.getText().length() > 30
						|| tfNotaMateria.getText().isEmpty()) {

					lblErro3.setText("X");
					lblErro3.setVisible(true);
					verifica++;

				}
				if (verifica == 0) {
					
					lblNotaSucesso.setText(c.exibirNotas(tfNotaNome.getText(), tfNotaMateria.getText(), caminhoArquivo));
					
					lblNotaSucesso.setVisible(true);

					jframeCadastroNotas.setVisible(false);

					

				}

			}
		});
		btnCadastraNota.setBounds(106, 175, 89, 23);
		jframeCadastroNotas.add(btnCadastraNota);

		JButton btnAlteraNota = new JButton("Avan\u00E7ar");
		btnAlteraNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroAlunos c = new CadastroAlunos();

				int verifica = 0;
				lblErro4.setVisible(false);
				lblErro6.setVisible(false);
				lblNotaSucesso.setVisible(false);
				lblFaltaSucesso.setVisible(false);

				if (c.stringNoDigits(tfFaltaNome.getText()) == false || tfFaltaNome.getText().isEmpty()) {

					lblErro4.setText("X");
					lblErro4.setVisible(true);
					verifica++;

				}


				if (c.stringNoDigits(tfFaltaMateria.getText()) == false || tfFaltaMateria.getText().length() > 30
						|| tfFaltaMateria.getText().isEmpty()) {

					lblErro6.setText("X");
					lblErro6.setVisible(true);
					verifica++;

				}
				if (verifica == 0) {

					lblFaltaSucesso.setText(c.exibirFaltas(tfFaltaNome.getText(), tfFaltaMateria.getText(), caminhoArquivo));

					lblFaltaSucesso.setVisible(true);

					jframeAlteraNotas.setVisible(false);

					

				}
			}
		});
		btnAlteraNota.setBounds(106, 175, 89, 23);
		jframeAlteraNotas.add(btnAlteraNota);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MenuAluno exibir = new MenuAluno();
				exibir.setVisible(true);

				dispose();

			}
		});
		btnVoltar.setBounds(267, 322, 89, 23);
		contentPane.add(btnVoltar);
	}

}
