package Concessionaria;


public class Veiculo {
    protected String modelo;
    protected String marca;
    protected String anoFabricacao;


    public Veiculo(){


    }


    public Veiculo(String modelo, String marca, String anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getAnoFabricacao() {
        return anoFabricacao;
    }


    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }




    public String imprimirDetalhes() {
        return "Modelo: " + getModelo() + ", marca: " + getMarca() + ", ano: " + getAnoFabricacao();
    }
}


