package simulacaodiscretam2;

import Utils.ViewExponencial;
import Utils.ViewNormal;
import Utils.ViewTriangular;
import Utils.ViewUniforme;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.PrintWriter;

/**
 *
 * @author Danilo de Maria
 */
public class Menu extends javax.swing.JFrame {

    public int option = -1;
    public int TECfixo = -1;
    public int TSfixo = -1;
    public ArrayList<Integer> TEC = new ArrayList<Integer>();
    public ArrayList<Integer> TS = new ArrayList<Integer>();
    public ArrayList<Carro> saida = new ArrayList<Carro>();

    public Queue<Carro> chegada = new LinkedList<Carro>();
    Queue<Carro> fifo = new LinkedList<Carro>();

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
        buttonConfigura = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numSimu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        radio10 = new javax.swing.JRadioButton();
        radio100 = new javax.swing.JRadioButton();
        radio1000 = new javax.swing.JRadioButton();
        radioFinal = new javax.swing.JRadioButton();
        buttoInicia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulação Discreta - M2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIMULAÇÃO DISCRETA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TEC (tempo entre chegadas)");

        radioDeterministico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioDeterministico.setText("Determinístico");
        radioDeterministico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDeterministicoActionPerformed(evt);
            }
        });

        radioAleatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioAleatorio.setText("Aleatório");
        radioAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAleatorioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TS (tempo de serviço)");

        radioDetTS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioDetTS.setText("Determinístico");
        radioDetTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDetTSActionPerformed(evt);
            }
        });

        radioAleaTS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioAleaTS.setText("Aleatório");
        radioAleaTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAleaTSActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fila");

        radioFilaSem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioFilaSem.setText("Sem Limite");
        radioFilaSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFilaSemActionPerformed(evt);
            }
        });

        radioFilaCom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioFilaCom.setText("Com Limite");
        radioFilaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFilaComActionPerformed(evt);
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

        buttonConfigura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonConfigura.setText("Configurar");
        buttonConfigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfiguraActionPerformed(evt);
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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Avançar (minutos)");

        radio10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio10.setText("10");
        radio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio10ActionPerformed(evt);
            }
        });

        radio100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio100.setText("100");
        radio100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio100ActionPerformed(evt);
            }
        });

        radio1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio1000.setText("1000");
        radio1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1000ActionPerformed(evt);
            }
        });

        radioFinal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioFinal.setText("Até final");
        radioFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFinalActionPerformed(evt);
            }
        });

        buttoInicia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttoInicia.setText("Iniciar");
        buttoInicia.setEnabled(false);
        buttoInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoIniciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(radioAleaTS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(radio10)
                                .addGap(18, 18, 18)
                                .addComponent(radio100))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttoInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radioFilaSem)
                                .addGap(18, 18, 18)
                                .addComponent(radioFilaCom))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radio1000)
                        .addGap(18, 18, 18)
                        .addComponent(radioFinal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonConfigura)
                .addGap(310, 310, 310))
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(numSimu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(radio10)
                    .addComponent(radio100)
                    .addComponent(radio1000)
                    .addComponent(radioFinal))
                .addGap(18, 18, 18)
                .addComponent(buttonConfigura)
                .addGap(10, 10, 10)
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
                    .addComponent(jLabel17)
                    .addComponent(buttoInicia))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDeterministicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDeterministicoActionPerformed
        // TODO add your handling code here:
        radioDeterministico.setSelected(true);
        radioAleatorio.setSelected(false);
        textTEC.setEditable(true);
        comboTEC.setEnabled(false);
    }//GEN-LAST:event_radioDeterministicoActionPerformed

    private void radioAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAleatorioActionPerformed
        // TODO add your handling code here:
        radioDeterministico.setSelected(false);
        radioAleatorio.setSelected(true);
        textTEC.setEditable(false);
        comboTEC.setEnabled(true);
    }//GEN-LAST:event_radioAleatorioActionPerformed

    private void radioDetTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDetTSActionPerformed
        // TODO add your handling code here:
        radioDetTS.setSelected(true);
        radioAleaTS.setSelected(false);
        textTS.setEditable(true);
        comboTS.setEnabled(false);
    }//GEN-LAST:event_radioDetTSActionPerformed

    private void radioAleaTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAleaTSActionPerformed
        // TODO add your handling code here:
        radioAleaTS.setSelected(true);
        radioDetTS.setSelected(false);
        textTS.setEditable(false);
        comboTS.setEnabled(true);
    }//GEN-LAST:event_radioAleaTSActionPerformed

    private void radioFilaSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFilaSemActionPerformed
        // TODO add your handling code here:
        radioFilaSem.setSelected(true);
        radioFilaCom.setSelected(false);
        textLimite.setEditable(false);
    }//GEN-LAST:event_radioFilaSemActionPerformed

    private void radioFilaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFilaComActionPerformed
        // TODO add your handling code here:
        radioFilaSem.setSelected(false);
        radioFilaCom.setSelected(true);
        textLimite.setEditable(true);
    }//GEN-LAST:event_radioFilaComActionPerformed

    private void buttonConfiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfiguraActionPerformed
        // TODO add your handling code here:
        if (validacoes()) {

            if (radioDeterministico.isSelected()) {
                TECfixo = Integer.parseInt(textTEC.getText());
            } else {
                verificaTEC();
            }

            if (radioDetTS.isSelected()) {
                TSfixo = Integer.parseInt(textTS.getText());
            } else {
                verificaTS();
            }

        }

    }//GEN-LAST:event_buttonConfiguraActionPerformed

    private void radio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio10ActionPerformed
        // TODO add your handling code here:
        radio10.setSelected(true);
        radio100.setSelected(false);
        radio1000.setSelected(false);
        radioFinal.setSelected(false);
    }//GEN-LAST:event_radio10ActionPerformed

    private void radio100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio100ActionPerformed
        // TODO add your handling code here:
        radio10.setSelected(false);
        radio100.setSelected(true);
        radio1000.setSelected(false);
        radioFinal.setSelected(false);
    }//GEN-LAST:event_radio100ActionPerformed

    private void radio1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1000ActionPerformed
        // TODO add your handling code here:
        radio10.setSelected(false);
        radio100.setSelected(false);
        radio1000.setSelected(true);
        radioFinal.setSelected(false);
    }//GEN-LAST:event_radio1000ActionPerformed

    private void radioFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFinalActionPerformed
        // TODO add your handling code here:
        radio10.setSelected(false);
        radio100.setSelected(false);
        radio1000.setSelected(false);
        radioFinal.setSelected(true);
    }//GEN-LAST:event_radioFinalActionPerformed

    private void buttoIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoIniciaActionPerformed
        // TODO add your handling code here:
        if (radioFilaCom.isSelected()) {
            try {
                calculaGeral(true, Integer.parseInt(textLimite.getText()), option);
            } catch (InterruptedException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                calculaGeral(false, 0, option);
            } catch (InterruptedException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttoIniciaActionPerformed

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

    public void verificaTS() {
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

    public void geraRelatorio() {
        String dataArquivo = null;
        FileWriter arq = null;
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");

        dataArquivo = simpleDateformat.format(now) + ", ";
        simpleDateformat = new SimpleDateFormat("dd");
        dataArquivo = dataArquivo + simpleDateformat.format(now) + " de ";
        simpleDateformat = new SimpleDateFormat("MMMM");
        dataArquivo = dataArquivo + simpleDateformat.format(now);
        simpleDateformat = new SimpleDateFormat("YYYY");
        dataArquivo = dataArquivo + " de " + simpleDateformat.format(now) + ".";

        try {
            arq = new FileWriter("Resultado.txt");
        } catch (IOException ex) {
            Logger.getLogger(ViewExponencial.class.getName()).log(Level.SEVERE, null, ex);
        }

        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("\t\t--RESULTADO LAVAÇÃO DE CARROS--\n");
        gravarArq.printf("___________________________________________________________");
        gravarArq.printf("\nNÚMERO MÉDIO DE ENTIDADES NA FILA                    : %d", 100);
        gravarArq.printf("\nTAXA MÉDIA DE OCUPAÇÃO DO SERVIDOR                   : %d", 100);
        gravarArq.printf("\nTEMPO MÉDIA DE UMA ENTIDADE NA FILA                  : %d", 100);
        gravarArq.printf("\nTEMPO MÉDIA NO SISTEMA                               : %d", 100);
        gravarArq.printf("\nCONTATOR DE ENTIDADES                                : %d", 100);
        gravarArq.printf("\nNÚMERO MÁXIMO DE ENTIDADES SIMULTÂNEAS NO SISTEMA    : %d", 100);
        gravarArq.printf("\nNÚMERO DE CARROS CARROS LAVADOS AO FINAL DA SIMULAÇÃO: %d", 100);
        gravarArq.printf("\n___________________________________________________________");
        gravarArq.printf("\n\nAlunos: Danilo de Maria e Vinicius da Palma Martins");
        gravarArq.printf("\n%s", dataArquivo);

        try {
            arq.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public void calculaGeral(boolean comFila, int limiteFila, int tempoAvanco) throws InterruptedException {
        // recebe true se for com fila e o limte da fila
        // se receber false, limite da fila é zero, ou seja, sem limite
        // tempo avanço 1 para 10, 2 para 100, 3 para 1000 e 4 sem parar
        // sleep(2000);
        TEC = le_arquivo("TEC.txt"); //leitura dos valores de TEC
        TS = le_arquivo("TS.txt");  //leitura dos valores de TS
        Carro servidor = null;

        for (int i = 0; i < Double.parseDouble(numSimu.getText()); i++) {

            Carro carro = new Carro(); //para cada i é criado um carro
            carro.setTEC(TEC.get(i));  //valor gerado é colocado para a chegada
            carro.setTS(TS.get(i));    //valor gerado é colocado para o TS
            carro.setEntrar_fila(i + carro.getTEC()); //momento i em que entrará no sistema

            chegada.add(carro);

            Carro entrada = chegada.peek();
            if (i == entrada.getEntrar_fila()) {
                fifo.add(entrada);
                chegada.poll();
                System.out.println("Carro na fila: i = " + i);
            }

        }

    }

    public ArrayList<Integer> le_arquivo(String nome) {

        ArrayList<Integer> valores = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nome));
            while (br.ready()) {
                String linha = br.readLine();
                linha = linha.replace(",", ".");
                Double var = Double.parseDouble(linha);
                valores.add(var.intValue());
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return valores;
    }

    public boolean validacoes() {

        if (numSimu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar um tempo para simulação.");
            numSimu.requestFocus();
            buttoInicia.setEnabled(false);
            return false;
        }

        if (radio10.isSelected()) {
            option = 1;
        } else if (radio100.isSelected()) {
            option = 2;
        } else if (radio1000.isSelected()) {
            option = 3;
        } else if (radioFinal.isSelected()) {
            option = 4;
        } else {
            JOptionPane.showMessageDialog(null, "Você precisa informar quanto tempo a simulação deverá avançar por vez.");
            buttoInicia.setEnabled(false);
            return false;
        }

        if (!radioAleatorio.isSelected() && !radioDeterministico.isSelected()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar um tempo entre chegadas.");
            buttoInicia.setEnabled(false);
            return false;
        }

        if (!radioAleaTS.isSelected() && !radioDetTS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar um tempo de serviço.");
            buttoInicia.setEnabled(false);
            return false;
        }

        if (!radioFilaCom.isSelected() && !radioFilaSem.isSelected()) {
            JOptionPane.showMessageDialog(null, "Você precisa informar as opções de limite de fila.");
            buttoInicia.setEnabled(false);
            return false;
        }
        buttoInicia.setEnabled(true);
        return true;
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
    private javax.swing.JButton buttoInicia;
    private javax.swing.JButton buttonConfigura;
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
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JRadioButton radio10;
    private javax.swing.JRadioButton radio100;
    private javax.swing.JRadioButton radio1000;
    private javax.swing.JRadioButton radioAleaTS;
    private javax.swing.JRadioButton radioAleatorio;
    private javax.swing.JRadioButton radioDetTS;
    private javax.swing.JRadioButton radioDeterministico;
    private javax.swing.JRadioButton radioFilaCom;
    private javax.swing.JRadioButton radioFilaSem;
    private javax.swing.JRadioButton radioFinal;
    private javax.swing.JTextField textLimite;
    private javax.swing.JTextField textTEC;
    private javax.swing.JTextField textTS;
    // End of variables declaration//GEN-END:variables
}
