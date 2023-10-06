package model;

import java.util.ArrayList;

public class Controller<K, V> {

    private HashTable<Integer, String> taskTable;
    int taskCounter = -1;
    private Queue<Task> taskQueue;

    //private ArrayList<HashNode<K,V>> organizationTable;

    //HashTable hashTable = new HashTable();

    public Controller(){

        taskTable = new HashTable<>(5);
        taskQueue = new Queue<>();


    }

    public String createTask(String title, String description, String date, PriorityLevel priorityLevel) throws Exception{

        Task task = new Task(title, description, date, priorityLevel);

        int priorityValue = (priorityLevel == PriorityLevel.HIGH) ? 0:1;

        taskCounter++;

          //Preguntar que se pasa en el value y como pasar una task en value

        taskTable.put(taskCounter, title);

        if (task.getPriority().equals(PriorityLevel.LOW)) {
            taskQueue.enqueue(task);
        }


        return "The task / reminder " +title+ "has been created ";
    }  
     

    public void printTasks() {
        
        System.out.println("HASH TABLE");
        taskTable.printTable();
        System.out.println("");
        System.out.println("QUEUE NON PRIORITY");
        taskQueue.printQueue();
        
    }
   
}
