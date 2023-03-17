package circularList;

public class MainListaCircular {

    public static void main (String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("Nó 1");
        minhaLista.add("Nó 2");
        minhaLista.add("Nó 3");
        minhaLista.add("Nó 4");

        System.out.println(minhaLista);
        System.out.println("Quantidade de nós: " + minhaLista.size());

        minhaLista.remove(1);
        System.out.println("Nó removido: " + minhaLista.get(1));
        System.out.println(minhaLista);
        System.out.println("Quantidade de nós: " + minhaLista.size());

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));
        System.out.println(minhaLista.get(4));
    }
}
