package ES_2;

public class Buffer {
    private static final int SIZE = 1;
    private int numItem = 0;
    private int value;

    public Buffer() {

    }

    public synchronized void setValue() throws InterruptedException {
        if (numItem == SIZE) {
            wait();
        } else {
            value = (int) (Math.random() * 10) + 1;
            numItem++;
            notifyAll();
        }
    }

    public synchronized void getValue(String name) throws InterruptedException {
        if (numItem == 0) {
            wait();
        } else {
            numItem--;
            accesso(name);
            notifyAll();
        }
    }


    public synchronized void accesso(String name){
        if ((name.equals("1-5")) && (value <= 5)) {
            System.out.println("buffer 1-5: NUMERO GENERATO = " + value);
        }
        if ((name.equals("6-10")) && (value > 5)) {
            System.out.println("buffer 6-10: NUMERO GENERATO = " + value);
        }
    }
}
