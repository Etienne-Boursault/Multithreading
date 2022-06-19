
/*
// Implementing the interface Runnable is better than to extend Thread
// But, you'll have to use the Thread Class with the instance of your class in the constructor
// in order to Thread's method
 */
public class AnotherMultithreadThing implements Runnable{
    public int threadNumber;
    public AnotherMultithreadThing(int threadNumber) {
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
