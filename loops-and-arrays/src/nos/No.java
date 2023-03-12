package nos;

public class No<T> {

    private T texto;
    private No<T> proximoNo;

    public No(T texto) {
        this.proximoNo = null;
        this.texto = texto;
    }

    public T getTexto() {return texto;}

    public void setTexto(T texto) {this.texto = texto;}

    public No<T> getProximoNo() {return proximoNo;}

    public void setProximoNo(No<T> proximoNo) {this.proximoNo = proximoNo;}

    @Override
    public String toString() {
        return "No{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
