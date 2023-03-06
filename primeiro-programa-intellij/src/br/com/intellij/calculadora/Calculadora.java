package br.com.intellij.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();

        System.out.println("Resultado:");
        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Divisão: " + divisao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
    }

    public static int soma(int n1, int n2){
        return n1 + n2;
    }
    public static int subtracao(int n1, int n2){
        return n1 - n2;
    }
    public static int divisao(int n1, int n2){
        return n1 / n2;
    }
    public static int multiplicacao(int n1, int n2){
        return n1 * n2;
    }

}
