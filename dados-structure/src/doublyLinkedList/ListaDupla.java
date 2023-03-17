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
        if(this.isEmpty()){
            primeiroNo = novoNo;
            ultimoNo = primeiroNo;
        }else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo.setNoPosterior(novoNo);
            ultimoNo = novoNo;
        }
        tamanhoLista++;
    }

    public void add(int index, T novoObj){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(novoObj);
        novoNo.setNoPosterior(noAuxiliar);
        if(index == 0){
            primeiroNo = novoNo;
        } else if (index == this.size() - 1) {
            ultimoNo = novoNo;
            noAuxiliar.setNoPosterior(ultimoNo);
            ultimoNo.setNoAnterior(noAuxiliar);
        } else {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoPosterior();
            if (primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        }else if (index == this.size() - 1){
            ultimoNo = ultimoNo.getNoAnterior();
            ultimoNo.setNoPosterior(null);
        }else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
            }else {
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
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

    @Override
    public String toString() {
        String strRetorno = "---------------------\n";
        strRetorno += "-----LISTA DUPLA-----\n";
        strRetorno += "---------------------\n";
        NoDuplo<T> noAuxiliar = primeiroNo;
        if(!this.isEmpty()) {
            for(int i = 0; i < this.size(); i++){
                strRetorno += "[Nó Lista {" + noAuxiliar.getObject() + "}] -> ";
                noAuxiliar = noAuxiliar.getNoPosterior();
            }
            strRetorno += "null";
        }else {
            return strRetorno += "LISTA VAZIA!";
        }
        return strRetorno;
    }
}
