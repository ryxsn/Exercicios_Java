/* Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6) por três vezes.
Ao final some seus valores e apresente o resultado das três jogadas. */

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio09;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex9 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        // Declara uma variável para armazenar o valor de cada jogada do dado.
        int num_dado = 0;
        // Declara uma variável para acumular a soma dos valores das jogadas. Inicia em 0.
        int num_soma = 0;
        // Declara uma String vazia que será usada para montar a lista de resultados.
        String resultado = "";
        
        // Inicia um laço de repetição 'for' que executará o bloco de código 3 vezes.
        // O contador 'i' começa em 1 e o laço continua enquanto 'i' for menor ou igual a 3.
        for(int i = 1; i <= 3; i++){
            // Esta linha simula a jogada do dado. Vamos entendê-la por partes:
            // 1. Math.random(): Gera um número decimal aleatório entre 0.0 (incluso) e 1.0 (excluso). Ex: 0.75...
            // 2. * 6: Multiplica o número por 6, mudando o intervalo para 0.0 a 5.999...
            // 3. (int): Converte o resultado para um número inteiro, descartando a parte decimal. O intervalo vira 0, 1, 2, 3, 4 ou 5.
            // 4. + 1: Soma 1 ao resultado, ajustando o intervalo para 1, 2, 3, 4, 5 ou 6, que são as faces de um dado.
            num_dado = (int) (Math.random() * 6) + 1;
            
            // Adiciona o valor da jogada atual ('num_dado') à soma total acumulada.
            num_soma = num_soma + num_dado;
            
            // Concatena (junta) o número sorteado e uma quebra de linha ('\n') à String 'resultado'.
            // A cada volta do laço, um novo número é adicionado à lista.
            resultado = resultado + num_dado + "\n";
        }
        
        // Após o laço terminar, esta linha exibe o resultado final em uma janela de diálogo.
        // Ela junta o texto inicial, a lista de números sorteados (que foi montada na variável 'resultado') e a soma total.
        JOptionPane.showMessageDialog(null,"Números sorteados:\n" + resultado + "Total = " + num_soma);
    }
}