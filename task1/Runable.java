public class Runable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
}
