package br.com.drcode.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		System.out.println("Soma: " + soma(a, b));
		System.out.println("Subtração: " + subtracao(a, b));
		System.out.println("Divisão: " + divisao(a, b));
		System.out.println("Multiplicação: " + multiplicacao(a, b));
		
	}
	
	public static int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int subtracao(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int divisao(int n1, int n2) {
		return n1 / n2;
	}
	
	public static int multiplicacao(int n1, int n2) {
		return n1 * n2;
	}
}
