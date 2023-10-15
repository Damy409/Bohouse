package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A generic implementation of a priority queue using a list to store elements. Elements in the
 * priority queue are sorted in ascending order according to their natural ordering or based on
 * their implementation of the Comparable interface.
 *
 * @param <T> The type of elements to be stored in the priority queue, which must implement Comparable.
 */
public class PriorityQueue<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();

    /**
     * Enqueues an element into the priority queue.
     *
     * @param element The element to be enqueued.
     */
    public void enqueue(T element) {
        elements.add(element);
        Collections.sort(elements);
    }

    /**
     * Dequeues and returns the element with the highest priority from the priority queue.
     *
     * @return The element with the highest priority in the priority queue.
     * @throws IllegalStateException if the priority queue is empty.
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The priority queue is empty");
        }
        return elements.remove(0);
    }

    /**
     * Checks if the priority queue is empty.
     *
     * @return True if the priority queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Prints the elements in the priority queue in their natural order (highest priority first).
     */
    public void printQueue() {
        for (T element : elements) {
            System.out.println(element.toString());
        }
    }
}
