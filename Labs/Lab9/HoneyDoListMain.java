// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 9: HoneyDo List
// This program tests the 'HoneyDoList' class

public class HoneyDoListMain {
    public static void main(String[] args) {
        HoneyDoList honeyDoList = new HoneyDoList();

        System.out.println("Initial List: \n" + honeyDoList);
        honeyDoList.addTask(new Task("Do laundry", 1, 120));
        honeyDoList.addTask(new Task("release the penguin", 2, 15));
        System.out.println("Updated List: \n" + honeyDoList);

        System.out.println("shortest time index: " + honeyDoList.shortestTime());
        System.out.println("Total time to complete tasks: " + honeyDoList.totalTime());
        int penguinIndex = honeyDoList.find("release the penguin");
        System.out.println("Penguin index: " + penguinIndex);

        System.out.println(honeyDoList.getTask(penguinIndex));
        honeyDoList.completeTask(penguinIndex);
        System.out.println("Final list: \n" + honeyDoList);
    }
}
