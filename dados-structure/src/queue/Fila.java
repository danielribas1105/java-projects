package queue;

public class Fila {

    private No refNoEntrada; //referência apontando para o último nó da fila

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(No novoNo){
       novoNo.setRefNo(refNoEntrada);
       refNoEntrada.setRefNo(novoNo);
    }

    public No first(){
        No noAuxiliar = refNoEntrada;
        if(!this.isEmpty()){
            while (refNoEntrada.getRefNo() != null){
                refNoEntrada = refNoEntrada.getRefNo();
            }
        }else
            return null;

        return refNoEntrada;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            refNoEntrada = refNoEntrada.getRefNo();
            return refNoEntrada;
        }else
            return null;
    }

    public boolean isEmpty(){ return refNoEntrada == null ? true : false; }

    @Override
    public String toString(){
        String stringRetorno = "----------------\n";
        stringRetorno += "------FILA------\n";
        stringRetorno += "----------------\n";

        return stringRetorno;
    }
}
