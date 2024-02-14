// Laura McDonnell
//
// CIS 1068 Section 006
// Lab 9: Task
// This program tests the 'Task' class

public class TaskMain {
    public static void main(String[] args) {
        Task laundry = new Task("do laundry", 1, 120);
        System.out.println(laundry.getName());
        System.out.println(laundry.getPriority());
        System.out.println(laundry.getEstMinsToComplete());
        System.out.println(laundry);
        laundry.setName("Do laundry");
        laundry.increasePriority(1);
        System.out.println(laundry.getPriority());
        System.out.println(laundry.getName());

    }
}
