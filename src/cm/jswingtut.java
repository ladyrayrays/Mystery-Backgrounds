package cm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Random;

public class jswingtut {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jswingtut window = new jswingtut();
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
	public jswingtut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.getContentPane().setBackground(new Color(255, 51, 51));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("RIP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rand = new Random();
				int n = rand.nextInt(50) + 1;
				int x = rand.nextInt(100) + 1;
				int y = rand.nextInt(200) + 1;
				int z = rand.nextInt(325) + 1;
				btnNewButton.setBounds(z, y, 89, 23);

				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(174, 136, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Help");
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(282, 91, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
