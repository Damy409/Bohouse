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
public class HashTable<K, V> implements IHashTable<K, V> {

    private int m;
    private HashNode<K, V>[] table;

    /**
     * Constructs a hash table with a specified number of slots.
     *
     * @param m The number of slots in the hash table.
     */
    public HashTable(int m) {
        this.m = m;
        table = new HashNode[m];
    }

    /**
     * Constructs a hash table with a default number of slots (5).
     */
    public HashTable() {
        m = 5;
        table = new HashNode[m];
    }

    /**
     * Computes the hash code for a given key and maps it to a slot in the hash table.
     *
     * @param key The key for which to compute the hash code.
     * @return The index of the slot in the hash table.
     */
    public int hash(Object key) {
        return (Math.abs(key.hashCode())) % m;
    }

    @Override
    public void put(K key, V value) throws Exception {
        int insertKey = hash(key);
        HashNode<K, V> nodeList = table[insertKey];

        if (nodeList == null) {
            table[insertKey] = new HashNode<>(key, value);
        } else {
            // Search for the key in the linked list
            HashNode<K, V> currentNode = nodeList;
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    // Key already exists, update the value
                    currentNode.setValue(value);
                    return;
                }
                currentNode = currentNode.getNext();
            }

            // If it reaches here, the key does not exist in the linked list, add a new node at the end
            HashNode<K, V> finalNode = new HashNode<>(key, value);
            HashNode<K, V> lastNode = nodeList;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(finalNode);
            finalNode.setPrevious(lastNode);
        }
    }

    @Override
    public V search(K key) {
        V value = null;
        int searchKey = hash(key);
        HashNode<K, V> searchNode = table[searchKey];
        while (searchNode != null) {
            if (searchNode.getKey().equals(key)) {
                value = searchNode.getValue();
            }
            searchNode = searchNode.getNext();
        }
        return value;
    }

    @Override
    public void remove(K key) {
        int deleteKey = hash(key);
        HashNode<K, V> deleteNode = table[deleteKey];
        while (deleteNode != null) {
            if (deleteNode.getKey().equals(key)) {
                HashNode<K, V> prev = deleteNode.getPrevious();
                HashNode<K, V> next = deleteNode.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
            }
            deleteNode = deleteNode.getNext();
        }
    }

    @Override
    public void printTable() {
        for (int i = 0; i < m; i++) {
            HashNode<K, V> current = table[i];
            System.out.print("Hash " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.getKey() + "=" + current.getValue() + "] ");
                current = current.getNext();
            }
            System.out.println(); // Change line after printing values in the same hash
        }
    }
}
