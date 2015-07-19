package app.frames;

import app.models.Estabelecimento;
import app.models.EstabelecimentoTableModel;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JTable;

public class SearchEstabelecimento extends javax.swing.JDialog {

  List<Estabelecimento> estabelecimentos = null;

  public SearchEstabelecimento(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    estabelecimentos = Estabelecimento.findAll();
    data.setModel(new EstabelecimentoTableModel(estabelecimentos));
    ajustaColunas(data);
    txtSearch.requestFocusInWindow();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    data = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    buttonSearch = new javax.swing.JButton();
    txtSearch = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Pesquisa de Estabelecimentos");
    setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    setModal(true);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

    data.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    data.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3"
      }
    ));
    data.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        dataMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(data);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 230));

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
    jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    buttonSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
    buttonSearch.setText("OK");
    buttonSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSearchActionPerformed(evt);
      }
    });
    jPanel1.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 18, 100, 30));

    txtSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtSearchKeyPressed(evt);
      }
    });
    jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 510, 30));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 650, 60));

    setSize(new java.awt.Dimension(653, 328));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      estabelecimentos = Estabelecimento.find("nome_completo like ?", "%" + txtSearch.getText().toUpperCase() + "%");
      data.setModel(new EstabelecimentoTableModel(estabelecimentos));
      ajustaColunas(data);
    }
  }//GEN-LAST:event_txtSearchKeyPressed

  private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
    if(evt.getClickCount() == 2){
      buttonSearch.doClick();
    }
  }//GEN-LAST:event_dataMouseClicked

  private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
    getId();
    this.dispose();
  }//GEN-LAST:event_buttonSearchActionPerformed

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
      java.util.logging.Logger.getLogger(SearchEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SearchEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SearchEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SearchEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        SearchEstabelecimento dialog = new SearchEstabelecimento(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton buttonSearch;
  private javax.swing.JTable data;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtSearch;
  // End of variables declaration//GEN-END:variables

  private void ajustaColunas(JTable data) {
    data.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    data.getColumnModel().getColumn(0).setPreferredWidth(30);
    data.getColumnModel().getColumn(1).setPreferredWidth(60);
    data.getColumnModel().getColumn(2).setPreferredWidth(540);
  }
  
  public int getId(){
    return Integer.parseInt(data.getValueAt(data.getSelectedRow(), 0).toString());
  }
}
