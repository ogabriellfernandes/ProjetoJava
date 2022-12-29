package formularios;

import classes.Dados;
import classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUsuarios extends javax.swing.JInternalFrame {
    private Dados msDados;
    private int usuAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtIDUsuario = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastrar Usuários:");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        txtNome.setEnabled(false);

        txtSobrenome.setEnabled(false);

        txtSenha.setEnabled(false);

        txtConfSenha.setToolTipText("");
        txtConfSenha.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("ID Usuário:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o perfil", "Administrador", "Usuário" }));
        cmbPerfil.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Sobrenome:");

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Conf. da Senha:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Perfil:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtIDUsuario.setEnabled(false);
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome)
                                .addComponent(txtSobrenome)
                                .addComponent(txtSenha)
                                .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnNovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEditar))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        //caixa de texto
        txtIDUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        //limpar caixas de textos
        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtSenha.setText("");
        txtConfSenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        novo = true; 
        txtIDUsuario.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o usuário");
            txtIDUsuario.requestFocusInWindow();
            return;
        }
         if (cmbPerfil.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selcione o perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }
         if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o nome");
            txtNome.requestFocusInWindow();
            return;
        }
        if (txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o sobrenome");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        String senha = new String (txtSenha.getPassword());
        String confirmar = new String (txtConfSenha.getPassword());
        
        if (senha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir a senha");
            txtSenha.requestFocusInWindow();
            return;
        }
        if (confirmar.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor confirmar a senha");
            txtConfSenha.requestFocusInWindow();
            return;
        }
        if (!senha.equals(confirmar)){
            JOptionPane.showMessageDialog(rootPane, "A confirmação não confere com a senha");
            txtSenha.setText("");
            txtConfSenha.setText("");
            txtSenha.requestFocusInWindow();
            return;
        }
        
        int pos = msDados.posicaoUsuario(txtIDUsuario.getText());
            if (novo){
            if (pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe");
                txtIDUsuario.setText("");
                txtIDUsuario.requestFocusInWindow();
            return;
            }
            } else{
                if (pos == -1){
                JOptionPane.showMessageDialog(rootPane, "Este usuário não existe");
                txtIDUsuario.requestFocusInWindow();
                return;
                }
            }
            
            Usuario mUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNome.getText(),
                txtSobrenome.getText(),
                senha,
                cmbPerfil.getSelectedIndex());
            
            String msg;
            if (novo){
                msg = msDados.adicionarUsuario(mUsuario);
            } else{
                msg = msDados.editarUsuario(mUsuario, pos);
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            
            
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        //desabilitar os campos
        txtIDUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
        //limpar caixas de textos
        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtSenha.setText("");
        txtConfSenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        txtIDUsuario.requestFocus();
        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtIDUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        //caixa de texto
        txtIDUsuario.setEnabled(false);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        novo = false;
        txtNome.requestFocus();
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       mostrarRegistro();
       preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse usuário?");
                if (resposta !=0 ){
                    return;
                }
                String msg;
                msg = msDados.deletarUsuario(usuAtual);
                JOptionPane.showMessageDialog(rootPane, msg);
                usuAtual = 0;
                mostrarRegistro();
                preencherTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String usuario = JOptionPane.showInputDialog("Favor inserir o ID do usuário");
        if (usuario.equals("")){
            return;
        }
        int pos = msDados.posicaoUsuario(usuario);
        if (pos == -1){
            JOptionPane.showMessageDialog(rootPane, "Esse usuário não existe");
            return;
        }
            usuAtual = pos;
            mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private void mostrarRegistro(){
       txtIDUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
       txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
       txtSobrenome.setText(msDados.getUsuarios()[usuAtual].getSobrenome());
       txtSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
       txtConfSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
       cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil()); 

    }
    
    private void preencherTabela(){
        String titulos[] = {"ID Usuário", "Nome", "Sobrenome", "Perfil"};
        String registro[] = new String[4];
        mTabela = new DefaultTableModel(null, titulos);
        for (int i=0; i < msDados.numeroUsuarios(); i++){
            registro[0] = msDados.getUsuarios()[i].getIdUsuario();
            registro[1] = msDados.getUsuarios()[i].getNome();
            registro[2] = msDados.getUsuarios()[i].getSobrenome();
            registro[3] = perfil (msDados.getUsuarios()[i].getPerfil());
            mTabela.addRow(registro);
        }
        tblTabela.setModel(mTabela);
    }
    
    private String perfil (int idPerfil){
        if (idPerfil == 1){
            return "Administrador";
        } else{
            return "Usuário";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
