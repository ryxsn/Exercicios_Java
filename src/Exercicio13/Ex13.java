/* Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas
notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
(da maior para a menor) e a média aritmética das notas.  */

package Exercicio13;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        double notas[] = new double[5];
        double notasMedia = 0;
        int notasTamanho = notas.length;
        StringBuilder notasFormatacao = new StringBuilder(); // Usando StringBuilder para acumular as notas
        
        //Recebendo 5 variáveis do usuário
        for(int i = 0; i < notasTamanho; i++){
           String numeroVetorString = JOptionPane.showInputDialog("Insira o " + (i + 1) + " número: ");
           double numeroVetor = Double.parseDouble(numeroVetorString);
           
           //Enderençando-as na array
           notas[i] = numeroVetor;
           //Somando todas notas
           notasMedia += numeroVetor;
        }
        //Organizando a array de forma crescente
        Arrays.sort(notas);
        //Organizando a array de forma decrescente
        for(int i = 0; i < notasTamanho / 2; i++){
            double temp = notas[i];
            notas[i] = notas[notasTamanho - 1 - i];
            notas[notasTamanho - 1 - i] = temp;
        }
        
        for(int i = 0; i < notasTamanho; i++){
            notasFormatacao.append(String.format("%.1f  ", notas[i]));
        }
        //Calculando média aritmética
        notasMedia = notasMedia / notasTamanho;
        
        //Imprimindo osutput
        JOptionPane.showMessageDialog(null, "Notas: " + notasFormatacao.toString() + String.format("\nMédia: %.1f", notasMedia));
    }
}
