public class Main extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            Main ob=new Main();
            ob.run();
        }
    }
}