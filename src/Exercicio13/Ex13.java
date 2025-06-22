/* Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas
notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
(da maior para a menor) e a média aritmética das notas.  */

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio13;

// Importa a classe Arrays, que contém métodos úteis para trabalhar com arrays, como a ordenação.
import java.util.Arrays;
// Importa a classe JOptionPane para permitir a criação de janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex13 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        // Declara um 'array' (vetor) chamado 'notas' que pode armazenar 5 números do tipo 'double'.
        double notas[] = new double[5];
        // Variável para acumular a soma de todas as notas, para o cálculo da média.
        double notasMedia = 0;
        // Armazena o tamanho do array (5) em uma variável para fácil acesso. 'notas.length' retorna o tamanho do array.
        int notasTamanho = notas.length;
        // Cria um objeto StringBuilder, que é uma forma eficiente de construir strings, especialmente dentro de laços.
        StringBuilder notasFormatacao = new StringBuilder(); 
        
        //Recebendo 5 variáveis do usuário
        // Inicia um laço 'for' que se repetirá 5 vezes (para i de 0 a 4) para pedir cada uma das notas.
        for(int i = 0; i < notasTamanho; i++){
            // Pede ao usuário a nota, indicando a posição (i + 1 para mostrar de 1 a 5).
            String numeroVetorString = JOptionPane.showInputDialog("Insira a " + (i + 1) + "ª nota: ");
            // Converte o texto digitado para um número 'double'.
            double numeroVetor = Double.parseDouble(numeroVetorString);
            
            //Enderençando-as na array (endereçando/armazenando)
            // Armazena a nota convertida no array 'notas', na posição indicada pelo índice 'i'.
            notas[i] = numeroVetor;
            //Somando todas notas
            // Adiciona a nota atual à soma total na variável 'notasMedia'. (+= é um atalho para notasMedia = notasMedia + numeroVetor)
            notasMedia += numeroVetor;
        }
        //Organizando a array de forma crescente
        // O método 'Arrays.sort()' ordena todos os elementos do array 'notas' em ordem crescente (do menor para o maior).
        Arrays.sort(notas);
        
        //Organizando a array de forma decrescente
        // Este laço 'for' inverte a ordem do array que já está ordenado, resultando em uma ordem decrescente.
        // Ele só precisa ir até a metade do array, trocando os elementos das pontas para o centro.
        for(int i = 0; i < notasTamanho / 2; i++){
            // Guarda o valor da primeira posição (ex: notas[0]) em uma variável temporária.
            double temp = notas[i];
            // Coloca o valor da última posição (ex: notas[4]) no lugar da primeira.
            notas[i] = notas[notasTamanho - 1 - i];
            // Coloca o valor que estava guardado (da primeira posição) no lugar da última.
            notas[notasTamanho - 1 - i] = temp;
        }
        
        // Este laço percorre o array agora em ordem decrescente para montar o texto de saída.
        for(int i = 0; i < notasTamanho; i++){
            // O método 'append' adiciona a nota formatada (com uma casa decimal) ao StringBuilder.
            notasFormatacao.append(String.format("%.1f   ", notas[i]));
        }
        //Calculando média aritmética
        // Divide a soma total das notas pelo número de notas para obter a média.
        notasMedia = notasMedia / notasTamanho;
        
        //Imprimindo osutput (output/saída)
        // Exibe o resultado final, convertendo o StringBuilder para uma String com '.toString()' e adicionando a média.
        JOptionPane.showMessageDialog(null, "Notas em ordem decrescente:\n" + notasFormatacao.toString() + String.format("\n\nMédia: %.1f", notasMedia));
    }
}