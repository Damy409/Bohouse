package model;

/**
 * The IHashTable interface defines the contract for a generic hash table data structure.
 * Hash tables provide efficient key-value pair storage and retrieval.
 *
 * @param <K> The type of keys to be stored in the hash table.
 * @param <V> The type of values associated with the keys in the hash table.
 */
public interface IHashTable<K, V> {

    /**
     * Adds a key-value pair to the hash table.
     *
     * @param key   The key to be added.
     * @param value The value associated with the key.
     * @throws Exception if an error occurs during the insertion.
     */
    public void put(K key, V value) throws Exception;

    /**
     * Searches for a value associated with a given key in the hash table.
     *
     * @param key The key to search for.
     * @return The value associated with the key, or null if the key is not found.
     */
    public V search(K key);

    /**
     * Removes a key-value pair from the hash table based on the key.
     *
     * @param key The key to be removed.
     */
    public void remove(K key);

    /**
     * Prints the contents of the hash table, including key-value pairs.
     */
    public void printTable();
}


