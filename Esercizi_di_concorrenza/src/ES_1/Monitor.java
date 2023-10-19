package ES_1;

public class Monitor {
    public Monitor() {
    }

    public void conferme(long tempo, String nome) {
        try {
            synchronized (this){
                Thread.sleep(tempo);
                System.out.println("Ecco la quantità di pizze pronte: " + tempo/1000 + " ordinate dal cliente " + nome);
            }
        } catch (InterruptedException e) {
            System.err.println("Problemi con la pizza");
        }
    }
}
