import javax.swing.JFrame;
public class TwoWarriors extends javax.swing.JFrame {

    public TwoWarriors() {

       
        setTitle("TwoWarriors"); //Titulo do game
        //setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setSize(550, 450); //tamanho e largura da interface
        setLocationRelativeTo(null);//para tela aparecer no centro
        setResizable(false);//para o usuario não interferir na largura e altura do game
        setVisible(true);

    }

    public static void main(String[] args) {        
        ArenaInterface A = new ArenaInterface();
        A.setVisible (true);
        System.out.println("Olá");
        
    }
    
}
