import java.util.ArrayList;
import java.util.Scanner;

public class todoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add the task");
            System.out.println("2. View the task");
            System.out.println("3. Exit the task");
            System.out.println("4. Create the task");
            System.out.println("5. Read the task");
            System.out.println("6. Update the task");
            System.out.println("7. Delete the tsk");
            System.out.println("choose an option");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter the task");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("task added succesfully");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("View the task");
                    if (tasks.isEmpty()) {
                        System.out.println("Please add the task");
                    } else {
                        System.out.println(tasks);
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Exited succesfully from the list");
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("Create the task");
                    task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("task created succesfully");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Read the task");
                    System.out.println(tasks);
                    break;

                case 6:
                    String upd = sc.nextLine();
                    System.out.println("Task updated succesfully");
                    break;

                case 7:

                    System.out.println("Task deleted succesfully");
                    // tasks.remove();
                    break;

                default:
                    System.out.println("Invalid Choice please choose again");
                    break;

            }

            // sc.close();
        }
    }

}
