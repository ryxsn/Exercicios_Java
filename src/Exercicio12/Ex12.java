/* Pesquise na referência da classe Math um método para calcular um número elevado a outro. 
Por exemplo, 2 elevado a 3 é igual a 8.
Apresente o resultado na tela com a formatação (DecimalFormat) de suas casas decimais. */

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio12;

// Importa a classe DecimalFormat, usada para formatar números com um padrão específico.
import java.text.DecimalFormat;
// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex12 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        //Define tipo de formatação
        // Cria um objeto de formatação. O padrão "0.00" fará com que os números exibidos tenham sempre duas casas decimais.
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Recebendo variáveis do usuário
        // Pede ao usuário o número base e armazena o texto digitado.
        String numeroString = JOptionPane.showInputDialog("Digite o numero desejado: ");
        // Converte o texto da base para um número 'double'.
        double numero = Double.parseDouble(numeroString);
        
        // Pede ao usuário o número da potência (expoente) e armazena o texto digitado.
        String numeroPotenciaString = JOptionPane.showInputDialog("Digite a potencia desejada: ");
        // Converte o texto do expoente para um número 'double'.
        double numeroPotencia = Double.parseDouble(numeroPotenciaString);
        
        //Resutaldo = numero ^ numeroPotencia
        // A linha abaixo usa o método 'pow' (power) da classe 'Math' para calcular a potência.
        // Math.pow(base, expoente) -> eleva o primeiro número (base) ao segundo número (expoente).
        double resultado = Math.pow(numero, numeroPotencia);
        
        // Exibe o resultado final em uma janela de diálogo.
        // O método 'df.format(resultado)' formata o número calculado para ter apenas duas casas decimais antes de ser exibido.
        JOptionPane.showMessageDialog(null, "O numero " + numero + " elevado a " + numeroPotencia + " corresponde a " + df.format(resultado));
    }
}