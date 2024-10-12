package br.edu.unisep.view;

import br.edu.unisep.model.Caminhao;
import br.edu.unisep.model.Carro;
import br.edu.unisep.model.Frota;
import br.edu.unisep.model.Moto;

public class Main {
    public static void main(String[] args) {
        // Criando uma frota
        Frota frota = new Frota();

        // Criando veículos e adicionando à frota
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto1 = new Moto("Yamaha", "MT-07", 2021, "Esportivo");
        Caminhao caminhao1 = new Caminhao("Volvo", "FH16", 2019, "Carga Pesada");

        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);

        // Exibindo detalhes da frota
        frota.exibirDetalhesFrota();
    }
}

