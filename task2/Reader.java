import java.util.concurrent.CopyOnWriteArrayList;

public class Reader implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000); // Задержка чтения
                System.out.println("Reading from list: " + Main.listOfNumbers);
            } catch (InterruptedException e) {
                ///e.printStackTrace();
            }
        }
    }
}

