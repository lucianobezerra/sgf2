package app.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CompetenciaTableModel extends AbstractTableModel {

  private final List<Competencia> competencias;
  private final String[] colunas = {"Cód", "Mês", "Ano", "Ativo"};

  public CompetenciaTableModel() {
    this.competencias = new ArrayList<>();
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }
  
  
  
  public void addrow(Competencia cmpt){
    this.competencias.add(cmpt);
    this.fireTableDataChanged();
  }
  
  public void removeAll() {
    this.competencias.clear();
    this.fireTableDataChanged();
  }
  

  @Override
  public int getRowCount() {
    return this.competencias.size();
  }

  @Override
  public int getColumnCount() {
    return this.colunas.length;
  }

  @Override
  public Object getValueAt(int row, int column) {
    switch (column) {
      case 0: return competencias.get(row).getString("id");
      case 1: return competencias.get(row).getString("mes");
      case 2: return competencias.get(row).getString("ano");
      case 3: return competencias.get(row).getString("ativo");
    }
    return null;
  }

}
