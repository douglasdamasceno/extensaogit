import javax.swing.*;

public class TesteFatorial {

   public static void main(String[] args) {
       Fatorial fatorial = new Fatorial();
       String numero = JOptionPane.showInputDialog("Calcular fatorial do numero:" );
       int num = Integer.parseInt(numero);
       JOptionPane.showMessageDialog(null,"Fatorial de " + num + " é " + fatorial.fatorialDoNumero(num));
   }

}
