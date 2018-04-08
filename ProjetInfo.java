
package projet.info;
import javax.swing.JFrame;

public class ProjetInfo 
{


    public static void main(String[] args) 
    {
        //Fenetre fen = new Fenetre();
        JFrame monCadre = new JFrame();
        monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        monCadre.setLocation(400,400);
        monCadre.setContentPane(new Fenetre());
        monCadre.pack();
        monCadre.setVisible(true);
        new FenetreMise_a_jour();
    }
    
}
