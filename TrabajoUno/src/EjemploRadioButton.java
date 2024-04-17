import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadioButton extends JPanel{
	public EjemploRadioButton() {
		JPanel panelRadioButton = new JPanel(null);
		JRadioButton male = new JRadioButton("Masculino");
		JRadioButton female = new JRadioButton("Femenino");
		add(male);
		add(female);
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(female);
		sexo.add(male);
	}
}
