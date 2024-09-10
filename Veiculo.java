public class Veiculo {
    private String marca;
    public String modelo;
    public int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;    
    }   
    
    public void getDescricao(){
        System.out.println("Modelo: Golf, Marca: Volkswagen, Ano: 2000");
    }

    public void ligar(){
        System.out.println("O veículo está ligado!");
    }
    }

