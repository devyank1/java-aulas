package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    //attribute
    private List<Tasks> list;

    public TaskList(){
        this.list = new ArrayList<>();
    }

    public void addTask(String description){
        list.add(new Tasks(description));
    }

    public void removeTask(String description){
        List<Tasks> tasksToRemove = new ArrayList<>();
        for (Tasks t : list){
            if (t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }
        list.removeAll(tasksToRemove);
    }

    public int getTotalTasks(){
        return list.size();
    }

    public void obtainDescriptionTasks(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("O NÚMERO TOTAL DE TAREFAS É: " + taskList.getTotalTasks());

        taskList.addTask("BUY CHEESE");
        taskList.addTask("BUY GAS");
        taskList.addTask("BUY CHICKEN");
        System.out.println("O NÚMERO TOTAL DE TAREFAS É: " + taskList.getTotalTasks());

        taskList.removeTask("BUY CHEESE");
        System.out.println("O NÚMERO TOTAL DE TAREFAS É: " + taskList.getTotalTasks());

        taskList.obtainDescriptionTasks();
    }
}
