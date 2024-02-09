package threads;

public class DeadLock {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void method1() {
        synchronized (resource1) {
            System.out.println("Thread 1 acquired resource 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource2) {
                System.out.println("Thread 1 acquired resource 2");
            }
        }
    }

    public void method2() {
        synchronized (resource2) {
            System.out.println("Thread 2 acquired resource 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource1) {
                System.out.println("Thread 2 acquired resource 1");
            }
        }
    }
}
