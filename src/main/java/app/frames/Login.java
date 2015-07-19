package app.frames;

import app.models.LoggedUser;
import app.models.User;
import app.util.Funcoes;
import java.awt.event.KeyEvent;
import app.security.Criptografia;

/**
 * @author luciano
 */
public class Login extends javax.swing.JDialog {

  private int conta = 0;

  public Login(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    editUser.requestFocusInWindow();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    btAcesso = new javax.swing.JButton();
    editSenha = new javax.swing.JPasswordField();
    jLabel4 = new javax.swing.JLabel();
    editUser = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Acesso ao Sistema");
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SGF - Acesso ao Sistema"));
    jPanel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Login:");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 30));

    jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Senha:");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

    btAcesso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    btAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
    btAcesso.setText("Login");
    btAcesso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btAcessoActionPerformed(evt);
      }
    });
    jPanel2.add(btAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, 30));

    editSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    editSenha.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        editSenhaKeyPressed(evt);
      }
    });
    jPanel2.add(editSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

    jLabel4.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(248, 28, 28));
    jLabel4.setText(" ");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 191, -1, -1));

    editUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jPanel2.add(editUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, 30));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, 330, 240));

    jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.gif"))); // NOI18N
    jScrollPane1.setViewportView(jLabel3);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    setSize(new java.awt.Dimension(536, 280));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessoActionPerformed
      String name = editUser.getText().toLowerCase();
      String pass = Criptografia.CriptaBase64(String.valueOf(editSenha.getPassword()));
      if (conta <= 2) {
        User user = User.findFirst("nome = ? and senha = ?", name, pass);
        if (user != null) {
          LoggedUser.getInstance().setId(user.getInteger("id"));
          LoggedUser.getInstance().setNome(user.getString("nome"));
          Menu menu = new Menu();
          menu.setVisible(true);
          this.dispose();
        } else {
          conta++;
          if (conta <= 2) {
            jLabel4.setText("<html>Usuário e/ou Senha Incorretos,<br> tentativa " + conta + " de 3!</html>");
          } else {
            Funcoes.informacao("Número de tentativas excedidas.\n\nO Sistema será finalizado");
            System.exit(0);
          }
        }
      }
    }//GEN-LAST:event_btAcessoActionPerformed

  private void editSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editSenhaKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btAcesso.doClick();
    }
  }//GEN-LAST:event_editSenhaKeyPressed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        Login dialog = new Login(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btAcesso;
  private javax.swing.JPasswordField editSenha;
  private javax.swing.JTextField editUser;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
