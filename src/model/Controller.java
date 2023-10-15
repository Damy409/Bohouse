package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Controller class acts as a controller for managing tasks using a hash table and task queues.
 *
 * @param <K> The type of keys used in the hash table.
 * @param <V> The type of values associated with the keys in the hash table.
 */
public class Controller<K, V> {

    private HashTable<Integer, String> taskTable;
    private PriorityQueue<Task> taskQueuePriority = new PriorityQueue<>();
    int taskCounter = -1;
    private Queue<Task> taskQueue;

    /**
     * Constructs a Controller with default settings, initializing a hash table and task queues.
     */
    public Controller() {
        taskTable = new HashTable<>(5);
        taskQueue = new Queue<>();
        taskQueuePriority = new PriorityQueue<>();
    }

    /**
     * Creates a task with the specified attributes and adds it to the task table and relevant queue.
     *
     * @param title         The title of the task.
     * @param description   The description of the task.
     * @param date          The date associated with the task.
     * @param priorityLevel The priority level of the task.
     * @param priorityOrder The priority order of the task.
     * @return A confirmation message indicating the task has been created.
     * @throws Exception if there is an error adding the task to the hash table.
     */
    public String createTask(String title, String description, String date, PriorityLevel priorityLevel, int priorityOrder) throws Exception {
        Task task = new Task(title, description, date, priorityLevel, priorityOrder);
        int priorityValue = (priorityLevel == PriorityLevel.HIGH) ? 0 : 1;
        taskCounter++;
        taskTable.put(taskCounter, title);

        if (task.getPriority().equals(PriorityLevel.LOW)) {
            taskQueue.enqueue(task);
        }

        if (task.getPriority().equals(PriorityLevel.HIGH)) {
            taskQueuePriority.enqueue(task);
        }

        return "The task / reminder " + title + " has been created.";
    }

    /**
     * Prints the contents of the hash table and the task queues.
     */
    public void printTasks() {
        System.out.println("HASH TABLE");
        taskTable.printTable();
        System.out.println("");
        System.out.println("QUEUE NON PRIORITY");
        taskQueue.printQueue();
        System.out.println("QUEUE PRIORITY (HIGH)");
        taskQueuePriority.printQueue();
    }
}
