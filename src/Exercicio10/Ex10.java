/* Uma farmácia precisa ajustar os preços de seus produtos em 12%.
Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. 
O novo valor a ser calculado deve ser arredondado para mais ou para menos usando o método round. 
A classe deve também conter um laço de repetição
que encerre o programa quando o usuário fornecer o valor zero(0) para o valor do produto */


// Define o pacote (pasta) onde a classe está localizada.
package Exercicio10;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas.
import javax.swing.JOptionPane;


    // Declara a classe principal do programa.
    public class Ex10 {
        // Este é o método principal ('main'), onde o programa começa a ser executado.
        public static void main(String[] args) {
            
            // Declara a variável que guardará o valor do produto.
            // Ela é iniciada com -1 para garantir que a condição do laço 'while' seja verdadeira na primeira vez.
            double produtoValor = -1;
            
            // Inicia um laço de repetição 'while'. O código dentro dele continuará executando
            // enquanto a variável 'produtoValor' for diferente de 0.
            while(produtoValor != 0){
                //Recebendo a variável do usuário
                // Pede ao usuário para inserir o valor do produto e armazena o texto digitado.
                String produtoValorString = JOptionPane.showInputDialog("Insira o valor do produto (digite 0 para sair): ");
                
                // Converte o texto (String) digitado pelo usuário para um número 'double'.
                // Este valor atualiza a variável que controla o laço 'while'.
                produtoValor = Double.parseDouble(produtoValorString); 
                
                //Aplicando ajuste, e, mostrando na tela enquanto for diferente de 0.
                // Esta verificação impede que o cálculo seja feito e exibido quando o usuário digita 0 para sair.
                if(produtoValor != 0){
                    // Calcula o novo valor: multiplica o valor original por 1.12 (acréscimo de 12%).
                    // Math.round() arredonda o resultado para o número inteiro mais próximo.
                    produtoValor = Math.round(produtoValor * 1.12); 
                    
                    // A linha abaixo está "comentada", ou seja, inativa.
                    // Se estivesse ativa, ela arredondaria o valor para duas casas decimais, uma técnica comum para valores monetários.
                    // produtoValor = Math.round(produtoValor * 100.0) / 100.0;
                    
                    // Exibe o resultado em uma janela de diálogo.
                    // String.format() cria o texto a ser exibido.
                    // "%%" é usado para mostrar o símbolo de porcentagem (%) no texto.
                    // "%.2f" formata o número para que ele sempre tenha duas casas decimais (ex: 112.00).
                    JOptionPane.showMessageDialog(null, String.format("O valor do produto ao ser reajustado em 12%%: R$ %.2f", produtoValor));
                }
            }   
        }
}