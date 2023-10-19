package ES_2;

public class Produttore extends Thread {
    private Buffer b;

    public Produttore(Buffer b) {
        this.b = b;
    }

    @Override
    public void run() {
        while(true){
            try {
                b.setValue();
            } catch (InterruptedException e) {
                System.err.println("Errore generazione valore");
            }
        }
    }
}
