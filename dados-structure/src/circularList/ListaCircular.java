package circularList;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }
}
