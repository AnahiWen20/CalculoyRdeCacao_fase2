
package Main;

import Formulario.Form1;
import Formulario.Form2;
import Formulario.Form3;
import Formulario.Form4;
import java.awt.Color;
import javax.swing.ImageIcon;
import swing.EventNavigation;
import swing.NavigationBackgroundColor;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        getContentPane().setBackground(new Color(240, 240, 240));
        navigation1.addItem(new ImageIcon(getClass().getResource("/icons/menu-principal.png")));
        navigation1.addItem(new ImageIcon(getClass().getResource("/icons/cacao.png")));
        navigation1.addItem(new ImageIcon(getClass().getResource("/icons/probabilidad.png")));
        navigation1.addItem(new ImageIcon(getClass().getResource("/icons/graficos.png")));
        navigation1.addEvent(new EventNavigation(){
        @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransitions1.display(new Form1(), navigation1.getAnimator());
                } else if (index == 1) {
                    panelTransitions1.display(new Form2(), navigation1.getAnimator());
                } else if (index == 2) {
                    panelTransitions1.display(new Form3(), navigation1.getAnimator());
                } else if (index == 3) {
                    panelTransitions1.display(new Form4(), navigation1.getAnimator());
                
                     }
            }

            @Override
            public void afterSelected(int index) {

            }
        });
        NavigationBackgroundColor nb = new NavigationBackgroundColor();
        nb.apply(getContentPane());
        nb.addColor(0, new Color(27, 51, 69));
        nb.addColor(1, new Color(80, 54, 68));
        nb.addColor(2, new Color(30, 54, 85));
        nb.addColor(3, new Color(126, 209, 132));
        navigation1.setnavigationBackgroundColor(nb);
    
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransitions1 = new Transitions.PanelTransitions();
        navigation1 = new swing.Navigation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1186, 446));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelTransitions1.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout navigation1Layout = new javax.swing.GroupLayout(navigation1);
        navigation1.setLayout(navigation1Layout);
        navigation1Layout.setHorizontalGroup(
            navigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        navigation1Layout.setVerticalGroup(
            navigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTransitions1Layout = new javax.swing.GroupLayout(panelTransitions1);
        panelTransitions1.setLayout(panelTransitions1Layout);
        panelTransitions1Layout.setHorizontalGroup(
            panelTransitions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTransitions1Layout.setVerticalGroup(
            panelTransitions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransitions1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(navigation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransitions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(panelTransitions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        navigation1.initSelectedIndex(2);
    }//GEN-LAST:event_formWindowOpened

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Navigation navigation1;
    private Transitions.PanelTransitions panelTransitions1;
    // End of variables declaration//GEN-END:variables
}
