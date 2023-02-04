public class OnWork extends Handler {
    public OnWork(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Worker is on work: " + message);
    }
}
