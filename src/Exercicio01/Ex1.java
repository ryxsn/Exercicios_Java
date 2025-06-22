/*Escreva um programa na linguagem Java que contenha duas variáveis do tipo double relativas a nota parcial e final de um aluno.
Calcule e apresente na tela a média final utilizando método println.*/

// Define o 'pacote' ou a pasta onde a classe está localizada. É uma forma de organizar o código.
package Exercicio01;

// Importa a classe 'Scanner' do pacote 'java.util'. A classe Scanner é utilizada para ler a entrada de dados do usuário (pelo teclado, por exemplo).
import java.util.Scanner;

// Declara a classe principal do programa, chamada 'Ex1'. Todo código Java deve estar dentro de uma classe.
public class Ex1 {

    // Este é o método principal ('main'). É o ponto de partida da execução de qualquer programa Java.
    public static void main(String[] args) {
        
        // Cria um novo objeto do tipo 'Scanner' chamado 'nota'. Este objeto será usado para capturar o que o usuário digitar no console (System.in).
        Scanner nota = new Scanner(System.in);
        
        // Exibe a mensagem "Digite a nota da prova parcial: " no console, sem pular para a próxima linha (print).
        System.out.print("Digite a nota da prova parcial: ");
        
        // Lê o próximo valor do tipo 'double' (número com casas decimais) que o usuário digitar e o armazena na variável 'nota_parcial'.
        double nota_parcial = nota.nextDouble();
        
        // Exibe a mensagem "Digite a nota da prova final: " no console.
        System.out.print("Digite a nota da prova final: ");
        
        // Lê o próximo valor 'double' digitado pelo usuário e o armazena na variável 'nota_final'.
        double nota_final = nota.nextDouble();
        
        // Declara uma variável 'double' chamada 'media'. Ela recebe o resultado do cálculo da média: soma da 'nota_parcial' com a 'nota_final', dividida por 2.
        double media = ((nota_parcial + nota_final) / 2);
        
        // Exibe o resultado final no console. O comando 'println' mostra a mensagem e pula para a próxima linha. O sinal de '+' junta o texto com o valor da variável 'media'.
        System.out.println("Sua media corresponde a: " + media);      
        
        // Fecha o objeto 'Scanner'. É uma boa prática liberar os recursos do sistema que não serão mais utilizados.
        nota.close();
    }
}
