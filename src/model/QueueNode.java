package model;

/**
 * A class representing a node in a generic queue data structure. Each node contains a value
 * and a reference to the node behind it.
 *
 * @param <T> The type of the value stored in the node.
 */
public class QueueNode<T> {
    private QueueNode<T> behind;
    private T value;

    /**
     * Constructs a new QueueNode with the given value and no reference to a node behind it.
     *
     * @param value The value to be stored in the node.
     */
    public QueueNode(T value) {
        behind = null;
        this.value = value;
    }

    /**
     * Retrieves the node behind the current node.
     *
     * @return The node behind the current node, or null if there is no node behind.
     */
    public QueueNode<T> getBehind() {
        return behind;
    }

    /**
     * Sets the node behind the current node.
     *
     * @param behind The node to be set as the one behind the current node.
     */
    public void setBehind(QueueNode<T> behind) {
        this.behind = behind;
    }

    /**
     * Retrieves the value stored in the current node.
     *
     * @return The value stored in the current node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the value stored in the current node.
     *
     * @param value The value to be stored in the current node.
     */
    public void setValue(T value) {
        this.value = value;
    }
}
