/*Escreva um programa em linguagem Java que apresente na tela o IMC e o nome do João. 
Para isso, utilize a caixa de diálogo.*/
// Nota: O comentário acima sugere o uso de caixas de diálogo (JOptionPane),
// mas o código implementado utiliza o console para exibir os resultados.

// Define o 'pacote' ou a pasta onde esta classe está organizada.
package Exercicio02;

//IMC = (peso/altura*altura) -> Este é um comentário que descreve a fórmula do Índice de Massa Corporal.

// Declara a classe principal do programa, chamada 'Ex2'.
public class Ex2 {
    
    // Este é o método principal ('main'), onde a execução do programa começa.
    public static void main(String[] args) {
        
        // Declara uma variável do tipo 'String' chamada 'nome' e armazena o texto "João da Silva" nela.
        String nome = "João da Silva";
        
        // Declara uma variável do tipo 'double' (número com casas decimais) chamada 'altura' e atribui o valor 1.95.
        double altura = 1.95;
        
        // Declara uma variável do tipo 'double' chamada 'peso' e atribui o valor 92.58.
        double peso = 92.58;

        // Calcula o IMC. A variável 'IMC' recebe o resultado da divisão do 'peso' pela 'altura' multiplicada por ela mesma.
        double IMC = peso / (altura * altura);
        
        // Esta linha demonstra uma forma de imprimir um texto formatado.
        // String.format() cria uma string formatada:
        // %s é substituído pela variável 'nome'.
        // %.2f é substituído pela variável 'IMC', formatada para ter apenas duas casas decimais.
        // System.out.println() então exibe essa string completa no console.
        System.out.println(String.format("O IMC de %s corresponde a: %.2f", nome, IMC));
        
        // Esta linha faz exatamente a mesma coisa que a anterior, mas de uma forma mais direta.
        // System.out.printf() (print formatted) formata e imprime diretamente no console.
        // Os especificadores de formato (%s, %.2f) e as variáveis (nome, IMC) funcionam da mesma maneira.
        // O '\n' no final da string significa "nova linha", fazendo com que o cursor passe para a linha de baixo.
        System.out.printf("O IMC de %s corresponde a: %.2f\n", nome, IMC);
    } 
}