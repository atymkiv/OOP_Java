package ConcurencyProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurencyTest {
    public static void main(String[]args){
        Runnable hellos =()->{
            double end;
            double start = System.nanoTime();
            for (int i = 0; i <1000 ; i++) {
                System.out.println(i+1+ " Hello");
            }
            end = System.nanoTime();
            long elapsedTime= (long) (end - start);
            double seconds = (double)elapsedTime / 1000000000.0;
            System.out.println(seconds);
        };
        Runnable goodbyes = () ->{
            for (int i = 0; i <1000 ; i++) {
                System.out.println(i+1+ " Goodbye");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(hellos);
        executorService.execute(goodbyes);

    }
}
