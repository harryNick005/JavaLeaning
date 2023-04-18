package Timmer;

import java.util.concurrent.TimeoutException;

public class Time {
    public static void breakTime(int minute) {
        if (minute > 0) {
         for (int i=minute*60;i>=0;i--){
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException |RuntimeException e) {
                 throw new RuntimeException(e);
             }
             System.out.println("Class Begins After: "+i+"Seconds");
         }
        }
    }
}
