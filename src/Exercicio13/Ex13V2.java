/* Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas
notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
(da maior para a menor) e a média aritmética das notas.  */

package Exercicio13;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex13V2 {
    public static void main(String[] args) {
        double notas[] = new double[5];
        double notasMedia = 0;
        int notasTamanho = notas.length;
        int j = notasTamanho;
        
        //Recebendo 5 variáveis do usuário
        for(int i = 0; i < notasTamanho; i++){
           String numeroVetorString = JOptionPane.showInputDialog("Insira o " + (i + 1) + " número: ");
           double numeroVetor = Double.parseDouble(numeroVetorString);
           
           //Enderençando-as na array
           notas[i] = numeroVetor;
           //Somando todas notas
           notasMedia += numeroVetor;
           
           //Organizando array em forma decrescente
           if(notas[i] < notas[i + 1]){
               
           }
        }
        //Calculando média aritmética
        notasMedia = notasMedia / notasTamanho;
    }
}
