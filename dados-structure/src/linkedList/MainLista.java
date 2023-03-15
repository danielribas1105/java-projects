package linkedList;

public class MainLista {

    public static void main(String[] args){

        Lista<String> minhaLista = new Lista<>();

        minhaLista.add("Nó 1");
        minhaLista.add("Nó 2");
        //minhaLista.add("Nó 3");
        //minhaLista.add("Nó 4");

        System.out.println(minhaLista + "\n");
        System.out.println("Quantidade de nós: " + minhaLista.size());
        System.out.println(minhaLista.get(0));

    }
}
