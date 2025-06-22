//Crie uma classe que receba o valor da base e da altura de um triângulo retângulo e apresente na tela sua área.

// Define o 'pacote' ou a pasta onde a classe está localizada, ajudando na organização do código.
package Exercicio03;

// Importa a classe 'Scanner' do pacote 'java.util'. A classe Scanner é essencial para ler dados de entrada do usuário, como o que é digitado no teclado.
import java.util.Scanner;


// Declara a classe principal do programa, chamada 'Ex3'.
public class Ex3 {
    
    // Este é o método 'main', o ponto de partida obrigatório para a execução de um programa Java.
    public static void main(String[] args) {
        
        //Definindo Scanner
        // Cria um novo objeto do tipo 'Scanner' chamado 'dados'. Este objeto "escuta" a entrada padrão do sistema (System.in), que geralmente é o teclado.
        Scanner dados = new Scanner(System.in);
        
        // Exibe a mensagem "Digite o valor da base..." no console. 'System.out.print' não pula para a próxima linha após exibir o texto.
        System.out.print("Digite o valor da base de um triângulo retângulo: ");
        
        // Pausa o programa e espera o usuário digitar um número. 
        // 'dados.nextDouble()' lê o valor digitado como um 'double' (número com casas decimais) e o armazena na variável 'base_triangulo'.
        double base_triangulo = dados.nextDouble();
        
        // Exibe outra mensagem no console, agora pedindo o valor da altura.
        System.out.print("Digite o valor da altura desse triângulo retângulo: ");
        
        // Lê o próximo número 'double' que o usuário digitar e o armazena na variável 'altura_triangulo'.
        double altura_triangulo = dados.nextDouble();
        
        // Declara uma variável 'double' chamada 'area' e calcula a área do triângulo com a fórmula (base * altura) / 2.
        double area = ((base_triangulo*altura_triangulo) / 2);
        
        // Imprime o resultado final no console.
        // String.format() cria um texto formatado: "%.2f" é um marcador que será substituído pelo valor da variável 'area', formatado para ter apenas duas casas decimais.
        // System.out.println() exibe o texto e move o cursor para a próxima linha.
        System.out.println(String.format("A área desse triângulo corresponde a: %.2f", area)); 
        
        // Fecha o objeto 'Scanner' para liberar os recursos do sistema que ele estava usando. É uma boa prática de programação fazer isso ao final.
        dados.close();
    }
}