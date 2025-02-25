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
        
        //Recebendo 5 variáveis do usuário
        for(int i = 0; i < notasTamanho; i++){
           String numeroVetorString = JOptionPane.showInputDialog("Insira o " + (i + 1) + " número: ");
           double numeroVetor = Double.parseDouble(numeroVetorString);
           
           //Enderençando-as na array
           notas[i] = numeroVetor;
           //Somando todas notas
           notasMedia += numeroVetor;
        }
        //Calculando média aritmética
        notasMedia = notasMedia / notasTamanho;
        
        //Organizando-as em forma crescente
        Arrays.sort(notas);
        //Organizando-as em forma decrescente ***************************
        int j = notasTamanho - 1; // j = 5
        String notasFormatacao = "";
        for(int i = 0; i < notasTamanho; i++){
            notas[i] = notas[j];
            notasFormatacao = notasFormatacao + " " + notas[i];
            j--;
        }
        //Imprimindo resultado final
        JOptionPane.showMessageDialog(null, "Notas: " + notasFormatacao + "\nMédia aritmética: " + notasMedia);
    }
}
    