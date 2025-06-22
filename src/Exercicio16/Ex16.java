/* Um sorteio de brindes será feito em um supermercado este mês.
Faça uma classe que forneça dez nomes de brindes e sorteie um desses brindes por meio de um método chamado sorteio.*/

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio16;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex16 {
    //Definindo os brindes
    // Declara um array de Strings 'private' (só pode ser acessado dentro desta classe) e 'static' (pertence à classe, não a um objeto).
    // O array já é inicializado com 10 nomes de brindes. Os índices vão de 0 ("bola") a 9 ("caneta").
    private static String[] brindes = {
        "bola", "bicicleta", "carro", "moto", "casa",
        "chaveiro", "garrafa térmica", "vale-compras", "camiseta", "caneta"};
    
    //Sorteando um brinde
    // Declara um método chamado 'sorteio' que é 'public', 'static' e retorna um valor do tipo 'String'.
    public static String sorteio(){
        // Gera um número inteiro aleatório entre 0 e 9.
        // Math.random() * 10 -> gera um número decimal de 0.0 até 9.999...
        // (int) -> converte para inteiro, resultando em um número de 0 a 9.
        int num = (int)(Math.random() * 10);
        
        // Usa o número aleatório 'num' como índice para acessar um elemento do array 'brindes'.
        // A palavra 'return' envia o brinde sorteado (o texto) de volta para quem chamou o método.
        return brindes[num];
    }

    //Utilizando a função sorteio para imprimir o brinde
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        // Exibe uma janela de diálogo.
        // O conteúdo da janela será o resultado retornado pela chamada do método 'sorteio()'.
        // O método sorteio() é executado primeiro, e o brinde que ele retorna é exibido na tela.
        JOptionPane.showMessageDialog(null, "O brinde sorteado é: " + sorteio());
    }
}