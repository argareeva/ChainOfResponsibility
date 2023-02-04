public class Fired extends Handler {
    public Fired(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Worker is fired: " + message);
    }
}