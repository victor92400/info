/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.info;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Victor
 */
//Classe écoutant notre premier bouton
public class BoutonListenerMise_a_jour extends FenetreMise_a_jour implements ActionListener
{
  
    //Redéfinition de la méthode actionPerformed()
    @Override
    public void actionPerformed(ActionEvent arg0) 
    {

        //FenetreMise_a_jour();
        System.out.println("cocococococo");
    }
  
}
