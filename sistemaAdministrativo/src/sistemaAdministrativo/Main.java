package sistemaAdministrativo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
	}

}

class Frame extends JFrame {
    public Frame() {
        setTitle("Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Registro registro = new Registro();
        MenuPrincipal menu = new MenuPrincipal();
        
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) (screenSize.getWidth() / 2);
        int screenHeight = (int) (screenSize.getHeight() / 2);
        setBounds(screenWidth/2, screenHeight/2, screenWidth, screenHeight);
        
    }
}

