package model;

public class Task {

    private String title; 
    private String description;
    private String date;
    private PriorityLevel priority;


    public Task(String title, String description, String date, PriorityLevel priority){
        this.title = title;
        this.description = description;
        this.date = date;
        this.priority = priority;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }

    public String toString(){

        return "Title: " +title+ " Description: " +description+ " Date: " +date+ " Priority: " +priority;
    }
     


    
}