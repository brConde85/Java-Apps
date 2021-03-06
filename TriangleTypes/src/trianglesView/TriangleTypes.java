/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglesView;

import java.awt.Color;

/**
 *
 * @author bruno
 */
public class TriangleTypes extends javax.swing.JFrame {

    /**
     * Creates new form TriangleTypes
     */
    public TriangleTypes() {
        initComponents();
        lblForm.setVisible(false);
        lblType.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jslC = new javax.swing.JSlider();
        jslA = new javax.swing.JSlider();
        jslB = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblForm = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 316)); // NOI18N
        jLabel1.setText("<html>&Delta;</html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -30, 200, 280));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("c");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("a");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("b");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("<html>Segment <b>c</b></html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("<html>Segment <b>a</b></html>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("<html>Segment <b>b</b></html>");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jslC.setMaximum(20);
        jslC.setValue(0);
        jslC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslCStateChanged(evt);
            }
        });
        getContentPane().add(jslC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jslA.setMaximum(20);
        jslA.setValue(0);
        jslA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslAStateChanged(evt);
            }
        });
        getContentPane().add(jslA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jslB.setMaximum(20);
        jslB.setValue(0);
        jslB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jslBStateChanged(evt);
            }
        });
        getContentPane().add(jslB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 40, 30));

        lblC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 30));

        lblA.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 30));

        lblB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 30));

        lblForm.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblForm.setForeground(new java.awt.Color(51, 102, 255));
        lblForm.setText("Form or not form a triangle");
        getContentPane().add(lblForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        lblType.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 102, 102));
        lblType.setText("Triangle type");
        getContentPane().add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lblForm.setVisible(true);
       
        int numA = jslA.getValue();
        int numB = jslB.getValue();
        int numC = jslC.getValue();
        if(numA < (numB+numC) && 
           numB < (numA+numC) && 
           numC < (numA+numB)){
            lblForm.setForeground(Color.blue);
            lblForm.setText("Form a triangle");            
            lblType.setVisible(true);
            if(numA == numB && numA == numC){
                lblType.setText("The triangle type is Equilateral");                              
            }else if(numA != numB && numA != numC){                
                if(Math.pow(numA, 2) == Math.pow(numB, 2) + Math.pow(numC, 2) ||
                   Math.pow(numB, 2) == Math.pow(numA, 2) + Math.pow(numC, 2) ||
                   Math.pow(numC, 2) == Math.pow(numB, 2) + Math.pow(numA, 2)){
                   lblType.setText("The triangle type is Rectangle");
                }else {
                    lblType.setText("The triangle type is Scalene");
                }
            }else{
                lblType.setText("The triangle type is Isosceles");
            }            
        }else{
            lblForm.setForeground(Color.red);
            lblForm.setText("Not Form a triangle");
            lblType.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jslAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslAStateChanged
        // TODO add your handling code here:        
        lblA.setText(Integer.toString(jslA.getValue()));
    }//GEN-LAST:event_jslAStateChanged

    private void jslBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(jslB.getValue()));
    }//GEN-LAST:event_jslBStateChanged

    private void jslCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jslCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(jslC.getValue()));
    }//GEN-LAST:event_jslCStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TriangleTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangleTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangleTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangleTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangleTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider jslA;
    private javax.swing.JSlider jslB;
    private javax.swing.JSlider jslC;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
