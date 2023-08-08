import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTree;

public class Calculator1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 window = new Calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 314, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 22, 250, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(20, 83, 43, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(90, 83, 43, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(158, 83, 43, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(227, 83, 43, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(20, 132, 43, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(20, 173, 43, 30);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(20, 214, 43, 30);
		frame.getContentPane().add(btn1);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnZero.setBounds(20, 264, 43, 30);
		frame.getContentPane().add(btnZero);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(90, 132, 43, 30);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9.setBounds(90, 173, 43, 30);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(90, 214, 43, 30);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDot.setBounds(90, 264, 43, 30);
		frame.getContentPane().add(btnDot);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_12.setBounds(158, 132, 43, 30);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("6");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_13.setBounds(158, 173, 43, 30);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(158, 214, 43, 30);
		frame.getContentPane().add(btn3);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(227, 132, 43, 30);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(227, 173, 43, 30);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		btnNewButton_18.setBounds(227, 214, 43, 30);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("=");
		btnNewButton_19.setBounds(227, 264, 43, 30);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(158, 264, 43, 30);
		frame.getContentPane().add(btnNewButton_5);
	}
}
