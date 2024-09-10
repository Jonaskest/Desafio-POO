public class Carro extends Veiculo {
    public int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas){
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public void abrirPortas(){
        System.out.println("Todas as portas foram abertas com sucesso!");
    }

    @Override
    public void ligar(){
        System.out.println("O Carro está ligado!");
    }

}
