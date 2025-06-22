//Crie uma classe que receba o valor da base e da altura de um triângulo retângulo e apresente na tela sua área.

// Define o 'pacote' (a pasta) onde a classe está localizada, ajudando a organizar o projeto.
package Exercicio03;

// Importa a classe 'JOptionPane' do pacote 'javax.swing'. 
// Essa classe é usada para criar caixas de diálogo gráficas para interação com o usuário.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex3_Grafico {
    
    // Este é o método principal ('main'), o ponto de entrada para a execução do programa.
    public static void main(String[] args) {
        
        //Captura de dados com interface gráfica
        // A linha abaixo usa 'JOptionPane.showInputDialog' para exibir uma caixa de diálogo que pede a base do triângulo.
        // O valor digitado pelo usuário é sempre recebido como um texto (String) e armazenado na variável 'nm1_base_triangulo'.
        String nm1_base_triangulo = JOptionPane.showInputDialog("Base do triângulo retângulo: ");
        
        // Aqui, fazemos o mesmo para a altura, armazenando o texto digitado na variável 'nm2_altura_triangulo'.
        String nm2_altura_triangulo = JOptionPane.showInputDialog("Altura desse triângulo retângulo: ");
        
        //A captura de dados com interface gráfica sempre vem em string, é preciso convertê-la
        // A variável 'nm1_base_triangulo' (que é um texto) é convertida para um número do tipo 'double' (com casas decimais).
        // O método 'Double.parseDouble()' realiza essa conversão. O resultado é guardado na variável 'base_triangulo'.
        double base_triangulo = Double.parseDouble(nm1_base_triangulo);
        
        // O mesmo processo de conversão é feito para a altura.
        double altura_triangulo = Double.parseDouble(nm2_altura_triangulo);
        
        // Calcula a área do triângulo usando a fórmula (base * altura) / 2.
        // O resultado do cálculo é armazenado na variável 'area_triangulo'.
        double area_triangulo = ((base_triangulo * altura_triangulo) / 2);
        
        
        //Sempre será nessa ordem, null, texto, título, tipo de painel)
        // A linha abaixo exibe uma caixa de diálogo de mensagem para mostrar o resultado.
        JOptionPane.showMessageDialog(null, // O 'null' faz a janela aparecer no centro da tela.
            "A área desse triângulo retângulo é igual a " + area_triangulo, // A mensagem a ser exibida, juntando o texto com o valor da área.
            "Resultado", // O texto que aparece na barra de título da janela.
            JOptionPane.PLAIN_MESSAGE); // O tipo de ícone da janela (neste caso, uma mensagem simples, sem ícone).
    }
}