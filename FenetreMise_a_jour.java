/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.info;

import javax.swing.JFrame;

/**
 *
 * @author Victor
 */

public class FenetreMise_a_jour
{
  public FenetreMise_a_jour()
  {
      
    JFrame fenm = new JFrame();
                
    //Définit un titre pour notre fenêtre
    fenm.setTitle("Ma première fenêtre Java");
    //Définit sa taille : 400 pixels de large et 100 pixels de haut
    fenm.setSize(400, 100);
    //Nous demandons maintenant à notre objet de se positionner au centre
    fenm.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Et enfin, la rendre visible        
    fenm.setVisible(true);
  }       
}