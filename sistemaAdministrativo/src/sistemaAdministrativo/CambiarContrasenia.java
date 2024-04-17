package sistemaAdministrativo;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CambiarContrasenia extends JPanel{
	public CambiarContrasenia() {
		setLayout(null);
		
		JLabel tvWelcome = new JLabel("Cambiar Contrasenia");
		tvWelcome.setFont(new Font("Arial", Font.PLAIN, 30));
		tvWelcome.setBounds(110, 120, 500, 100);
		add(tvWelcome);
		
		JLabel tvEmail = new JLabel("Contrasenia actual");
		tvEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		tvEmail.setBounds(150, 190, 500, 100);
		add(tvEmail);
		
		JTextField etEmail = new JTextField();
		etEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		etEmail.setBounds(150, 255, 200, 30);
		add(etEmail);
		
		JLabel tvPassword = new JLabel("Nueva Contrasenia");
		tvPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		tvPassword.setBounds(150, 270, 500, 100);
		add(tvPassword);
		
		JPasswordField etPassword = new JPasswordField();
		etPassword.setBounds(150, 335, 200, 30);
		etPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		add(etPassword);
		
		JButton btnNo = new JButton("Cancelar");
		btnNo.setBounds(150, 420, 90, 50);
		add(btnNo);
		
		JButton btnYes = new JButton("Aceptar");
		btnYes.setBounds(260, 420, 90, 50);
		add(btnYes);
	}
	
}