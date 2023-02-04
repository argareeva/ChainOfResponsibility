public class BeLate extends Handler {
    public BeLate(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Worker is being late: " + message);
    }
}