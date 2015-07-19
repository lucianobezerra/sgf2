package app.frames;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author luciano
 */
public class FixedLengthDocument extends PlainDocument {

  private final int iMaxLength;

  public FixedLengthDocument(int maxlen) {
    super();
    iMaxLength = maxlen;
  }

  @Override
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null) {
      return;
    }
    if (iMaxLength <= 0) {
      super.insertString(offset, str, attr);
      return;
    }

    int ilen = (getLength() + str.length());
    if (ilen <= iMaxLength) {
      super.insertString(offset, str, attr);
    } else {
      if (getLength() == iMaxLength) {
        return;
      }
      String newStr = str.substring(0, (iMaxLength - getLength()));
      super.insertString(offset, newStr, attr);
    }
  }
}
