/*Escreva um programa em linguagem Java que apresente na tela o IMC e o nome do João. 
Para isso, utilize a caixa de diálogo.*/

package Exercicio02;

//IMC = (peso/altura*altura)
public class Ex2 {
    public static void main(String[] args) {
        
        String nome = "João da Silva";
        double altura = 1.95;
        double peso = 92.58;

        double IMC = peso / (altura * altura);
        
        System.out.println(String.format("O IMC de %s corresponde a: %.2f", nome, IMC));
        System.out.printf("O IMC de %s corresponde a: %.2f\n", nome, IMC);
    } 
}
