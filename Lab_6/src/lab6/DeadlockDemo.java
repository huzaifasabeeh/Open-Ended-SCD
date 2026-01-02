package lab6;

public class DeadlockDemo {

    static final Object LockA = new Object();
    static final Object LockB = new Object();
    static final Object LockC = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (LockA) {
                System.out.println("Thread 1 locked A");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (LockB) {
                    System.out.println("Thread 1 locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LockB) {
                System.out.println("Thread 2 locked B");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (LockC) {
                    System.out.println("Thread 2 locked C");
                }
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (LockC) {
                System.out.println("Thread 3 locked C");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (LockA) {
                    System.out.println("Thread 3 locked A");
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
