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
}
