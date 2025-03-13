/*Crie uma classe que receba dois valores numéricos e apresente na tela o resultado das quatro operações básicas: 
soma, subtração, multiplicação e divisão.*/

package Exercicio05;
import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Insira o primeiro valor: ");
        String valor2 = JOptionPane.showInputDialog("Insira o segundo valor: ");
       
        int valor1_int = Integer.parseInt(valor1);
        int valor2_int = Integer.parseInt(valor2);
            
        Operacoes_basicas(valor1_int, valor2_int);
    }
    
    
    public static void Operacoes_basicas(int nm1, int nm2){
        System.out.println(String.format("%d + %d = " + (nm1+nm2), nm1, nm2));
        System.out.println(String.format("%d - %d = " + (nm1-nm2), nm1, nm2));
        System.out.println(String.format("%d * %d = " + (nm1*nm2), nm1, nm2));
        System.out.println(String.format("%d / %d = " + (nm1/nm2), nm1, nm2));
    }    
}
