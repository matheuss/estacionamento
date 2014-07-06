/**
 * Created by matheus on 06/07/14.
 */
public class Main {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Carro carro1 = new Carro(estacionamento, "1");
        carro1.start();
    }
}
