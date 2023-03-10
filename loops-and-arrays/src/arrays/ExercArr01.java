package arrays;

public class ExercArr01 {
    public static void main(String[] args) {
        int[] vetor = {11,12,13,14,15,16};
        System.out.print("O vetor invertido é: ");
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
