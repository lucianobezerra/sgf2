package app;

import app.frames.Login;
import javax.swing.SwingUtilities;
import org.javalite.activejdbc.Base;

public class App {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/sgf", "postgres", "postgres");
        Login login = new Login(null, true);
        login.setVisible(true);
      }
    });
  }

}
