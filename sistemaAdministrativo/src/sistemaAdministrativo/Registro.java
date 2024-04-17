package sistemaAdministrativo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro implements ActionListener {
	
	JTextField etUser;
	JTextField etEmail;
	JPasswordField etPassword;
	
	public Registro() {
		Frame frame = new Frame();
		frame.setLayout(null);
		frame.setTitle("Registro");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	    frame.setBounds(0, 0, 800, 800);
		
		JLabel tvWelcome = new JLabel("Nuevo usuario");
		tvWelcome.setFont(new Font("Arial", Font.PLAIN, 30));
		tvWelcome.setBounds(150, 50, 500, 100);
		frame.add(tvWelcome);
		
		JLabel tvUser = new JLabel("Usuario");
		tvUser.setFont(new Font("Arial", Font.PLAIN, 18));
		tvUser.setBounds(150, 110, 500, 100);
		frame.add(tvUser);
		
		etUser = new JTextField();
		etUser.setFont(new Font("Arial", Font.PLAIN, 20));
		etUser.setBounds(150, 175, 200, 30);
		frame.add(etUser);
		
		JLabel tvEmail = new JLabel("Correo");
		tvEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		tvEmail.setBounds(150, 190, 500, 100);
		frame.add(tvEmail);
		
		etEmail = new JTextField();
		etEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		etEmail.setBounds(150, 255, 200, 30);
		frame.add(etEmail);
		
		JLabel tvPassword = new JLabel("Contrasenia");
		tvPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		tvPassword.setBounds(150, 270, 500, 100);
		frame.add(tvPassword);
		
		etPassword = new JPasswordField();
		etPassword.setBounds(150, 335, 200, 30);
		etPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		frame.add(etPassword);
		
		JCheckBox cbTermsConditions = new JCheckBox("Acepto terminos y condiciones", false);
		cbTermsConditions.setBounds(150, 375, 200, 30);
		frame.add(cbTermsConditions);
		
		JButton btnNo = new JButton("Cancelar");
		btnNo.setBounds(150, 420, 90, 50);
		frame.add(btnNo);
		
		JButton btnYes = new JButton("Aceptar");
		btnYes.setBounds(260, 420, 90, 50);
		frame.add(btnYes);
		btnYes.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = etUser.getText();
		String correo = etEmail.getText();
		char contrasenia[] = etPassword.getPassword();
		
		
		System.out.println(usuario);
		System.out.println(correo);
		System.out.println(contrasenia);
		
	}
	
	public static void main(String[] args) {
		new Registro();

	}
}
