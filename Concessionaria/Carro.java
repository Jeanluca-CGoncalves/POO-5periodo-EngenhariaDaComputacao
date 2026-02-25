package Concessionaria;


public class Carro extends Veiculo{
    protected Integer numPortas;


    public Carro(){
        super();
    }


    public Carro(String modelo, String marca, String anoFabricacao, Integer numPortas) {
        super(modelo, marca, anoFabricacao);
        this.numPortas = numPortas;
    }


    public Integer getNumPortas() {
        return numPortas;
    }


    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }


    @Override
    public String imprimirDetalhes() {
        return "Modelo: " + getModelo() + ", marca: " + getMarca() + ", ano: " + getAnoFabricacao() + ",numero de portas: " + getNumPortas();
    }
}
