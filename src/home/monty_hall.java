package home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class monty_hall {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {String[] args2 = new String[args.length + 1];
	System.arraycopy(args, 0, args2, 0, args.length);
	args2[args.length] = args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					monty_hall window = new monty_hall();
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
	public monty_hall() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLabel label = new JLabel("64356");
	 Toolkit.getDefaultToolkit().beep();

	JLabel label_1 = new JLabel("New label");
	JLabel label_2 = new JLabel("New label");
	JLabel label_3 = new JLabel("New label");
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(131, 138, 161, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Switching");
		rdbtnNewRadioButton.setForeground(SystemColor.textHighlightText);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(131, 185, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No Switching");
		rdbtnNewRadioButton_1.setForeground(SystemColor.textHighlightText);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setBounds(131, 224, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Settings");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto Light", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 11, 150, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Results");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Roboto Light", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(468, 11, 150, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("GO !!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				methods.run(Float.parseFloat(textField.getText()));
				
			label.setText(Float.toString((float) methods.win));
				
			label_3.setText(Float.toString((float) methods.winavg));
			label_2.setText(Float.toString((float) methods.lose));
			
			label_1.setText(Float.toString((float) methods.loseavg));
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(267, 389, 234, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Repetition");
		lblNewLabel_2.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(23, 137, 111, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Wins");
		lblNewLabel_3.setForeground(SystemColor.textHighlightText);
		lblNewLabel_3.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(451, 73, 144, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Loss");
		lblNewLabel_4.setForeground(SystemColor.textHighlightText);
		lblNewLabel_4.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(451, 247, 144, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("The percentage of wins");
		lblNewLabel_5.setForeground(SystemColor.textHighlightText);
		lblNewLabel_5.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(418, 160, 177, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("The percentage of loss");
		lblNewLabel_6.setForeground(SystemColor.textHighlightText);
		lblNewLabel_6.setFont(new Font("Simplified Arabic", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(418, 334, 177, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setForeground(Color.WHITE);
		label.setBounds(605, 73, 102, 14);
		frame.getContentPane().add(label);
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(605, 334, 102, 14);
		frame.getContentPane().add(label_1);
		
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(605, 247, 102, 14);
		frame.getContentPane().add(label_2);
		
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(605, 160, 102, 14);
		frame.getContentPane().add(label_3);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 776, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
