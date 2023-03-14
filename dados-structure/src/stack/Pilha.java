package stack;

public class Pilha {

    private No refNoEntrada;

    public Pilha() {
        this.refNoEntrada = null;
    }

    public No top(){
        return refNoEntrada;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPoped;
        }
        return null;
    }

    public void push(No novoNo){
        No refNoAuxiliar = refNoEntrada;
        refNoEntrada = novoNo;
        novoNo.setRefNo(refNoAuxiliar);
    }

    public boolean isEmpty(){
        return refNoEntrada == null ? true : false;
    }

}
