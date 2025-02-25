/* Uma farmácia precisa ajustar os preços de seus produtos em 12%.
Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. 
O novo valor a ser calculado deve ser arredondado para mais ou para menos usando o método round. 
A classe deve também conter um laço de repetição
que encerre o programa quando o usuário fornecer o valor zero(0) para o valor do produto */


package Exercicio10;
import javax.swing.JOptionPane;


    public class Ex10 {
        public static void main(String[] args) {
            
            double produtoValor = -1;
            
            while(produtoValor != 0){
                //Recebendo a variável do usuário
                String produtoValorString = JOptionPane.showInputDialog("Insira o valor do produto: ");
                produtoValor = Double.parseDouble(produtoValorString); 
                
                //Aplicando ajuste, e, mostrando na tela enquanto for diferente de 0.
                if(produtoValor != 0){
                produtoValor = Math.round(produtoValor * 1.12); 
                // produtoValor = Math.round(produtoValor * 100.0) / 100.0;
                JOptionPane.showMessageDialog(null, String.format("O valor do produto ao ser reajustado em 12%%: %.2f", produtoValor));
            }
        }   
    }
}