package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAluno extends JFrame {

	private JPanel contentPane;
	private JTextField tfOp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAluno frame = new MenuAluno();
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
	public MenuAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Aluno");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1 - Cadastrar Aluno");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 61, 154, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2 - Visualizar Nota/Falta");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 111, 184, 39);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3 - Abrir Requerimento");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 161, 184, 39);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblOp1 = new JLabel("Escolha uma Op\u00E7\u00E3o: ");
		lblOp1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOp1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOp1.setBounds(10, 213, 143, 37);
		contentPane.add(lblOp1);
		
		tfOp = new JTextField();
		tfOp.setBounds(146, 222, 48, 20);
		contentPane.add(tfOp);
		tfOp.setColumns(10);
		
		JLabel lblOpInvalida = new JLabel("OP\u00C7\u00C3O INV\u00C1LIDA!");
		lblOpInvalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblOpInvalida.setBounds(204, 213, 143, 37);
		contentPane.add(lblOpInvalida);
		lblOpInvalida.setVisible(false);
		
		JButton btnAvançar = new JButton("Avan\u00E7ar");
		btnAvançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfOp.getText().equals("1")) {
					
					FrontCadastroAluno exibir = new FrontCadastroAluno();
					exibir.setVisible(true);
					
					dispose();
				
				}else if (tfOp.getText().equals("2")) {
					
					FrontVisualizar exibir = new FrontVisualizar();
					exibir.setVisible(true);
					
					dispose();

				}else if (tfOp.getText().equals("3")) {
					
					FrontRequerimento exibir = new FrontRequerimento();
					exibir.setVisible(true);
					
					dispose();
				}else {
					
					lblOpInvalida.setVisible(true);
					
				}
				
				
			}
		});
		btnAvançar.setBounds(75, 253, 89, 23);
		contentPane.add(btnAvançar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuPrincipal exibir = new MenuPrincipal();
				exibir.setVisible(true);
				
				dispose();
				
			}
		});
		btnVoltar.setBounds(258, 253, 89, 23);
		contentPane.add(btnVoltar);
	}
}
