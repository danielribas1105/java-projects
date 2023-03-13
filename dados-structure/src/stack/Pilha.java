package stack;

public class Pilha {

    private No refNoEntrada;

    public Pilha() {}

    public Pilha(No refNoEntrada) {
        this.refNoEntrada = refNoEntrada;
    }

    public boolean isEmpty(){
        return refNoEntrada == null? true:false;
    }

}
