/* Na área da eletrônica, em um circuito em série
temos que a resistência equivalente (total) desse circuito é obtida mediante a soma de todas
as resistências existentes (RE = r1 + r2 + ... + rn).
Faça uma classe que receba o valor de quatro
resistências ligadas em série, calcule e mostre a
resistência equivalente, a maior e a menor resistência. */
package Exercicio07;
import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {        
        
        String r1String = JOptionPane.showInputDialog("Digite a PRIMEIRA resistência: ");
        String r2String = JOptionPane.showInputDialog("Digite a SEGUNDA resistência: ");
        String r3String = JOptionPane.showInputDialog("Digite a TERCEIRA resistência: ");
        String r4String = JOptionPane.showInputDialog("Digite a QUARTA resistência: ");
                
        double r1 = Double.parseDouble(r1String);
        double r2 = Double.parseDouble(r2String);
        double r3 = Double.parseDouble(r3String);
        double r4 = Double.parseDouble(r4String);
        
        mostrarResistencia(r1, r2, r3, r4);
    }
    
    public static void mostrarResistencia(double res1, double res2, double res3, double res4){
        
        double menorRes = Math.min(Math.min(res1, res2), Math.min(res3, res4));
        double maiorRes = Math.max(Math.max(res1, res2), Math.max(res3, res4));
        double resistenciaEquivalente = res1 + res2 + res3 + res4;
        
        JOptionPane.showMessageDialog(null, String.format("Resistências fornecidas:\n %.0f, %.0f, %.0f, %.0f\nA maior resistência: %.0f\nA menor Resistência é: %.0f", res1, res2, res3, res4, maiorRes, menorRes));
        JOptionPane.showMessageDialog(null, String.format("Resistência equivalente: %.0f ", resistenciaEquivalente));
    }
}