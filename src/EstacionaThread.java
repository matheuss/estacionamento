import java.util.Random;

/**
 * Created by matheus on 06/07/14.
 */
    public class EstacionaThread extends Thread{
    private Estacionamento estacionamento;
    private int espera;
    private int vezes;
    private int vaga;

    public EstacionaThread(Estacionamento e, int vezes) {
        super();
        this.estacionamento = e;
        this.vezes = vezes;
    }
    public EstacionaThread(Estacionamento e, String nome, int vezes) {
        super(nome);
        this.estacionamento = e;
        this.vezes = vezes;
    }

    public void run() {
        try {
            int i = 0;
            while(i < vezes) {
                vaga = estacionamento.estacionar();
                System.out.println("Carro " + this.getName() + " estacionou na vaga " + (vaga + 1));
                espera = Math.abs(new Random().nextInt() % 10) * 1000;
                sleep(espera);
                estacionamento.sair(vaga);
                System.out.println("Carro " + this.getName() + " saiu da vaga " + (vaga + 1));
                ++i;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
