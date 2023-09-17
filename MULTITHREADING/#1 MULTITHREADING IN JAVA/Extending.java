class Multi extends Thread{
    public void run(){
        try{
            System.out.println(" Thread "+Thread.currentThread().getId()+" is running");
        }catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
class Extending{
    public static void main(String[]args){
        for(int i=0;i<8;i++){
            Multi thread=new Multi();
            thread.start();
        }
    }
}