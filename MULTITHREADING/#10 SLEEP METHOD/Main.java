public class Main implements Runnable{
    public void run(){
        for(int i=5;i>=-2;i--){try {
            Thread.sleep(200*i);//will throw illgela argument upon -1
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        Main r=new Main();
        Thread k=new Thread(r);
        k.start();
    }
}