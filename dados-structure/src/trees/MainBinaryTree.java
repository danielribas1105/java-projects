package trees;

import trees.models.Obj;

public class MainBinaryTree {

    public static void main (String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));
        //minhaArvore.inserir(new Obj(1));
        //minhaArvore.inserir(new Obj(5));

        minhaArvore.exibirPreOrder();
        minhaArvore.exibirInOrder();
        minhaArvore.exibirPosOrder();

        /*minhaArvore.remover(new Obj(10));

        minhaArvore.exibirPreOrder();
        minhaArvore.exibirInOrder();
        minhaArvore.exibirPosOrder();*/
    }
}
