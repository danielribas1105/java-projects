package queue;

public class MainFila {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("1º fila"));
        minhaFila.enqueue(new No("2º fila"));
        minhaFila.enqueue(new No("3º fila"));
        minhaFila.enqueue(new No("4º fila"));
        minhaFila.enqueue(new No("5º fila"));
        minhaFila.enqueue(new No("6º fila"));

        System.out.println(minhaFila);

    }
}
