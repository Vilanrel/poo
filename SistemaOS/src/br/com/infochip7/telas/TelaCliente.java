package br.com.infochip7.telas;

import java.sql.*;
import br.com.infochip7.dal.ModuloConexao;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;


public class TelaCliente extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void pesquisar(){
        
    String sql = "SELECT * FROM SISTEMAOS.TBCLI WHERE IDCLI = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            rs=pst.executeQuery();
            
            if (rs.next()) {
                txtCodigo.setText(rs.getString(1));
                txtNome.setText(rs.getString(2));
                txtDtNasc.setText(rs.getString(3));
                txtCpfCnpj.setText(rs.getString(4));
                txtEndereco.setText(rs.getString(5));
                txtBairro.setText(rs.getString(6));
                txtCidade.setText(rs.getString(7));
                txtCep.setText(rs.getString(8));
                txtUf.setText(rs.getString(9));
                txtTelefone.setText(rs.getString(10));
                txtEmail.setText(rs.getString(11));
                txtCadastro.setText(rs.getString(12));
                txtIe.setText(rs.getString(13));
                txtCelular.setText(rs.getString(14));
                txtObservacoes.setText(rs.getString(15));
            } else {
                JOptionPane.showMessageDialog(null,"Usuário não cadastrado.");
                txtCodigo.setText(null);
                txtNome.setText(null);
                txtDtNasc.setText(null);
                txtCpfCnpj.setText(null);
                txtEndereco.setText(null);
                txtBairro.setText(null);
                txtCidade.setText(null);
                txtCep.setText(null);
                txtUf.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtCadastro.setText(null);
                txtIe.setText(null);
                txtCelular.setText(null);
                txtObservacoes.setText(null);
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void adicionar(){
        String sql = "INSERT INTO SISTEMAOS.TBCLI (IDCLI,NOME,DTNASC,CPF,ENDERECO,BAIRRO,MUNICIPIO,CEP,UF,TELEFONE,EMAIL,CADASTRO,IE,CELULAR,OBSERVACOES) VALUES (? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? )";
        try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtCodigo.getText());
                pst.setString(2,txtNome.getText());
                pst.setString(3,txtDtNasc.getText());
                pst.setString(4,txtCpfCnpj.getText());
                pst.setString(5,txtEndereco.getText());
                pst.setString(6,txtBairro.getText());
                pst.setString(7,txtCidade.getText());
                pst.setString(8,txtCep.getText());
                pst.setString(9,txtUf.getText());
                pst.setString(10,txtTelefone.getText());
                pst.setString(11,txtEmail.getText());
                pst.setString(12,txtCadastro.getText());
                pst.setString(13,txtIe.getText());
                pst.setString(14,txtCelular.getText());
                pst.setString(15,txtObservacoes.getText());
            
            if (((txtCodigo.getText().isEmpty()) || (txtNome.getText().isEmpty()) || (txtCpfCnpj.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {
            
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                txtCodigo.setText(null);
                txtNome.setText(null);
                txtDtNasc.setText(null);
                txtCpfCnpj.setText(null);
                txtEndereco.setText(null);
                txtBairro.setText(null);
                txtCidade.setText(null);
                txtCep.setText(null);
                txtUf.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtCadastro.setText(null);
                txtIe.setText(null);
                txtCelular.setText(null);
                txtObservacoes.setText(null);
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    private void alterar(){
        String sql = "UPDATE SISTEMAOS.TBCLI SET IDCLI=?,NOME=?,DTNASC=?,CPF=?,ENDERECO=?,BAIRRO=?,MUNICIPIO=?,CEP=?,UF=?,TELEFONE=?,EMAIL=?,CADASTRO=?,IE=?,CELULAR=?,OBSERVACOES=?";
        try {
            pst = conexao.prepareStatement(sql);
                pst.setString(1,txtCodigo.getText());
                pst.setString(2,txtNome.getText());
                pst.setString(3,txtDtNasc.getText());
                pst.setString(4,txtCpfCnpj.getText());
                pst.setString(5,txtEndereco.getText());
                pst.setString(6,txtBairro.getText());
                pst.setString(7,txtCidade.getText());
                pst.setString(8,txtCep.getText());
                pst.setString(9,txtUf.getText());
                pst.setString(10,txtTelefone.getText());
                pst.setString(11,txtEmail.getText());
                pst.setString(12,txtCadastro.getText());
                pst.setString(13,txtIe.getText());
                pst.setString(14,txtCelular.getText());
                pst.setString(15,txtObservacoes.getText());
            
            if (((txtCodigo.getText().isEmpty()) || (txtNome.getText().isEmpty()) || (txtCpfCnpj.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {
            
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Dados do cliente alterados cadastrado com sucesso!");
                      txtCodigo.setText(null);
                txtNome.setText(null);
                txtDtNasc.setText(null);
                txtCpfCnpj.setText(null);
                txtEndereco.setText(null);
                txtBairro.setText(null);
                txtCidade.setText(null);
                txtCep.setText(null);
                txtUf.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtCadastro.setText(null);
                txtIe.setText(null);
                txtCelular.setText(null);
                txtObservacoes.setText(null);
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void excluir(){
        String sql = "DELETE FROM SISTEMAOS.TBCLI WHERE IDCLI=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso.");
                txtCodigo.setText(null);
                txtNome.setText(null);
                txtDtNasc.setText(null);
                txtCpfCnpj.setText(null);
                txtEndereco.setText(null);
                txtBairro.setText(null);
                txtCidade.setText(null);
                txtCep.setText(null);
                txtUf.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtCadastro.setText(null);
                txtIe.setText(null);
                txtCelular.setText(null);
                txtObservacoes.setText(null);
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    
    
    public TelaCliente() {
        initComponents();
        conexao = ModuloConexao.conector();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCadastro = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblCodigo1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCadastro1 = new javax.swing.JTextField();
        txtCpfCnpj = new javax.swing.JTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        lblIe = new javax.swing.JLabel();
        txtIe = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        lblCidade1 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        lblCidade2 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtDtNasc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Cadastro de Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDoubleBuffered(true);
        setFocusCycleRoot(false);
        setFocusable(false);
        setName(""); // NOI18N
        setVisible(true);

        lblCodigo.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setText("Data Nascimento:");

        txtCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroActionPerformed(evt);
            }
        });

        lblCodigo1.setText("Código");

        txtCodigo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        txtNome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome1.setText("Nome");

        jLabel4.setText("Data Cadastro");

        txtCadastro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo1)
                            .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCadastro1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigo1))
                .addGap(0, 0, 0)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCpfCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCpfCnpj.setText("CPF/CNPJ:");

        lblIe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIe.setText("IE:");

        txtIe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCidade.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblUf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUf.setText("UF:");

        txtUf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCidade1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCidade1.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        lblCidade2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCidade2.setText("CEP:");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCelular.setText("Celular:");

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        lblObservacoes.setText("Observações:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Cadastro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtObservacoes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addGap(0, 0, 0)
                        .addComponent(txtEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpfCnpj)
                        .addGap(0, 0, 0)
                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblIe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addGap(0, 0, 0)
                        .addComponent(txtCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUf)
                        .addGap(0, 0, 0)
                        .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addGap(0, 0, 0)
                        .addComponent(txtEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCidade1)
                        .addGap(0, 0, 0)
                        .addComponent(txtBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCidade2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addGap(0, 0, 0)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblObservacoes)
                        .addGap(290, 290, 290)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 221, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 222, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCadastro, txtDtNasc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpj)
                    .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIe)
                    .addComponent(txtIe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade1)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade2)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 226, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 226, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCadastro, txtCodigo, txtDtNasc, txtNome});

        setBounds(0, 0, 459, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroActionPerformed

    private void txtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1ActionPerformed

    private void txtCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastro1ActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
    pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        adicionar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIe;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCadastro;
    private javax.swing.JTextField txtCadastro1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCpfCnpj;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIe;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
