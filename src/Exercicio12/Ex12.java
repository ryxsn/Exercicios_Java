/* Pesquise na referência da classe Math um método para calcular um número elevado a outro. 
Por exemplo, 2 elevado a 3 é igual a 8.
Apresente o resultado na tela com a formatação (DecimalFormat) de suas casas decimais. */

package Exercicio12;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        //Define tipo de formatação
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Recebendo variáveis do usuário
        String numeroString = JOptionPane.showInputDialog("Digite o numero desejado: ");
        double numero = Double.parseDouble(numeroString);
        
        String numeroPotenciaString = JOptionPane.showInputDialog("Digite a potencia desejada: ");
        double numeroPotencia = Double.parseDouble(numeroPotenciaString);
        
        //Resutaldo = numero ^ numeroPotencia
        double resultado = Math.pow(numero, numeroPotencia);
        
        JOptionPane.showMessageDialog(null, "O numero " + numero + " elevado a " + numeroPotencia + " corresponde a " + df.format(resultado));
    }
}
