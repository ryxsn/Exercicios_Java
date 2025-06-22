/* Na área da eletrônica, em um circuito em série
temos que a resistência equivalente (total) desse circuito é obtida mediante a soma de todas
as resistências existentes (RE = r1 + r2 + ... + rn).
Faça uma classe que receba o valor de quatro
resistências ligadas em série, calcule e mostre a
resistência equivalente, a maior e a menor resistência. */

// Define o pacote (pasta) onde a classe está localizada, para organização do projeto.
package Exercicio07;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas para interagir com o usuário.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex7 {
    // Este é o método principal ('main'), onde a execução do programa se inicia.
    public static void main(String[] args) {       
        
        // As quatro linhas seguintes exibem janelas de diálogo para o usuário digitar
        // o valor de cada uma das quatro resistências. Os valores são armazenados como texto (String).
        String r1String = JOptionPane.showInputDialog("Digite a PRIMEIRA resistência: ");
        String r2String = JOptionPane.showInputDialog("Digite a SEGUNDA resistência: ");
        String r3String = JOptionPane.showInputDialog("Digite a TERCEIRA resistência: ");
        String r4String = JOptionPane.showInputDialog("Digite a QUARTA resistência: ");
                
        // As quatro linhas seguintes convertem o texto digitado pelo usuário em números do tipo 'double' (com casas decimais),
        // que podem ser usados em cálculos matemáticos.
        double r1 = Double.parseDouble(r1String);
        double r2 = Double.parseDouble(r2String);
        double r3 = Double.parseDouble(r3String);
        double r4 = Double.parseDouble(r4String);
        
        // Chama (executa) o método 'mostrarResistencia', passando os quatro valores numéricos como argumentos.
        mostrarResistencia(r1, r2, r3, r4);
    }
    
    // Declaração de um método chamado 'mostrarResistencia'.
    // 'void' indica que este método executa ações, mas não retorna nenhum valor para o 'main'.
    // Ele recebe quatro valores 'double' como parâmetros de entrada.
    public static void mostrarResistencia(double res1, double res2, double res3, double res4){
        
        // A função 'Math.min(a, b)' retorna o menor valor entre a e b.
        // Aqui, ela é usada de forma aninhada para encontrar o menor valor entre os quatro:
        // 1. Math.min(res1, res2) -> encontra o menor entre os dois primeiros.
        // 2. Math.min(res3, res4) -> encontra o menor entre os dois últimos.
        // 3. O Math.min de fora compara os dois resultados para achar o menor de todos.
        double menorRes = Math.min(Math.min(res1, res2), Math.min(res3, res4));
        
        // A função 'Math.max(a, b)' funciona da mesma forma, mas para encontrar o maior valor.
        double maiorRes = Math.max(Math.max(res1, res2), Math.max(res3, res4));
        
        // Calcula a resistência equivalente somando os valores das quatro resistências.
        double resistenciaEquivalente = res1 + res2 + res3 + res4;
        
        // Exibe uma janela de diálogo com os valores fornecidos e o maior e menor valor encontrados.
        // '%.0f' é um especificador de formato que exibe o número 'double' sem nenhuma casa decimal (arredondado).
        // '\n' é usado para pular para a próxima linha na mensagem.
        JOptionPane.showMessageDialog(null, String.format("Resistências fornecidas:\n %.0f, %.0f, %.0f, %.0f\nA maior resistência: %.0f\nA menor Resistência é: %.0f", res1, res2, res3, res4, maiorRes, menorRes));
        
        // Exibe uma segunda janela de diálogo, mostrando apenas o valor da resistência equivalente.
        JOptionPane.showMessageDialog(null, String.format("Resistência equivalente: %.0f ", resistenciaEquivalente));
    }
}