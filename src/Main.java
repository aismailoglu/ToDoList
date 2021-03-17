
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        TaskList taskList = new TaskList();
        Reader reader = new Reader();



        boolean running = true;
        while ( running == true)
        {
            System.out.println(" select the option");
            System.out.println("1) DisplayTask");
            System.out.println("2) addTask");
            System.out.println("3) edit or remove");
            System.out.println("4) sort");
            System.out.println("5) save and exit");

            int choice = reader.scanInt(1,5); //todo use try catch in a validator method

            switch (choice) {
                case 1:
                    taskList.displayTask();
                    break;
                case 2:
                    taskList.add();
                    break;
                case 3:
                    System.out.println("choose if you want to delete the task press 1, if you want to edit the task press 2"); //2
                    int subChoice = reader.scanInt(1,2); //todo move the printer before the reader
                    if (subChoice == 1) {

                        System.out.println("what index do you want to remove"); //todo call display enter index
                        taskList.remove(reader.scanInt(1, taskList.size()));
                    } else if (subChoice == 2) {
                        System.out.println("Enter the task number you want to edit");
                        taskList.editTask(reader.scanInt(1, taskList.size()));
                        System.out.println("---");
                    }

                    System.out.println("____");
                    break;
                case 4:
                    taskList.sortTask();
                    taskList.displayTask();
                    break;
                case 5:
                    taskList.save();
                    running = false;
                    break;

                default:
                    System.out.println("please write number from 1 to 5");


            }
        }

    }


}
