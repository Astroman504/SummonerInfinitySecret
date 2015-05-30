/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summonerinfinitysecret;

import java.applet.AudioClip;
import java.awt.event.*;
/**
 *
 * @author Christhian
 */
public class Menu extends javax.swing.JFrame {
    Global Every = new Global();
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        //new animationAndRepainting ();
    
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JButton();
        P2Button = new javax.swing.JButton();
        P1Button = new javax.swing.JButton();
        P2Button1 = new javax.swing.JButton();
        P1Button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hp1 = new javax.swing.JTextField();
        att1 = new javax.swing.JTextField();
        att2 = new javax.swing.JTextField();
        hp2 = new javax.swing.JTextField();
        P1Button2 = new javax.swing.JButton();
        P1Button3 = new javax.swing.JButton();
        P2Button2 = new javax.swing.JButton();
        P2Button3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Start.setText("Start");
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 103, 59));

        P2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/wizard100x100.png"))); // NOI18N
        P2Button.setPreferredSize(new java.awt.Dimension(100, 100));
        P2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2ButtonMouseClicked(evt);
            }
        });
        getContentPane().add(P2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 88, 109));

        P1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/wizard100x1002.png"))); // NOI18N
        P1Button.setHideActionText(true);
        P1Button.setPreferredSize(new java.awt.Dimension(100, 100));
        P1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1ButtonMouseClicked(evt);
            }
        });
        getContentPane().add(P1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 88, 109));

        P2Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/golem100x100.png"))); // NOI18N
        P2Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2Button1MouseClicked(evt);
            }
        });
        getContentPane().add(P2Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 88, 110));

        P1Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/golem100x1002.png"))); // NOI18N
        P1Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1Button1MouseClicked(evt);
            }
        });
        getContentPane().add(P1Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 88, 110));

        jLabel1.setText("attac1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel2.setText("hp1%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel3.setText("attac2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jLabel4.setText("hp2%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));
        getContentPane().add(hp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 50, -1));
        getContentPane().add(att1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 50, -1));
        getContentPane().add(att2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 50, -1));
        getContentPane().add(hp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 50, -1));

        P1Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/valkyrie100x1002.png"))); // NOI18N
        P1Button2.setHideActionText(true);
        P1Button2.setPreferredSize(new java.awt.Dimension(100, 100));
        P1Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1Button2MouseClicked(evt);
            }
        });
        getContentPane().add(P1Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 88, 109));

        P1Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/archer100x1002.png"))); // NOI18N
        P1Button3.setHideActionText(true);
        P1Button3.setPreferredSize(new java.awt.Dimension(100, 100));
        P1Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1Button3MouseClicked(evt);
            }
        });
        getContentPane().add(P1Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 88, 109));

        P2Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/valkyrie100x100.png"))); // NOI18N
        P2Button2.setPreferredSize(new java.awt.Dimension(100, 100));
        P2Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2Button2MouseClicked(evt);
            }
        });
        getContentPane().add(P2Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 88, 109));

        P2Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpg/ImageToBottons100x100/archer100x100.png"))); // NOI18N
        P2Button3.setPreferredSize(new java.awt.Dimension(100, 100));
        P2Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2Button3MouseClicked(evt);
            }
        });
        getContentPane().add(P2Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 88, 109));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificardatos(){
                if(Global.P1Vida <= 0 && Global.P2Vida <= 0 ){
                   Start.setEnabled(false);
               }
                else{
                    Start.setEnabled(true);
                }      
    }
    
    public void veri(){
        if(Global.P1Vida > 0){
            Start.setEnabled(true);
        }else{
            Start.setEnabled(false);
        }
    }
    
    
    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
        if(this.P1Button.isEnabled()==true){
            Global.P1 = "Mago";
            int viMago = Global.VidaMago;
            Global.P1Vida = viMago;
            
            int attMago = Global.AtaqueMago;
            Global.P1Ataque = attMago;
            String nombreatta1 = Global.NombreAttacMago;
            Global.NombreAttacP1 = nombreatta1;
            
            int attMago2 = Global.AtaqueMago2;
            Global.P1Ataque2 = attMago2;
            String nombreatta12 = Global.NombreAttacMago2;
            Global.NombreAttacP12 = nombreatta12;
            
            String nombre = "Mago";
            Global.P1 = nombre;
           
        }
        else
        {
        if(this.P1Button1.isEnabled()==true){
            Global.P1 = "Golem";
            int viGolem = Global.VidaGolem;
            Global.P1Vida = viGolem;
            
            int attGolem = Global.AtaqueGolem;
            Global.P1Ataque = attGolem;
            String nombreatta1 = Global.NombreAttacGolem;
            Global.NombreAttacP1 = nombreatta1;
            
            int attGolem2 = Global.AtaqueGolem2;
            Global.P1Ataque2 = attGolem2;
            String nombreatta2 = Global.NombreAttacGolem2;
            Global.NombreAttacP12 = nombreatta2;
            
            String nombre = "Golem";
            Global.P1 = nombre;
        
        }
        } 
        
        //
        if(this.P2Button.isEnabled()==true){
            Global.P2 = "Mago";
            int viMago = Global.VidaMago;
            Global.P2Vida = viMago;
            
            int attMago = Global.AtaqueMago;
            Global.P2Ataque = attMago;
            String nombreatta1 = Global.NombreAttacMago;
            Global.NombreAttacP2 = nombreatta1;
            
            int attMago2 = Global.AtaqueMago2;
            Global.P2Ataque2 = attMago2;
            String nombreatta12 = Global.NombreAttacMago2;
            Global.NombreAttacP21 = nombreatta12;
            
            String nombre = "Mago";
            Global.P2 = nombre;
           
        }
        else
        {
        if(this.P2Button1.isEnabled()==true){
            Global.P2 = "Golem";
            int viGolem = Global.VidaGolem;
            Global.P2Vida = viGolem;
            
            int attGolem = Global.AtaqueGolem;
            Global.P2Ataque = attGolem;
            String nombreatta1 = Global.NombreAttacGolem;
            Global.NombreAttacP2 = nombreatta1;
            
            int attGolem2 = Global.AtaqueGolem2;
            Global.P2Ataque2 = attGolem2;
            String nombreatta2 = Global.NombreAttacGolem2;
            Global.NombreAttacP21 = nombreatta2;
            
           
            String nombre = "Golem";
            Global.P2 = nombre;
        
        }
        } 
        //
        
        if(Start.isEnabled()){
            //animationAndRepainting var = new animationAndRepainting();
            
            StageScreen va = new StageScreen();
            va.setVisible(true);
            verificardatos();
            this.dispose();
            }
    }//GEN-LAST:event_StartMouseClicked

    private void P1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1ButtonMouseClicked
P1Button1.setEnabled(false);

    }//GEN-LAST:event_P1ButtonMouseClicked

    private void P2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2ButtonMouseClicked
P2Button1.setEnabled(false);   
    }//GEN-LAST:event_P2ButtonMouseClicked

    private void P1Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1Button1MouseClicked
P1Button.setEnabled(false);
    }//GEN-LAST:event_P1Button1MouseClicked

    private void P2Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2Button1MouseClicked
P2Button.setEnabled(false);    
    }//GEN-LAST:event_P2Button1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
att1.setEnabled(false);
hp1.setEnabled(false);
att2.setEnabled(false);
hp2.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void P1Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1Button2MouseClicked
       P1Button2.setEnabled(false);
    }//GEN-LAST:event_P1Button2MouseClicked

    private void P1Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1Button3MouseClicked
       P1Button3.setEnabled(false);
    }//GEN-LAST:event_P1Button3MouseClicked

    private void P2Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2Button2MouseClicked
        P2Button2.setEnabled(false);
    }//GEN-LAST:event_P2Button2MouseClicked

    private void P2Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2Button3MouseClicked
       P2Button3.setEnabled(false);
    }//GEN-LAST:event_P2Button3MouseClicked
   
    public void ButtonsP1() {
            P1Button.setEnabled(false);
            P1Button1.setEnabled(false);

        }

     public void ButtonsP2() {
            P2Button.setSelected(false);
            P2Button1.setSelected(false);

        }
     
      
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1Button;
    private javax.swing.JButton P1Button1;
    private javax.swing.JButton P1Button2;
    private javax.swing.JButton P1Button3;
    private javax.swing.JButton P2Button;
    private javax.swing.JButton P2Button1;
    private javax.swing.JButton P2Button2;
    private javax.swing.JButton P2Button3;
    private javax.swing.JButton Start;
    private javax.swing.JTextField att1;
    private javax.swing.JTextField att2;
    private javax.swing.JTextField hp1;
    private javax.swing.JTextField hp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void musicback(){
    
    
    }
}
