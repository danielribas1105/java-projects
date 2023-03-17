package circularList;

public class No<T> {

    private T object;
    private No<T> proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T object) {
        this.proximoNo = null;
        this.object = object;
    }

    public T getObject() {return object;}

    public void setObject(T object) {this.object = object;}

    public No<T> getProximoNo() {return proximoNo;}

    public void setProximoNo(No<T> proximoNo) {this.proximoNo = proximoNo;}

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
