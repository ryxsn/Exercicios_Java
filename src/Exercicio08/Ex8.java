/*Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o nú-
mero desejado e a classe apresenta a relação de todos os cálculos de 1 a 10. */

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio08;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex8 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        //Recebendo variável do usuário
        // Exibe uma janela de diálogo pedindo um número ao usuário e armazena o texto digitado.
        String numeroString = JOptionPane.showInputDialog("Qual número você deseja ver a tabuada: ");
        
        //Transformando-a em inteiro
        // Converte o texto (String) digitado pelo usuário para um número inteiro (int).
        int numero = Integer.parseInt(numeroString);
        
        // Chama (executa) o método 'Tabuada', passando o número fornecido pelo usuário como argumento.
        Tabuada(numero);
    }
    
    
    
    // Declaração de um método chamado 'Tabuada'.
    // 'void' indica que este método executa uma ação, mas não retorna nenhum valor para o 'main'.
    // Ele recebe um número inteiro como parâmetro de entrada.
    public static void Tabuada(int Numero){
        // Declara uma variável do tipo String e a inicia vazia. Ela será usada para "montar" o texto da tabuada.
        String TabuadaNumero =  "";
        
        // Declara uma variável para guardar o resultado de cada multiplicação.
        int Resultado = 0;
        
        // Inicia um laço de repetição 'for'.
        // 1. 'int i = 1;': Cria uma variável contadora 'i' que começa em 1.
        // 2. 'i <= 10;': O laço continuará executando enquanto 'i' for menor ou igual a 10.
        // 3. 'i++': Ao final de cada volta do laço, o valor de 'i' é aumentado em 1.
        for(int i = 1; i <= 10; i++){
            // Calcula o resultado da multiplicação do número do usuário pelo contador atual do laço.
            Resultado = Numero * i;
            
            // Concatena (junta) a linha atual da tabuada à variável 'TabuadaNumero'.
            // A cada volta, uma nova linha é adicionada. Ex: "5 x 1 = 5\n", depois "5 x 2 = 10\n", e assim por diante.
            // O '\n' no final serve para criar uma quebra de linha.
            TabuadaNumero = TabuadaNumero + Numero + " x " + i + " = " + Resultado + "\n";
        }
        
        // Após o laço 'for' terminar (quando 'i' chegar a 11), esta linha exibe o texto completo
        // que foi montado dentro da variável 'TabuadaNumero', tudo em uma única janela de diálogo.
        JOptionPane.showMessageDialog(null, TabuadaNumero);
    }
}