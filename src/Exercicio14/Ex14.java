/* Uma imagem é formada por pixels. Considere uma imagem com dimensão de 10 x 10 e faça uma
classe que contenha um array bidimensional com essas dimensões. 
A seguir, para cada posição desse array bidimensional armazene um valor aleatório entre 0 e 255 (esses valores correspondem às tonalidades aplicadas sobre a imagem). 
Apresente em tela os valores gerados. */

// Declara a classe principal do programa.
public class Ex14 {
    // Este é o método principal ('main'), onde o programa começa a ser executado.
    public static void main(String[] args) {
        // Declara um array bidimensional (matriz) chamado 'matriz' com 10 linhas e 10 colunas.
        // Pense nisso como uma grade ou um tabuleiro.
        int matriz[][] = new int [10][10];
        
        // A propriedade '.length' em um array bidimensional retorna o número de linhas. Aqui, 10.
        int matriz_tamanho = matriz.length;
    
        // Inicia um laço 'for' externo para percorrer as LINHAS da matriz, de 0 a 9.
        for(int linha = 0; linha < matriz_tamanho; linha++){
            // Inicia um laço 'for' interno para percorrer as COLUNAS de cada linha, também de 0 a 9.
            // A combinação dos dois laços permite visitar cada "célula" da grade.
            for(int coluna = 0; coluna < matriz_tamanho; coluna++){
                // Gera um número aleatório e o armazena na posição atual da matriz.
                // Math.random() * 255 -> gera um número decimal de 0.0 até 254.999...
                // (int) -> converte para inteiro, resultando em um número de 0 a 254.
                // Nota: para gerar de 0 a 255, o correto seria multiplicar por 256.
                matriz[linha][coluna] = (int)(Math.random() * 255);
                
                // Imprime no CONSOLE a posição (linha e coluna) e o valor aleatório armazenado nela.
                // System.out.printf permite uma impressão formatada:
                // Os '%d' são marcadores que serão substituídos pelas variáveis na ordem em que aparecem.
                // '\n' pula uma linha ao final da impressão.
                System.out.printf("Posição: [%d][%d] | Valor: %d\n",linha, coluna, matriz[linha][coluna]);
            }
        }
    }
}