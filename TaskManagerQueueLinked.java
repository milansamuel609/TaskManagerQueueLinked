import java.util.*;

class TaskManager {
    Queue<String> tasks = new LinkedList<>();

    void addTasks(){
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        tasks.offer("Task 4");
        tasks.offer("Task 5");

        System.out.println("Tasks added: " + tasks);
    }

    void viewTasks(){
        System.out.println("Current task: " + tasks.peek());
    }

    void completedTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks left to be completed");
        }
        else {
            System.out.println("Completed task: " + tasks.poll());
        }
    }

    void remainingTasks(){
        System.out.println("Remaining tasks: " + tasks);
    }

    void stateOfTasks(){
        System.out.println("Is the tasks empty now or not: " + tasks.isEmpty());
        System.out.println("Size of the list of tasks: " + tasks.size());
    }
}

public class TaskManagerQueueLinked {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTasks();
        taskManager.viewTasks();
        taskManager.completedTasks();
        taskManager.remainingTasks();
        taskManager.stateOfTasks();
    }
}
