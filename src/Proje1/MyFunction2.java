package Proje1;

public class MyFunction2 {

    public static void Wait(int sn) {
        try {
            Thread.sleep(1000 * sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
