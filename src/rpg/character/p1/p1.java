/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.character.p1;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
/**
 *
 * @author Christhian
 */
public class p1 {
    private String pokemon = "02.gif"; 
    
    private int dy;
    
    private int dx;
    
    private int y;
    
    private int x;
    
    private Image imagen;
    
    public p1(){
        x = 40;
        y = 60;
        ImageIcon img = new ImageIcon(this.getClass().getResource(pokemon));
        imagen = img.getImage();
        
    }
    
    public void mover(){
    x+=dx;
    y+=dy;
    }
    
    public int tenerX(){
    return x;
    }
    
    public int tenerY(){
    return y;
    }
    
    public Image tenerImagen(){
    return imagen;
    }
    
    // vamos a agregar un elementoq que escuche al teclado y agregamos un  adaptador
                                         //para poder usar solo un metodo de todos los que tiene el keyListenner
        public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key==KeyEvent.VK_LEFT){
        dx=-1;
        }
        if(key==KeyEvent.VK_RIGHT){
        dx=1;
        }
        if(key==KeyEvent.VK_UP){
        dy=-1;
        }
        if(key==KeyEvent.VK_DOWN){
        dy=1;
        }
        }
       
        public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key==KeyEvent.VK_LEFT){
        dx=0;
        }
        if(key==KeyEvent.VK_RIGHT){
        dx=0;
        }
        if(key==KeyEvent.VK_UP){
        dy=0;
        }
        if(key==KeyEvent.VK_DOWN){
        dy=0;
        }
        }
}
