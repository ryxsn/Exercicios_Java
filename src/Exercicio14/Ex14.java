/* Uma imagem é formada por pixels. Considere uma imagem com dimensão de 10 x 10 e faça uma
classe que contenha um array bidimensional com essas dimensões. 
A seguir, para cada posição desse array bidimensional armazene um valor aleatório entre 0 e 255 (esses valores correspondem às tonalidades aplicadas sobre a imagem). 
Apresente em tela os valores gerados. */

public class Ex14 {
    public static void main(String[] args) {
    int matriz[][] = new int [10][10];
    int matriz_tamanho = matriz.length;
    
        for(int linha = 0; linha < matriz_tamanho; linha++){
            for(int coluna = 0; coluna < matriz_tamanho; coluna++){
                matriz[linha][coluna] = (int)(Math.random() * 255);
                System.out.printf("[%d] [%d] == %d\n",linha, coluna, matriz[linha][coluna]);
            }
        }
    }
}