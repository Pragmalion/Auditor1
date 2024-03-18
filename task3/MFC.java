import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MFC implements Runnable{
    public static final int CATEGORIES = 3;
    public static final int CUSTOMERS = 1000;

    @Override
    public void run(){
        for (int i = 0; i < CUSTOMERS; i++) {

            int category = Main.getRandomCategory();
            int window = Main.getRandomWindow(category);

            if (window != -1) {
                Main.windCount[window].incrementAndGet();
                Main.catCount[category].incrementAndGet();
            } else {
                Main.abandCount[category].incrementAndGet();
            }
        }

        for (int i = 0; i < CATEGORIES; i++) {
            int categoryCounter = Main.catCount[i].get();
            int abandonedCounter = Main.abandCount[i].get();
            double abandonmentRate = (double) abandonedCounter / (categoryCounter + abandonedCounter) * 100;
            System.out.printf("Категория %d: Процент ушедших клиентов: %.2f%%\n", i+1, abandonmentRate);
        }
    }
}