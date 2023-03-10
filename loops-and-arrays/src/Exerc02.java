import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String notaAluno;
        while (true){
            System.out.println("Digite uma nota entre 0.0 e 10.0: ");
            notaAluno = scanner.next();
            double nota = Double.parseDouble(notaAluno);
            if(nota >= 0.0 && nota <= 10.0){
                System.out.println("Nota digitada -> " + nota);
                System.out.println("Fim da Consulta!");
                break;
            }else
                System.out.println("Valor fora do range de notas!");
        }

    }
}
