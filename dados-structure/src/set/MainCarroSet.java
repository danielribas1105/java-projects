package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainCarroSet {

    public static void main(String[] args) {

        Set<Carro> carroHashSet = new HashSet<>();

        carroHashSet.add(new Carro("Ford"));
        carroHashSet.add(new Carro("Zip"));
        carroHashSet.add(new Carro("Renault"));
        carroHashSet.add(new Carro("Alfa Romeo"));

        System.out.println(carroHashSet);

        Set<Carro> carroTreeSet = new TreeSet<>();

        carroTreeSet.add(new Carro("Ford"));
        carroTreeSet.add(new Carro("Zip"));
        carroTreeSet.add(new Carro("Renault"));
        carroTreeSet.add(new Carro("Alfa Romeo"));

        System.out.println(carroTreeSet);


    }
}
