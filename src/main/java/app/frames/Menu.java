package app.frames;

import app.models.DefineCompetencia;
import app.models.LoggedUser;

/**
 *
 * @author luciano
 */
public class Menu extends javax.swing.JFrame {

  public Menu() {
    initComponents();
    jLabel1.setText(LoggedUser.getInstance().getNome());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenuItem5 = new javax.swing.JMenuItem();
    jToolBar1 = new javax.swing.JToolBar();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuItem4 = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();

    jMenuItem5.setText("jMenuItem5");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Sistema de Gestão Financeira");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jToolBar1.setRollover(true);

    jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendario_icone.jpg"))); // NOI18N
    jButton1.setText("Competência");
    jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton1.setFocusable(false);
    jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton1.setMaximumSize(new java.awt.Dimension(100, 55));
    jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton1);

    jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/single-op-chat.png"))); // NOI18N
    jButton2.setText("Usuários");
    jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton2.setFocusable(false);
    jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton2.setMaximumSize(new java.awt.Dimension(100, 55));
    jButton2.setMinimumSize(new java.awt.Dimension(100, 55));
    jButton2.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton2);

    jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
    jButton4.setText("Ambiente");
    jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton4.setFocusable(false);
    jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton4.setMaximumSize(new java.awt.Dimension(100, 55));
    jButton4.setMinimumSize(new java.awt.Dimension(100, 55));
    jButton4.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });
    jToolBar1.add(jButton4);

    jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caderno.png"))); // NOI18N
    jButton3.setText("Autorização");
    jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton3.setFocusable(false);
    jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton3.setMaximumSize(new java.awt.Dimension(100, 55));
    jButton3.setMinimumSize(new java.awt.Dimension(100, 55));
    jButton3.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton3);

    jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-careerreports.gif"))); // NOI18N
    jButton5.setText("Relatórios");
    jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton5.setFocusable(false);
    jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton5.setMaximumSize(new java.awt.Dimension(100, 55));
    jButton5.setMinimumSize(new java.awt.Dimension(100, 55));
    jButton5.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton5);

    jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Notepad.png"))); // NOI18N
    jButton6.setText("Leiame");
    jButton6.setBorder(null);
    jButton6.setFocusable(false);
    jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton6.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton6);

    jButton7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about-blue.png"))); // NOI18N
    jButton7.setText("Sobre");
    jButton7.setBorder(null);
    jButton7.setFocusable(false);
    jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton7.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton7);

    jButton8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
    jButton8.setText("Sair");
    jButton8.setBorder(null);
    jButton8.setFocusable(false);
    jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton8.setPreferredSize(new java.awt.Dimension(100, 55));
    jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    jToolBar1.add(jButton8);

    getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
    jPanel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel1.setText("null");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("null");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 5, 230, -1));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 800, 28));

    jMenu1.setText("Tabelas");

    jMenuItem1.setText("Estabelecimentos");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem1ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setText("Competências");
    jMenu1.add(jMenuItem2);

    jMenuItem3.setText("Rubricas");
    jMenu1.add(jMenuItem3);

    jMenuItem4.setText("Operadores");
    jMenu1.add(jMenuItem4);
    jMenu1.add(jSeparator1);

    jMenuItem6.setText("Sair");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItem6ActionPerformed(evt);
      }
    });
    jMenu1.add(jMenuItem6);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    setSize(new java.awt.Dimension(800, 410));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    System.exit(0);
  }//GEN-LAST:event_jMenuItem6ActionPerformed

  private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Estabelecimentos estabelecimentos = new Estabelecimentos(this, true);
    estabelecimentos.setVisible(true);
  }//GEN-LAST:event_jMenuItem1ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    DefinirCompetencia defineCompetencia = new DefinirCompetencia(this, true);
    defineCompetencia.setVisible(true);
    jLabel2.setText("Competência: " + DefineCompetencia.getInstance().getMes()+"/"+DefineCompetencia.getInstance().getAno());
  }//GEN-LAST:event_jButton4ActionPerformed

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      System.out.println(ex.getLocalizedMessage());
    }
    //</editor-fold>

    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Menu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JToolBar jToolBar1;
  // End of variables declaration//GEN-END:variables
}
