package projet.info;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton extends JPanel implements ActionListener 
{
    
   private JButton rechercherinfo = new JButton("Recherche d'informations");
   private JButton mise_a_jour = new JButton("Mise à jour des données");
   private JButton reporting = new JButton("Reporting");


   public Bouton() 
   {
      setLayout(new BorderLayout(50, 50));
      JPanel lesBoutons = new JPanel();
      lesBoutons.add(rechercherinfo);
      lesBoutons.add(mise_a_jour);
      lesBoutons.add(reporting);
      add(lesBoutons, BorderLayout.NORTH);
  }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
