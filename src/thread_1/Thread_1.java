package thread_1;
import java.lang.InterruptedException;
//import java.io.IOException;

public class Thread_1 extends Thread {
    

    public void  run(){
        try{

        for(int i=0; i<=5;i++){
            System.out.println("Fabiha");
            sleep(1000);
        }
    }
      catch(InterruptedException e){
           e.printStackTrace();
}



}
}

