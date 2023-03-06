package br.com.intellij;

import br.com.intellij.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Gato gato = new Gato();
        gato.setNome("Fifi");
        gato.setCor("preto");
        gato.setIdade(5);
        System.out.println(gato);
    }
}
