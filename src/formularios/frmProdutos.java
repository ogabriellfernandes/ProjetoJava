package formularios;

import classes.Dados;
import classes.Ultilidades;
import classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProdutos extends javax.swing.JInternalFrame {
    private Dados msDados;
    private int proAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbImposto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtIDProduto = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();
        txtPreco = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastrar Produtos:");
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

        txtDescricao.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("ID Produto:");

        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o imposto", "0%", "10%", "15%" }));
        cmbImposto.setEnabled(false);
        cmbImposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbImpostoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Descrição:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Preço:");

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Anotação:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Imposto:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtIDProduto.setEnabled(false);
        txtIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdutoActionPerformed(evt);
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        txtAnotacao.setEnabled(false);
        jScrollPane2.setViewportView(txtAnotacao);

        txtPreco.setEnabled(false);
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(btnEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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
        txtIDProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);
        //limpar caixas de textos
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);
        novo = true; 
        txtIDProduto.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o ID do poduto");
            txtIDProduto.requestFocusInWindow();
            return;
        }
         if (cmbImposto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selcione a porcentagem do imposto");
            cmbImposto.requestFocusInWindow();
            return;
        }
         if (txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir a descrição");
            txtDescricao.requestFocusInWindow();
            return;
        }
        if (txtPreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o preço");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        double preco =  Double.parseDouble(txtPreco.getText());
        if (preco <= 0){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir números acima de zero");
            txtPreco.requestFocusInWindow();
            return;
        }
        
        int pos = msDados.posicaoProduto(txtDescricao.getText());
            if (novo){
            if (pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este produto não existe");
                txtIDProduto.setText("");
                txtIDProduto.requestFocusInWindow();
            return;
            }
            } else{
                if (pos == -1){
                JOptionPane.showMessageDialog(rootPane, "Este produto já existe");
                txtIDProduto.requestFocusInWindow();
                return;
                }
            }
            
            Produto mProduto = new Produto(
                txtIDProduto.getText(),
                txtDescricao.getText(),
                preco,
                cmbImposto.getSelectedIndex(),
                txtAnotacao.getText());    
                 
            String msg;
            if (novo){
                msg = msDados.adicionarProduto(mProduto);
            } else{
                msg = msDados.editarProduto(mProduto, pos);
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        //desabilitar os campos
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        txtAnotacao.setEnabled(false);
        cmbImposto.setEnabled(false);
        //limpar caixas de textos
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);
        
        txtIDProduto.requestFocus();
        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        txtAnotacao.setEnabled(false);
        cmbImposto.setEnabled(false);
        
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdutoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        //caixa de texto
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);
        novo = false;
        txtAnotacao.requestFocus();
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       mostrarRegistro();
       preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse produto?");
                if (resposta !=0 ){
                    return;
                }
                String msg;
                msg = msDados.deletarProduto(proAtual);
                JOptionPane.showMessageDialog(rootPane, msg);
                proAtual = 0;
                mostrarRegistro();
                preencherTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Favor digite o nome do produto");
        if (produto.equals("")){
            return;
        }
        int pos = msDados.posicaoProduto(produto);
        if (pos == -1){
            JOptionPane.showMessageDialog(rootPane, "Esse produto não existe");
            return;
        }
            proAtual = pos;
            mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbImpostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbImpostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbImpostoActionPerformed

    private void txtPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyReleased
        txtPreco.setText(txtPreco.getText().replaceAll("[^0-9]", "."));
        
    }//GEN-LAST:event_txtPrecoKeyReleased
    
    private void mostrarRegistro(){
       txtIDProduto.setText(msDados.getProdutos()[proAtual].getIdProduto());
       txtDescricao.setText(msDados.getProdutos()[proAtual].getDescricao());
       txtPreco.setText(""+ msDados.getProdutos()[proAtual].getPreco());
       cmbImposto.setSelectedIndex(msDados.getProdutos()[proAtual].getImposto());
       txtAnotacao.setText(msDados.getProdutos()[proAtual].getAnotacao());
    }
    
    private void preencherTabela(){
        String titulos[] = {"ID Produto", "Descrição", "Preço", "Imposto", "Anotação"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        for (int i=0; i < msDados.numeroProdutos(); i++){
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescricao();
            registro[2] = "R$  "+ (msDados.getProdutos()[i].getPreco());
            registro[3] = imposto (msDados.getProdutos()[i].getImposto());
            registro[4] = msDados.getProdutos()[i].getAnotacao();
            mTabela.addRow(registro);
        }
        tblTabela.setModel(mTabela);
    }
    
    private String imposto (int idIMPOSTO){
        switch (idIMPOSTO){
            case 1: return "0%";
            case 2: return "10%";
            case 3: return "15%";
            default: return "Nâo defenido";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
