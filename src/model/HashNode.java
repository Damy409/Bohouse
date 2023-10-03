package model;

public class HashNode<K,V> {
    
    private Nodo<K,V> top;

    private static class Nodo<K,V> {
        K key;
        V value;
        Nodo<K, V> next;

    }

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Nodo<K, V> getTop() {
        return top;
    }

    public void setTop(Nodo<K, V> top) {
        this.top = top;
    }

    public void setNext(HashNode<K, V> current) {
    }

    public Object getKey() {
        return null;
    }

    public V getValue() {
        return null;
    }

    public HashNode<K, V> getNext() {
        return null;
    }

    


    
}
