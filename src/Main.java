public class Main {
    public static void main(String[] args) {
        //NumberGenerator num = new NumberGenerator();
        new Thread(new NumberGenerator()).start();
    }
}
