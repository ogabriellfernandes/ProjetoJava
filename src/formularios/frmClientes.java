package formularios;

import classes.Dados;
import classes.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {
    private Dados msDados;
    private int cliAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        cmbCidade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DData = new com.toedter.calendar.JDateChooser();
        DNascimento = new com.toedter.calendar.JDateChooser();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastrar Clientes:");
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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("CPF:");

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
        jLabel4.setText("Endereço:");

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
        jLabel6.setText("Data de Nascimento:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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

        txtEndereco.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Identificação:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Cidade:");

        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Identificação", "CNH", "RG", "CPF", "Passaporte" }));
        cmbIdentificacao.setEnabled(false);

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Cidade", "Monte Alto", "Jaboticabal", "Taquaritinga", "São Paulo", "Ribeirão Preto", "Araraquara", "Matão", "São Joaquim da Barra", "Pirangi", "Cantanduva" }));
        cmbCidade.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Data:");

        DData.setEnabled(false);

        DNascimento.setEnabled(false);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNome)
                                            .addComponent(txtSobrenome)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtTelefone)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExcluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbIdentificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditar)))))
                        .addGap(0, 384, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
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
        txtCPF.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        DData.setEnabled(false);
        //limpar caixas de textos
        txtCPF.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
        novo = true; 
        
        txtCPF.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCPF.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o CPF do cliente");
            txtCPF.requestFocusInWindow();
            return;
        }
         
         if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir a descrição");
            txtNome.requestFocusInWindow();
            return;
        }
        if (txtSobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o preço");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        if (txtEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o endereço");
            txtEndereco.requestFocusInWindow();
            return;
        }
        
        if (txtTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir o telefone");
            txtTelefone.requestFocusInWindow();
            return;
        }
        
        if (cmbCidade.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selcione a cidade");
            cmbCidade.requestFocusInWindow();
            return;
        }
        
        if (cmbIdentificacao.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selcione a identificação");
            cmbIdentificacao.requestFocusInWindow();
            return;
        }
        
        if (DNascimento.getDate().after(new Date())){
            JOptionPane.showMessageDialog(rootPane, "Favor selcione data de nascimento");
            DNascimento.requestFocusInWindow();
            return;
        }
        
        int pos = msDados.posicaoCliente(txtCPF.getText());
            if (novo){
            if (pos != -1){
                JOptionPane.showMessageDialog(rootPane, "Este cliente não existe");
                txtCPF.setText("");
                txtCPF.requestFocusInWindow();
            return;
            }
            } else{
                if (pos == -1){
                JOptionPane.showMessageDialog(rootPane, "Este cliente já existe");
                txtCPF.requestFocusInWindow();
                return;
                }
            }
            
            Cliente mCliente = new Cliente(
                txtCPF.getText(),
                cmbIdentificacao.getSelectedIndex(),
                txtNome.getText(),
                txtSobrenome.getText(),
                txtEndereco.getText(),
                txtTelefone.getText(),
                cmbCidade.getSelectedIndex(),
                DNascimento.getDate(),
                DData.getDate());
                 
            String msg;
            if (novo){
                msg = msDados.adicionarCliente(mCliente);
            } else{
                msg = msDados.editarCliente(mCliente, pos);
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        //desabilitar os campos
        txtCPF.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        DData.setEnabled(false);
        //limpar caixas de textos
        txtCPF.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
        
        txtCPF.requestFocus();
        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtCPF.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        DNascimento.setEnabled(false);
        DData.setEnabled(false);
        
        txtCPF.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        DNascimento.setDate(new Date());
        DData.setDate(new Date());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        //caixa de texto
        txtCPF.setEnabled(false);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        DNascimento.setEnabled(true);
        DData.setEnabled(false);
        novo = false;
        txtNome.requestFocus();
       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       mostrarRegistro();
       preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esse cliente?");
                if (resposta !=0 ){
                    return;
                }
                String msg;
                msg = msDados.deletarCliente(cliAtual);
                JOptionPane.showMessageDialog(rootPane, msg);
                cliAtual = 0;
                mostrarRegistro();
                preencherTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Favor digite o nome do cliente");
        if (cliente.equals("")){
            return;
        }
        int pos = msDados.posicaoCliente(cliente);
        if (pos == -1){
            JOptionPane.showMessageDialog(rootPane, "Esse cliente não existe");
            return;
        }
            cliAtual = pos;
            mostrarRegistro();
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private void mostrarRegistro(){
       txtCPF.setText(msDados.getClientes()[cliAtual].getIdCliente());
       cmbIdentificacao.setSelectedIndex(msDados.getClientes()[cliAtual].getIdTipo());
       txtNome.setText(msDados.getClientes()[cliAtual].getNome());
       txtSobrenome.setText(msDados.getClientes()[cliAtual].getSobrenome());
       txtEndereco.setText(msDados.getClientes()[cliAtual].getEndereco());
       txtTelefone.setText(msDados.getClientes()[cliAtual].getTelefone());
       cmbCidade.setSelectedIndex(msDados.getClientes()[cliAtual].getIdCidade());
       DNascimento.setDate(msDados.getClientes()[cliAtual].getDNascimento());
       DData.setDate(msDados.getClientes()[cliAtual].getData());
    }
    
    private void preencherTabela(){
        String titulos[] = {"CPF", "Documento", "Nome", "Sobrenome", "Endereço", "Telefone", "Cidade", "Data de Nascimetno",
            "Data de hoje"};
        String registro[] = new String[9];
        mTabela = new DefaultTableModel(null, titulos);
        for (int i=0; i < msDados.numeroClientes(); i++){
            registro[0] = msDados.getClientes()[i].getIdCliente();
            registro[1] = idTipo (msDados.getClientes()[i].getIdTipo());
            registro[2] = msDados.getClientes()[i].getNome();
            registro[3] = msDados.getClientes()[i].getSobrenome();
            registro[4] = msDados.getClientes()[i].getEndereco();
            registro[5] = msDados.getClientes()[i].getTelefone();
            registro[6] = cidade (msDados.getClientes()[i].getIdCidade());
            registro[7] = ""+ msDados.getClientes()[i].getDNascimento();
            registro[8] = ""+ msDados.getClientes()[i].getData();
            mTabela.addRow(registro);
        }
        tblTabela.setModel(mTabela);
    }
    
    private String idTipo (int id){
        switch (id){
            case 1: return "CNH";
            case 2: return "RG";
            case 3: return "CPF";
            case 4: return "Passaporte";
            default: return "Nâo defenido";
        }
    }
    
    private String cidade (int id){
        switch (id){
            case 1: return "Monte Alto";
            case 2: return "Jaboticabal";
            case 3: return "Taquaritinga";
            case 4: return "São Paulo";
            case 5: return "Ribeirão Preto";
            case 6: return "Araraquara";
            case 7: return "Matão";
            case 8: return "São Joaquim da Barra";
            case 9: return "Pirangi";
            case 10: return "Cantanduva";
            default: return "Nâo defenido";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DData;
    private com.toedter.calendar.JDateChooser DNascimento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
