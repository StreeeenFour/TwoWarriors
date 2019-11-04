
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personagem {

    private int x, y;
    private int dx, dy;
    private final Image imagem;

    public Personagem() {
        ImageIcon referencia = new ImageIcon("src/ImageDisplay/personagem.gif");
        imagem = referencia.getImage();
        
        this.x = 1;
        this.y = 1;
    }

    public void mexer() {
        System.out.println(x + ", " + y);

        x += dx; //1 e 462 
        y += dy; //1 e 340 essa é as coordenadas de até onde o champ vai

        if (this.x < 1) {
            x = 1;
        }
        if (this.x > 360) {
            x = 360;
        }
        if (this.y < 1) {
            y = 1;
        }
        if (this.y > 486) {
            y = 486;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }

    public void keyPressed(KeyEvent tecla) {
        System.out.println("APERTEI TECLA");
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = -2;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 2;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -2;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

    }

    public void keyReleased(KeyEvent tecla) {
        
        int codigo = tecla.getKeyCode();
        
        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}


