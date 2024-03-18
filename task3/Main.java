import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main{
    private static final int COUNT = 3;

    public static AtomicInteger[] windCount;
    public static AtomicInteger[] catCount;
    public static AtomicInteger[] abandCount;

    public static void main(String[] args) {
        windCount = new AtomicInteger[COUNT];
        catCount = new AtomicInteger[MFC.CATEGORIES];
        abandCount = new AtomicInteger[MFC.CATEGORIES];

        for (int i = 0; i < COUNT; i++) {
            windCount[i] = new AtomicInteger(0);
        }

        for (int i = 0; i < MFC.CATEGORIES; i++) {
            catCount[i] = new AtomicInteger(0);
            abandCount[i] = new AtomicInteger(0);
        }
        MFC thirdClass = new MFC();
        Thread thirdThread = new Thread(thirdClass);
        thirdThread.start();
    }
    public static int getRandomCategory() {
        Random random = new Random();
        return random.nextInt(MFC.CATEGORIES);
    }

    public static int getRandomWindow(int category) {
        Random random = new Random();
        int window = random.nextInt(COUNT);

        if (window == 0 || (window == 1 && category == 1) || (window == 2 && category == 2)) {
            if (windCount[window].get() < MFC.CUSTOMERS / COUNT) {
                return window;
            }
        }

        return -1;
    }
}
