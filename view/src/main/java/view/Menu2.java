package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class Menu {

	private JFrame frmLorann;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmLorann.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		frmLorann = new JFrame();
		frmLorann.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\lorannicon.png"));
		frmLorann.setTitle("LORANN");
		frmLorann.setBounds(100, 100, 391, 294);
		frmLorann.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLorann.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 375, 261);
		frmLorann.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnStartGame = new JButton("Start game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStartGame.setBackground(Color.WHITE);
		btnStartGame.setBounds(82, 80, 204, 40);
		panel.add(btnStartGame);
		
		JButton button = new JButton("Levels");
		button.setBackground(Color.WHITE);
		
		button.setBounds(82, 131, 204, 40);
		panel.add(button);
		
		JButton button_1 = new JButton("Quit");
		button_1.setBackground(Color.RED);
		button_1.setBounds(82, 182, 204, 40);
		panel.add(button_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\lorann_ul.png"));
		lblNewLabel.setBounds(34, 179, 38, 47);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\monster_4.png"));
		label.setBounds(296, 80, 38, 47);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_1.setBounds(0, -12, 38, 40);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_2.setBounds(34, -12, 38, 40);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_3.setBounds(68, -12, 38, 40);
		panel.add(label_3);
		
		JTextPane txtpnLorann = new JTextPane();
		txtpnLorann.setEditable(false);
		txtpnLorann.setFont(new Font("8-bit pusab", Font.PLAIN, 12));
		txtpnLorann.setForeground(Color.RED);
		txtpnLorann.setBackground(Color.BLACK);
		txtpnLorann.setText("LORANN");
		txtpnLorann.setBounds(131, 35, 90, 20);
		panel.add(txtpnLorann);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_6.setBounds(100, -12, 38, 40);
		panel.add(label_6);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_4.setBounds(136, -12, 38, 40);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_5.setBounds(169, -12, 38, 40);
		panel.add(label_5);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_7.setBounds(204, -12, 38, 40);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_8.setBounds(238, -12, 38, 40);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_9.setBounds(271, -12, 38, 40);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_10.setBounds(306, -12, 38, 40);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\horizontal_bone.png"));
		label_11.setBounds(337, -12, 38, 40);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\fireball_2.png"));
		label_12.setBounds(34, 103, 38, 47);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\gate_closed.png"));
		label_13.setBounds(34, 73, 38, 47);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\crystal_ball.png"));
		label_14.setBounds(34, 226, 38, 47);
		panel.add(label_14);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\gate_open.png"));
		label_16.setBounds(349, 211, 38, 47);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\purse.png"));
		label_17.setBounds(306, 211, 38, 47);
		panel.add(label_17);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\vertical_bone.png"));
		label_15.setBounds(296, 117, 38, 47);
		panel.add(label_15);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setIcon(new ImageIcon("C:\\Users\\Walim\\Desktop\\LorannFinal-master\\LorannFinal-master\\Loranne\\Images\\monster_1.png"));
		label_18.setBounds(296, 157, 38, 47);
		panel.add(label_18);
		
		
	}
	
	
	
			
		
		
		
		
	}
	
