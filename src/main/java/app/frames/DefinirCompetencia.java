package app.frames;

import app.models.Competencia;
import app.models.DefineCompetencia;
import app.util.Funcoes;
import java.util.List;

public class DefinirCompetencia extends javax.swing.JDialog {

  public DefinirCompetencia(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    carregaComboAno();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    buttonSeleciona = new javax.swing.JButton();
    comboMes = new javax.swing.JComboBox();
    comboAno = new javax.swing.JComboBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Definir Competência");
    setModal(true);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Mês:");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, 60, 30));

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Ano:");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, 60, 30));

    buttonSeleciona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    buttonSeleciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
    buttonSeleciona.setText("Seleciona");
    buttonSeleciona.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSelecionaActionPerformed(evt);
      }
    });
    getContentPane().add(buttonSeleciona, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 209, 150, 30));

    comboMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
    getContentPane().add(comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 38, 180, 30));

    comboAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    comboAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
    getContentPane().add(comboAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 85, 120, 30));

    setSize(new java.awt.Dimension(330, 280));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void buttonSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionaActionPerformed
    if (comboMes.getSelectedIndex() > 0 && comboAno.getSelectedIndex() > 0) {
      String mes = String.format("%02d", comboMes.getSelectedIndex()); 
      String ano = comboAno.getSelectedItem().toString();
      Competencia competencia = Competencia.findFirst("mes = ? and ano = ?", mes, ano);
      if (competencia != null) {
        DefineCompetencia.getInstance().setId(competencia.getInteger("id"));
        DefineCompetencia.getInstance().setMes(competencia.getString("mes"));
        DefineCompetencia.getInstance().setAno(competencia.getString("ano"));
        this.dispose();
      } else {
        Funcoes.informacao("Competência Não Localizada!");
      }
    } else {
      Funcoes.erro("Favor selecionar Ano e Mês!");
    }
  }//GEN-LAST:event_buttonSelecionaActionPerformed

  public static void main(String args[]) {
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
      java.util.logging.Logger.getLogger(DefinirCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DefinirCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DefinirCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DefinirCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        DefinirCompetencia dialog = new DefinirCompetencia(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton buttonSeleciona;
  private javax.swing.JComboBox comboAno;
  private javax.swing.JComboBox comboMes;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables

  private void carregaComboAno() {
    List<Competencia> competencias = Competencia.findBySQL("select ano from competencias group by ano order by ano");
    int ultimo = 0;
    int ano = 0;
    comboAno.removeAllItems();
    comboAno.addItem("Selecione");
    for (int i = 0; i < competencias.size(); i++) {
      comboAno.addItem(competencias.get(i).get("ano"));
      ultimo++;
      if (ultimo == competencias.size()) {
        ano = competencias.get(i).getInteger("ano") + 1;
        comboAno.addItem(ano);
      }
    }
  }
}
