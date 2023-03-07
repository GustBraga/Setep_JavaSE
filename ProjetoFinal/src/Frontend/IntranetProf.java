package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntranetProf extends JFrame {

	private JPanel contentPane;
	private JTextField tfOp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntranetProf frame = new IntranetProf();
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
	public IntranetProf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuProfessor = new JLabel("Intranet Professores ");
		lblMenuProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuProfessor.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblMenuProfessor.setBounds(10, 11, 414, 32);
		contentPane.add(lblMenuProfessor);
		
		JLabel lblCadastrarProf = new JLabel("1 - Cadastrar Professor");
		lblCadastrarProf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCadastrarProf.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCadastrarProf.setBounds(10, 81, 174, 32);
		contentPane.add(lblCadastrarProf);
		
		JLabel lblNotas = new JLabel("2 - Cadastrar/Alterar Notas");
		lblNotas.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotas.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNotas.setBounds(10, 124, 201, 26);
		contentPane.add(lblNotas);
		
		JLabel lblFaltas = new JLabel("3 - Cadastrar/Alterar Faltas");
		lblFaltas.setHorizontalAlignment(SwingConstants.LEFT);
		lblFaltas.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFaltas.setBounds(10, 161, 201, 32);
		contentPane.add(lblFaltas);
		
		JLabel lblOp1 = new JLabel("Escolha uma Op\u00E7\u00E3o: ");
		lblOp1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOp1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOp1.setBounds(10, 204, 143, 37);
		contentPane.add(lblOp1);
		
		tfOp = new JTextField();
		tfOp.setColumns(10);
		tfOp.setBounds(145, 213, 48, 20);
		contentPane.add(tfOp);
		
		JLabel lblOpInvalida = new JLabel("OP\u00C7\u00C3O INV\u00C1LIDA!");
		lblOpInvalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblOpInvalida.setBounds(203, 202, 204, 41);
		contentPane.add(lblOpInvalida);
		lblOpInvalida.setVisible(false);
		
		JButton btnAvancar2 = new JButton("Avan\u00E7ar");
		btnAvancar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfOp.getText().equals("1")){
					
					FrontCadastroProf exibir = new FrontCadastroProf();
					exibir.setVisible(true);
					
					dispose();
				
				}else if(tfOp.getText().equals("2")){
					
					FrontCadastrarOuAlterarNotas exibir = new FrontCadastrarOuAlterarNotas();
					exibir.setVisible(true);
					
					dispose();
				}else if(tfOp.getText().equals("3")){
					
					FrontCadastrarOuAlterarFaltas exibir = new FrontCadastrarOuAlterarFaltas();
					exibir.setVisible(true);
					
					dispose();
				}else {
					lblOpInvalida.setVisible(true);
				}
				
			}
		});
		btnAvancar2.setBounds(75, 238, 89, 23);
		contentPane.add(btnAvancar2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuProfessor exibir = new MenuProfessor();
				exibir.setVisible(true);
				
				dispose();
				
			}
		});
		btnVoltar.setBounds(251, 238, 89, 23);
		contentPane.add(btnVoltar);
		
		
		
	}

}
