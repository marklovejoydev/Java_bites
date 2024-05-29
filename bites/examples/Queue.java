package bites.examples;
import java.util.ArrayList;

public class Queue {
    ArrayList<String> people = new ArrayList<>();
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Mark");
        queue.add("Lisa");
        queue.add("Bart");
        queue.add("Maggie");
        queue.add("Homer");
        queue.state();
        queue.next();
        queue.state();
        queue.next();
        queue.state();
    }

    public void next() {
        System.out.println(people.get(0));
        people.remove(0);
    }

    public void state() {
        System.out.println(people);
    }

    public void add(String name) {
        people.add(name);
    }
}
