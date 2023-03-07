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

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfOp1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu ");
		lblMenu.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(10, 11, 315, 48);
		contentPane.add(lblMenu);
		
		JLabel lblProf = new JLabel("1 - Professor");
		lblProf.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProf.setHorizontalAlignment(SwingConstants.LEFT);
		lblProf.setBounds(10, 70, 110, 40);
		contentPane.add(lblProf);
		
		JLabel lblAluno = new JLabel("2 - Aluno");
		lblAluno.setFont(new Font("Arial", Font.PLAIN, 16));
		lblAluno.setHorizontalAlignment(SwingConstants.LEFT);
		lblAluno.setBounds(10, 109, 110, 37);
		contentPane.add(lblAluno);
		
		JLabel lblOp1 = new JLabel("Escolha uma Op\u00E7\u00E3o: ");
		lblOp1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOp1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOp1.setBounds(10, 157, 143, 37);
		contentPane.add(lblOp1);
		
		tfOp1 = new JTextField();
		tfOp1.setBounds(145, 166, 48, 20);
		contentPane.add(tfOp1);
		tfOp1.setColumns(10);
		
		JLabel lblOpInvalida = new JLabel("OP\u00C7\u00C3O INV\u00C1LIDA!");
		lblOpInvalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblOpInvalida.setBounds(201, 153, 124, 41);
		contentPane.add(lblOpInvalida);
		lblOpInvalida.setVisible(false);
		
		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfOp1.getText().equals("1")){
					
					MenuProfessor exibir = new MenuProfessor();
					exibir.setVisible(true);
					
					dispose();
					
				}else if (tfOp1.getText().equals("2")){
					
					MenuAluno exibir = new MenuAluno();
					exibir.setVisible(true);
					
					dispose();
					
					
				}else {
					
					lblOpInvalida.setVisible(true);
					
				}
				
			}
		});
		btnAvancar.setBounds(123, 197, 89, 23);
		contentPane.add(btnAvancar);
		
	}
}
