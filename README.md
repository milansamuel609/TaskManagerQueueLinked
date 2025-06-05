# TaskManagerQueueLinked

This project demonstrates a simple implementation of a task manager using the Queue data structure in Java. It simulates basic operations such as adding tasks to the queue, viewing the current task, completing tasks, printing remaining tasks, and checking the state of the task queue.

## Code Summary

The program uses a Queue<String> (implemented via LinkedList) to store tasks simulating a task management system. It performs the following operations:

i) Add Tasks: Adds a predefined list of tasks to the queue.

ii) View Current Task: Displays the task at the front of the queue.

iii) Complete Task: Removes the task at the front of the queue indicating it has been completed.

iv) Remaining Tasks: Prints all tasks still in the queue.

v) State of Tasks: Checks if the task queue is empty and displays the current size of the queue.

## Sample Output

```
Tasks added: [Task 1, Task 2, Task 3, Task 4, Task 5]
Current task: Task 1
Completed task: Task 1
Remaining tasks: [Task 2, Task 3, Task 4, Task 5]
Is the tasks empty now or not: false
Size of the list of tasks: 4
```

## Key Points

i) Uses Java's Queue interface with a LinkedList implementation to manage tasks.

ii) Demonstrates basic queue operations: offer(), peek(), poll(), isEmpty(), and size().

iii) Since queues do not support indexing, tasks are managed in a FIFO (First In First Out) order.

## Developed By: 

Milan P Samuel
