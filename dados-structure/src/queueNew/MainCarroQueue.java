package queueNew;

import java.util.LinkedList;
import java.util.Queue;

public class MainCarroQueue {

    public static void main(String[] args) {

        Queue<Carro> carroQueue = new LinkedList<>();

        carroQueue.add(new Carro("Ford"));
        carroQueue.add(new Carro("Fiat"));
        carroQueue.add(new Carro("Renault"));
        carroQueue.add(new Carro("Nissan"));

        System.out.println(carroQueue);
        System.out.println(carroQueue.peek());
        System.out.println(carroQueue);
        System.out.println(carroQueue.poll());
        System.out.println(carroQueue);
        System.out.println(carroQueue.size());
        carroQueue.offer(new Carro("Chevrolet"));
        System.out.println(carroQueue);

    }
}
