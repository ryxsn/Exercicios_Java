//Crie uma classe para calcular e exibir na tela o peso ideal. IMC = (peso / (altura^2))
package Ex4;
import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        
    //Recebendo as variáveis do usuário
        String peso = JOptionPane.showInputDialog("Digite o peso: ");
        String altura = JOptionPane.showInputDialog("Digite a altura: ");
        
        int peso_int = Integer.parseInt(peso);
        int altura_int = Integer.parseInt(altura);
        
    //Inserindo as variáveis recebidas na função e recebendo-as na variável IMC
        double IMC = CalcularPesoIMC(peso_int, altura_int);
        System.out.println(String.format("O valor desejado de IMC: %.2f",IMC));
    }

    //Definindo a função CaclularPesoIMC
        public static double CalcularPesoIMC(int peso, double altura){
        return (peso/(altura*altura));    
    }
}