import java.util.Random;

/**
 * Created by matheus on 06/07/14.
 */
public class Main {

    private static final int nCarros = 6;
    private static Random random = new Random();

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionaThread[] carros = new EstacionaThread[nCarros];

        for(int i = 0; i < nCarros; i ++) {
            System.out.print((random.nextInt(4) + 1) + " ");
        }

        for(int i = 0; i < nCarros; i ++) {
            carros[i] = new EstacionaThread(estacionamento, Integer.toString(i + 1), random.nextInt(4) + 1);
            carros[i].start();
        }
    }
}
