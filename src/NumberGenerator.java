public class NumberGenerator implements Runnable {
    String name;
    int numMax;
    int count;
    NumberGenerator(){
        numMax = 10;
        count  = 0;
    }
    NumberGenerator(String name){
        this.name = name;
        numMax = 10;
        count  = 0;
    }
    @Override
    public void run() {
        while (count < numMax){
            count++;
            System.out.println(this.name + " ___ " + count + " - " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
