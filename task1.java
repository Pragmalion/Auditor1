public class task1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runable());
        Thread thread2 = new Thread(new Runable());
        Thread thread3 = new Thread(new Runable());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
