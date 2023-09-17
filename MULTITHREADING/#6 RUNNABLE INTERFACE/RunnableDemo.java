import java.io.FileNotFoundException;
public class RunnableDemo{
    public static void main(String[]args){
        Thread t1=new Thread(new RunnableDemo().new RunnableImpl());
        t1.start();
    }

private class RunnableImpl implements Runnable{
    public void run(){
        System.out.println("Hello"+Thread.currentThread().getName());
        try{
            throw new FileNotFoundException();
        }catch(FileNotFoundException e){
            System.out.println("Must catch here!");
                e.printStackTrace();
        }System.out.println("fluent");
    }
}
}