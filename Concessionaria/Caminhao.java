package Concessionaria;

public class Caminhao extends Veiculo {
    protected Double capacidadeCarga;


    public Caminhao(){
        super();
    }


    public Caminhao(String modelo, String marca, String anoFabricacao, Double capacidadeCarga) {
        super(modelo, marca, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }


    public Double getCapacidadeCarga() {
        return capacidadeCarga;
    }


    public void setCapacidadeCarga(Double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }


    @Override
    public String imprimirDetalhes() {
        return "Modelo: " + getModelo() + ", marca: " + getMarca() + ", ano: " + getAnoFabricacao() +
                ",capacidade de carga: " + String.format("%.2f", getCapacidadeCarga());
    }
}



