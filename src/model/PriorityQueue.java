package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();

    public void enqueue(T element) {
        elements.add(element);
        Collections.sort(elements);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía");
        }
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void printQueue() {
        for (T element : elements) {
            System.out.println(element.toString());
        }
    }

}
