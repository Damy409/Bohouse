package model;

/**
 * The HashNode class represents a node in a hash table, containing a key-value pair.
 *
 * @param <K> The type of the key.
 * @param <V> The type of the value.
 */
public class HashNode<K, V> {

    private V value;
    private K key;

    private HashNode<K, V> next;
    private HashNode<K, V> previous;

    /**
     * Constructs a HashNode with the specified key and value.
     *
     * @param key   The key associated with the node.
     * @param value The value associated with the key.
     */
    public HashNode(K key, V value) {
        this.value = value;
        this.key = key;
        next = null;
        previous = null;
    }

    /**
     * Retrieves the value associated with the node.
     *
     * @return The value associated with the node.
     */
    public V getValue() {
        return value;
    }

    /**
     * Sets the value associated with the node.
     *
     * @param value The value to be associated with the node.
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Retrieves the key associated with the node.
     *
     * @return The key associated with the node.
     */
    public K getKey() {
        return key;
    }

    /**
     * Sets the key associated with the node.
     *
     * @param key The key to be associated with the node.
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Retrieves the next node in the linked list.
     *
     * @return The next node in the linked list, or null if there is no next node.
     */
    public HashNode<K, V> getNext() {
        return next;
    }

    /**
     * Sets the next node in the linked list.
     *
     * @param next The node to be set as the next node in the linked list.
     */
    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

    /**
     * Retrieves the previous node in the linked list.
     *
     * @return The previous node in the linked list, or null if there is no previous node.
     */
    public HashNode<K, V> getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node in the linked list.
     *
     * @param previous The node to be set as the previous node in the linked list.
     */
    public void setPrevious(HashNode<K, V> previous) {
        this.previous = previous;
    }
}
