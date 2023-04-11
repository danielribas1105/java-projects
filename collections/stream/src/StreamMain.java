import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<String> numAleatorios = Arrays.asList("1", "2", "4", "7", "1", "8", "2", "5");

        //System.out.println("Imprima todos os elementos dessa lista:");
        //numAleatorios.forEach(System.out::println);

        /*System.out.println("Pegar os 5 primeiros números e colocar em um Set:");
        numAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        /*System.out.println("Trasforme a lista de String para Integer:");
        numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        /*System.out.println("Imprima os números pares maiores que 2:");
        numAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        /*System.out.println("Imprima a média dos números:");
        numAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average().ifPresent(System.out::println);*/

        System.out.println("Remova os valores ímpares:");
        List<Integer> numAleatorios2 = numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numAleatorios2.removeIf(i -> i % 2 != 0);
        System.out.println(numAleatorios2);

    }
}
