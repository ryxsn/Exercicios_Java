/*Escreva um programa na linguagem Java que contenha duas variáveis do tipo double relativas a nota parcial e final de um aluno.
Calcule e apresente na tela a média final utilizando método println.*/

package Exercicio01;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        
        System.out.print("Digite a nota da prova parcial: ");
        double nota_parcial = nota.nextDouble();
        
        System.out.print("Digite a nota da prova final: ");
        double nota_final = nota.nextDouble();
        
        double media = ((nota_parcial + nota_final) / 2);
        System.out.println("Sua media corresponde a: " + media);     
        
        nota.close();
    }
}
