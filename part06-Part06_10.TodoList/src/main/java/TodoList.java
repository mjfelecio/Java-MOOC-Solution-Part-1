import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoList;

    public TodoList () {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        toDoList.add(task);
    }

    public void print() {
        int numOrder = 1;

        for (String list: toDoList) {
            System.out.println(numOrder + ": " + list);
            numOrder ++;
        }
    }

    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}