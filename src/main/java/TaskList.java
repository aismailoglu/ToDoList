import java.io.*;
import java.security.PrivateKey;
import java.util.*;

public class TaskList {


    private List<Task> list;
    private Reader reader = new Reader();


    public TaskList() {
        list = loadFromFile();
    }

    public int size()
    {
       return list.size();
    }


    public void filterByTaskName(String givenTaskName) {
        for (Task t : list) {
            if (t.getTaskName().contains(givenTaskName))
                System.out.println(t);
        }
    }

    public void displayTask() {
        int statusOpen = 0;
        int statusClosed = 0;

        for (int index = 0; index < list.size(); index++) {

            String changeStatus = list.get(index).getStatus().toUpperCase();
            if (changeStatus.equals("OPEN")) {
                statusOpen += statusOpen;
            } else if (changeStatus.equals("CLOSED")) {
                statusClosed += statusClosed;
            }
            System.out.println("" + (index + 1) + ":" + list.get(index));  //todo index plus 1
        }
        System.out.println("Number of Tasks open : " + statusOpen + " Number of Tasks Closed " + statusClosed);

    }


    public void sortTask() {

        System.out.println("Please Enter your choice - for sorting");
        System.out.println("1.Sort based on Date");
        System.out.println("2.Sort based on Project");
        int choice;
        choice = reader.scanInt(1, 2);
        ;
        if (choice == 1) {

            list.sort((Task d1, Task d2) -> d1.getTaskDate().compareTo(d2.getTaskDate()));
        } else if (choice == 2) {
            list.sort((Task d1, Task d2) -> d1.getProjectName().compareTo(d2.getProjectName()));
        }


    }

    public void add() {
        System.out.println("Enter the Task Name: ");
        String taskName = reader.scanString(); // homework

        System.out.println("Enter the ProjectName: ");
        String projectName = reader.scanString();

        System.out.println("Enter the Status: ");
        String status = reader.scanString();

        System.out.println("Enter Date: ");
        String date = reader.scanString();  //todo convert To a Date

        Task newTask = new Task(taskName, projectName, status, date);
        list.add(newTask);

    }

    public void remove(int removeIndex) {
        int index = 0;
        System.out.println("Delete The Task");
        System.out.println(" Enter the Task No");
        list.remove(removeIndex - 1);             //todo pay attention -1
        System.out.println(" Task deleted Successfully");
        System.out.println("" + (index + 1) + ":" + list.get(index)); //todo

    }

    public void editTask(int taskNo) {

        Task editTask2 = list.get(taskNo - 1);
        System.out.println("Enter the field you want to edit");
        System.out.println("1.Task Name");
        System.out.println("2.Project Name");
        System.out.println("3.Status");
        System.out.println("4.Date");
        int option = reader.scanInt(1,4);
        switch (option) {

            case 1:
                System.out.println("Edit the Task Name");
                editTask2.setTaskName(reader.scanString());
                break;
            case 2:
                System.out.println("Edit Project Name");
                editTask2.setProjectName(reader.scanString());
                break;
            case 3:
                System.out.println("Edit Status");
                editTask2.setStatus(reader.scanString());

                break;
            case 4:
                System.out.println("edit the date of task YYYY-MM-DD");
                editTask2.setTaskDate(reader.scanString());
                break;


        }


    }


    public List<Task> loadFromFile() {
        List<Task> list = new ArrayList<Task>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("ToDo.txt")));
            list = (List<Task>) in.readObject();
        } catch (EOFException e) {
            System.out.println("File is empty. First thing you need to do is create a task!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

        return list;

    }

    public void saveToFile(List<Task> tasksToSave)
    {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("ToDo.txt")));
            out.writeObject(tasksToSave);

            System.out.println("TASKS SAVED:");
            System.out.println();
            tasksToSave.forEach(task -> System.out.println("* " + task.getTaskName()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void save() throws IOException {
        saveToFile(list);
    }
}