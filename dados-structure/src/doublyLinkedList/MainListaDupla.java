package doublyLinkedList;

public class MainListaDupla {

    public static void main (String[] args) {

        ListaDupla<String> minhaLista = new ListaDupla<>();

        minhaLista.add("Nó 1");
        minhaLista.add("Nó 2");
        minhaLista.add("Nó 3");
        minhaLista.add("Nó 4");
        minhaLista.add(1,"Nó extra");

        System.out.println(minhaLista);
        System.out.println("Quantidade de nós: " + minhaLista.size());

    }
}
