package MultiThreading;

class Test extends Thread {
    public void run(){
        for(int i = 0 ; i < 5; i++) System.out.println("Inside the Thread !");
    }
}
public class MultipleThreads {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside the Main !");
            Thread.sleep(1);
        }
    }
}
