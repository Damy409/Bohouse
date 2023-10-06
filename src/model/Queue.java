package model;

public class Queue<T> implements Queueable<T>{
    private QueueNode<T> front;
    private QueueNode<T> back;

    public Queue() {
        front = null;
        back = null;
    }

    public QueueNode<T> getFront() {
        return front;
    }

    public void setFront(QueueNode<T> front) {
        this.front = front;
    }

    public QueueNode<T> getBack() {
        return back;
    }

    public void setBack(QueueNode<T> back) {
        this.back = back;
    }


    @Override
    public void enqueue(T value) {
        QueueNode<T> node = new QueueNode<T>(value);
        if (front == null) {
            front = node;
        } else {
            back.setBehind(node);
        }
        back = node;
    }

    @Override
    public T peek() {
        T value = null;
        if (front != null) {
            value= front.getValue();
        }
        return value;
    }

    @Override
    public void dequeue() {
        if (front != null) {
            front = front.getBehind();
        }
        if (front == null) {
            back = null;
        }
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (front == null) {
            empty = true;
        }
        return empty;
    }

    public void printQueue() {
        QueueNode<T> current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getBehind();
        }
    }
}
