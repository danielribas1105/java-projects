package exercicio2;

import java.util.Scanner;

public class MainExerc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da figura para o cálculo de área: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Trapézio");
        System.out.print("-> ");
        int figura = scanner.nextInt();

        switch (figura){
            case 1:
                System.out.println("Lado do quadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área do Quadrado: " + Quadrilatero.area(lado));
                break;
            case 2:
                System.out.println("Comprimeto do retângulo: ");
                double comp = scanner.nextDouble();
                System.out.println("Altura do retângulo: ");
                double alt = scanner.nextDouble();
                System.out.println("Área do Retângluo: " + Quadrilatero.area(comp, alt));
                break;
            case 3:
                System.out.println("Base maior do trapézio: ");
                double baseMaior = scanner.nextDouble();
                System.out.println("Base menor do trapézio: ");
                double baseMenor = scanner.nextDouble();
                System.out.println("Altura do trapézio: ");
                double altura = scanner.nextDouble();
                System.out.println("Área do Trapézio: " + Quadrilatero.area(baseMaior, baseMenor, altura));
                break;
            default:
                System.out.println("Valor digitado inválido!");
        }
    }
}
