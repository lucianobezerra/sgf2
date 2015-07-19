package app.models;

public class DefineCompetencia {

  private int id;
  private String mes;
  private String ano;

  private DefineCompetencia() {
  }
  
  private static class CompetenciaDefinidaHolder{
    private final static DefineCompetencia competencia = new DefineCompetencia();
  }
  
  public static DefineCompetencia getInstance(){
    return CompetenciaDefinidaHolder.competencia;
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public String getMes() {
    return mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public String getAno() {
    return ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }

}
