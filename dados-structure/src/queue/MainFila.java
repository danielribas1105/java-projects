package queue;

public class MainFila {

    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("1º");
        minhaFila.enqueue("2º");
        minhaFila.enqueue("3º");
        minhaFila.enqueue("4º");
        minhaFila.enqueue("5º");
        minhaFila.enqueue("6º");

        System.out.println(minhaFila);

        System.out.println("Primeiro da fila: "+minhaFila.first()+"\n");

        System.out.println("Nó retirado: "+minhaFila.dequeue()+"\n");

        System.out.println(minhaFila);
    }
}
