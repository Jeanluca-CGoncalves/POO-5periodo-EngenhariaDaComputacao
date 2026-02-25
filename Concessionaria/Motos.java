package Concessionaria;

public class Motos extends Veiculo {
    protected Integer cilindradas;


    public Motos() {


    }


    public Motos(String modelo, String marca, String anoFabricacao, Integer cilindradas) {
        super(modelo, marca, anoFabricacao);
        this.cilindradas = cilindradas;
    }


    public Integer getCilindradas() {
        return cilindradas;
    }


    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }


    @Override
    public String imprimirDetalhes() {
        return "Modelo: " + getModelo() + ", marca: " + getMarca() + ", ano: " + getAnoFabricacao() + ",cilindradas :" + getCilindradas();
    }
}
