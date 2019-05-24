package Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import simulacaodiscretam2.Menu;

public class ViewExponencial extends javax.swing.JFrame {

    public String numeroSimulacoes;
    public String nomeTXT;

    public ViewExponencial(String numeroSimulacoes, String titulo, String nomeTXT) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.numeroSimulacoes = numeroSimulacoes;
        this.setTitle(titulo);
        this.nomeTXT = nomeTXT;
    }

    private ViewExponencial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textInferior = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textMedia = new javax.swing.JTextField();
        buttonGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Função Exponencial");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Função Exponencial");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Limite Inferior");

        textInferior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Média");

        textMedia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonGerar.setText("Avançar");
        buttonGerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGerarMouseClicked(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(buttonGerar)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(buttonGerar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGerarMouseClicked
        DecimalFormat df = new DecimalFormat("######0");
        ArrayList<Double> numerosGerados = new ArrayList<Double>();

        Random gerador = new Random();
        double numero, limite, media, aux, alfa = 0, soma = 0;

        numero = Double.parseDouble(numeroSimulacoes);
        limite = Double.parseDouble(textInferior.getText());
        media = Double.parseDouble(textMedia.getText());
        alfa = (1) / (media - limite);

        for (int i = 0; i < numero; i++) {
            aux = limite - (1 / alfa) * Math.log(gerador.nextDouble());
            soma = soma + aux;
            numerosGerados.add(aux);
        }
        
        
        Collections.sort(numerosGerados);
        FileWriter arq = null;
        try {
            arq = new FileWriter(nomeTXT + ".txt");
        } catch (IOException ex) {
            Logger.getLogger(ViewExponencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        
        PrintWriter gravarArq = new PrintWriter(arq);
        for (int i = 0; i < numero; i++) {
            gravarArq.printf("%.2f\n", numerosGerados.get(i));
        }

        try {
            arq.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        this.dispose();


    }//GEN-LAST:event_buttonGerarMouseClicked

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
            java.util.logging.Logger.getLogger(ViewExponencial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewExponencial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewExponencial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewExponencial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExponencial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textInferior;
    private javax.swing.JTextField textMedia;
    // End of variables declaration//GEN-END:variables
}
