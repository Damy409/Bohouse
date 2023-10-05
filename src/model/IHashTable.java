package model;

public interface IHashTable<K,V> {

    public void insert(K key, V value, Task task);
    public V search(K key, Task task);
    public void delete(K key, Task task);
    public String print();
    
}


