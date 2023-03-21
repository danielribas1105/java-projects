package stackNew;

import java.util.Stack;

public class MainCarroStack {

    public static void main(String[] args) {

        Stack<Carro> pilhaCarros = new Stack<>();

        pilhaCarros.push(new Carro("Ford"));
        pilhaCarros.push(new Carro("Renault"));
        pilhaCarros.push(new Carro("Nissan"));

        System.out.println(pilhaCarros);
        System.out.println(pilhaCarros.peek());
        System.out.println(pilhaCarros);
        System.out.println(pilhaCarros.pop());
        System.out.println(pilhaCarros.empty());


    }
}
