package loginWork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class loginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField emailtextField;
	private JTextField admintextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame frame = new loginFrame();
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
	public loginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("LOGIN");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		titleLabel.setBounds(159, 11, 96, 24);
		contentPane.add(titleLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		emailLabel.setBounds(10, 71, 143, 24);
		contentPane.add(emailLabel);
		
		JLabel adminLabel = new JLabel("Reg Number:");
		adminLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		adminLabel.setBounds(10, 133, 143, 24);
		contentPane.add(adminLabel);
		
		emailtextField = new JTextField();
		emailtextField.setBounds(228, 68, 218, 34);
		contentPane.add(emailtextField);
		emailtextField.setColumns(10);
		
		admintextField = new JTextField();
		admintextField.setBounds(228, 130, 218, 34);
		contentPane.add(admintextField);
		admintextField.setColumns(10);
		
		JButton loginBtn = new JButton("login");
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		loginBtn.setBounds(122, 210, 89, 23);
		contentPane.add(loginBtn);
	}
}
