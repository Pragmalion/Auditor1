import java.util.concurrent.CopyOnWriteArrayList;

public class Writer implements Runnable {

    @Override
    public void run() {
        int number = 0;
        while (true) {
            try {
                Thread.sleep(2500);
                Main.listOfNumbers.add(number);
                System.out.println("Writing to list: " + number);
                number++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
