package aulateste;

import javax.swing.JOptionPane;

public class AulaTeste {
    
    public static void main(String[] args) {
        
      System.out.println("Realize a distributiva dos valores representados como:" + "a, b, c, d");
      
            int a = 0, b = 0, c = 0, d = 0, r = 0;
            
                  a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero"));
                  b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero"));
                  c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º numero"));
                  d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º numero"));
            
                  r = ( a * b ) + ( a * c ) + ( a * d );
              
            JOptionPane.showMessageDialog(null, "O resultado é:" + r );
    }
    
}
