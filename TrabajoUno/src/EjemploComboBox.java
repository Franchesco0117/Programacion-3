import javax.swing.JComboBox;
import javax.swing.JPanel;

public class EjemploComboBox extends JPanel {
	public EjemploComboBox(){
		JPanel panelCombo = new JPanel(null);
		String [] frutas = {"Manzana", "Naranja", "Pera", "Uvas"};
		JComboBox<String> listafrutas = new JComboBox<String>(frutas);
		listafrutas.setSelectedIndex(1);
		add(listafrutas);
		
	}
}
