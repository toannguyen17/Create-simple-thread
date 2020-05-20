public class Main {
    public static void main(String[] args) {
        //NumberGenerator num = new NumberGenerator();
        Thread threadA = new Thread(new NumberGenerator("A"));
        Thread threadB = new Thread(new NumberGenerator("B"));

        threadA.setPriority(threadA.MIN_PRIORITY);
        threadB.setPriority(threadA.MAX_PRIORITY);

        threadA.start();
        threadB.start();
    }
}
