package demoJavaSwing;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame(); // Crea instancia de MyFrame
		frame.setVisible(true); // Boolean que hace que se muestre la pantalla o no
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se cierra cuando le das a la X

		// Las cordenadas empiezan desde la esquina superior izquierda de la pantalla
		// Es como un plano cartesiano
		// frame.setBounds(50, 50, 500, 500);

		// Para poner titulo
		frame.setTitle("Java Swing");

	}

}

class MyFrame extends JFrame {
	public MyFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		// Sacar el tamaño de cualquier dispositivo
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		int posWidth = screenWidth / 2;
		int posHeight = screenHeight / 2;

		// setSize(screenWidth, screenHeight); Pone el tamaño del "Frame"
		setBounds(200, 200, posWidth, posHeight);
		setLocationRelativeTo(null);

		// TAREA: AÑADIR
		/*
		 * JButton JLabel JTextField JPasswordField
		 */

		// Para crear el JLabel
		JLabel texto = new JLabel();
		texto.setText("Hola mundo");
		texto.setBounds(200, 200, 100, 50);
		texto.setFont(new Font("Arial", Font.ITALIC, 16));
		texto.setForeground(Color.BLACK);
		add(texto);

		// Para crear un JButton
		JButton button = new JButton();
		button.setBounds(100, 100, 150, 50);
		button.setText("Dale click");
		button.setBackground(Color.cyan);
		add(button);

		// Para crear el JTextField
		JTextField campoTexto = new JTextField();
		campoTexto.setBounds(2, 2, 1, 1);

	}
}
