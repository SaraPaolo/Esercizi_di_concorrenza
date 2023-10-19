package ES_1;

public class Cliente extends Thread {
    private Integer numeroPizze;
    private String nome;

    private static final Monitor m = new Monitor();

    public Cliente(Integer numeroPizze, String nome) {
        this.numeroPizze = numeroPizze;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        setPriority(MAX_PRIORITY);
        long tempo = numeroPizze * 5000;
            System.out.println("Le pizza del cliente " + getNome() + " pronta tra: " + tempo / 1000 + " sec");
            m.conferme(tempo, getNome());

    }

}
