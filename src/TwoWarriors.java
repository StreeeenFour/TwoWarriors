import javax.swing.JFrame;


public class TwoWarriors extends JFrame {

    public TwoWarriors() {
        
        add(new Arena());
        //add(new JButton("Teste"));
        setTitle("TwoWarriors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(490,650);
        setLocationRelativeTo(null);//para tela aparecer no centro
        setResizable(false);//para o usuario não interferir na largura e altura do game
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new TwoWarriors();
    }
}
