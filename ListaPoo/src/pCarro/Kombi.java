package pCarro;

/**
 *
 * @author Levi
 */
public class Kombi {
    public static void main(String[] args) {
        Carro kombi = new Carro(10);
        System.out.println(kombi.abastecer(100));
        System.out.println(kombi.andar(3));
        System.out.println(kombi.gasolina());
    }
}
