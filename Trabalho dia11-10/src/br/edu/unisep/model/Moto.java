package br.edu.unisep.model;

public class Moto extends Veiculo {
    private String tipoGuidao;

    public Moto(String marca, String modelo, int ano, String tipoGuidao) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto -> Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Tipo de Guidão: " + tipoGuidao);
    }
}

