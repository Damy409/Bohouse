package model;

/**
 * An interface representing a generic queue data structure, allowing elements to be enqueued, dequeued,
 * peeked at, and checked for emptiness.
 *
 * @param <T> The type of elements to be stored in the queue.
 */
public interface Queueable<T> {
    /**
     * Enqueues an element into the queue.
     *
     * @param value The element to be enqueued.
     */
    public void enqueue(T value);

    /**
     * Retrieves, but does not remove, the element at the front of the queue.
     *
     * @return The element at the front of the queue.
     */
    public T peek();

    /**
     * Dequeues the element at the front of the queue, removing it.
     */
    public void dequeue();

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    public boolean isEmpty();
}
