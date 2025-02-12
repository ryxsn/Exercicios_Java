/*Elabore uma classe que receba o nome de um produto e o seu valor.
O desconto deve ser calculado de acordo com o valor fornecido conforme a Tabela.
Apresente em tela o nome do produto, valor original do produto e o novo valor depois de ser realizado o desconto.
Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
        -----------------------------------------
        |    Valor(R$)      |     Desconto(%)   |
        |    >=50 e <200    |     5             |
        |    >=200 e <500   |     6             |
        |    >=500 e <1000  |     7             |
        |    >=1000         |     8             |    
        -----------------------------------------   */


package Ex6;
import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        //Recebendo variáveis do usuário
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        String valorProdutoString = JOptionPane.showInputDialog("Digite o valor do produto: ");
        
        double valorProduto = 0;
        
        //Transformando variável valorProdutoString em tipo Double
        try {
            valorProduto = Double.parseDouble(valorProdutoString);
        //Caso ocorra um erro de conversão executa catch e dispara mensagem de erro
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, digite um número válido para o valor do produto.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Se valorProduto < 0 dispara mensagem de erro.
        if(valorProduto < 0){
            JOptionPane.showMessageDialog(null, "O valor do produto não pode ser negativo.","Erro",JOptionPane.WARNING_MESSAGE);
            return;
        //Se não, cria uma variável aplica-a à função e imprime resultado
        } else {
            double valorComDesconto = aplicarDesconto(valorProduto);
            JOptionPane.showMessageDialog(null,String.format("Nome do produto: %s\nValor original: %.2f\nValor com desconto: %.2f",nomeProduto, valorProduto, valorComDesconto));
        }   
    }
    
    //Função para aplicar desconto no valorProduto
    public static double aplicarDesconto(double valorProdutoF){
        double valorDescontoF = 0;
        
        if(valorProdutoF >= 1000){
                valorDescontoF = 0.08;
            } else if (valorProdutoF >= 500) {
                valorDescontoF = 0.07;
            } else if (valorProdutoF >= 200) {
                valorDescontoF = 0.06;
            } else if (valorProdutoF >= 50) {
                valorDescontoF = 0.05;
            }
        
        return valorProdutoF * (1 - valorDescontoF);
    } 
}


