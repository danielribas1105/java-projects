package loops;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tab;
        System.out.println("Qual a tabuada que vc deseja ver? ");
        tab = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(tab + " X " + i + " = " + tab * i);
        }

    }
}
