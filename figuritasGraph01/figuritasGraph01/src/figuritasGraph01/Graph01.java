package figuritasGraph01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Graph01 extends JFrame implements KeyListener {

    private JPanel contentPane;
    int cuadroX=200, cuadroY=415;
    private Platform platforms;
    private Character personaje;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Graph01 frame = new Graph01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Graph01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();

        Color backgroundColor = new Color(0x00A4FC);
        contentPane.setBackground(backgroundColor); // Establecer el color de fondo azul

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 1200, 600);
        
        this.addKeyListener(this);

    }

    public void paint(Graphics g) {
        super.paint(g);

        // Crear instancias de objetos Box
        Box box1 = new Box(1000, 350, 500, 150, new Color(1, 203, 95));
        Box box2 = new Box(1000, 250, 50, 50, new Color(222, 139, 154));
        
        Box box3 = new Box(60, 225, 50, 50, new Color(222, 139, 154));
        Box box4 = new Box(250, 125, 50, 50, new Color(222, 139, 154));
        Box box5 = new Box(300, 125, 50, 50, new Color(222, 139, 154));
        
        Box box6 = new Box(360, 260, 170, 240, new Color(2, 84, 255));
        Box box7 = new Box(270, 360, 150, 140, new Color(214, 136, 178));

        // Dibujar cajas
        box1.draw(g);
        box2.draw(g);
        box3.draw(g);
        box4.draw(g);
        box5.draw(g);
        box6.draw(g);
        box7.draw(g);

        // Crear instancias de objetos Bush
        Bush bush1 = new Bush(80, 460, 80, 80, new Color(50, 205, 50));
        Bush bush2 = new Bush(120, 462, 80, 80, new Color(50, 205, 50));
        Bush bush3 = new Bush(115, 420, 69, 80, new Color(50, 205, 50));

        // Dibujar arbustos
        bush1.draw(g);
        bush2.draw(g);
        bush3.draw(g);

        // Crear instancias de objetos Pipe
        Pipe pipe1 = new Pipe(650, 350, 125, 200, new Color(2, 171, 52));
        Pipe pipe2 = new Pipe(637, 350, 150, 50, new Color(2, 171, 52));

        // Dibujar tuberías
        pipe1.draw(g);
        pipe2.draw(g);

        // Crear instancias de objetos Platform
        platforms = new Platform(69, 500, 1200, 100, new Color(233, 137, 115));

        // Dibujar plataformas
        platforms.draw(g);
        
        //Dibujar personaje
        personaje = new Character(cuadroX, cuadroY, 50, 50, new Color(0, 0, 0));
        
        personaje.draw(g);
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        if (keyCode == KeyEvent.VK_A) {
            if (cuadroX > 0) {
                cuadroX -= 30;
                // Verificar colisión con la plataforma
                if (cuadroY + 50 >= 500 && cuadroY <= 600 && cuadroX <= 69 + 1200) {
                    cuadroX = 69 + 1200;
                }
            }
        } else if (keyCode == KeyEvent.VK_D) {
            if (cuadroX + 50 < 1200) {
                cuadroX += 30;
                // Verificar colisión con la plataforma
                if (cuadroY + 50 >= 500 && cuadroY <= 600 && cuadroX + 50 >= 69) {
                    cuadroX = 69 - 50;
                }
            }
            
        } else if (keyCode == KeyEvent.VK_W) {
            cuadroY -= 30; // Mover hacia arriba
            
        } else if (keyCode == KeyEvent.VK_S) {
            if (cuadroY + 50 < 1200) {
                cuadroY += 30;
                // Verificar colisión con la plataforma
                if (cuadroY + 50 >= 500 && cuadroY <= 600 && cuadroX + 50 >= 69) {
                    cuadroY -= 30;
                }
            }
        }
        repaint(); // Redibujar la ventana con la nueva posición del personaje
    }


	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
