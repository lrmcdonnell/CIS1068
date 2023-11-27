// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 9: HoneyDo List
// This program constructs a 'HoneyDoList' class
public class HoneyDoList {

    private Task[] tasks;
    private int numTasks;
    private int INITIAL_CAPACITY;

    //Constructor
    public HoneyDoList() {
        numTasks = 0;
        INITIAL_CAPACITY = 10;
        tasks = new Task[INITIAL_CAPACITY];
    }

    //To String Method
    public String toString() {
        String str = "----------HONEYDO LIST-----------\n";
        for (int i = 0; i < tasks.length - 1; i++) {
            if (hasTask(i)) {
                str += ("Task " + (i + 1) + ": " + tasks[i]);
            }
        }
        str += "----------END OF LIST-----------";

        return(str);
    }

    //Find a Task by Name
    public int find(String name) {
        for (int i = 0; i < tasks.length - 1; i++) {
            if((tasks[i].getName()).equalsIgnoreCase(name)) {
               return i;
            }
        }
        return -1;
    }

    //Add a Task
    public void addTask(Task task) {
        numTasks += 1;
        for (int i = 0; i < tasks.length - 1; i++) {
          if (!(hasTask(i))) {
              tasks[i] = task;
              return;
            }
        }
    }

    //Total Time to Complete Tasks
    public int totalTime() {
        int timeCounter = 0;
        for (int i = 0; i < tasks.length - 1; i++) {
            if(hasTask(i)) {
                timeCounter += tasks[i].getEstMinsToComplete();
            }
        }
        return timeCounter;
    }

    //Get task with Shortest Time
    public int shortestTime() {
        int index = -1;
        int shortestTime = 0;
        for (int i = 0; i < tasks.length - 1; i++) {
            if(hasTask(i)) {
                if (i == 0) {
                    shortestTime = tasks[i].getEstMinsToComplete();
                }
                if (tasks[i].getEstMinsToComplete() < shortestTime) {
                    index = i;
                }
            }
        }
        return index;
    }

    //Complete a Task
    public void completeTask(int index) {
        numTasks -= 1;
        for (int i = index + 1; i < tasks.length - 1; i++) {
            Task taskAtIndex = tasks[i];
            tasks[i-1] = taskAtIndex;
        }
        tasks[tasks.length - 1] = null;
    }

    //Get the Task at a Specified Index
    public Task getTask(int index) {
        return tasks[index];
    }

    //Has Task: Checks Whether a Task is Present at a Specified Index
    public boolean hasTask(int index) {
        if(!(tasks[index] == null)) {
            return true;
        }
        return false;
    }
}
