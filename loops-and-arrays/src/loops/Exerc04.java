package loops;

public class Exerc04 {
    public static void main(String[] args) {
        int[] numeros = {9,23,5,31,7,86,33,34,12,78};
        int count = 0;
        int par = 0;
        int impar = 0;
        while (count < numeros.length){
            int resto = numeros[count] % 2;
            if (resto == 0){
                par++;
            } else {
                impar++;
            }
            count++;
        }
        System.out.println("Na lista temos: " + par + " números pares e " + impar + " números ímpares.");
    }
}
