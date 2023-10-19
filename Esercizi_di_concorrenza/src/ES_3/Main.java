package ES_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parcheggio p = new Parcheggio();
        Automobile a0 = new Automobile(p,"a0");
        Automobile a1 = new Automobile(p,"a1");
        Automobile a2 = new Automobile(p,"a2");
        Automobile a3 = new Automobile(p,"a3");
        Automobile a4 = new Automobile(p,"a4");
        Automobile a5 = new Automobile(p,"a5");
        Automobile a6 = new Automobile(p,"a6");
        Automobile a7 = new Automobile(p,"a7");
        Automobile a8 = new Automobile(p,"a8");
        Automobile a9 = new Automobile(p,"a9");

        a0.start();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
        a7.start();
        a8.start();
        a9.start();

        a0.join();
        a1.join();
        a2.join();
        a3.join();
        a4.join();
        a5.join();
        a6.join();
        a7.join();
        a8.join();
        a9.join();



    }
}
