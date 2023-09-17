public class Indirect extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{Thread.sleep(200);}
        catch(Exception e){
            System.out.println("Thread failed for timed wait");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
    public static void main(String[]args){
        Indirect d1=new Indirect();
        d1.start();
        try{Thread.sleep(100);}
        catch(Exception e){
            System.out.println("Timed waiting failed in main thread");
        }
        d1.setName("Dhagga 1");
        System.out.println(Thread.currentThread().getId());
    }
}
