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

    public T get(int index) {
        return this.getNo(index).getObject();
    }

    private No<T> getNo(int index) {
        checkIndex(index);
        No<T> noAuxiliar = cabeca;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }

    private void checkIndex(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ". A lista " +
                    "possui índices até a posição " + (this.size()-1) + "!");
        }
    }

}
