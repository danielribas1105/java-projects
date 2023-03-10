import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String diaSemana = scanner.next().toLowerCase();

        switch (diaSemana){
            case "domingo":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 1º dia da semana");
                break;
            case "segunda":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 2º dia da semana");
                break;
            case "terça":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 3º dia da semana");
                break;
            case "quarta":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 4º dia da semana");
                break;
            case "quinta":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 5º dia da semana");
                break;
            case "sexta":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 6º dia da semana");
                break;
            case "sábado":
                System.out.println("Vc digitou " + diaSemana + ". Esté é o 7º dia da semana");
                break;
            default:
                System.out.println("Vc não digitou um dia de semana válido!!!");
                break;
        }

        System.out.println("FIM DA CONSULTA!");
    }
}
