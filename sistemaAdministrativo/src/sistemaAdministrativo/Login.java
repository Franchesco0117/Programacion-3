package sistemaAdministrativo;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel{
	public Login() {
		setLayout(null);
		
		JLabel tvWelcome = new JLabel("Inicio Sesion");
		tvWelcome.setFont(new Font("Arial", Font.PLAIN, 30));
		tvWelcome.setBounds(160, 120, 500, 100);
		add(tvWelcome);
		
		JLabel tvEmail = new JLabel("Correo Electronico");
		tvEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		tvEmail.setBounds(150, 190, 500, 100);
		add(tvEmail);
		
		JTextField etEmail = new JTextField();
		etEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		etEmail.setBounds(150, 255, 200, 30);
		add(etEmail);
		
		JLabel tvPassword = new JLabel("Contrasenia");
		tvPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		tvPassword.setBounds(150, 270, 500, 100);
		add(tvPassword);
		
		JPasswordField etPassword = new JPasswordField();
		etPassword.setBounds(150, 335, 200, 30);
		etPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		add(etPassword);
		
		JButton btnSignUp = new JButton("Cambiar Contraseña");
		btnSignUp.setBounds(150, 380, 200, 40);
		add(btnSignUp);
		
		JButton btnLoginCancel = new JButton("Sign Up");
		btnLoginCancel.setBounds(150, 430, 90, 50);
		add(btnLoginCancel);
		
		JButton btnLogin = new JButton("Ingresar");
		btnLogin.setBounds(260, 430, 90, 50);
		add(btnLogin);
	}

}