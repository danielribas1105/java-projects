package loops;

public class Exerc03 {
    public static void main(String[] args) {
        int [] numeros = {75,8,201,9,25};
        int indice = 0;
        double soma = 0.0;
        int maior = numeros[indice];
        do{
            soma += numeros[indice];
            if (maior < numeros[indice]){
                maior = numeros[indice];
            }
            indice++;
        }while (indice < numeros.length);

        System.out.println("A média dos números vale: " + soma/numeros.length);
        System.out.println("O maior número da lista é: " + maior);
    }
}
