package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Ultilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmFatura extends javax.swing.JInternalFrame {
        
    private Dados msDados;
    private DefaultTableModel mTabela;
    
     
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public frmFatura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtQuant = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JFormattedTextField();
        btnPesqCliente = new javax.swing.JToggleButton();
        cmbcliente = new javax.swing.JComboBox<>();
        bntPesqProduto = new javax.swing.JToggleButton();
        cmbproduto = new javax.swing.JComboBox<>();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JToggleButton();
        btnDeletarTodos = new javax.swing.JToggleButton();
        btnAdicionar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Sistema de Vendas:");
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

        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalhes);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Produto:");

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValor.setEnabled(false);

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setEnabled(false);

        txtQuant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtQuant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuant.setEnabled(false);

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyReleased(evt);
            }
        });

        btnPesqCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.jpg"))); // NOI18N

        bntPesqProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar.jpg"))); // NOI18N

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSalvar.setSelected(true);
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletarTodos.setText("Deletar Todos");
        btnDeletarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTodosActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbproduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdicionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeletar)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDeletarTodos)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesqCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cmbproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnDeletarTodos)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyReleased
        txtQuantidade.setText(txtQuantidade.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtQuantidadeKeyReleased

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (cmbproduto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar produto");
            cmbproduto.requestFocusInWindow();
            return;
        } try{
            DefaultTableModel modelo = (DefaultTableModel)tblDetalhes.getModel();
            int Linha = tblDetalhes.getRowCount();
            for(int i = 0; Linha > i; i++){
                String idTabela = Ultilidades.objectToString(tblDetalhes.getValueAt(i, 0));
                String idCombo = ((Opcoes)cmbproduto.getSelectedItem()).getValor();
                if (idTabela.equals(idCombo)){
                    modelo.removeRow(i);
                    totais();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbcliente.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar o cliente");
            cmbcliente.requestFocusInWindow();
            return;
        }
        int totalquant = new Integer(txtQuant.getText());
        if (totalquant == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir dados da venda");
            cmbproduto.requestFocusInWindow();
            return;
        }
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente finalizar a venda?");
        if (resposta !=0 ){
            return;
        }

        int numFatura = msDados.getNumeroFatura()+1;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/fatura.txt", true);
            pw = new PrintWriter(fw);

            String aux = "1|"
            + numFatura +"|"
            +((Opcoes)cmbcliente.getSelectedItem()).getValor()+"|"
            +((Opcoes)cmbcliente.getSelectedItem()).getDescricao()+"|"
            + txtData.getText();
            pw.println(aux);

            int num = tblDetalhes.getRowCount();
            for (int i = 0; i < num; i++){
                aux = "2|"
                + Ultilidades.objectToString(tblDetalhes.getValueAt(i, 0))+ "|"
                + Ultilidades.objectToString(tblDetalhes.getValueAt(i, 1))+ "|"
                + Ultilidades.objectToString(tblDetalhes.getValueAt(i, 2))+ "|"
                + Ultilidades.objectToString(tblDetalhes.getValueAt(i, 3))+ "|"
                + Ultilidades.objectToString(tblDetalhes.getValueAt(i, 4));
                pw.println(aux);
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(rootPane, "VENDA: "+ numFatura +" realizada com sucesso");
        msDados.setNumeroFatura(numFatura);
        cmbcliente.setSelectedIndex(0);
        LimparTabela();
        totais();
        cmbcliente.requestFocusInWindow();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esta venda?");
        if (resposta !=0 ){
            return;
    }//GEN-LAST:event_btnDeletarTodosActionPerformed
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        if (cmbproduto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar produto");
            cmbproduto.requestFocusInWindow();
            return;
        }
        if (txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar quantidade");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        
        //        if (!Ultilidades.isNumeric(txtQuantidade.getText())){
            //            JOptionPane.showMessageDialog(rootPane, "Favor inserir somente núemeros");
            //            txtQuantidade.setText("");
            //            txtQuantidade.requestFocusInWindow();
            //            return;
            //        
            //      }

        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if (quantidade <= 0){
            txtQuantidade.setText("");
            JOptionPane.showMessageDialog(rootPane, "Favor inserir números acima de zero");
            txtQuantidade.requestFocusInWindow();
            return;
        }
            // int pos = cmbproduto.getSelectedIndex() - 1;
            int pos = msDados.posicaoProduto(((Opcoes)cmbproduto.getSelectedItem()).getValor());

        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = "R$   "+ msDados.getProdutos()[pos].getPreco();
        registro[3] = ""+ quantidade;
        registro[4] = "R$   "+ (quantidade * msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);

        cmbproduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbproduto.requestFocusInWindow();
        totais();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Opcoes opc = new Opcoes("","Selecione um cliente");
        cmbcliente.addItem(opc);
            for (int i = 0; i < msDados.numeroClientes(); i++){
                opc = new Opcoes(
                msDados.getClientes()[i].getIdCliente(),
                msDados.getClientes()[i].getNome()+" "+
                msDados.getClientes()[i].getSobrenome());
                cmbcliente.addItem(opc);
            }
        
         opc = new Opcoes("", "Selecione um produto");
         cmbproduto.addItem(opc);
            for (int i = 0; i < msDados.numeroProdutos(); i++){
                opc = new Opcoes(
                msDados.getProdutos()[i].getIdProduto(),
                msDados.getProdutos()[i].getDescricao());
                cmbproduto.addItem(opc);
            }
            txtData.setText(Ultilidades.formatDate(new Date()));
            
            txtQuant.setText("0");
            txtValor.setText("0");
            preencherTabela();

    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bntPesqProduto;
    private javax.swing.JToggleButton btnAdicionar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JToggleButton btnDeletarTodos;
    private javax.swing.JToggleButton btnPesqCliente;
    private javax.swing.JToggleButton btnSalvar;
    private javax.swing.JComboBox<String> cmbcliente;
    private javax.swing.JComboBox<String> cmbproduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtQuant;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void totais(){
            int num = tblDetalhes.getRowCount();
            int somQuant = 0, somVal=0;
            for (int i = 0; i < num; i++){
            somQuant += Ultilidades.objectToInt(tblDetalhes.getValueAt(i, 3));
            somVal += Ultilidades.objectToInt(tblDetalhes.getValueAt(i, 4));
            }
            txtQuant.setText(""+ somQuant);
            txtValor.setText(""+ somVal);
        }
    
    public void LimparTabela(){
                try {
                    DefaultTableModel modelo = (DefaultTableModel)tblDetalhes.getModel();
                    int Linha = tblDetalhes.getRowCount();
                    for(int i = 0; Linha > i; i++){
                        modelo.removeRow(0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }            
    
    private void preencherTabela(){
        String titulos[] = {"ID Produto", "Descrição", "Preco", "Quantidade", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);  
        tblDetalhes.setModel(mTabela);
        
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblDetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
        }
}
