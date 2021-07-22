package com.cybertek.Utilities;

public class browserUtils {
    //putting our reusable method
    /**
     * Method that will accept int argument
     * waite for given second duration
     */
    public static void sleep(int second)  {// because it will accept milli second
        second*=1000;
        // 1sec=1000 milli seconds
        // 1*1000=1000

        try {
            Thread.sleep(second);// second way to handle thread.sleep
        } catch (InterruptedException e) {
            System.out.println("something happened in thread.sleep");
        }


    }

}
