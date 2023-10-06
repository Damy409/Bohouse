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

    private int m;
    private HashNode<K,V>[] table;

    //Constructor with parameter
    public HashTable(int m) {
        this.m = m;
        table = new HashNode[m];
    }

     public HashTable() {
        m = 5;
        table = new HashNode[m];
    }

    public int hash(Object key) {
        return (Math.abs(key.hashCode())) % m;
    }

    
    public void put(K key, V value) throws Exception 
    {
        int insertKey = hash(key);
    HashNode<K,V> nodeList = table[insertKey];

    if (nodeList == null) {
        table[insertKey] = new HashNode<>(key, value);
    } else {
        // Busca si la clave ya existe en la lista enlazada
        HashNode<K, V> currentNode = nodeList;
        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                // La clave ya existe, actualiza el valor
                currentNode.setValue(value);
                return; // Sale del método para evitar la duplicación
            }
            currentNode = currentNode.getNext();
        }

        // Si llega aquí, la clave no existe en la lista enlazada, agrega un nuevo nodo al final
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
        HashNode<K,V> searchNode = table[searchKey];
        while (searchNode != null) {
            if(searchNode.getKey().equals(key)){
                value = searchNode.getValue();
            }
            searchNode = searchNode.getNext();
        }
        return value;
    }

    @Override
    public void remove(K key) {
        int deleteKey = hash(key);
        HashNode<K,V> deleteNode = table[deleteKey];
        while (deleteNode != null){
            if(deleteNode.getKey().equals(key)){
                HashNode<K,V> prev = deleteNode.getPrevious();
                HashNode<K,V> next = deleteNode.getNext();
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
            System.out.println(); // Cambia de línea después de imprimir los valores en el mismo hash
        }
    }


}