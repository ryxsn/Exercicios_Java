//Crie uma classe que receba o valor da base e da altura de um triângulo retângulo e apresente na tela sua área.

package Exercicio03;
import javax.swing.JOptionPane;

public class Ex3_Grafico {
    public static void main(String[] args) {
        
        //Captura de dados com interface gráfica
        String nm1_base_triangulo = JOptionPane.showInputDialog("Base do triângulo retângulo: ");
        String nm2_altura_triangulo = JOptionPane.showInputDialog("Altura desse triângulo retângulo: ");
        
        //A captura de dados com interface gráfica sempre vem em string, é preciso convertê-la
        double base_triangulo = Double.parseDouble(nm1_base_triangulo);
        double altura_triangulo = Double.parseDouble(nm2_altura_triangulo);
        
        double area_triangulo = ((base_triangulo*altura_triangulo)/2);
        
        
        //Sempre será nessa ordem, null, texto, título, tipo de painel)
          JOptionPane.showMessageDialog(null, 
            "A área desse triângulo retângulo é igual a " + area_triangulo, 
            "Resultado", // Título da caixa de diálogo
            JOptionPane.PLAIN_MESSAGE);  
    }
}
