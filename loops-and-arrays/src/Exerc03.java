public class Exerc03 {
    public static void main(String[] args) {
        int [] numeros = {5,8,2,9,4};
        int indice = 0;
        double soma = 0.0;
        int maior = numeros[indice];
        do{
            soma += numeros[indice];
            if (maior < numeros[indice + 1]){
                maior = numeros[indice + 1];
            }
            indice++;
        }while (indice < numeros.length);

        System.out.println("A média dos números vale: " + soma/numeros.length);
        System.out.println("O maior número da lista é: " + maior);
    }
}
