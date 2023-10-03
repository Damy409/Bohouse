package ui;

import java.util.Scanner;
import model.Controller;
import model.PriorityLevel;

public class Main {

    private Scanner lector;
    private Controller bohouseSystem;

    public Main() {
        lector = new Scanner(System.in);
        this.bohouseSystem = new Controller();
    }

    public static void main(String[] args) {

        Main objBohouseSystem = new Main();

        objBohouseSystem.menu();


    }

    public void menu() {

        int option = 0;

        System.out.println("-----------------------------------------------------");
        System.out.println("    Welcome to BOHOUSE tasks and reminders system    ");
        System.out.println("-----------------------------------------------------");

        System.out.println("What do you want to do?");
        System.out.println("1. Add a task/reminder");
        System.out.println("2. Modify a task/reminder");
        System.out.println("3. Delete a task/reminder");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------------------------");
        System.out.println("Please, enter the number of your choice");
        System.out.println("OPTION: ");

        option = lector.nextInt();

        while (option < 1 || option > 4) {

            System.out.println("Please enter a valid choice (between 1 and 4)");
            System.out.println("1. Add a task/reminder");
            System.out.println("2. Modify a task/reminder");
            System.out.println("3. Delete a task/reminder");
            System.out.println("4. Exit");
            System.out.println("OPTION: ");

            option = lector.nextInt();
        }
        
        switch(option)
        {
            case 1:
                System.out.println("Caso uno");
                repeatMenu();
                break;
            case 2:
                System.out.println("Caso dos");
                repeatMenu();
                break;
            case 3:
                System.out.println("Caso tres");
                repeatMenu();
                break;
            case 4:
                System.out.println("Caso cuatro");
                repeatMenu();
                break;
        }
        
 

    }
    
    public void repeatMenu() {

        int optionRepeat = 0;

        System.out.println("Do you want to continue in the program?");
        System.out.println("1. Yes, continue");
        System.out.println("2. No, exit");

        optionRepeat = lector.nextInt();

        while (optionRepeat < 1 || optionRepeat > 2) {

            System.out.println("Please enter a valid choice (1 or 2)");
            System.out.println("1. Yes, continue");
            System.out.println("2. No, exit");

            optionRepeat = lector.nextInt();
        }

        switch(optionRepeat)
        {
            case 1:
                menu();
                break;
            case 2:
                break;
        }

    }

    public void createTask() {

        System.out.println("-----------------------------------------------------");
        System.out.println("                Create a task/reminder               ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Please, enter de data od the task/reminder you want  ");
        System.out.println("to create");

        System.out.println("TITLE: ");
        String title = lector.nextLine();

        System.out.println("DESCRIPTION: ");
        String description = lector.nextLine();

        System.out.println("DEADLINE: ");
        String date = lector.nextLine();

        System.out.println("PRIORITY: ");
        System.out.println("    Choose the level of priority");
        System.out.println("        1. PRIORITY TASK/REMINDER");
        System.out.println("        2. NON PRIORITY TASK/REMINDER");
        System.out.println("    OPTION: ");

        int priority = lector.nextInt();
        PriorityLevel levelPriority;

        while (priority < 1 || priority > 2) {

            System.out.println("Please enter a valid choice (1 or 2)");
            System.out.println("1. PRIORITY TASK/REMINDER");
            System.out.println("2. NON PRIORITY TASK/REMINDER");

            priority = lector.nextInt();
        }

        switch(priority)
        {
            case 1:
                levelPriority = PriorityLevel.HIGH;
                break;
            case 2:
                levelPriority = PriorityLevel.LOW;
                break;
        }



    }
}


