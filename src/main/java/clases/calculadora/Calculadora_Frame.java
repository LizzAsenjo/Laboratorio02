/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases.calculadora;

public class Calculadora_Frame extends javax.swing.JFrame {

    public Calculadora_Frame() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    private Calculadora getCalculadora(){
       float elemento_1=Float.parseFloat(txt_num1.getText());
       float elemento_2=Float.parseFloat(txt_num2.getText());
       Calculadora ope = new Calculadora(elemento_1, elemento_2);
       return ope;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_num2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        btm_sum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btm_minus = new javax.swing.JButton();
        btm_multi = new javax.swing.JButton();
        btm_div = new javax.swing.JButton();
        txt_num1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        txt_num2.setBackground(new java.awt.Color(255, 255, 204));
        txt_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CALCULADORA");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setText("Resultado");

        lbl_resultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_resultado.setText("#######");

        btm_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suma_png.png"))); // NOI18N
        btm_sum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btm_sum.setMaximumSize(new java.awt.Dimension(56, 57));
        btm_sum.setMinimumSize(new java.awt.Dimension(56, 57));
        btm_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_sumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Elemento 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Elemento 2");

        btm_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resta-png.png"))); // NOI18N
        btm_minus.setHideActionText(true);
        btm_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_minusActionPerformed(evt);
            }
        });

        btm_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multi_png.png"))); // NOI18N
        btm_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_multiActionPerformed(evt);
            }
        });

        btm_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/div_png.png"))); // NOI18N
        btm_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_divActionPerformed(evt);
            }
        });

        txt_num1.setBackground(new java.awt.Color(255, 255, 204));
        txt_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btm_sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btm_multi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btm_minus)
                            .addComponent(btm_div)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_resultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btm_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btm_sum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btm_div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btm_multi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_minusActionPerformed

        Calculadora ope = getCalculadora();
        lbl_resultado.setText(ope.restar()+"");
    }//GEN-LAST:event_btm_minusActionPerformed

    private void btm_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_multiActionPerformed

        Calculadora ope = getCalculadora();
        lbl_resultado.setText(String.valueOf(ope.multiplicar()));
    }//GEN-LAST:event_btm_multiActionPerformed

    private void btm_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_divActionPerformed

        Calculadora ope = getCalculadora();
        lbl_resultado.setText(ope.dividir()+"");
    }//GEN-LAST:event_btm_divActionPerformed

    private void txt_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num1ActionPerformed

    }//GEN-LAST:event_txt_num1ActionPerformed

    private void btm_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_sumActionPerformed
        Calculadora ope = getCalculadora();
        lbl_resultado.setText(ope.sumar()+"");
    }//GEN-LAST:event_btm_sumActionPerformed

    private void txt_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num2ActionPerformed

    }//GEN-LAST:event_txt_num2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_div;
    private javax.swing.JButton btm_minus;
    private javax.swing.JButton btm_multi;
    private javax.swing.JButton btm_sum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_resultado;
    public javax.swing.JTextField txt_num1;
    public javax.swing.JTextField txt_num2;
    // End of variables declaration//GEN-END:variables
}
