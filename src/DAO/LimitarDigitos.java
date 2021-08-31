
package DAO;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitarDigitos extends PlainDocument{
    private int limite;

  public LimitarDigitos(int tamanho) {
   super();
   this.limite = tamanho;
   }

  public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
    if (str == null) return;

    if ((getLength() + str.length()) <= limite) {
      super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
    }
  }
}
