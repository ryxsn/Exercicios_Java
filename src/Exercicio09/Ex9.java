/* Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6) por três vezes.
Ao final some seus valores e apresente o resultado das três jogadas. */
package Exercicio09;
import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        int num_dado = 0;
        int num_soma = 0;
        String resultado = "";
        
        for(int i = 1; i <= 3; i++){
            num_dado = (int) (Math.random() * 6) + 1;
            num_soma = num_soma + num_dado;
            
            resultado = resultado + num_dado + "\n";
        }
        JOptionPane.showMessageDialog(null,"Números sorteados:\n" + resultado + "Total = " + num_soma);
    }
}
