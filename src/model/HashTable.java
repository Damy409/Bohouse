package model;

import java.util.ArrayList;
import java.util.Collections;

public class HashTable<K,V> implements IHashTable<K,V> {

    private ArrayList<HashNode<K,V>> table;

    public HashTable() {
        this.table = new ArrayList<>(Collections.nCopies(12, null));
    }

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

    public ArrayList<HashNode<K, V>> getTable() {
        return table;
    }

    public void setTable(ArrayList<HashNode<K, V>> table) {
        this.table = table;
    }


}