package model;

import java.util.ArrayList;

public class Controller<K, V> {

    int taskCounter = -1;

    private HashTable<Integer, String> taskTable;
    int taskCounter = -1;

    //private ArrayList<HashNode<K,V>> organizationTable;

    //HashTable hashTable = new HashTable();

    public Controller(){

        taskTable = new HashTable<>(5);
<<<<<<< HEAD

=======
>>>>>>> f77b825a4cfa3e060992e2d281ab75761531d44a

    }

    public String createTask(String title, String description, String date, PriorityLevel priorityLevel) throws Exception{

        Task task = new Task(title, description, date, priorityLevel);

        taskCounter = taskCounter+5;

<<<<<<< HEAD
        taskCounter++;

          //Preguntar que se pasa en el value y como pasar una task en value

        taskTable.put(taskCounter, title);
=======
        int taksValue = taskCounter;
>>>>>>> f77b825a4cfa3e060992e2d281ab75761531d44a

        taskTable.insert(taksValue, title, null);        //Preguntar que se pasa en el value y como pasar una task en value

        return "The task / reminder " +title+ "has been created ";
    }  
     

<<<<<<< HEAD
    public void printTasks() {
        
        taskTable.printTable();
        
=======
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
>>>>>>> f77b825a4cfa3e060992e2d281ab75761531d44a
    }
   
    
    


}