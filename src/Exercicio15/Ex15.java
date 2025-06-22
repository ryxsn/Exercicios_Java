/* Faça uma classe que possua um método que recebe um número inteiro,
referente a idade de uma pessoa, e retorne uma mensagem:
De 0 a 2 anos = bebê
De 3 a 11 anos = criança
De 12 a 19 anos = adolescente
De 20 a 30 anos = jovem
De 31 a 60 anos = adulto
Maior de 60 = idoso */
// Nota: O comentário sugere que o método 'retorne' uma mensagem, mas a implementação
// abaixo exibe a mensagem diretamente em uma janela de diálogo.

// Define o pacote (pasta) onde a classe está localizada.
package Exercicio15;

// Importa a classe JOptionPane para permitir a criação de janelas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara a classe principal do programa.
public class Ex15 {
    // Função para determinar a classe etária com base na idade
    // Declaração de um método chamado 'pessoaClasse'.
    // 'private': só pode ser usado dentro desta classe. 'static': não precisa criar um objeto para ser chamado.
    // 'void': indica que este método executa uma ação, mas não retorna nenhum valor.
    // '(int idade)': é o parâmetro, uma variável que recebe a idade a ser classificada.
    private static void pessoaClasse(int idade){
        // Inicia uma estrutura 'if-else if' para verificar em qual faixa a idade se encaixa.
        // A verificação é feita em ordem, e assim que uma condição for verdadeira, o bloco correspondente é executado e os demais são ignorados.
        if (idade >= 0 && idade <= 2) {
            JOptionPane.showMessageDialog(null, "De 0 a 2 anos = Bebê");
        } else if (idade >= 3 && idade <= 11) {
            JOptionPane.showMessageDialog(null, "De 3 a 11 anos = Criança");
        } else if (idade >= 12 && idade <= 19) {
            JOptionPane.showMessageDialog(null, "De 12 a 19 anos = Adolescente");
        } else if (idade >= 20 && idade <= 30) {
            JOptionPane.showMessageDialog(null, "De 20 a 30 anos = Jovem");
        } else if (idade >= 31 && idade <= 60) {
            JOptionPane.showMessageDialog(null, "De 31 a 60 anos = Adulto");
        } else if (idade > 60) {
            JOptionPane.showMessageDialog(null, "Maior que 60 = Idoso");
        }
    }
    
    // Método principal para coletar a idade do usuário e chamar a função de classificação
    // Este é o método 'main', onde a execução do programa se inicia.
    public static void main(String[] args) {
        // Pede ao usuário para digitar a idade e armazena o texto na variável 'pessoaIdadeString'.
        String pessoaIdadeString = JOptionPane.showInputDialog("Digite sua idade: ");
        // Converte o texto (String) digitado para um número inteiro (int).
        int pessoaIdade = Integer.parseInt(pessoaIdadeString);

        // Verifica se a idade é válida
        // Estrutura de decisão para validar a idade inserida.
        if (pessoaIdade >= 0) {
            // Se a idade for válida (maior ou igual a zero), chama o método 'pessoaClasse' para fazer a classificação.
            pessoaClasse(pessoaIdade);
        } else {
            // Se a idade for inválida (negativa), exibe uma mensagem de erro.
            JOptionPane.showMessageDialog(null, "Idade inválida. A idade não pode ser negativa.");
        }
    }
}