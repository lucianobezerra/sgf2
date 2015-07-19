package app.models;

import app.models.Estabelecimento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstabelecimentoTableModel extends AbstractTableModel {

  private static final int COL_ID = 0;
  private static final int COL_CNES = 1;
  private static final int COL_FANTASIA = 2;
  private final String[] colunas;
  private final List<Estabelecimento> estabelecimentos;

  public EstabelecimentoTableModel(List<Estabelecimento> estabelecimentos) {
    this.colunas = new String[]{"Cod", "Cnes", "Fantasia"};
    this.estabelecimentos = new ArrayList<>(estabelecimentos);
  }

  @Override
  public int getRowCount() {
    return estabelecimentos.size();
  }

  @Override
  public int getColumnCount() {
    return 3;
  }

  @Override
  public Object getValueAt(int row, int column) {
    Estabelecimento estabelecimento = estabelecimentos.get(row);
    switch(column){
      case COL_ID: return String.format("%03d", estabelecimento.getInteger("id"));
      case COL_CNES: return estabelecimento.get("cnes");
      case COL_FANTASIA: return estabelecimento.get("nome_completo");
    }
    return null;
  }

  @Override
  public String getColumnName(int column) {
    return this.colunas[column];
  }

  @Override
  public void setValueAt(Object aValue, int row, int column) {
    Estabelecimento estabelecimento = estabelecimentos.get(row);
    switch(column){
      case COL_ID: estabelecimento.set("id", aValue.toString());
      case COL_CNES: estabelecimento.set("cnes", aValue.toString());
      case COL_FANTASIA: estabelecimento.set("nome_completo", aValue.toString());
    }
  }

  @Override
  public Class<?> getColumnClass(int column) {
    return String.class;
  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
  }
  
  public Estabelecimento get(int row){
    return estabelecimentos.get(row);
  }

}
