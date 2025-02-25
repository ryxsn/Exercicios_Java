/* Um sorteio de brindes será feito em um supermercado este mês.
Faça uma classe que forneça dez nomes de brindes e sorteie um desses brindes por meio de um método chamado sorteio.*/

package Exercicio16;

import javax.swing.JOptionPane;

public class Ex16 {
    //Definindo os brindes
    private static String[] brindes = {
        "bola", "bicicleta", "carro", "moto", "casa",
        "chaveiro", "garrafa térmica", "vale-compras", "camiseta", "caneta"};
    
    //Sorteando um brinde
    public static String sorteio(){
        int num = (int)(Math.random() * 10);
        return brindes[num];
    }

    //Utilizando a função sorteio para imprimir o brinde
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, sorteio());
    }
}
