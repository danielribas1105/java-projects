package linkedList;

public class Lista<T> {

    private No<T> refNoEntrada;

    public Lista() {this.refNoEntrada = null;}

    public void add(T novoObj){
        No<T> novoNo = new No<>(novoObj);
        if (this.isEmpty()) {
            refNoEntrada = novoNo;
        }else {
            No<T> noAuxiliar = refNoEntrada;
            for(int i = 0; i < this.size() - 1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    public T get(int index){
        return getNo(index).getObject();
    }

    private No<T> getNo(int index){
        checkIndex(index);
        No<T> noAuxiliar = refNoEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        checkIndex(index);
        No<T> noPivot = this.getNo(index);
        if(index == 0){
            refNoEntrada = noPivot.getProximoNo();
            return noPivot.getObject();
        }else{
            No<T> noAnterior = this.getNo(index - 1);
            noAnterior.setProximoNo(noPivot.getProximoNo());
            return noPivot.getObject();
        }
    }

    public int size(){
        int tamanho = 0;
        No<T> refNo = refNoEntrada;
        if(refNo != null) {
            tamanho ++;
            while (refNo.getProximoNo() != null){
                tamanho ++;
            }
        }
        return tamanho;
    }

    private void checkIndex(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ". A lista " +
                    "possui índices até a posição " + (this.size()-1) + "!");
        }
    }

    public boolean isEmpty(){return refNoEntrada == null ? true : false;}

    @Override
    public String toString() {
        String strRetorno = "---------------\n";
        strRetorno += "-----LISTA-----\n";
        strRetorno += "---------------\n";
        No<T> noAuxiliar = refNoEntrada;

        if(!this.isEmpty()) {
            for(int i = 0; i < this.size(); i++){
                strRetorno += "[Nó Lista {" + noAuxiliar.getObject() + "}] -> ";
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }else {
            return strRetorno += "LISTA VAZIA!";
        }
        strRetorno += "null";
        return strRetorno;
    }
}
