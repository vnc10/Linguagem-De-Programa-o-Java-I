/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teste;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author vinicius
 */
public class ImprimirExcluirTodosCarga extends javax.swing.JFrame {

    /**
     * Creates new form ImprimirExcluirTodosCarga
     */
    public ImprimirExcluirTodosCarga() {
        initComponents();
    }


    private BDVeiculos bdVeiculos;

    public BDVeiculos getBdVeiculos() {
        return bdVeiculos;
    }

    public void setBdVeiculos(BDVeiculos bdVeiculos) {
        this.bdVeiculos = bdVeiculos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}}, new String[]{"Placa", "Marca", "Modelo", "Cor", "Qtd Rodas", "Veloc Max", "Qtd Pist", "Potencia", "Tara", "Carga Max", "Qtd Letras"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Imprimir Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(202, 202, 202).addComponent(jButton1).addGap(27, 27, 27).addComponent(jButton2).addGap(18, 18, 18).addComponent(jButton3).addContainerGap(287, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jButton2).addComponent(jButton3)).addGap(0, 17, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modeloTab = new DefaultTableModel();
        modeloTab = (DefaultTableModel) jTable1.getModel();
        int posLin = 0;
        modeloTab.setRowCount(posLin);
        if (bdVeiculos.getCargas().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carro de cargas vazio", "ERRO", 0);
        } else {
            for (int i = 0; i < bdVeiculos.getCargas().size(); i++) {
                modeloTab.insertRow(posLin, new Object[]{bdVeiculos.getCargas().get(i).getPlaca(), bdVeiculos.getCargas().get(i).getMarca(), bdVeiculos.getCargas().get(i).getModelo(), bdVeiculos.getCargas().get(i).getCor(), bdVeiculos.getCargas().get(i).getQtdRodas(), bdVeiculos.getCargas().get(i).getVelocMax(), bdVeiculos.getCargas().get(i).getMotor().getQtdPist(), bdVeiculos.getCargas().get(i).getMotor().getPotencia(), bdVeiculos.getCargas().get(i).getTara(), bdVeiculos.getCargas().get(i).getCargaMax(), bdVeiculos.getCargas().get(i).calcular()});
                posLin++;
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modeloTab = new DefaultTableModel();
        modeloTab = (DefaultTableModel) jTable1.getModel();
        int posLin = 0;
        modeloTab.setRowCount(posLin);
        if (bdVeiculos.getCargas().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carro de carga vazio", "ERRO", 0);
        } else {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                modeloTab.removeRow(posLin);
                posLin++;
            }

            bdVeiculos.getCargas().clear();

            JOptionPane.showMessageDialog(null, "Carros de carga excluidos com sucesso!", "Ok", 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saida do sistema", -1);

        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ImprimirExcluirTodosCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirExcluirTodosCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirExcluirTodosCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirExcluirTodosCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirExcluirTodosCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
