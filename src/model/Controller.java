package model;

import java.util.ArrayList;
import java.util.Collections;

public class Controller<K, V> {

    private HashTable<Integer, String> taskTable;
    private PriorityQueue<Task> taskQueuePriority = new PriorityQueue<>();
    int taskCounter = -1;
    private Queue<Task> taskQueue;

    //private ArrayList<HashNode<K,V>> organizationTable;

    //HashTable hashTable = new HashTable();

    public Controller(){

        taskTable = new HashTable<>(5);
        taskQueue = new Queue<>();
        taskQueuePriority = new PriorityQueue<>();
    }

    public String createTask(String title, String description, String date, PriorityLevel priorityLevel, int priorityOrder) throws Exception{

        Task task = new Task(title, description, date, priorityLevel, priorityOrder);

        int priorityValue = (priorityLevel == PriorityLevel.HIGH) ? 0:1;

        taskCounter++;

          //Preguntar que se pasa en el value y como pasar una task en value

        taskTable.put(taskCounter, title);

        if (task.getPriority().equals(PriorityLevel.LOW)) {
            taskQueue.enqueue(task);
        }

        if (task.getPriority().equals(PriorityLevel.HIGH)) {
            taskQueuePriority.enqueue(task); // Agrega la tarea a la cola personalizada
        }


        return "The task / reminder " +title+ "has been created ";
    }  
     

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
