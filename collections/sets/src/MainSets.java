import java.util.*;

public class MainSets {

    public static void main (String[] args){

        /*
        **** Exercício 01 - Set ****
        *
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Verde");
        arcoIris.add("Laranja");
        arcoIris.add("Violeta");
        arcoIris.add("Roxo");
        arcoIris.add("Azul");
        arcoIris.add("Amarelo");

        System.out.println(arcoIris);
        System.out.println("Quantidade de cores: " + arcoIris.size());

        for (String cor : arcoIris) {
            if(cor.startsWith("V"))
                System.out.println(cor);
        }

        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<String> iterator2 = arcoIris.iterator();
        while (iterator2.hasNext()){
            if(iterator2.next().startsWith("V"))
                iterator2.remove();
        }

        System.out.println(arcoIris);


        System.out.println(arcoIris.isEmpty());
        arcoIris.clear();
        System.out.println(arcoIris);

        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Verde");
        arcoIris.add("Laranja");
        arcoIris.add("Violeta");
        arcoIris.add("Roxo");
        arcoIris.add("Azul");
        arcoIris.add("Amarelo");

        System.out.println(arcoIris);
        //System.out.println("Quantidade de cores: " + arcoIris.size());
        List<String> novoArcoIris = new ArrayList<>(arcoIris);
        Collections.reverse(novoArcoIris);
        System.out.println(novoArcoIris);

        Set<String> arcoIris = new TreeSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Verde");
        arcoIris.add("Laranja");
        arcoIris.add("Violeta");
        arcoIris.add("Roxo");
        arcoIris.add("Azul");
        arcoIris.add("Amarelo");

        System.out.println(arcoIris);
        System.out.println("Quantidade de cores: " + arcoIris.size());*/

        /*
        **** Exercício 02 - Set
         */
        Set<LinguagemFavorita> minhaLinguagem = new TreeSet<>();
        minhaLinguagem.add(new LinguagemFavorita("Java", 1985, "Intellij"));
        minhaLinguagem.add(new LinguagemFavorita("PHP", 2001, "Visual Studio Code"));
        minhaLinguagem.add(new LinguagemFavorita("HTML", 1970, "NotePad++"));

        System.out.println(minhaLinguagem);
    }
}
