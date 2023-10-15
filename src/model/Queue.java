package model;

/**
 * A generic implementation of a queue data structure that implements the Queueable interface.
 *
 * @param <T> The type of elements to be stored in the queue.
 */
public class Queue<T> implements Queueable<T> {
    private QueueNode<T> front;
    private QueueNode<T> back;

    /**
     * Constructs an empty queue with both front and back references set to null.
     */
    public Queue() {
        front = null;
        back = null;
    }

    /**
     * Retrieves the front node of the queue.
     *
     * @return The front node of the queue.
     */
    public QueueNode<T> getFront() {
        return front;
    }

    /**
     * Sets the front node of the queue.
     *
     * @param front The node to be set as the front of the queue.
     */
    public void setFront(QueueNode<T> front) {
        this.front = front;
    }

    /**
     * Retrieves the back node of the queue.
     *
     * @return The back node of the queue.
     */
    public QueueNode<T> getBack() {
        return back;
    }

    /**
     * Sets the back node of the queue.
     *
     * @param back The node to be set as the back of the queue.
     */
    public void setBack(QueueNode<T> back) {
        this.back = back;
    }

    /**
     * Enqueues an element into the queue.
     *
     * @param value The element to be enqueued.
     */
    @Override
    public void enqueue(T value) {
        QueueNode<T> node = new QueueNode<T>(value);
        if (front == null) {
            front = node;
        } else {
            back.setBehind(node);
        }
        back = node;
    }

    /**
     * Retrieves, but does not remove, the element at the front of the queue.
     *
     * @return The element at the front of the queue, or null if the queue is empty.
     */
    @Override
    public T peek() {
        T value = null;
        if (front != null) {
            value = front.getValue();
        }
        return value;
    }

    /**
     * Dequeues the element at the front of the queue, removing it.
     */
    @Override
    public void dequeue() {
        if (front != null) {
            front = front.getBehind();
        }
        if (front == null) {
            back = null;
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return True if the queue is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Prints the elements in the queue in their order from front to back.
     */
    public void printQueue() {
        QueueNode<T> current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getBehind();
        }
    }
}

