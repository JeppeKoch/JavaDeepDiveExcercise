package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TaskList<Task> taskList=new TaskList<>();

        taskList.addTask(new Task("Klip hæk", "Klip hæk i baghaven", LocalDate.of(2024, 8, 30)));
        taskList.addTask(new Task("Støvsug", "Støvsug stue", LocalDate.of(2024, 8, 24)));
        taskList.addTask(new Task("Vask bil", "Vask bilen i indkørslen", LocalDate.of(2024, 8, 25)));
        taskList.addTask(new Task("Slå græs", "Slå græs i forhaven", LocalDate.of(2024, 8, 26)));
        taskList.addTask(new Task("Rengør køkken", "Rengør køkkenbordet og gulvet", LocalDate.of(2024, 8, 27)));
        taskList.addTask(new Task("Tag affald ud", "Tag skraldet ud til containeren", LocalDate.of(2024, 8, 28)));
        taskList.addTask(new Task("Handle ind", "Køb ind til aftensmad", LocalDate.of(2024, 8, 29)));
        taskList.addTask(new Task("Organiser garage", "Ryd op og organiser værktøjet i garagen", LocalDate.of(2024, 8, 31)));
        taskList.addTask(new Task("Vand planter", "Vand blomsterne i haven", LocalDate.of(2024, 8, 23)));
        taskList.addTask(new Task("Rens tagrender", "Fjern blade og snavs fra tagrenderne", LocalDate.of(2024, 8, 1)));
        taskList.addTask(new GardenTask("Water the Flowers", "Water the flowers in the backyard", LocalDate.of(2024, 8, 24), "Backyard"));
        taskList.addTask(new GardenTask("Trim the Hedges", "Trim the hedges in the front yard", LocalDate.of(2024, 8, 25), "Front yard"));
        taskList.addTask(new GardenTask("Plant New Seeds", "Plant the new seeds in the vegetable garden", LocalDate.of(2024, 8, 26), "Vegetable garden"));
        taskList.addTask(new GardenTask("Fertilize Lawn", "Apply fertilizer to the lawn", LocalDate.of(2024, 8, 27), "Lawn"));


        //taskList.filterTask("Støvsug");
        //taskList.sortTask();
        //System.out.println(taskList.tasksDueToday());
        //System.out.println(taskList.overdueTasks());
        taskList.allTasks();

    }
}