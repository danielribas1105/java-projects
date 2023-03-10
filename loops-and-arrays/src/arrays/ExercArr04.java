package arrays;

import java.util.Random;

public class ExercArr04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz44 = new int[4][4];
        int linha = 0;
        int coluna = 0;
        for (int l = 0; l < 4; l++){
            for (int c = 0; c < 4; c++){
                int numero = random.nextInt(9);
                matriz44[l][c] = numero;
                System.out.print(matriz44[l][c] + " ");
            }
            System.out.println();
        }
    }
}
