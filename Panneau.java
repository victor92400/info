
package projet.info;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel
{
    public void paintComponent(Graphics g)
    {
       //Vous verrez cette phrase chaque fois que la méthode sera invoquée
       //System.out.println("Je suis exécutée !"); 
       //g.fillRoundRect(375, 175, 150, 60, 5, 5);
       
       Font font = new Font("Courier", Font.BOLD, 20);
       g.setFont(font);
       g.setColor(Color.red);          
       g.drawString("Tiens ! Le Site du Zéro !", 100, 20);  
       
    }
}
