package demoJavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class SpringLayoutEjemplo {
	public static void main(String[] args) {
        // Crear el frame y establecer algunas configuraciones básicas
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear el panel y establecer el administrador de diseño SpringLayout
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        frame.add(panel);

        // Crear algunos componentes
        JLabel label1 = new JLabel("Label 1:");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Label 2:");
        JTextField textField2 = new JTextField(10);

        // Agregar los componentes al panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);

        // Establecer restricciones usando SpringLayout.Constraints
        SpringLayout.Constraints label1Cons = layout.getConstraints(label1);
        SpringLayout.Constraints textField1Cons = layout.getConstraints(textField1);
        SpringLayout.Constraints label2Cons = layout.getConstraints(label2);
        SpringLayout.Constraints textField2Cons = layout.getConstraints(textField2);

        // Establecer las restricciones de muelle para los componentes
        label1Cons.setX(Spring.constant(10));
        label1Cons.setY(Spring.constant(10));
        textField1Cons.setX(Spring.sum(Spring.constant(10), label1Cons.getConstraint(SpringLayout.EAST)));
        textField1Cons.setY(Spring.constant(10));

        label2Cons.setX(Spring.constant(10));
        label2Cons.setY(Spring.sum(Spring.constant(10), textField1Cons.getConstraint(SpringLayout.SOUTH)));
        textField2Cons.setX(Spring.sum(Spring.constant(10), label2Cons.getConstraint(SpringLayout.EAST)));
        textField2Cons.setY(Spring.sum(Spring.constant(10), textField1Cons.getConstraint(SpringLayout.SOUTH)));

        // Mostrar el frame
        frame.setVisible(true);
    }
}
