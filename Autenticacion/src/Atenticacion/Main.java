package Atenticacion;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Main {
	
	//Francisco Castro Murillo IDS TV

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignUp frame = new SignUp();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class SignUp extends JFrame{
	public SignUp(){
		setBounds(1000, 100, 500, 700);
		setTitle("Registro");
		
		
		
		Registro registro = new Registro();
		add(registro);
		
		Componentes componentes = new Componentes();
		add(componentes);
	}
	
}

class Registro extends JPanel{
	public Registro() {
		setLayout(null);
		
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		 */
		
		JLabel tvWelcome = new JLabel("Nuevo usuario");
		tvWelcome.setFont(new Font("Arial", Font.PLAIN, 30));
		tvWelcome.setBounds(150, 50, 500, 100);
		add(tvWelcome);
		
		JLabel tvUser = new JLabel("Usuario");
		tvUser.setFont(new Font("Arial", Font.PLAIN, 18));
		tvUser.setBounds(150, 110, 500, 100);
		add(tvUser);
		
		JTextField etUser = new JTextField();
		etUser.setFont(new Font("Arial", Font.PLAIN, 20));
		etUser.setBounds(150, 175, 200, 30);
		add(etUser);
		
		JLabel tvEmail = new JLabel("Correo");
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
		
		JCheckBox cbTermsConditions = new JCheckBox("Acepto terminos y condiciones", false);
		cbTermsConditions.setBounds(150, 375, 200, 30);
		add(cbTermsConditions);
		
		JButton btnNo = new JButton("Cancelar");
		btnNo.setBounds(150, 420, 90, 50);
		add(btnNo);
		
		JButton btnYes = new JButton("Aceptar");
		btnYes.setBounds(260, 420, 90, 50);
		add(btnYes);

	}
}

class Componentes extends JPanel{
	public Componentes() {
		String[] frutas = {"Manzana", "Naranja", "Pera", "Uva"};
		JComboBox<String> listaFrutas = new JComboBox<String>(frutas);
		listaFrutas.setSelectedIndex(0);
		add(listaFrutas);	
		
		//JRadioButton Single
		JRadioButton male = new JRadioButton("Masculino");
		JRadioButton female = new JRadioButton("Femenino");
		add(male);
		add(female);
		
		//JRadioButton in Group
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(male);
		sexo.add(female);
		
		//Slider
		JSlider slider = new JSlider(0, 100, 10);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		add(slider);
	}
}
