import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;


public class TwoWarriors extends JFrame {

    public TwoWarriors() {
        
        JMenuBar barraMenu = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");

		JMenuItem sobre = new JMenuItem("Sobre");
		sobre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Jogo feito e criado por Diogo Dos Santos, Flávia dos Santos e Victória Termezana", "Informações", JOptionPane.INFORMATION_MESSAGE);
			}

            //@Override
            //public void actionPerformed(ActionEvent ae) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //}
		});
		
		JMenuItem sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		menu.add(sobre);
		menu.add(new JSeparator());
		menu.add(sair);
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
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
