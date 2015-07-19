package app.util;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PreparaForm {

  public static void enableFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      component.setEnabled(true);
    }
  }

  public static void disableFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      component.setEnabled(false);
    }
  }

  public static void cleanFields(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JTextField) {
        JTextField textField = (JTextField) component;
        textField.setText(null);
      } else if (component instanceof JComboBox) {
        JComboBox comboField = (JComboBox) component;
        if (comboField.getItemCount() > 0) {
          comboField.setSelectedIndex(0);
        }
      } else if (component instanceof JCheckBox) {
        JCheckBox checkField = (JCheckBox) component;
        checkField.setSelected(false);
      } else if (component instanceof JLabel) {
        JLabel labelField = (JLabel) component;
        if ("idJLabel".equals(component.getName())) {
          labelField.setText(null);
        }
      }
    }
  }

  public static void setNewButtons(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JButton) {
        JButton jButton = (JButton) component;
        if ("salvar".equals(component.getName()) || "cancelar".equals(component.getName())) {
          jButton.setEnabled(true);
        } else {
          if ("novo".equals(component.getName()) || "alterar".equals(component.getName()) || "excluir".equals(component.getName()) || "pesquisar".equals(component.getName())) {
            jButton.setEnabled(false);
          }
        }
      }
    }
  }
  
  public static void setEditButtons(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JButton) {
        JButton jButton = (JButton) component;
        if ("salvar".equals(component.getName()) || "cancelar".equals(component.getName())) {
          jButton.setEnabled(true);
        } else {
          if ("novo".equals(component.getName()) || "alterar".equals(component.getName()) || "excluir".equals(component.getName()) || "pesquisar".equals(component.getName())) {
            jButton.setEnabled(false);
          }
        }
      }
    }
  }
  
  public static void setCancelButtons(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JButton) {
        JButton jButton = (JButton) component;
        if ("novo".equals(component.getName()) || "pesquisar".equals(component.getName())) {
          jButton.setEnabled(true);
        } else {
          if ("salvar".equals(component.getName()) || "alterar".equals(component.getName()) || "excluir".equals(component.getName()) || "cancelar".equals(component.getName())) {
            jButton.setEnabled(false);
          }
        }
      }
    }
  }
  
  public static void setSaveButtons(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JButton) {
        JButton jButton = (JButton) component;
        if ("salvar".equals(component.getName()) || "cancelar".equals(component.getName())) {
          jButton.setEnabled(false);
        } else {
          if ("novo".equals(component.getName()) || "alterar".equals(component.getName()) || "excluir".equals(component.getName()) || "pesquisar".equals(component.getName())) {
            jButton.setEnabled(true);
          }
        }
      }
    }
  }
  
  public static void setDeleteButtons(JPanel panel) {
    for (int i = 0; i < panel.getComponentCount(); i++) {
      Component component = panel.getComponent(i);
      if (component instanceof JButton) {
        JButton jButton = (JButton) component;
        if ("novo".equals(component.getName()) || "pesquisar".equals(component.getName())) {
          jButton.setEnabled(true);
        } else {
          if ("alterar".equals(component.getName()) || "salvar".equals(component.getName()) || "cancelar".equals(component.getName()) || "excluir".equals(component.getName())) {
            jButton.setEnabled(false);
          }
        }
      }
    }
  }
 
}
