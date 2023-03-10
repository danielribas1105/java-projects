import java.util.Scanner;

public class MesFerias {
    public static void main(String[] args) {
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do mês para informações: ");
        int numMes = scanner.nextInt() - 1;
        String mesConsulta = mes[numMes];
        System.out.println("O mês consultado é: " + mesConsulta);

        if ((numMes == 0)||(numMes == 5)||(numMes == 11))
            System.out.println("Esse é um mês de férias!");
        else{
            System.out.println("Esse não é um mês de férias!");
        }
    }
}
