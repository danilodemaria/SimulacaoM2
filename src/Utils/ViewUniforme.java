package Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewUniforme extends javax.swing.JFrame {

    public String numeroSimulacoes;
    public String nomeTXT;

    public ViewUniforme(String numeroSimulacoes, String titulo, String nomeTXT) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.numeroSimulacoes = numeroSimulacoes;
        this.setTitle(titulo);
        this.nomeTXT = nomeTXT;
    }

    private ViewUniforme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textInferior = new javax.swing.JTextField();
        buttonGravaar = new javax.swing.JButton();
        textSuperior = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        buttonSelect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonSelect.setText("Selecionar");
        buttonSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSelectMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Função Uniforme");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Função Uniforme");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Inferior");

        textInferior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGravaar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonGravaar.setText("Avançar");
        buttonGravaar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGravaarMouseClicked(evt);
            }
        });

        textSuperior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Superior");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(textInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(textSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(buttonGravaar)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(32, 32, 32)
                .addComponent(buttonGravaar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSelectMouseClicked
    }//GEN-LAST:event_buttonSelectMouseClicked

    private void buttonGravaarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGravaarMouseClicked
        // TODO add your handling code here:
        ArrayList<Double> numerosGerados = new ArrayList<Double>();
        Random gerador = new Random();
        double inferior, superior, n, aux;

        inferior = Double.parseDouble(textInferior.getText());
        n = Double.parseDouble(numeroSimulacoes);
        superior = Double.parseDouble(textSuperior.getText());

        for (int i = 0; i < n; i++) {
            aux = gerador.nextDouble();
            numerosGerados.add(inferior + (superior - inferior) * aux);

        }

        FileWriter arq = null;
        try {
            arq = new FileWriter(nomeTXT + ".txt");
        } catch (IOException ex) {
            Logger.getLogger(ViewExponencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq);
        for (int i = 0; i < Integer.parseInt(numeroSimulacoes); i++) {
            gravarArq.printf("%.2f\n", numerosGerados.get(i));
        }

        try {
            arq.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        this.dispose();


    }//GEN-LAST:event_buttonGravaarMouseClicked

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
            java.util.logging.Logger.getLogger(ViewUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUniforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGravaar;
    private javax.swing.JButton buttonSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textInferior;
    private javax.swing.JTextField textSuperior;
    // End of variables declaration//GEN-END:variables
}
