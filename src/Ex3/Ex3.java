//Crie uma classe que receba o valor da base e da altura de um triângulo retângulo e apresente na tela sua área.

package Ex3;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        
        //Definindo Scanner
        Scanner dados = new Scanner(System.in);
        
        System.out.print("Digite o valor da base de um triângulo retângulo: ");
        double base_triangulo = dados.nextDouble();
        
        System.out.print("Digite o valor da altura desse triângulo retângulo: ");
        double altura_triangulo = dados.nextDouble();
        
        double area = ((base_triangulo*altura_triangulo) / 2);
        System.out.println(String.format("A área desse triângulo corresponde a: %.2f", area)); 
        
        dados.close();
    }
}