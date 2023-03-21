package exercicio1;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MainExerc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.println(somar(n1, n2));
        System.out.println(diminuir(n1, n2));
        System.out.println(multiplicar(n1, n2));
        System.out.println(dividir(n1, n2));

        Date date = new Date();
        System.out.println(saudacao(date));

        System.out.println("Qual o valor para empréstimo: ");
        double valor = scanner.nextDouble();
        System.out.println(calcularEmprestimo(valor));

    }

    private static String calcularEmprestimo(double valor) {
        String strRetorno = "----------------------";
        strRetorno += "\n- VALOR DAS PARCELAS -";
        strRetorno += "\n----------------------";
        double emp12x = (valor * 1.2)/12;
        double emp24x = (valor * 1.5)/12;
        double emp36x = (valor * 1.8)/12;
        strRetorno += "\n-> 12 x de " + "R$ " + emp12x;
        strRetorno += "\n-> 24 x de " + "R$ " + emp24x;
        strRetorno += "\n-> 36 x de " + "R$ " + emp36x;

        return strRetorno;
    }

    private static double somar(double n1, double n2){
        return n1 + n2;
    }

    private static double diminuir(double n1, double n2){
        return n1 - n2;
    }

    private static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    private static double dividir(double n1, double n2){
        return n1 / n2;
    }

    private static String saudacao(Date horaDia){
        String horaAtual = new SimpleDateFormat("HH:mm").format(horaDia);
        return horaAtual;
    }
}
