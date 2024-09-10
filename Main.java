public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Cobalt", 2014, 4);
        Moto moto1 = new Moto("Yamaha", "XJ6 N", 2009, 600);

        carro1.ligar();
        carro1.abrirPortas();
        moto1.ligar();
        moto1.empinar();
    }
}
