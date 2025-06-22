/*Elabore uma classe que receba o nome de um produto e o seu valor.
O desconto deve ser calculado de acordo com o valor fornecido conforme a Tabela.
Apresente em tela o nome do produto, valor original do produto e o novo valor depois de ser realizado o desconto.
Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
        -----------------------------------------
        |    Valor(R$)      |     Desconto(%)   |
        |    >=50 e <200    |     5             |
        |    >=200 e <500   |     6             |
        |    >=500 e <1000  |     7             |
        |    >=1000         |     8             |    
        -----------------------------------------   */


// Define o pacote (pasta) onde a classe está organizada.
package Exercicio06;

// Importa a classe JOptionPane para permitir a criação de janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex6 {
    // Método principal, onde o programa começa a ser executado.
    public static void main(String[] args) {
        //Recebendo variáveis do usuário
        // Pede o nome do produto ao usuário e armazena o texto na variável 'nomeProduto'.
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        // Pede o valor do produto e armazena o texto na variável 'valorProdutoString'.
        String valorProdutoString = JOptionPane.showInputDialog("Digite o valor do produto: ");
        
        // Declara uma variável do tipo 'double' para armazenar o valor numérico do produto. Inicia com 0.
        double valorProduto = 0;
        
        //Transformando variável valorProdutoString em tipo Double
        // O bloco 'try-catch' é usado para tratar possíveis erros sem que o programa quebre.
        try {
            // Tenta (try) converter o texto digitado pelo usuário para um número 'double'.
            valorProduto = Double.parseDouble(valorProdutoString);
        //Caso ocorra um erro de conversão executa catch e dispara mensagem de erro
        // Se a conversão falhar (ex: usuário digitou "abc"), o erro 'NumberFormatException' é capturado (catch).
        } catch (NumberFormatException e) {
            // Uma mensagem de erro é exibida em uma janela de diálogo.
            JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, digite um número válido para o valor do produto.", "Erro", JOptionPane.WARNING_MESSAGE);
            // 'return' encerra a execução do método 'main' imediatamente.
            return;
        }
        
        //Se valorProduto < 0 dispara mensagem de erro.
        // Verifica se o valor do produto, após a conversão, é um número negativo.
        if(valorProduto < 0){
            // Se for negativo, exibe uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "O valor do produto não pode ser negativo.","Erro",JOptionPane.WARNING_MESSAGE);
            // Encerra o método 'main'.
            return;
        //Se não, cria uma variável aplica-a à função e imprime resultado
        // Se o valor for válido (não negativo), o código dentro do 'else' é executado.
        } else {
            // Chama o método 'aplicarDesconto' passando o valor do produto e armazena o resultado na variável 'valorComDesconto'.
            double valorComDesconto = aplicarDesconto(valorProduto);
            // Exibe o resultado final em uma única janela de diálogo.
            // '\n' é usado para pular linha dentro da mensagem.
            // '%.2f' formata os números para exibirem apenas duas casas decimais.
            JOptionPane.showMessageDialog(null,String.format("Nome do produto: %s\nValor original: R$ %.2f\nValor com desconto: R$ %.2f",nomeProduto, valorProduto, valorComDesconto));
        }   
    }
    
    //Função para aplicar desconto no valorProduto
    // Método que recebe um valor 'double' e retorna o novo valor com desconto, também como 'double'.
    public static double aplicarDesconto(double valorProdutoF){
        // Variável para guardar a taxa de desconto (ex: 0.05 para 5%). Inicia com 0 (sem desconto).
        double valorDescontoF = 0;
        
        // A estrutura 'if-else if' verifica as faixas de preço, da maior para a menor.
        // Assim que uma condição for verdadeira, o bloco correspondente é executado e os outros são ignorados.
        if(valorProdutoF >= 1000){
                // Se o valor for maior ou igual a 1000, o desconto é de 8%.
                valorDescontoF = 0.08;
            } else if (valorProdutoF >= 500) {
                // Se não for >= 1000, mas for >= 500, o desconto é de 7%.
                valorDescontoF = 0.07;
            } else if (valorProdutoF >= 200) {
                // Se não for >= 500, mas for >= 200, o desconto é de 6%.
                valorDescontoF = 0.06;
            } else if (valorProdutoF >= 50) {
                // Se não for >= 200, mas for >= 50, o desconto é de 5%.
                valorDescontoF = 0.05;
            }
        
        // Calcula o valor final. Ex: (1 - 0.08) = 0.92. Multiplicar por 0.92 é o mesmo que dar 8% de desconto.
        // A palavra 'return' envia o resultado do cálculo de volta para onde o método foi chamado.
        return valorProdutoF * (1 - valorDescontoF);
    } 
}