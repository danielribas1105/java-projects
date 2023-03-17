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

    public void add(T novoObj){
        No<T> novoNo = new No<>(novoObj);
        if (this.isEmpty()){
            this.cabeca = this.cauda = novoNo;
            this.cabeca.setProximoNo(novoNo);
        }else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public T get(int index) {
        return this.getNo(index).getObject();
    }

    private No<T> getNo(int index) {
        checkIndex(index);
        No<T> noAuxiliar = this.cauda;
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Lista Vazia");
        if (index == 0){
            return noAuxiliar;
        }else {
            for (int i = 0; i < index; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            return noAuxiliar;
        }
    }

    public void remove(int index) {
        No<T> noPivot = this.cauda;
        No<T> noAnterior = null;
        checkIndex(index);
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Lista Vazia");
        if (index == 0) {
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else {
            while (true) {
                noAnterior = noPivot;
                noPivot = noPivot.getProximoNo();
                if (noPivot == getNo(index))
                    break;
            }
            noAnterior.setProximoNo(noPivot.getProximoNo());
        }
        this.tamanhoLista--;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    private void checkIndex(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ". A lista " +
                    "possui índices até a posição " + (this.size()-1) + "!");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "--------------------\n";
        strRetorno += "---LISTA CIRCULAR---\n";
        strRetorno += "--------------------\n";
        No<T> noAuxiliar = this.cauda;
        if(!this.isEmpty()) {
            for(int i = 0; i < this.size(); i++){
                strRetorno += "[Nó Lista Circular {" + noAuxiliar.getObject() + "}] -> ";
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }else {
            return strRetorno += "LISTA VAZIA!";
        }
        strRetorno += "(Retorna Início)";
        return strRetorno;
    }
}
