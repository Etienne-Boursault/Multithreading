public class Multithreading {

    public static void main (String[] args) {

        MultithreadThing myThing = new MultithreadThing(1);
        MultithreadThing myThing2 = new MultithreadThing(2);
        MultithreadThing myThing3 = new MultithreadThing(3);

        myThing3.run();
        myThing.start();
        myThing2.start();

        for (int i = 0; i <= 5; i++) {
            MultithreadThing myThing4 = new MultithreadThing(5*i);
            myThing4.start();
        }

        for (int i = 0; i <= 5; i++) {
            AnotherMultithreadThing myThing5 = new AnotherMultithreadThing(i*100);
            Thread myThread = new Thread(myThing5);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myThread.isAlive();
        }
    }
}
