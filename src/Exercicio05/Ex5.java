/*Crie uma classe que receba dois valores numéricos e apresente na tela o resultado das quatro operações básicas: 
soma, subtração, multiplicação e divisão.*/

// Define o pacote ou a pasta onde a classe está localizada, ajudando na organização do projeto.
package Exercicio05;

// Importa a classe JOptionPane, que permite criar janelas de diálogo gráficas para interagir com o usuário.
import javax.swing.JOptionPane;

// Declara a classe principal do programa, chamada Ex5.
public class Ex5 {
    
    // Este é o método principal ('main'), onde a execução do programa se inicia.
    public static void main(String[] args) {
        
        // Exibe uma janela de diálogo pedindo o primeiro valor. O que o usuário digita é armazenado como texto (String).
        String valor1 = JOptionPane.showInputDialog("Insira o primeiro valor: ");
        
        // Exibe outra janela de diálogo, pedindo o segundo valor.
        String valor2 = JOptionPane.showInputDialog("Insira o segundo valor: ");
        
        // Converte o texto (String) do primeiro valor para um número inteiro (int).
        int valor1_int = Integer.parseInt(valor1);
        
        // Converte o texto do segundo valor para um número inteiro (int).
        int valor2_int = Integer.parseInt(valor2);
            
        // Chama (executa) o método 'Operacoes_basicas', passando os dois números inteiros como argumentos.
        Operacoes_basicas(valor1_int, valor2_int);
    }
    
    
    // Declaração de um método chamado 'Operacoes_basicas'.
    // 'public static': são modificadores de acesso e comportamento.
    // 'void': indica que este método executa uma ação, mas não retorna nenhum valor para o 'main'.
    // '(int nm1, int nm2)': são os parâmetros, variáveis que recebem os valores passados na chamada do método.
    public static void Operacoes_basicas(int nm1, int nm2){
        
        // As linhas abaixo imprimem os resultados das operações no CONSOLE (área de texto do ambiente de programação).
        
        // Para a SOMA:
        // 1. O cálculo (nm1+nm2) é feito primeiro.
        // 2. O resultado é juntado com o texto "%d + %d = ".
        // 3. String.format() usa essa junção como um molde, substituindo os %d pelos valores de nm1 e nm2.
        // 4. System.out.println() exibe o texto final no console.
        System.out.println(String.format("%d + %d = " + (nm1+nm2), nm1, nm2));
        
        // O mesmo processo é repetido para a SUBTRAÇÃO.
        System.out.println(String.format("%d - %d = " + (nm1-nm2), nm1, nm2));
        
        // O mesmo processo é repetido para a MULTIPLICAÇÃO.
        System.out.println(String.format("%d * %d = " + (nm1*nm2), nm1, nm2));
        
        // Para a DIVISÃO:
        // ATENÇÃO: Como 'nm1' e 'nm2' são números inteiros, o resultado da divisão também será um inteiro.
        // Qualquer parte decimal será descartada (ex: 7 / 2 = 3).
        System.out.println(String.format("%d / %d = " + (nm1/nm2), nm1, nm2));
    }   
}