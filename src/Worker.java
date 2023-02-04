public class Worker {
    public static void main(String[] args) {
        Handler goodWorker = new OnWork(Priority.GOOD);
        Handler lateWorker = new OnWork(Priority.BAD);
        Handler firedWorker = new OnWork(Priority.REALLYBAD);

        goodWorker.setNextNotifier(lateWorker);
        lateWorker.setNextNotifier(firedWorker);

        goodWorker.notifyManager("You came to work on time, well done))", Priority.GOOD);
        goodWorker.notifyManager("You are an hour late...", Priority.BAD);
        goodWorker.notifyManager("You didn't come to work, you're fired", Priority.REALLYBAD);
    }
}