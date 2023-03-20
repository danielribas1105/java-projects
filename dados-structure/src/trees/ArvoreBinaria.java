package trees;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T object) {
        BinNo<T> novoNo = new BinNo<>(object);
        raiz = inserir(raiz, novoNo);
    }
    private BinNo<T> inserir(BinNo<T> noAtual, BinNo<T> novoNo) {
        if (noAtual == null) {
            return novoNo;
        } else if (novoNo.getObject().compareTo(noAtual.getObject()) < 0) {
            noAtual.setNoEsq(inserir(noAtual.getNoEsq(),novoNo));
        }else {
            noAtual.setNoDir(inserir(noAtual.getNoDir(),novoNo));
        }
        return noAtual;
    }

    public void exibirInOrder() {
        System.out.println("\nExibir Árvore InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> noAtual) {
        if (noAtual != null) {
            exibirInOrder(noAtual.getNoEsq());
            System.out.println(noAtual.getObject() + ", ");
            exibirInOrder(noAtual.getNoDir());
        }
    }

    public void exibirPreOrder(){
        System.out.println("\nExibir Árvore PreOrder");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> noAtual) {
        if (noAtual != null) {
            System.out.println(noAtual.getObject() + ", ");
            exibirPreOrder(noAtual.getNoEsq());
            exibirPreOrder(noAtual.getNoDir());
        }
    }

    public void exibirPosOrder(){
        System.out.println("\nExibir Árvore PosOrder");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> noAtual) {
        if (noAtual != null) {
            exibirPosOrder(noAtual.getNoEsq());
            exibirPosOrder(noAtual.getNoDir());
            System.out.println(noAtual.getObject() + ", ");
        }
    }
}
