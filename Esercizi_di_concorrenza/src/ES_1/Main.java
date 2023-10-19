package ES_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = new Cliente(2, "MATTIA");
        Cliente c2 = new Cliente(1, "GABRIELE");
        c1.start();
        c2.start();
        c1.join();
        c2.join();

    }
}
