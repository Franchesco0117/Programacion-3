package sistemaAdministrativo;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame{
	public MenuPrincipal() {
		
		setLayout(null);
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	     int screenWidth = (int) (screenSize.getWidth() / 2);
	     int screenHeight = (int) (screenSize.getHeight() / 2);
	     setBounds(screenWidth/2, screenHeight/2, screenWidth, screenHeight);
		
		//option archivo y Ayuda(Submenu ayuda) (Submenu Salir)
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu menu1 = new JMenu("Opciones");
		mb.add(menu1);
		
		JMenu mi1 = new JMenu("Ayuda");
		menu1.add(mi1);
		
		JMenuItem mi2 = new JMenuItem("Submenu ayuda");
		mi1.add(mi2);
		
		JMenuItem mi3 = new JMenuItem("Salir");
		menu1.add(mi3);
		
		//SpringLayout Ejemplo de como se acomoda todo funciona y eso
		

	}
}
