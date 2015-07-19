package app.models;

/**
 * @author luciano
 */
public class LoggedUser {

  private String nome;
  private Integer id;

  private LoggedUser() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  private static class OperadorLogadoHolder {
    private final static LoggedUser instance = new LoggedUser();
  }

  public static Boolean isLogged() {
    if (OperadorLogadoHolder.instance != null) {
      return true;
    }
    return false;
  }


  public static LoggedUser getInstance() {
    return OperadorLogadoHolder.instance;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
