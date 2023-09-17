public class Direct extends Thread{
    Direct(String f){
        super(f);
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[]args){
        Direct d1=new Direct("dhaagga 1");
        d1.start();
    }
}