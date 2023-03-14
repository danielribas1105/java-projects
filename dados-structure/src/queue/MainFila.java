package queue;

public class MainFila {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("1º"));
        minhaFila.enqueue(new No("2º"));
        minhaFila.enqueue(new No("3º"));
        minhaFila.enqueue(new No("4º"));
        minhaFila.enqueue(new No("5º"));
        minhaFila.enqueue(new No("6º"));

        System.out.println(minhaFila);

        System.out.println("Primeiro da fila: "+minhaFila.first()+"\n");

        System.out.println("Nó retirado: "+minhaFila.dequeue()+"\n");

        System.out.println(minhaFila);
    }
}
