package model;


/**
 * The HashNode class represents a node in a hash table, containing a key-value pair.
 *
 * @param <K> The type of the key.
 * @param <V> The type of the value.
 */
public class HashNode<K,V> {

  
    private K key;
    private V value;
    private HashNode<K, V> next;

    /**
     * Constructs a new HashNode with the specified key and value.
     *
     * @param key   The key associated with the node.
     * @param value The value associated with the key.
     */
    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;

    }

    /**
     * Sets the key associated with this node.
     *
     * @param key The new key to set.
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Sets the value associated with this node.
     *
     * @param value The new value to set.
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Sets the next HashNode in the linked list.
     *
     * @param current The next HashNode to set.
     */
    public void setNext(HashNode<K, V> current) {
    }

    /**
     * Gets the key associated with this node.
     *
     * @return The key associated with this node.
     */
    public Object getKey() {
        return null;
    }

    /**
     * Gets the value associated with this node.
     *
     * @return The value associated with this node.
     */
    public V getValue() {
        return null;
    }

    /**
     * Gets the next HashNode in the linked list.
     *
     * @return The next HashNode in the linked list.
     */
    public HashNode<K, V> getNext() {
        return null;
    }

    


    
}
