/**
 * Created by matheus on 06/07/14.
 */
    public class Carro extends Thread{
    private Estacionamento estacionamento;
    private int espera;
    private int vaga;

    public Carro(Estacionamento e) {
        super();
        this.estacionamento = e;
    }
    public Carro(Estacionamento e, String nome) {
        super(nome);
        this.estacionamento = e;
    }

    public void run() {
        try {
            vaga = estacionamento.estacionar();
            System.out.println("Carro " + this.getName() + " estacionou na vaga " + vaga);
            espera = (int) (3 * 1000);
            sleep(espera);
            estacionamento.sair(vaga);
            System.out.println("Carro " + this.getName() + " saiu da vaga " + vaga);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
