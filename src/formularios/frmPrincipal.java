package formularios;

import Classes.BackGround;
import classes.Dados;

public class frmPrincipal extends javax.swing.JFrame {
   
   private int perfil;
   private String senha;
   private String usuario;
   private Dados msDados;
   
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
   
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
   
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setPerfil(int perfil){
        this.perfil = perfil;
    }
    public frmPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesck = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoTrocarSenha = new javax.swing.JMenuItem();
        mnuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosRelatorioVenda = new javax.swing.JMenuItem();
        mnuMovimentosNovaVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesck.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDesckLayout = new javax.swing.GroupLayout(dpnDesck);
        dpnDesck.setLayout(dpnDesckLayout);
        dpnDesckLayout.setHorizontalGroup(
            dpnDesckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        dpnDesckLayout.setVerticalGroup(
            dpnDesckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivos");

        mnuArquivoClientes.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoClientes.setText("Clientes");
        mnuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClientesActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoUsuarios.setText("Usuários");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivoTrocarSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoTrocarSenha.setText("Trocar Senha");
        mnuArquivoTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarSenhaActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarSenha);

        mnuArquivoTrocarUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoTrocarUsuario.setText("Trocar Usuário");
        mnuArquivoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setText("Movimentos");

        mnuMovimentosRelatorioVenda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuMovimentosRelatorioVenda.setText("Relatório de Venda");
        mnuMovimentos.add(mnuMovimentosRelatorioVenda);

        mnuMovimentosNovaVenda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuMovimentosNovaVenda.setText("Nova Venda");
        mnuMovimentosNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosNovaVendaActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosNovaVenda);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaSobreActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaAjudaActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesck)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnDesck)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        frmUsuarios mUsuarios = new frmUsuarios();
        mUsuarios.setDados(msDados);
        dpnDesck.add(mUsuarios);
        mUsuarios.show();
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(msDados);
        dpnDesck.add(msProdutos);
        msProdutos.show();
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClientesActionPerformed
        frmClientes msClientes = new frmClientes();
        msClientes.setDados(msDados);
        dpnDesck.add(msClientes);
        msClientes.show();
    }//GEN-LAST:event_mnuArquivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround)dpnDesck).setImagem("/imagens/background.jpg");
        
        if (perfil == 2){
            mnuArquivoClientes.setEnabled(false);
            mnuArquivoProdutos.setEnabled(false);
            mnuArquivoUsuarios.setEnabled(false);
            mnuMovimentosRelatorioVenda.setEnabled(false);     
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        msDados.salvarTudo();
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarUsuarioActionPerformed
        this.setVisible(false);
        frmLogin mLogin= new frmLogin();
        mLogin.setDados(msDados);
        mLogin.setLocationRelativeTo(null);
        mLogin.setVisible(true);
    }//GEN-LAST:event_mnuArquivoTrocarUsuarioActionPerformed

    private void mnuArquivoTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarSenhaActionPerformed
        frmTrocarSenha msSenha = new frmTrocarSenha(this, rootPaneCheckingEnabled);
        msSenha.setLocationRelativeTo(null);
        msSenha.setSenha(senha);
        msSenha.setUsuario(usuario);
        msSenha.setDados(msDados);
        msSenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuArquivoTrocarSenhaActionPerformed

    private void mnuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaSobreActionPerformed
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled);  
    }//GEN-LAST:event_mnuAjudaSobreActionPerformed

    private void mnuMovimentosNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosNovaVendaActionPerformed
        frmFatura mFatura = new frmFatura();
        mFatura.setDados(msDados);
        dpnDesck.add(mFatura);
        mFatura.show();
    }//GEN-LAST:event_mnuMovimentosNovaVendaActionPerformed

    private void mnuAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaAjudaActionPerformed
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled); 
    }//GEN-LAST:event_mnuAjudaAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesck;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoTrocarSenha;
    private javax.swing.JMenuItem mnuArquivoTrocarUsuario;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosNovaVenda;
    private javax.swing.JMenuItem mnuMovimentosRelatorioVenda;
    // End of variables declaration//GEN-END:variables
}
