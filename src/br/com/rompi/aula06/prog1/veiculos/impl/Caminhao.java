package br.com.rompi.aula06.prog1.veiculos.impl;

import br.com.rompi.aula06.prog1.veiculos.VeiculoPesado;

public class Caminhao extends VeiculoPesado {
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, capacidadeCarga);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Caminhão " + marca + " acelerando devagar mas com força... 🚛💨");
        } else {
            System.out.println("Ligue o caminhão primeiro!");
        }
    }

    @Override
    public void frear() {
        System.out.println("Caminhão " + marca + " freando com freio a ar... 💨🛑");
    }

    @Override
    public void ativarFreioDeEstacionamento() {
        System.out.println("Freio de estacionamento ativado! Caminhão seguro.");
    }

    @Override
    public void trocarOleo() {
        System.out.println("Trocando óleo do caminhão " + marca + " (maior quantidade)... 🔧");
    }

    @Override
    public void verificarPneus() {
        System.out.println("Verificando pressão dos " + (numeroEixos * 2) + " pneus... ⚡");
    }
}