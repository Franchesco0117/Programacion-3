package figuritasGraph01;

import java.awt.Color;
import java.awt.Graphics;

public class Character {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Character(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.drawRect(x, y, width, height);
    }
    
}