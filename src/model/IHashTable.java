package model;


/**
 * The IHashTable interface defines the contract for a generic hash table data structure.
 * Hash tables provide efficient key-value pair storage and retrieval.
 *
 * @param <K> The type of keys to be stored in the hash table.
 * @param <V> The type of values associated with the keys in the hash table.
 */
public interface IHashTable<K,V> {

    /**
     * Inserts a key-value pair into the hash table.
     *
     * @param key   The key to be inserted.
     * @param value The value associated with the key.
     * @param task  The associated task (if applicable) for additional context.
     */
    public void insert(K key, V value, Task task);

    /**
     * Searches for a value associated with the given key in the hash table.
     *
     * @param key  The key to search for.
     * @param task The associated task (if applicable) for additional context.
     * @return The value associated with the key, or {@code null} if not found.
     */
    public V search(K key, Task task);

    /**
     * Deletes a key-value pair from the hash table based on the provided key.
     *
     * @param key  The key to be deleted.
     * @param task The associated task (if applicable) for additional context.
     */
    public void delete(K key, Task task);

    /**
     * Returns a string representation of the hash table, typically for debugging purposes.
     *
     * @return A string representation of the hash table.
     */
    public String print();
    
}


