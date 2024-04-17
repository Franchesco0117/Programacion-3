	import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
	}

}

class Frame extends JFrame {
    public Frame() {
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        
        JPanel panelBase = new JPanel();
   
        
        Registro registro = new Registro();
        EjemploSlider slider = new EjemploSlider();
        EjemploComboBox comboBox = new EjemploComboBox();
        EjemploRadioButton Radio = new EjemploRadioButton();
        
        
        JTabbedPane panelComponents = new JTabbedPane();
        panelComponents.addTab("Registro", registro);
        panelComponents.addTab("Combo", comboBox);
        panelComponents.addTab("Radio", Radio);
        panelComponents.addTab("Slider", slider);
        
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) (screenSize.getWidth() / 2);
        int screenHeight = (int) (screenSize.getHeight() / 2);
        setBounds(screenWidth/2, screenHeight/2, screenWidth, screenHeight);
        
        setVisible(true);
        panelBase.add(panelComponents);
        add(panelBase);

    }
}



