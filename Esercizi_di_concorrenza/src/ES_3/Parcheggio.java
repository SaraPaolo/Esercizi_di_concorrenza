package ES_3;

public class Parcheggio {
    private int SIZE = 5;
    private int numAuto = 0;

    public synchronized void ingresso(String nome) throws InterruptedException {
        if(numAuto < SIZE){
            numAuto++;
            System.out.println("Auto " + nome + " è entrata nel parcheggio");
            //wait();
        }else{
            System.out.println("Auto " + nome + " prova ad accedere al parcheggio MA è PIENO");
            wait();
        }
    }

    public synchronized void uscita(String nome) {
        numAuto--;
        System.out.println("Auto " + nome + " è uscita dal parcheggio");
        notifyAll();
    }
}
