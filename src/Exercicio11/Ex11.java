/* Pesquise na referência da classe Math um método para calcular a raiz quadrada de um número informado pelo usuário.
Apresente o resultado na tela com a formatação (DecimalFormat) de suas casas decimais. */

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio11;

// Importa a classe DecimalFormat, que é usada para formatar números com um padrão específico (ex: casas decimais).
import java.text.DecimalFormat;
// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;


// Declara a classe principal do programa.
public class Ex11 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        //Define tipo de formatação
        // Cria um objeto de formatação DecimalFormat. O padrão "0.00" significa que qualquer número
        // formatado por ele terá sempre duas casas decimais.
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Recebendo variável do usuário
        // Pede ao usuário para digitar um número e armazena o texto na variável 'numeroString'.
        String numeroString = JOptionPane.showInputDialog("Digite o numero: ");
        // Converte o texto (String) digitado pelo usuário para um número 'double'.
        double numero = Double.parseDouble(numeroString);
        
        //numero = raiz quadrada(numero)
        // A linha abaixo usa o método 'sqrt' (square root) da classe 'Math' para calcular a raiz quadrada do número.
        // O resultado do cálculo substitui o valor original na variável 'numero'.
        numero = Math.sqrt(numero);

        // Exibe o resultado final em uma janela de diálogo.
        // O método 'df.format(numero)' pega o resultado do cálculo e o formata como um texto
        // com duas casas decimais, de acordo com o padrão "0.00" definido no início.
        JOptionPane.showMessageDialog(null, "A raiz quadrada do numero " + numeroString + " é " + df.format(numero));
    }
}