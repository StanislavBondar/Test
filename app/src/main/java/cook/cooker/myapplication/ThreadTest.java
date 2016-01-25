package cook.cooker.myapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Stas on 25.01.2016.
 */
public class ThreadTest implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(100);
//        synchronized (this) {
//            Thread.currentThread().join();
//        }
        return Thread.currentThread().getName();
    }
    public static void main(String args[]){

        ExecutorService mFirstPull = Executors.newFixedThreadPool(5);
        ExecutorService mSecondPull = Executors.newFixedThreadPool(5);
        List<Future<String>> mPoolList = new ArrayList<>();
        Callable<String> mCallable = new ThreadTest();

        for(int i=0; i< 30; i++){
            Future<String> mFirstFuture = mFirstPull.submit(mCallable);
            Future<String> mSecondFuture = mSecondPull.submit(mCallable);
            mPoolList.add(mFirstFuture);
            mPoolList.add(mSecondFuture);
        }

        int mCounter = 0;
        String mDivider;

        for(Future<String> mStringFuture : mPoolList){
            try {
                mCounter++;
                if (mCounter == 10) {
                    mDivider = "\n";
                    mCounter = 0;
                } else
                    mDivider = "";

                System.out.println(new Date()+ "::" + mStringFuture.get() + mDivider);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        mFirstPull.shutdown();
    }


}
