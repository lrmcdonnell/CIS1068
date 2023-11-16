// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 8: Fractions
// This program constructs a 'Task' class

public class Task {
    private String name;
    private int priority, estMinsToComplete;

    //constructor
    public Task(String name, int priority, int estMinsToComplete) {
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estMinsToComplete;
    }
    //GETTERS
    public String getName() {
        return name;
    }
    public int getPriority() {
        return priority;
    }
    public int getEstMinsToComplete() {
        return estMinsToComplete;
    }
    //SETTERS
    public void setName(String newName) {
        name = newName;
    }
    public void setPriority(int newPriority) {
        priority = newPriority;
    }
    public void setEstMinsToComplete(int newEstMinsToComplete) {
        estMinsToComplete = newEstMinsToComplete;
    }
    //ToString
    public String toString() {
        return ("Task name: " + name + ", Priority: " + priority + ", Estimated time to complete: " + estMinsToComplete);
    }
    public void increasePriority(int amount) {
        if (amount < 0) {
            return;
        }
        else {
            priority += amount;
        }
    }
    public void decreasePriority(int amount) {
        if (amount >= priority) {
            return;
        }
        else {
            priority -= amount;
        }
    }
}
