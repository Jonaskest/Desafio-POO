public class Moto extends Veiculo {
    public int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void empinar(){
        System.out.println("A moto está empinando");
    }

    @Override
    public void ligar(){
        System.out.println("A moto está ligado!");
    }
}
