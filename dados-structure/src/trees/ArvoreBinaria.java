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
            System.out.print(noAtual.getObject() + ", ");
            exibirInOrder(noAtual.getNoDir());
        }
    }

    public void exibirPreOrder(){
        System.out.println("\nExibir Árvore PreOrder");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> noAtual) {
        if (noAtual != null) {
            System.out.print(noAtual.getObject() + ", ");
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
            System.out.print(noAtual.getObject() + ", ");
        }
    }

    public void remover(T object) {
        try {
            BinNo<T> noAtual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            //Verificação de árvore vazia
            if (noAtual == null) {
                System.out.println("\nÁrvore Vazia - bloco try");
            } else {
                //Laço para encontrar o nó a ser removido
                while (noAtual != null && !noAtual.getObject().equals(object)) {
                    pai = noAtual;
                    if (object.compareTo(noAtual.getObject()) < 0){
                        noAtual = noAtual.getNoEsq();
                    }else {
                        noAtual = noAtual.getNoDir();
                    }
                }
            }

            System.out.println("\nNó a ser removido: " + noAtual.getObject());
            //Remover o nó
            if (pai == null){
                if (noAtual.getNoDir() == null) {
                    this.raiz = noAtual.getNoEsq();
                } else if (noAtual.getNoEsq() == null) {
                    this.raiz = noAtual.getNoDir();
                }else {
                    for (temp = noAtual, filho = noAtual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()) {
                        if (filho != noAtual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (noAtual.getNoDir() == null) {
                if (pai.getNoEsq() == noAtual) {
                    pai.setNoEsq(noAtual.getNoEsq());
                }else {
                    pai.setNoDir(noAtual.getNoEsq());
                }
            } else if (noAtual.getNoEsq() == null) {
                if (pai.getNoEsq() == noAtual) {
                    pai.setNoEsq(noAtual.getNoDir());
                }else {
                    pai.setNoDir(noAtual.getNoDir());
                }
            }else {
                for (temp = noAtual, filho = noAtual.getNoEsq();
                     filho.getNoDir() != null;
                     temp = filho, filho = filho.getNoDir()) {
                    if (filho != noAtual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(noAtual.getNoEsq());
                    }
                    filho.setNoDir(noAtual.getNoDir());
                    if (pai.getNoEsq() == noAtual) {
                        pai.setNoEsq(filho);
                    }else {
                        pai.setNoDir(filho);
                    }
                }

            }


        }catch (NullPointerException erro){
            System.out.println("\nConteúdo não encontrado - bloco cath");
        }
    }

}
