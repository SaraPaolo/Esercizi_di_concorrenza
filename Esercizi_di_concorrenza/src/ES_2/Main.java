package ES_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer b = new Buffer();
        Produttore p = new Produttore(b);
        Consumatore c15 = new Consumatore(b);
        c15.setName("1-5");
        Consumatore c610 = new Consumatore(b);
        c610.setName("6-10");
        p.start();
        c15.start();
        c610.start();
        p.join();
        c15.join();
        c610.join();
    }
}
