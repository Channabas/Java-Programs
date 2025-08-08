public class Thread1 extends Thread{

    public void run(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();

    }
}
