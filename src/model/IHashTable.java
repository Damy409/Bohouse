package model;


/**
 * The IHashTable interface defines the contract for a generic hash table data structure.
 * Hash tables provide efficient key-value pair storage and retrieval.
 *
 * @param <K> The type of keys to be stored in the hash table.
 * @param <V> The type of values associated with the keys in the hash table.
 */
public interface IHashTable<K,V> {

    public void put(K key, V value) throws Exception;
    public V search(K key);
    public void remove(K key);
    public void printTable();
    
}


