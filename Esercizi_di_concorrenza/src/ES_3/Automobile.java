package ES_3;

import java.util.Random;

public class Automobile extends Thread {
    private Parcheggio p;

    public Automobile(Parcheggio p, String nome) {
        this.p = p;
        setName(nome);
    }

    @Override
    public void run() {
        while (true) {
            try {
                drive();
                p.ingresso(getName());
                stayIn();
                p.uscita(getName());

            } catch (InterruptedException e) {
                System.err.println("Errore nella guida");
            }
        }
    }

    public void drive() throws InterruptedException {
        Thread.sleep(10000);
    }

    public void stayIn() throws InterruptedException {
        Thread.sleep(10000);
    }
}
