import java.util.LinkedList;
import java.util.Queue;

class Polyclinic {
    private static final int NUM_PATIENTS = 10;

    public static void main(String[] args) {
        Queue<Patient> queue = new LinkedList<>();
        int maxQueueLength = 0;

        for (int i = 0; i < NUM_PATIENTS; i++) {
            Patient newPatient = new Patient("Patient " + (i + 1));
            queue.add(newPatient);

            if (queue.size() > maxQueueLength) {
                maxQueueLength = queue.size();
            }
        }

        System.out.println("Максимальная длина очереди - " + maxQueueLength);
    }
}