
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Personagem {

    private int x, y;
    private int dx, dy;
    private final Image imagem;
    private int id;

    private int altura, largura;
    private boolean isVisivel;

    private List<jogo.Missel> misseis;

    public Personagem() {
        ImageIcon referencia = new ImageIcon("src/ImageDisplay/personagem.gif");
        imagem = referencia.getImage();

        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);

        misseis = new ArrayList<jogo.Missel>();

        this.x = 210;
        this.y = 50;
        this.id = 1;
    }

    public Personagem(int x, int y, String gif, int id) {
        ImageIcon referencia = new ImageIcon(gif);
        imagem = referencia.getImage();

        this.x = 210;
        this.y = 300;

        this.id = id;
    }

    public void mexer() {
        System.out.println(x + ", " + y);

        x += dx; //1 e 462 // largura
        y += dy; //1 e 340 essa é as coordenadas de até onde a nave vai // altura

        if (this.x < 1) {
            x = 1;
        }
        if (this.x > 361) {
            x = 361;
        }
        if (this.y < 1) {
            y = 1;
        }
        if (this.y > 483) {
            y = 483;
        }
    }

    public List<jogo.Missel> getMisseis() {
        return misseis;
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

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public void atira() {
        this.misseis.add(new jogo.Missel(x + largura, y + altura / 2));
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }

    public void keyPressed(KeyEvent tecla) {
        System.out.println("APERTEI TECLA");
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_SPACE) {
            atira();
        }

        if (this.id == 1) {
            if (codigo == KeyEvent.VK_UP) {
                dy = -3;
            }
            if (codigo == KeyEvent.VK_DOWN) {
                dy = 3;
            }
            if (codigo == KeyEvent.VK_LEFT) {
                dx = -3;
            }
            if (codigo == KeyEvent.VK_RIGHT) {
                dx = 3;
            }
        }
        if (this.id == 2) {
            if (codigo == KeyEvent.VK_W) {
                dy = -3;
            }
            if (codigo == KeyEvent.VK_S) {
                dy = 3;
            }
            if (codigo == KeyEvent.VK_A) {
                dx = -3;
            }
            if (codigo == KeyEvent.VK_D) {
                dx = 3;
            }

        }

    }

    public void keyReleased(KeyEvent tecla) {

        int codigo = tecla.getKeyCode();
        if (this.id == 1) {
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
        if (this.id == 2) {
            if (codigo == KeyEvent.VK_W) {
                dy = 0;
            }
            if (codigo == KeyEvent.VK_S) {
                dy = 0;
            }
            if (codigo == KeyEvent.VK_A) {
                dx = 0;
            }
            if (codigo == KeyEvent.VK_D) {
                dx = 0;
            }
        }

    }
}
