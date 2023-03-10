package arrays;

import java.util.Random;
import java.util.Scanner;

public class ExercArr03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];
        int count = 0;
        while (count < vetor.length){
            vetor[count] = random.nextInt(100);
            count++;
        }
        count = 0;
        while (count < vetor.length){
            System.out.println("O número armazenado foi " + vetor[count] + " e seu sucessor é " + (vetor[count] + 1));
            count++;
        }
    }
}
