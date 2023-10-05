package model;

import java.util.ArrayList;
import java.util.Collections;


/**
 * The HashTable class represents a hash table data structure that stores key-value pairs.
 * It uses a simple hashing function for indexing and handles collisions with linked lists.
 *
 * @param <K> The type of keys to be stored in the hash table.
 * @param <V> The type of values associated with the keys in the hash table.
 */
public class HashTable<K,V> implements IHashTable<K,V> {

    private ArrayList<HashNode<K,V>> table;

    /**
     * Constructs a new HashTable with an initial capacity of 12.
     */
    public HashTable() {
        this.table = new ArrayList<>(Collections.nCopies(12, null));
    }

    /**
     * Hashes a task to determine the index in the hash table.
     *
     * @param task The task used for generating the hash index.
     * @return The index in the hash table.
     */
    public int hash(Task task) {

        int key1 = 0;


        if (task.getPriority() == PriorityLevel.HIGH)
        {
            key1 = 0;
        }
        else
        {
            key1 = 1;
        }

        return key1;
    }


    @Override
    public void insert(K key, V value, Task task) {
        if (key == null) {
            throw new IllegalArgumentException("La clave no puede ser nula.");
        }

        int index = hash(task);
        HashNode<K, V> nodeToAdd = new HashNode<>(key, value);

        if (table.get(index) == null) {
            table.set(index, nodeToAdd);
        } else {
            HashNode<K, V> current = table.get(index);
            nodeToAdd.setNext(current);
            table.set(index, nodeToAdd);
        }
    }


    @Override
    public V search(K key, Task task) {
        int index = hash(task);
        return search(table.get(index), key, task);
    }

    private V search(HashNode<K, V> node, K key, Task task) {
        
        if (node == null) {
            return null;
        }
        if (node.getKey().equals(key)) {
            return node.getValue();
        }
        return search(key, task);
    }

    @Override
    public void delete(K key, Task task) {
        int index = hash(task);
        table.set(index, delete(table.get(index), key));
    }

    // Método privado para eliminar en una lista enlazada de nodos HashNode

    private HashNode<K, V> delete(HashNode<K, V> node, K key) {
        if (node == null) {
            return null; // Si no hay nodo en esta posición, no hay nada que eliminar
        }

        if (node.getKey().equals(key)) {
            // Si la clave coincide, se elimina este nodo y se devuelve el siguiente
            return node.getNext();
        }

        node.setNext(delete(node.getNext(), key)); // Eliminación recursiva en el siguiente nodo de la lista
        return node;
    }

    @Override
    public String print() {
        return null;
    }

    // Métodos getter y setter para acceder a la tabla desde fuera de la clase

    /**
     * Gets the current state of the hash table.
     *
     * @return An ArrayList containing the hash table's nodes.
     */
    public ArrayList<HashNode<K, V>> getTable() {
        return table;
    }

    /**
     * Sets the hash table to a new ArrayList of HashNodes.
     *
     * @param table The new ArrayList to set as the hash table.
     */
    public void setTable(ArrayList<HashNode<K, V>> table) {
        this.table = table;
    }


}