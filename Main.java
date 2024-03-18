import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static CopyOnWriteArrayList<Integer> listOfNumbers = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        Reader reader = new Reader();
        Writer writer = new Writer();

        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        readerThread.start();
        writerThread.start();
    }
}
