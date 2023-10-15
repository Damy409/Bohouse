package model;

/**
 * The Task class represents a task with a title, description, date, and priority level.
 * Tasks are used to manage and organize tasks in a to-do list.
 */
public class Task implements Comparable<Task>{

    private String title; 
    private String description;
    private String date;
    private PriorityLevel priority;
    private int priorityOrder; 


    /**
     * Constructs a new Task object with the specified properties.
     * 
     * @param title The title of the task.
     * @param description The description of the task.
     * @param date The date associated with the task.
     * @param priority The priority level of the task.
     */
    public Task(String title, String description, String date, PriorityLevel priority, int priorityOrder){
        this.title = title;
        this.description = description;
        this.date = date;
        this.priority = priority;
        this.priorityOrder = priorityOrder;

    }

    /**
     * Get the title of the task.
     * 
     * @return The title of the task.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the task.
     *
     * @param title The title of the task.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the description of the task.
     *
     * @return The description of the task.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the task.
     *
     * @param description The description of the task.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the date associated with the task.
     *
     * @return The date associated with the task.
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the date associated with the task.
     *
     * @param date The date associated with the task.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get the priority level of the task.
     *
     * @return The priority level of the task.
     */
    public PriorityLevel getPriority() {
        return priority;
    }

    /**
     * Set the priority level of the task.
     *
     * @param priority The priority level of the task.
     */
    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }


    /**
     * Get the Priority order of the task
     * 
     * @return priorityOrder The priority order of th task
     */
    public int getPriorityOrder() {
        return priorityOrder;
    }



    /**
     * Set the priority order of the task
     * 
     * @param priorityOrder The priority order of the task
     */
    public void setPriorityOrder(int priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    /**
     * Returns a string representation of the task, including its title, description, date, and priority.
     *
     * @return A string representation of the task.
     */

    @Override
    public int compareTo(Task otherTask) {
        // Compara las tareas en función de su priorityOrder
        return Integer.compare(this.priorityOrder, otherTask.priorityOrder);
    }
    
    /**
     * Returns a string representation of the object, including the title, description, date,
     * priority, and priority order.
     *
     * @return A string containing information about the object, including its title, description,date, priority, and priority order.
     */
    public String toString() {
        return "Title: " + title + " Description: " + description + " Date: " + date +
            " Priority: " + priority + " Priority Order: " + priorityOrder;
    } 


    
}