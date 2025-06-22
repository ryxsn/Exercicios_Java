//Crie uma classe para calcular e exibir na tela o peso ideal. IMC = (peso / (altura^2))
package Exercicio04;

// Importa a classe 'JOptionPane' do pacote 'javax.swing'.
// Esta classe é utilizada para criar caixas de diálogo gráficas para pedir informações ao usuário.
import javax.swing.JOptionPane;

// Declara a classe principal do programa, chamada 'Ex4'.
public class Ex4 {
    
    // Este é o método principal ('main'), o ponto de entrada onde a execução do programa começa.
    public static void main(String[] args) {

        //Recebendo as variáveis do usuário com exemplos para evitar erros
        // Exibe uma janela gráfica pedindo o peso. O valor que o usuário digita é sempre lido como um texto (String).
        // O exemplo "70.5" orienta o usuário a usar o ponto como separador decimal.
        String peso = JOptionPane.showInputDialog("Digite o peso (kg), por exemplo: 70.5");
        
        // Faz o mesmo para a altura, mostrando uma janela e guardando o valor digitado como texto na variável 'altura'.
        String altura = JOptionPane.showInputDialog("Digite a altura (m), por exemplo: 1.75");

        //Convertendo as variáveis para tipos adequados
        // Converte o texto (String) do peso para um número decimal (double), que pode ser usado em cálculos.
        double peso_double = Double.parseDouble(peso);
        
        // Converte o texto da altura para um número decimal (double).
        double altura_double = Double.parseDouble(altura);

        //Inserindo as variáveis recebidas na função e recebendo-as na variável IMC
        // Chama o método 'CalcularPesoIMC', passando as variáveis numéricas 'peso_double' e 'altura_double' como argumentos.
        // O resultado retornado pelo método é armazenado na variável 'IMC'.
        double IMC = CalcularPesoIMC(peso_double, altura_double);
        
        // Exibe o resultado final no CONSOLE (a área de texto do seu ambiente de programação).
        // ATENÇÃO: O resultado não aparecerá em uma janela gráfica, mas sim como texto no console.
        // String.format() cria um texto onde "%.2f" é substituído pelo valor da variável IMC, formatado para ter duas casas decimais.
        System.out.println(String.format("O valor desejado de IMC: %.2f", IMC));
    }

    //Definindo a função CalcularPesoIMC
    // Declaração de um método que calcula o IMC.
    // 'public static': são modificadores de acesso e comportamento.
    // 'double': é o tipo de dado que o método vai retornar (um número decimal).
    // '(double peso, double altura)': são os parâmetros (dados de entrada) que o método precisa para funcionar.
    public static double CalcularPesoIMC(double peso, double altura) {
        
        // Realiza o cálculo do IMC (peso dividido pela altura ao quadrado) e usa a palavra 'return'
        // para enviar o resultado de volta para onde o método foi chamado.
        return (peso / (altura * altura));
    }
}