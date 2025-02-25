/* Faça uma classe que possua um método que recebe um número inteiro,
referente a idade de uma pessoa, e retorne uma mensagem:
De 0 a 2 anos = bebê
De 3 a 11 anos = criança
De 12 a 19 anos = adolescente
De 20 a 30 anos = jovem
De 31 a 60 anos = adulto
Maior de 60 = idoso */

package Exercicio15;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        String pessoaIdadeString = JOptionPane.showInputDialog("Digite sua idade: ");
        int pessoaIdade = Integer.parseInt(pessoaIdadeString);
        pessoaClasse(pessoaIdade);
    }
    
    
    private static void pessoaClasse(int idade){
        if(idade > 0 && idade <= 2){
            JOptionPane.showMessageDialog(null, "De 0 a 2 anos = Bebê");
        } else if (idade <= 11){
            JOptionPane.showMessageDialog(null, "De 3 a 11 anos = Criança");
        } else if (idade <= 19){
            JOptionPane.showMessageDialog(null, "De 12 a 19 anos = Adolescente");
        } else if (idade <= 30) {
            JOptionPane.showMessageDialog(null, "De 20 a 30 anos = Jovem");
        } else if (idade <= 60){
            JOptionPane.showMessageDialog(null, "De 31 a 60 anos = Adulto");
        } else if (idade > 60) {
            JOptionPane.showMessageDialog(null, "Maior que 60 = Idoso");
        }
        
    }
}