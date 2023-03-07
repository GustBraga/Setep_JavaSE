package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beakend.CadastroProfessores;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class MenuProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	String caminhoArquivo = "C:\\Users\\Gustavo Braga\\Desktop\\Arquivos\\.txt";
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProfessor frame = new MenuProfessor();
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
	public MenuProfessor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuProfessor = new JLabel("Intranet Professores ");
		lblMenuProfessor.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMenuProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuProfessor.setBounds(10, 11, 414, 32);
		contentPane.add(lblMenuProfessor);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLogin.setBounds(121, 101, 48, 19);
		contentPane.add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(179, 100, 86, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSenha.setBounds(121, 147, 48, 19);
		contentPane.add(lblSenha);
		
		JLabel lblSenhaInvalida = new JLabel("SENHA E/OU LOGIN INV\u00C1LIDO, OU N\u00C3O CADASTRADO!");
		lblSenhaInvalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaInvalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSenhaInvalida.setBounds(10, 176, 414, 41);
		contentPane.add(lblSenhaInvalida);
		
		lblSenhaInvalida.setVisible(false);
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBounds(179, 146, 86, 20);
		contentPane.add(tfSenha);
		
		JButton btnAvancar2 = new JButton("Avan\u00E7ar");
		btnAvancar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroProfessores c = new CadastroProfessores();
				
				if(c.verificaCadastro(tfLogin.getText(), tfSenha.getText(), caminhoArquivo)) {
					
					IntranetProf exibir = new IntranetProf();
					exibir.setVisible(true);
					
					dispose();
					
				}else if(tfLogin.getText().equals("Admin") && tfSenha.getText().equals("Admin")) {
					
					IntranetProf exibir = new IntranetProf();
					exibir.setVisible(true);
					
					dispose();
						
				}else {
					lblSenhaInvalida.setVisible(true);
				}
				
			}
		});
		btnAvancar2.setBounds(87, 228, 89, 23);
		contentPane.add(btnAvancar2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuPrincipal exibir = new MenuPrincipal();
				exibir.setVisible(true);
				
				dispose();	
			}
		});
		btnVoltar.setBounds(250, 228, 89, 23);
		contentPane.add(btnVoltar);
		
		
			
	}
}
