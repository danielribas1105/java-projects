package arrays;

public class ExercArr02 {
    public static void main(String[] args) {
        String[] letras = {"a","b","c","d","e","f"};
        int letrasUp = 0;
        
        for (int i = 0; i < letras.length; i++){
            if(letras[i].equals(letras[i].toUpperCase())){
                letrasUp += 1;
                System.out.print(letras[i] + " -> ");
            }
        }
        System.out.println("Foram encontradas " + letrasUp + " letras maiúsculas!");
    }
}
