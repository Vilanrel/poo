package br.com.infochip7.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblLogo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenCad = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadUsu = new javax.swing.JMenuItem();
        MenCadOs = new javax.swing.JMenuItem();
        MenCadEqui = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenSob = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGO - Sistema de Gerenciamento de Ocorrências");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setBackground(java.awt.SystemColor.activeCaptionBorder);
        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/Logo.jpg"))); // NOI18N

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 204));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("Data");

        MenCad.setText("Cadastro");

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/cliente.png"))); // NOI18N
        MenCadCli.setText("Clientes");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        MenCad.add(MenCadCli);

        MenCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        MenCadUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/Usuário.png"))); // NOI18N
        MenCadUsu.setText("Usuários");
        MenCadUsu.setEnabled(false);
        MenCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadUsuActionPerformed(evt);
            }
        });
        MenCad.add(MenCadUsu);

        MenCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenCadOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/Ocorrência.jpg"))); // NOI18N
        MenCadOs.setText("OS");
        MenCad.add(MenCadOs);

        MenCadEqui.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        MenCadEqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infochip7/icones/Equipamentos.png"))); // NOI18N
        MenCadEqui.setText("Equipamentos");
        MenCad.add(MenCadEqui);

        jMenuBar1.add(MenCad);

        MenRel.setText("Relatórios");
        MenRel.setEnabled(false);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Serviços");
        MenRel.add(jMenuItem1);

        jMenuBar1.add(MenRel);

        MenSob.setText("Ajuda");

        MenAjuSob.setText("Sobre");
        MenAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobActionPerformed(evt);
            }
        });
        MenSob.add(MenAjuSob);

        jMenuBar1.add(MenSob);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLogo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(82, 82, 82))
        );

        setSize(new java.awt.Dimension(810, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadUsuActionPerformed
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_MenCadUsuActionPerformed
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair ?", "Atenção" , JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed
    private void MenAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobActionPerformed
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        desktop.add(sobre);
    }//GEN-LAST:event_MenAjuSobActionPerformed

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_MenCadCliActionPerformed
    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenu MenCad;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadEqui;
    private javax.swing.JMenuItem MenCadOs;
    public static javax.swing.JMenuItem MenCadUsu;
    public static javax.swing.JMenu MenRel;
    private javax.swing.JMenu MenSob;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
