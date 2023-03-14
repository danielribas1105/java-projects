package queue;

public class Fila<T> {

    private No<T> refNoEntrada; //referência apontando para o último nó (fim da fila)

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(T novoObj){
        No novoNo = new No(novoObj);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public T first(){
        No primeiroNo = refNoEntrada;
        if (!this.isEmpty()){
            while (primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }
        }else
            return null;
        return (T)primeiroNo.getObject();
    }

    public T dequeue(){
        No primeiroNo = refNoEntrada;
        No noAnterior = refNoEntrada;
        if (!this.isEmpty()){
            while (primeiroNo.getRefNo() != null){
                noAnterior = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAnterior.setRefNo(null);
            return (T)primeiroNo.getObject();
        }else
            return null;
    }

    public boolean isEmpty(){ return refNoEntrada == null ? true : false; }

    @Override
    public String toString(){
        String stringRetorno = "----------------\n";
        stringRetorno += "------FILA------\n";
        stringRetorno += "----------------\n";
        No noAuxiliar = refNoEntrada;

        if(!this.isEmpty()){
            while (true){
                stringRetorno += "[Nó {" + noAuxiliar.getObject() + "}] -> ";
                if(noAuxiliar.getRefNo() == null){
                    break;
                }
                noAuxiliar = noAuxiliar.getRefNo();
            }
        }else
            return stringRetorno += "FILA VAZIA!!!";

        return stringRetorno;
    }
}
