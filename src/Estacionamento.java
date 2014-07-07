import java.util.Arrays;

/**
 * Created by matheus on 06/07/14.
 */
public class Estacionamento extends Thread{
    boolean[] vagas; // false: ocupada; true: livre
    private final static int nVagas = 4;

    public Estacionamento() {
        super();
        vagas = new boolean[nVagas];
        Arrays.fill(vagas, Boolean.TRUE);
    }

    public Estacionamento(String name) {
        super(name);
        vagas = new boolean[nVagas];
    }

    public synchronized int estacionar() throws InterruptedException {
        int i = 0;

        loop:
        while(true) {
            while(i < nVagas) {
                if (vagas[i]) {
                    break loop;
                }
                i++;
            }
            i = 0;
            wait();
        }
        vagas[i] = false;
        notifyAll();
        return i;
    }

    public synchronized void sair(int vaga) {
        vagas[vaga] = true;
        notifyAll();
    }
}
