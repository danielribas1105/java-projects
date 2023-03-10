import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        String [][] aluno = {{"Daniel", "47"},{"Veronica", "42"},{"Julia", "15"},{"Vitor", "12"},{"Leticia","10"}};
        int linha = 0;
        int coluna = 0;
        while (true){
            System.out.println("Nome: " + aluno[linha][coluna] + " -> Idade: " + aluno[linha][coluna + 1]);
            if (linha == aluno.length - 1)
                break;
            linha += 1;
        }
    }
}
