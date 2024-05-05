public class App {
    public static void main(String[] args) {
        // 3 threads
        // 1. main, 2. th1 , 3. th2

        // Approach 1 : A class to implement Runnable interface (Thread constructor)
        Task task = new Task();

        // Approach 2: Lambda to create a runnable object (Thread constructor)
        Runnable task2 = () -> {
            System.out.println("I am task2, running...");
        };

        // Approach 3: MyThread extends Thread
        MyThread myThread = new MyThread();
        myThread.start(); // "MyThread is running ..."

        Thread th1 = new Thread(task);
        th1.start(); // trigger run method() ...//I am a task, and running...

        Thread th2 = new Thread(task2);
        th2.start(); // trigger run method() ...//I am task2, running

        System.out.println("main ends...");

    }
}
