/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.character.p1;

import javax.swing.JFrame;

/**
 *
 * @author Christhian
 */
public class ventana extends JFrame{
    
    public ventana(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add (new dibujar());
        setTitle("Primer personaje");
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    public static void main (String [] args){
    new ventana();
    
    }
    
    
}
