package model;

public interface Queueable<T> {
    public void enqueue(T value);
    public T peek();
    public void dequeue();
    public boolean isEmpty();
}