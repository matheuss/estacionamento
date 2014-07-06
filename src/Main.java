/**
 * Created by matheus on 06/07/14.
 */
public class Main {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionaThread carro1 = new EstacionaThread(estacionamento, "1");
        carro1.start();
    }
}
