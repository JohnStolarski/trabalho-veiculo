package br.edu.unisep.model;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro -> Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Número de Portas: " + numPortas);
    }
}

