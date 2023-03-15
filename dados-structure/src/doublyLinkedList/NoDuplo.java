package doublyLinkedList;

public class NoDuplo<T> {

    private T object;
    private NoDuplo<T> noAnterior;
    private NoDuplo<T> noPosterior;

    public NoDuplo() {
        this.noAnterior = null;
        this.noPosterior = null;
    }

    public NoDuplo(T object) {
        this.noAnterior = null;
        this.noPosterior = null;
        this.object = object;
    }

    public NoDuplo(T object, NoDuplo<T> noAnterior, NoDuplo<T> noPosterior) {
        this.object = object;
        this.noAnterior = noAnterior;
        this.noPosterior = noPosterior;
    }

    public T getObject() {return object;}

    public void setObject(T object) {this.object = object;}

    public NoDuplo<T> getNoAnterior() {return noAnterior;}

    public void setNoAnterior(NoDuplo<T> noAnterior) {this.noAnterior = noAnterior;}

    public NoDuplo<T> getNoPosterior() {return noPosterior;}

    public void setNoPosterior(NoDuplo<T> noPosterior) {this.noPosterior = noPosterior;}

    @Override
    public String toString() {
        return "NoDuplo{" +
                "object=" + object +
                '}';
    }
}
