package simulacaodiscretam2;

import Utils.ViewExponencial;
import Utils.ViewNormal;
import Utils.ViewTriangular;
import Utils.ViewUniforme;

/**
 *
 * @author Danilo de Maria
 */
public class Menu extends javax.swing.JFrame {
    

    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        comboTEC.setEnabled(false);
        comboTS.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radioDeterministico = new javax.swing.JRadioButton();
        radioAleatorio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radioDetTS = new javax.swing.JRadioButton();
        radioAleaTS = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioFilaSem = new javax.swing.JRadioButton();
        radioFilaCom = new javax.swing.JRadioButton();
        textTEC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboTEC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        textTS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboTS = new javax.swing.JComboBox<>();
        textLimite = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonCalcula = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numSimu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulação Discreta - M2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULAÇÃO DISCRETA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TEC (tempo entre chegadas)");

        radioDeterministico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioDeterministico.setText("Determinístico");
        radioDeterministico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDeterministicoMouseClicked(evt);
            }
        });

        radioAleatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioAleatorio.setText("Aleatório");
        radioAleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioAleatorioMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TS (tempo de serviço)");

        radioDetTS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioDetTS.setText("Determinístico");
        radioDetTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDetTSMouseClicked(evt);
            }
        });

        radioAleaTS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioAleaTS.setText("Aleatório");
        radioAleaTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioAleaTSMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fila");

        radioFilaSem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioFilaSem.setText("Sem Limite");
        radioFilaSem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioFilaSemMouseClicked(evt);
            }
        });

        radioFilaCom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioFilaCom.setText("Com Limite");
        radioFilaCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioFilaComMouseClicked(evt);
            }
        });

        textTEC.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TEC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Função");

        comboTEC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exponencial", "Uniforme", "Triangular", "Normal" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("TS");

        textTS.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Função");

        comboTS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exponencial", "Uniforme", "Triangular", "Normal" }));

        textLimite.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Limite");

        buttonCalcula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonCalcula.setText("Calcular");
        buttonCalcula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCalculaMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Carros na fila");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Carros em atendimento");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Carros que já saíram");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Minutos à simular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(radioDeterministico)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioAleatorio))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textTEC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboTEC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(numSimu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(comboTS, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textTS, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioDetTS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioAleaTS)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radioFilaSem)
                                .addGap(18, 18, 18)
                                .addComponent(radioFilaCom))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(buttonCalcula))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDeterministico)
                            .addComponent(radioAleatorio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDetTS)
                            .addComponent(radioAleaTS)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioFilaSem)
                            .addComponent(radioFilaCom))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboTEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(textLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(numSimu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(buttonCalcula)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDeterministicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDeterministicoMouseClicked
        // TODO add your handling code here:
        radioDeterministico.setSelected(true);
        radioAleatorio.setSelected(false);
        textTEC.setEditable(true);
        comboTEC.setEnabled(false);
    }//GEN-LAST:event_radioDeterministicoMouseClicked

    private void radioAleatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioAleatorioMouseClicked
        // TODO add your handling code here:
        radioDeterministico.setSelected(false);
        radioAleatorio.setSelected(true);
        textTEC.setEditable(false);
        comboTEC.setEnabled(true);
    }//GEN-LAST:event_radioAleatorioMouseClicked

    private void radioDetTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDetTSMouseClicked
        // TODO add your handling code here:
        radioDetTS.setSelected(true);
        radioAleaTS.setSelected(false);
        textTS.setEditable(true);
        comboTS.setEnabled(false);
    }//GEN-LAST:event_radioDetTSMouseClicked

    private void radioAleaTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioAleaTSMouseClicked
        // TODO add your handling code here:
        radioAleaTS.setSelected(true);
        radioDetTS.setSelected(false);
        textTS.setEditable(false);
        comboTS.setEnabled(true);
    }//GEN-LAST:event_radioAleaTSMouseClicked

    private void radioFilaSemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioFilaSemMouseClicked
        // TODO add your handling code here:
        radioFilaSem.setSelected(true);
        radioFilaCom.setSelected(false);
        textLimite.setEditable(false);
    }//GEN-LAST:event_radioFilaSemMouseClicked

    private void radioFilaComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioFilaComMouseClicked
        // TODO add your handling code here:
        radioFilaSem.setSelected(false);
        radioFilaCom.setSelected(true);
        textLimite.setEditable(true);
    }//GEN-LAST:event_radioFilaComMouseClicked

    private void buttonCalculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCalculaMouseClicked

        verificaTEC();
        verificaTS();
        


    }//GEN-LAST:event_buttonCalculaMouseClicked

    public void verificaTEC() {
        if (comboTEC.getSelectedIndex() == 0) {
            ViewExponencial a = new ViewExponencial(numSimu.getText(), "TEMPO ENTRE CHEGADAS - EXPONENCIAL", "TEC");
            a.setVisible(true);
        }

        if (comboTEC.getSelectedIndex() == 1) {
            ViewUniforme a = new ViewUniforme(numSimu.getText(), "TEMPO ENTRE CHEGADAS - UNIFORME", "TEC");
            a.setVisible(true);
        }

        if (comboTEC.getSelectedIndex() == 2) {
            ViewTriangular a = new ViewTriangular(numSimu.getText(), "TEMPO ENTRE CHEGADAS - TRIANGULAR", "TEC");
            a.setVisible(true);
        }

        if (comboTEC.getSelectedIndex() == 3) {
            ViewNormal a = new ViewNormal(numSimu.getText(), "TEMPO ENTRE CHEGADAS - NORMAL", "TEC");
            a.setVisible(true);
        }
    }
    
    public  void verificaTS() {
        if (comboTS.getSelectedIndex() == 0) {
            ViewExponencial a = new ViewExponencial(numSimu.getText(), "TEMPO SERVIÇO - EXPONENCIAL", "TS");
            a.setVisible(true);
        }

        if (comboTS.getSelectedIndex() == 1) {
            ViewUniforme a = new ViewUniforme(numSimu.getText(), "TEMPO SERVIÇO - UNIFORME", "TS");
            a.setVisible(true);
        }

        if (comboTS.getSelectedIndex() == 2) {
            ViewTriangular a = new ViewTriangular(numSimu.getText(), "TEMPO SERVIÇO - TRIANGULAR", "TS");
            a.setVisible(true);
        }

        if (comboTS.getSelectedIndex() == 3) {
            ViewNormal a = new ViewNormal(numSimu.getText(), "TEMPO SERVIÇO - NORMAL", "TS");
            a.setVisible(true);
        }
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
    private javax.swing.JButton buttonCalcula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboTEC;
    private javax.swing.JComboBox<String> comboTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numSimu;
    private javax.swing.JRadioButton radioAleaTS;
    private javax.swing.JRadioButton radioAleatorio;
    private javax.swing.JRadioButton radioDetTS;
    private javax.swing.JRadioButton radioDeterministico;
    private javax.swing.JRadioButton radioFilaCom;
    private javax.swing.JRadioButton radioFilaSem;
    private javax.swing.JTextField textLimite;
    private javax.swing.JTextField textTEC;
    private javax.swing.JTextField textTS;
    // End of variables declaration//GEN-END:variables
}
