package model;

import java.util.ArrayList;

public class Controller<K, V> {

    private ArrayList<HashNode<K,V>> organizationTable;

    HashTable hashTable = new HashTable();

    public String createTask(String title, String description, String date, PriorityLevel priorityLevel){

        Task task = new Task(title, description, date, priorityLevel);

        int key = hashTable.hash(task);

        //Preguntar que se pasa en el value y como pasar una task en value



        return "The task / reminder " +title+ "has been created ";
    }   
    

}
