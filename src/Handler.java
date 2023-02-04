public abstract class Handler {
    private final int priority;
    private Handler nextHandler;

    public Handler(int  priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextHandler != null) {
            nextHandler.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
