package thread_1;

import java.io.IOException;

public class Thread_1_main {
    public static void main(String[] args) throws InterruptedException {
        {
        Thread_1 obj=new Thread_1();
        obj.start();

        for(int i=0; i<=5;i++){
            System.out.println("Niaz");
            Thread.sleep(1000);
        }
        
    }

    }
}
