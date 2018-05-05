package br.com.infochip7.telas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLdata = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadastroEquipamentos = new javax.swing.JMenuItem();
        jMenuCadastroUsuarios = new javax.swing.JMenuItem();
        jMenuCadastroOcorrencia = new javax.swing.JMenuItem();
        jMenuRelatórios = new javax.swing.JMenu();
        jMenuRelatoriosOcorrencia = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGO - Sistema de Gerenciamento de Ocorrências");
        setSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLdata.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuCadastro.setText("Cadastro");

        jMenuCadastroEquipamentos.setText("Equipamentos");
        jMenuCadastro.add(jMenuCadastroEquipamentos);

        jMenuCadastroUsuarios.setText("Usuários");
        jMenuCadastro.add(jMenuCadastroUsuarios);

        jMenuCadastroOcorrencia.setText("Ocorrência");
        jMenuCadastro.add(jMenuCadastroOcorrencia);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatórios.setText("Relatórios");

        jMenuRelatoriosOcorrencia.setText("Ocorrências");
        jMenuRelatórios.add(jMenuRelatoriosOcorrencia);

        jMenuBar1.add(jMenuRelatórios);

        jMenuAjuda.setText("Ajuda");

        jMenuAjudaSobre.setText("Sobre");
        jMenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuAjudaSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLdata, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLdata, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      Date dataSistema = new Date();
      SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
      jLdata.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowOpened

    private void jMenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAjudaSobreActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLdata;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuAjudaSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuCadastroEquipamentos;
    private javax.swing.JMenuItem jMenuCadastroOcorrencia;
    private javax.swing.JMenuItem jMenuCadastroUsuarios;
    private javax.swing.JMenuItem jMenuRelatoriosOcorrencia;
    private javax.swing.JMenu jMenuRelatórios;
    // End of variables declaration//GEN-END:variables
}
