package br.com.rompi.aula06.prog1.veiculos.impl;


import br.com.rompi.aula06.prog1.veiculos.VeiculoTerrestre;

public class Carro extends VeiculoTerrestre {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = COMBUSTIVEL_PADRAO;
    }

    // Implementação obrigatória dos métodos abstratos
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Carro " + marca + " acelerando suavemente... 🚗💨");
        } else {
            System.out.println("Ligue o carro primeiro!");
        }
    }

    @Override
    public void frear() {
        System.out.println("Carro " + marca + " freando com ABS... 🛑");
    }

    // Implementação dos métodos de manutenção
    @Override
    public void trocarOleo() {
        System.out.println("Trocando óleo do carro " + marca + "... 🔧");
    }

    @Override
    public void verificarPneus() {
        System.out.println("Verificando pressão dos 4 pneus... ⚡");
    }

    // Método específico do carro
    public void abrirPortas() {
        System.out.println("Abrindo as " + numeroPortas + " portas do carro");
    }
}