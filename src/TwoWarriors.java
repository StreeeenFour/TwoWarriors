import javax.swing.JFrame;


public class TwoWarriors extends JFrame {

    public TwoWarriors() {
        
        add(new Arena());
        //add(new JButton("Teste"));
        setTitle("TwoWarriors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);//para tela aparecer no centro
        setResizable(false);//para o usuario não interferir na largura e altura do game
        setVisible(true);
        
        AudioAcerto y = new AudioAcerto(); // Chamando a classe aonde está o audio.
        y.AudioAcerto (); // Chamando o método do audio
    }
    
    
    public static void main(String[] args) {
        new TwoWarriors();
    }
}
