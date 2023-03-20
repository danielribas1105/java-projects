package trees;

public class BinNo<T extends Comparable<T>> {

    private T object;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo() {}

    public BinNo(T object) {
        this.object = object;
        this.noEsq = this.noDir = null;
    }

    public T getObject() {return object;}

    public void setObject(T object) {this.object = object;}

    public BinNo<T> getNoEsq() {return noEsq;}

    public void setNoEsq(BinNo<T> noEsq) {this.noEsq = noEsq;}

    public BinNo<T> getNoDir() {return noDir;}

    public void setNoDir(BinNo<T> noDir) {this.noDir = noDir;}

    @Override
    public String toString() {
        return "BinNo{" +
                "object=" + object +
                '}';
    }
}
