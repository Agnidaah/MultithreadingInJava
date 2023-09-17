public class Main extends Thread{
    public void run(){
        System.out.println("Thread:"+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        Main t=new Main();
        t.run();
        t.run();
        t.start();
        t.start();
    }
}