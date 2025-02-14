/*Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o nú-
mero desejado e a classe apresenta a relação de todos os cálculos de 1 a 10. */

package Ex8;
import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        //Recebendo variável do usuário
        String numeroString = JOptionPane.showInputDialog("Qual número você deseja ver a tabuada: ");
        
        //Transformando-a em inteiro
        int numero = Integer.parseInt(numeroString);
        Tabuada(numero);
    }
    
    
    
    public static void Tabuada(int Numero){
        String TabuadaNumero =  "";
        int Resultado = 0;
        
        for(int i = 1; i <= 10; i++){
            Resultado = Numero * i;
            TabuadaNumero = TabuadaNumero + Numero + " x " + i + " = " + Resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, TabuadaNumero);
    }
}
