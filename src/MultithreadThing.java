
/*
// Be careful with extendind the Thread Class. Due to Java limitation, you can extend only one Class
 */
public class MultithreadThing extends Thread {

    public int threadNumber;
    public MultithreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + " from thread number : " + threadNumber);

            if (threadNumber == 2) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
