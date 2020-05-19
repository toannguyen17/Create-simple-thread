public class NumberGenerator implements Runnable {
    int numMax;
    int count;
    NumberGenerator(){
        numMax = 10;
        count  = 0;
    }
    @Override
    public void run() {
        while (count < numMax){
            count++;
            System.out.println(count + " - " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
