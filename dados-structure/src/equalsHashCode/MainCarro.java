package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class MainCarro {

    public static void main (String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Renault"));
        listaCarros.add(new Carro("Nissan"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Fiat");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
