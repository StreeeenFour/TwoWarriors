import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Arena extends JPanel implements ActionListener {

    private final Image arena;
    private final Personagem personagem;
    private final Timer timer;

    public Arena() {

        setFocusable(true);
        setDoubleBuffered(true);//para se ter uma troca de imagem simultanea
        //this.addKeyListener(new TecladoAdapter());

        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        ImageIcon referencia = new ImageIcon("src/ImageDisplay/arena.jpg");
        arena = referencia.getImage();
        personagem = new Personagem();

        timer = new Timer(1, this);
        timer.start();

    }

    @Override
    public void paint(Graphics g) {

        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(arena, 0, 0, null);
        graficos.drawImage(personagem.getImagem(), personagem.getX(), personagem.getY(), this);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("ACAO REALIZADA");
        personagem.mexer();
        repaint();

    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        System.out.println("TECLADO APERTADO");
        personagem.keyPressed(evt);
    }

    private void formKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        System.out.println("TECLADO SOLD");
        personagem.keyReleased(evt);
    }

}
