package model;

import java.util.ArrayList;

public class Controller<K, V> {

    int taskCounter = -1;

    private HashTable<Integer, String> taskTable;

    //private ArrayList<HashNode<K,V>> organizationTable;

    //HashTable hashTable = new HashTable();

    public Controller(){

        taskTable = new HashTable<>(5);

    }

    //Create Task
    public String createTask(String title, String description, String date, PriorityLevel priorityLevel){

        Task task = new Task(title, description, date, priorityLevel);

        taskCounter = taskCounter+5;

        int taksValue = taskCounter;

        taskTable.insert(taksValue, title, null);        //Preguntar que se pasa en el value y como pasar una task en value

        return "The task / reminder " +title+ "has been created ";
    }   

    public String printTasks(){

        /*String tasks = taskTable.print();

        System.out.println(tasks);
        */

        StringBuilder result = new StringBuilder("Tasks:\n");

        // Itera sobre la HashTable
        for (int i = 0; i < 5; i++) {
            String task = taskTable.get(i);
            if(task != null){
                result.append(task).append("\n");
            }

            /*
            while (currentNode != null) {
                // Obtiene la tarea utilizando el método get y la agrega a la representación en forma de cadena
                result.append(currentNode.toString()).append("\n");
                currentNode = currentNode.getNext();
            }
            */
        }
    
        return result.toString();
    }
    
    


}
