package exercicio2;

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double comp, double alt){
        return comp * alt;
    }

    public static double area(double bMaior, double bMenor, double alt){
        return ((bMaior + bMenor) * alt) / 2;
    }

    public static void teste(int i){
        return;
    }
}
