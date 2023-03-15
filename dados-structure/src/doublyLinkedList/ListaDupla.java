package doublyLinkedList;

public class ListaDupla<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDupla() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }

    public void add(T novoObj){
        NoDuplo<T> novoNo = new NoDuplo<>(novoObj);
        novoNo.setNoPosterior(null);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo.setNoPosterior(novoNo);
        }
        tamanhoLista++;
    }

    public void add(int index, T novoObj){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(novoObj);
        if(index == 0){
            noAuxiliar.setNoAnterior(novoNo);
            novoNo.setNoAnterior(null);
            novoNo.setNoPosterior(noAuxiliar);
        }else if (index == this.size() - 1){
            noAuxiliar.setNoPosterior(novoNo);
            novoNo.setNoAnterior(noAuxiliar);
            novoNo.setNoPosterior(null);
        }else {
            NoDuplo<T> noAuxPosterior = getNo(index + 1);
            novoNo.setNoPosterior(noAuxPosterior);
            noAuxiliar.setNoPosterior(novoNo);
            novoNo.setNoAnterior(noAuxiliar);
            noAuxPosterior.setNoAnterior(novoNo);
        }
        tamanhoLista++;
    }

    public T get(int index){
        return this.getNo(index).getObject();
    }

    private NoDuplo<T> getNo(int index){
        checkIndex(index);
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
        return noAuxiliar;
    }

    private void checkIndex(int index){
        if(index >= size())
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ".");
    }

    public boolean isEmpty(){
        if((primeiroNo == null) && (ultimoNo == null))
            return true;
        else
            return false;
    }
}
