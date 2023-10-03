package model;

public class HashNode<K,V> {

  
    private K key;
    private V value;
    private HashNode<K, V> next;

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;

    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
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
