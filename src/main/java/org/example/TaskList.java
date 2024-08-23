package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
public class TaskList <T extends Task> implements Iterable{
    List<T> tasks = new ArrayList<>();


    public void addTask (T task){
        tasks.add(task);
    }

    public List<T> filterTask(String input ){
        return tasks.stream()
                .filter(task ->
                        (task.getTitle() != null && task.getTitle().toLowerCase().contains(input.toLowerCase())) ||
                                (task.getDescription() != null && task.getDescription().toLowerCase().contains(input.toLowerCase())))
                .collect(Collectors.toList());


    }
    public void sortTask(){
        List<Task> result = tasks.stream().sorted(Comparator.comparing(Task::getDueDate)).collect(Collectors.toList());
        result.forEach(task-> System.out.println("Tasks sorted by dueDate: "+task));
    }

    public List<Task> tasksDueToday(){
        LocalDate today = LocalDate.now();

        return tasks.stream().filter(task-> task.getDueDate().equals(today))
                .collect(Collectors.toList());

    }

    public List<Task> overdueTasks(){
        LocalDate today = LocalDate.now();
        return tasks.stream().filter(task -> task.getDueDate().isBefore(today)).collect(Collectors.toList());
    }

    public void allTasks(){
        for (Task tasks : tasks){
            System.out.println(tasks);
        }
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
