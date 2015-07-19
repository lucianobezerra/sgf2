package app.frames;

import app.models.Estabelecimento;
import app.models.LoggedUser;
import app.util.Formatacao;
import app.util.Funcoes;
import app.util.PreparaForm;

public class Estabelecimentos extends javax.swing.JDialog {

  public Estabelecimentos(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    buttonNovo = new javax.swing.JButton();
    buttonAlterar = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();
    buttonCancelar = new javax.swing.JButton();
    buttonExcluir = new javax.swing.JButton();
    buttonPesquisar = new javax.swing.JButton();
    checkBoxStatus = new javax.swing.JCheckBox();
    jLabel7 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtCnpj = new javax.swing.JTextField();
    txtCnpj.setDocument(new FixedLengthDocument(18));
    comboTipo = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtFantasia = new javax.swing.JTextField();
    idJLabel = new javax.swing.JLabel();
    labelCodigo = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtCnes = new javax.swing.JTextField();
    txtCnes.setDocument(new FixedLengthDocument(7));
    jLabel3 = new javax.swing.JLabel();
    txtRazao = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Estabelecimentos");
    setModal(true);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    buttonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
    buttonNovo.setText("Novo");
    buttonNovo.setBorder(null);
    buttonNovo.setName("novo"); // NOI18N
    buttonNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonNovoActionPerformed(evt);
      }
    });
    jPanel1.add(buttonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 120, 30));

    buttonAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alterar.png"))); // NOI18N
    buttonAlterar.setText("Alterar");
    buttonAlterar.setBorder(null);
    buttonAlterar.setEnabled(false);
    buttonAlterar.setName("alterar"); // NOI18N
    buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonAlterarActionPerformed(evt);
      }
    });
    jPanel1.add(buttonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 25, 120, 30));

    buttonSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
    buttonSalvar.setText("Salvar");
    buttonSalvar.setBorder(null);
    buttonSalvar.setEnabled(false);
    buttonSalvar.setName("salvar"); // NOI18N
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });
    jPanel1.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 120, 30));

    buttonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
    buttonCancelar.setText("Cancelar");
    buttonCancelar.setBorder(null);
    buttonCancelar.setEnabled(false);
    buttonCancelar.setName("cancelar"); // NOI18N
    buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCancelarActionPerformed(evt);
      }
    });
    jPanel1.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 25, 120, 30));

    buttonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
    buttonExcluir.setText("Excluir");
    buttonExcluir.setBorder(null);
    buttonExcluir.setEnabled(false);
    buttonExcluir.setName("excluir"); // NOI18N
    buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonExcluirActionPerformed(evt);
      }
    });
    jPanel1.add(buttonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 25, 120, 30));

    buttonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
    buttonPesquisar.setText("Pesquisar");
    buttonPesquisar.setBorder(null);
    buttonPesquisar.setName("pesquisar"); // NOI18N
    buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonPesquisarActionPerformed(evt);
      }
    });
    jPanel1.add(buttonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 25, 120, 30));

    jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 780, 70));

    checkBoxStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    checkBoxStatus.setText(" ");
    checkBoxStatus.setEnabled(false);
    jPanel2.add(checkBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 40, 30));

    jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("Status:");
    jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 30));

    jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel6.setText("Cnpj/Cpf:");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

    txtCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtCnpj.setEnabled(false);
    jPanel2.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, 30));

    comboTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Física", "Jurídica" }));
    comboTipo.setEnabled(false);
    jPanel2.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, 30));

    jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("Tipo:");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 30));

    jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Nome Fantasia:");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

    txtFantasia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtFantasia.setEnabled(false);
    jPanel2.add(txtFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 460, 30));

    idJLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    idJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    idJLabel.setText("Código:");
    jPanel2.add(idJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));
    jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 30));

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Cnes:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

    txtCnes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtCnes.setEnabled(false);
    txtCnes.setName(""); // NOI18N
    jPanel2.add(txtCnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, 30));

    jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Razão Social:");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

    txtRazao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtRazao.setEnabled(false);
    jPanel2.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 460, 30));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

    setSize(new java.awt.Dimension(800, 420));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
    prepare("new");
  }//GEN-LAST:event_buttonNovoActionPerformed

  private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
    prepare("edit");
  }//GEN-LAST:event_buttonAlterarActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    if(verificaForm()){
      saveIt(txtCnes.getText(), txtRazao.getText(), txtFantasia.getText(), comboTipo.getSelectedIndex(), txtCnpj.getText(), checkBoxStatus.isSelected());      
    } else {
      Funcoes.erro("Preencha todos os dados!");
      txtCnes.requestFocusInWindow();
    }
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
    prepare("cancel");
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
    if (!labelCodigo.getText().isEmpty()) {
      int rec = Integer.valueOf(labelCodigo.getText());
      if (Estabelecimento.findById(rec).delete()) {
        prepare("delete");
        Funcoes.informacao("Registro N.: " + rec + " Excluído!");
      } else {
        Funcoes.erro("Registro N.: " + rec + " não foi Excluído!");
      }
    } else {
      Funcoes.informacao("Nenhum Registro para Excluir!");
    }
  }//GEN-LAST:event_buttonExcluirActionPerformed

  private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
    PreparaForm.cleanFields(jPanel2);
    SearchEstabelecimento searchEstabelecimento = new SearchEstabelecimento(null, true);
    searchEstabelecimento.setVisible(true);
    
    Estabelecimento estabelecimento = Estabelecimento.findById(searchEstabelecimento.getId());
    fillForm(estabelecimento);
  }//GEN-LAST:event_buttonPesquisarActionPerformed

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
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Estabelecimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        Estabelecimentos dialog = new Estabelecimentos(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonAlterar;
  private javax.swing.JButton buttonCancelar;
  private javax.swing.JButton buttonExcluir;
  private javax.swing.JButton buttonNovo;
  private javax.swing.JButton buttonPesquisar;
  private javax.swing.JButton buttonSalvar;
  private javax.swing.JCheckBox checkBoxStatus;
  private javax.swing.JComboBox comboTipo;
  private javax.swing.JLabel idJLabel;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel labelCodigo;
  private javax.swing.JTextField txtCnes;
  private javax.swing.JTextField txtCnpj;
  private javax.swing.JTextField txtFantasia;
  private javax.swing.JTextField txtRazao;
  // End of variables declaration//GEN-END:variables

  private void fillForm(Estabelecimento estabelecimento) {
    if (estabelecimento != null) {
      txtCnes.setText(estabelecimento.getString("cnes"));
      txtRazao.setText(estabelecimento.getString("nome"));
      txtFantasia.setText(estabelecimento.getString("nome_completo"));
      txtCnpj.setText(estabelecimento.getString("cpf_cnpj"));
      if (estabelecimento.getString("tipo").equals("F")) {
        comboTipo.setSelectedIndex(1);
        txtCnpj.setText(Formatacao.formatarCpf(estabelecimento.getString("cpf_cnpj")));
      } else {
        comboTipo.setSelectedIndex(2);
        txtCnpj.setText(Formatacao.formatarCnpj(estabelecimento.getString("cpf_cnpj")));
      }
      labelCodigo.setText(String.format("%05d", estabelecimento.getInteger("id")));
      checkBoxStatus.setSelected(estabelecimento.getBoolean("ativo"));
      Funcoes.habilitaBotoes(buttonAlterar, buttonExcluir, buttonNovo);
    }
  }

  private void prepare(String opcao) {
    switch (opcao) {
      case "new": {
        PreparaForm.enableFields(jPanel2);
        PreparaForm.cleanFields(jPanel2);
        PreparaForm.setNewButtons(jPanel1);
        txtCnes.requestFocusInWindow();
        break;
      }
      case "edit": {
        PreparaForm.enableFields(jPanel2);
        PreparaForm.setEditButtons(jPanel1);
        txtCnes.requestFocusInWindow();
        break;
      }
      case "save": {
        PreparaForm.disableFields(jPanel2);
        PreparaForm.setSaveButtons(jPanel1);
        break;
      }
      case "cancel": {
        PreparaForm.cleanFields(jPanel2);
        PreparaForm.disableFields(jPanel2);
        PreparaForm.setCancelButtons(jPanel1);
        break;
      }
      case "delete": {
        PreparaForm.cleanFields(jPanel2);
        PreparaForm.setDeleteButtons(jPanel1);
        break;
      }
    }
  }

  private void saveIt(String cnes, String razao, String fantasia, int tipo, String cnpj, Boolean status) {
    Estabelecimento estabelecimento = new Estabelecimento();
    estabelecimento.set("cnes",          cnes);
    estabelecimento.set("nome",          razao.toUpperCase());
    estabelecimento.set("nome_completo", fantasia.toUpperCase());
    estabelecimento.set("tipo",          tipo == 1 ? 'F' : 'J');
    estabelecimento.set("cpf_cnpj",      cnpj.replaceAll("\\.", "").replaceAll("\\/", "").replaceAll("\\-", ""));
    estabelecimento.set("ativo",         status);
    estabelecimento.set("operador_id",   LoggedUser.getInstance().getId());
    if (!labelCodigo.getText().isEmpty()) {
      estabelecimento.set("id", Integer.valueOf(labelCodigo.getText()));
    }
    if (estabelecimento.saveIt()) {
      labelCodigo.setText(String.format("%05d", estabelecimento.getInteger("id")));
      prepare("save");
    } else {
      Funcoes.erro("Erro: " + estabelecimento.errors());
    }

  }

  private boolean verificaForm() {
    boolean result = true;
    if (txtCnes.getText().isEmpty() || txtCnpj.getText().isEmpty() || txtRazao.getText().isEmpty() || txtFantasia.getText().isEmpty()) {
      result = false;
    }
    return result;
  }
}
