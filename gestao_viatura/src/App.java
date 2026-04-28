public class App {
    public static void main(String[] args) throws Exception {

        Viatura carro = new Viatura();

        carro.setNumRodas(4);
        carro.setTipo("Carro Desportivo");
        carro.setVelMaxima(120);

        carro.mostraInfo();

    }
}