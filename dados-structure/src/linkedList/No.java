package linkedList;

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

    public No(T object, No<T> proximoNo) {
        this.object = object;
        this.proximoNo = proximoNo;
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

    public String toStringEncadeado(){
        String str = "No{" + "object=" + object + '}';
        if (proximoNo != null)
            str += " -> " + proximoNo.toString();
        else
            str += " -> null";
        return str;
    }
}
