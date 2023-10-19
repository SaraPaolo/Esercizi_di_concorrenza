package ES_2;

public class Consumatore extends Thread {

    private Buffer b;

    public Consumatore(Buffer b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            try {
                b.getValue(getName());
            } catch (InterruptedException e) {
                System.err.println("Errore ottenimento valore");
            }
        }
    }

}
