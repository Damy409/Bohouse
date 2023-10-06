package model;

import java.util.ArrayList;

public class Controller<K, V> {

    private HashTable<Integer, String> taskTable;

    //private ArrayList<HashNode<K,V>> organizationTable;

    //HashTable hashTable = new HashTable();

    public Controller(){

        taskTable = new HashTable<>(2);

    }

    //Create Task
    public String createTask(String title, String description, String date, PriorityLevel priorityLevel){

        Task task = new Task(title, description, date, priorityLevel);

        int priorityValue = (priorityLevel == PriorityLevel.HIGH) ? 0:1;

        taskTable.insert(priorityValue, title, null);        //Preguntar que se pasa en el value y como pasar una task en value


        return "The task / reminder " +title+ "has been created ";
    }   

    public String printTasks(){

        /*String tasks = taskTable.print();

        System.out.println(tasks);
        */

        StringBuilder result = new StringBuilder("Tasks:\n");

        // Itera sobre la HashTable
        for (int i = 0; i < 2; i++) {
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
