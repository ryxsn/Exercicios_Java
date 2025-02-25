/* Pesquise na referência da classe Math um método para calcular a raiz quadrada de um número informado pelo usuário.
Apresente o resultado na tela com a formatação (DecimalFormat) de suas casas decimais. */

package Exercicio11;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Ex11 {
    public static void main(String[] args) {
        //Define tipo de formatação
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Recebendo variável do usuário
        String numeroString = JOptionPane.showInputDialog("Digite o numero: ");
        double numero = Double.parseDouble(numeroString);
        
        //numero = raiz quadrada(numero)
        numero = Math.sqrt(numero);

        JOptionPane.showMessageDialog(null, "A raiz quadrada do numero " + numeroString + " é " + df.format(numero));
    }
}
