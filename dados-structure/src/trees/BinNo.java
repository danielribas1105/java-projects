package trees;

public class BinNo<T extends Comparable<T>> {

    private T object;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo() {
        this.noEsq = this.noDir = null;
    }

    public BinNo(T object) {
        this.object = object;
        this.noEsq = this.noDir = null;
    }
}
